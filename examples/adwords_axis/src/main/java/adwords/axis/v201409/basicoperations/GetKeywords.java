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
import com.google.api.ads.adwords.axis.utils.v201409.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupCriterionPage;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.Keyword;
import com.google.api.ads.adwords.axis.v201409.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all ad group criteria in an account. To add keywords
 * criteria, run AddKeywords.java
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupCriterionService.get
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class GetKeywords {

  private static final int PAGE_SIZE = 100;

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

    Long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId) throws Exception {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    int offset = 0;
    boolean morePages = true;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector = builder
        .fields("Id", "AdGroupId", "MatchType", "KeywordText")
        .orderAscBy("AdGroupId")
        .offset(offset)
        .limit(PAGE_SIZE)
        .in("AdGroupId", adGroupId.toString())
        .equals("CriteriaType", "KEYWORD")
        .build();

    while (morePages) {
      // Get all ad group criteria.
      AdGroupCriterionPage page = adGroupCriterionService.get(selector);

      // Display ad group criteria.
      if (page.getEntries() != null && page.getEntries().length > 0) {
        // Display results.
        for (AdGroupCriterion adGroupCriterionResult : page.getEntries()) {
          System.out.println("Keyword ad group criterion with ad group id \""
              + adGroupCriterionResult.getAdGroupId() + "\", criterion id \""
              + adGroupCriterionResult.getCriterion().getId() + "\", text \""
              + ((Keyword) adGroupCriterionResult.getCriterion()).getText()
              + "\" and match type \""
              + ((Keyword) adGroupCriterionResult.getCriterion()).getMatchType() + "\" was found.");
        }
      } else {
        System.out.println("No ad group criteria were found.");
      }

      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
      morePages = offset < page.getTotalNumEntries();
    }
  }
}
