/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Model definition for ProjectsSetDefaultNetworkTierRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectsSetDefaultNetworkTierRequest extends com.google.api.client.json.GenericJson {

  /**
   * Default network tier to be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkTier;

  /**
   * Default network tier to be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkTier() {
    return networkTier;
  }

  /**
   * Default network tier to be set.
   * @param networkTier networkTier or {@code null} for none
   */
  public ProjectsSetDefaultNetworkTierRequest setNetworkTier(java.lang.String networkTier) {
    this.networkTier = networkTier;
    return this;
  }

  @Override
  public ProjectsSetDefaultNetworkTierRequest set(String fieldName, Object value) {
    return (ProjectsSetDefaultNetworkTierRequest) super.set(fieldName, value);
  }

  @Override
  public ProjectsSetDefaultNetworkTierRequest clone() {
    return (ProjectsSetDefaultNetworkTierRequest) super.clone();
  }

}