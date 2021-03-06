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

package com.google.api.services.cloudasset.v1beta1.model;

/**
 * Batch get assets history response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchGetAssetsHistoryResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of assets with valid time windows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TemporalAsset> assets;

  /**
   * A list of assets with valid time windows.
   * @return value or {@code null} for none
   */
  public java.util.List<TemporalAsset> getAssets() {
    return assets;
  }

  /**
   * A list of assets with valid time windows.
   * @param assets assets or {@code null} for none
   */
  public BatchGetAssetsHistoryResponse setAssets(java.util.List<TemporalAsset> assets) {
    this.assets = assets;
    return this;
  }

  @Override
  public BatchGetAssetsHistoryResponse set(String fieldName, Object value) {
    return (BatchGetAssetsHistoryResponse) super.set(fieldName, value);
  }

  @Override
  public BatchGetAssetsHistoryResponse clone() {
    return (BatchGetAssetsHistoryResponse) super.clone();
  }

}
