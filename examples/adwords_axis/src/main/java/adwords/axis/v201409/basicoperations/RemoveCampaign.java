// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201409.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201409.cm.Campaign;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201409.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example removes a campaign by setting the status to 'REMOVED'. To get
 * campaigns, run GetCampaigns.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CampaignService.mutate
 *
 * @author Kevin Winter
 */
public class RemoveCampaign {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long campaignId) throws Exception {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create campaign with REMOVED status.
    Campaign campaign = new Campaign();
    campaign.setId(campaignId);
    campaign.setStatus(CampaignStatus.REMOVED);

    // Create operations.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.SET);

    CampaignOperation[] operations = new CampaignOperation[] {operation};

    // Remove campaign.
    CampaignReturnValue result = campaignService.mutate(operations);

    // Display campaigns.
    for (Campaign campaignResult : result.getValue()) {
      System.out.println("Campaign with name \"" + campaignResult.getName() + "\" and id \""
          + campaignResult.getId() + "\" was removed.");
    }
  }
}
