// Copyright 2012, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.testing.AuthResponseProvider;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.testing.SoapRequestXmlProvider;
import com.google.api.ads.dfp.axis.v201411.Company;
import com.google.api.ads.dfp.axis.v201411.CompanyServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.collect.Lists;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests that a DFP Axis SOAP call can be made end-to-end.
 *
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class DfpAxisSoapIntegrationTest extends MockHttpIntegrationTest {

  private static final String API_VERSION = "v201411";
  private static final String CLIENT_LOGIN_API_VERSION = "v201311";

  @BeforeClass
  public static void setupClass() {
    System.setProperty("api.adwords.useCompression", "false");
  }
  
  /**
   * Tests making a Axis DFP API call with ClientLogin.
   */
  @Test
  public void testGoldenSoap_clientLogin() throws Exception {
    testHttpServer.setMockResponseBody(
        SoapResponseXmlProvider.getTestSoapResponse(CLIENT_LOGIN_API_VERSION));

    DfpSession session = new DfpSession.Builder().withApplicationName("TEST_APP")
        .withClientLoginToken("TEST_TOKEN")
        .withEndpoint(testHttpServer.getServerUrl())
        .withNetworkCode("TEST_NETWORK_CODE")
        .build();

    com.google.api.ads.dfp.axis.v201311.CompanyServiceInterface companyService = new DfpServices()
        .get(session, com.google.api.ads.dfp.axis.v201311.CompanyServiceInterface.class);

    com.google.api.ads.dfp.axis.v201311.Company company =
        new com.google.api.ads.dfp.axis.v201311.Company();

    com.google.api.ads.dfp.axis.v201311.Company[] companies = companyService
        .createCompanies(new com.google.api.ads.dfp.axis.v201311.Company[] {company});

    assertEquals(1234L, companies[0].getId().longValue());
    assertEquals(SoapRequestXmlProvider.getClientLoginSoapRequest(CLIENT_LOGIN_API_VERSION),
        testHttpServer.getLastRequestBody());
    assertFalse("Did not request compression but request was compressed",
        testHttpServer.wasLastRequestBodyCompressed());
  }

  /**
   * Tests making a Axis DFP API call with OAuth2.
   */
  @Test
  public void testGoldenSoap_oauth2() throws Exception {
    testHttpServer.setMockResponseBody(SoapResponseXmlProvider.getTestSoapResponse(API_VERSION));

    GoogleCredential credential = new GoogleCredential.Builder().setTransport(
        new NetHttpTransport()).setJsonFactory(new JacksonFactory()).build();
    credential.setAccessToken("TEST_ACCESS_TOKEN");

    DfpSession session = new DfpSession.Builder().withApplicationName("TEST_APP")
        .withOAuth2Credential(credential)
        .withEndpoint(testHttpServer.getServerUrl())
        .withNetworkCode("TEST_NETWORK_CODE")
        .build();

    CompanyServiceInterface companyService =
        new DfpServices().get(session, CompanyServiceInterface.class);
    Company[] companies = companyService.createCompanies(new Company[] {new Company()});

    assertEquals(1234L, companies[0].getId().longValue());
    assertEquals(SoapRequestXmlProvider.getOAuth2SoapRequest(API_VERSION),
        testHttpServer.getLastRequestBody());
    assertFalse("Did not request compression but request was compressed",
        testHttpServer.wasLastRequestBodyCompressed());
    assertEquals("Bearer TEST_ACCESS_TOKEN", testHttpServer.getLastAuthorizationHttpHeader());
  }

  /**
   * Tests making a Axis DFP API call with OfflineCredentials.
   */
  @Test
  public void testGoldenSoap_oauth2_offlineCredentials() throws Exception {
    testHttpServer.setMockResponseBodies(Lists.newArrayList(
        AuthResponseProvider.getTestOAuthResponse("TEST_ACCESS_TOKEN_1", 1L, "newRefreshToken1"),
        AuthResponseProvider.getTestOAuthResponse("TEST_ACCESS_TOKEN_2", 3600L, "newRefreshToken2"),
        SoapResponseXmlProvider.getTestSoapResponse(API_VERSION)));

    OfflineCredentials offlineCredentials =
        new OfflineCredentials.Builder()
            .forApi(OfflineCredentials.Api.DFP)
            .withTokenUrlServer(testHttpServer.getServerUrl())
            .fromFile(
                DfpAxisSoapIntegrationTest.class.getResource("props/ads-test.properties"))
            .build();

    Credential credential = offlineCredentials.generateCredential();

    assertTrue(testHttpServer.getLastRequestBody().contains("grant_type=refresh_token"));
    assertTrue(testHttpServer.getLastRequestBody().contains("refresh_token=refreshToken"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_id=clientId"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_secret=clientSecret"));

    // Make sure the old token expires - the session builder should issue a request
    // for another access token.
    Thread.sleep(1000);

    assertEquals("TEST_ACCESS_TOKEN_1", credential.getAccessToken());

    DfpSession session = new DfpSession.Builder()
        .withApplicationName("TEST_APP")
        .withOAuth2Credential(credential)
        .withEndpoint(testHttpServer.getServerUrl())
        .withNetworkCode("TEST_NETWORK_CODE")
        .build();

    CompanyServiceInterface companyService =
        new DfpServices().get(session, CompanyServiceInterface.class);
    Company[] companies = companyService.createCompanies(new Company[] {new Company()});

    assertEquals(1234L, companies[0].getId().longValue());
    assertEquals(SoapRequestXmlProvider.getOAuth2SoapRequest(API_VERSION),
        testHttpServer.getLastRequestBody());
    assertFalse("Did not request compression but request was compressed",
        testHttpServer.wasLastRequestBodyCompressed());
    assertEquals("newRefreshToken2", credential.getRefreshToken());
    assertEquals("Bearer TEST_ACCESS_TOKEN_2", testHttpServer.getLastAuthorizationHttpHeader());
  }
}
