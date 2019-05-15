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

package com.google.api.services.vision.v1.model;

/**
 * The desired input location and metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p4beta1InputConfig extends com.google.api.client.json.GenericJson {

  /**
   * File content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   *
   * Currently, this field only works for BatchAnnotateFiles requests. It does not work for
   * AsyncBatchAnnotateFiles requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The Google Cloud Storage location to read the input from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p4beta1GcsSource gcsSource;

  /**
   * The type of the file. Currently only "application/pdf" and "image/tiff" are supported.
   * Wildcards are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * File content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   *
   * Currently, this field only works for BatchAnnotateFiles requests. It does not work for
   * AsyncBatchAnnotateFiles requests.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * File content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   *
   * Currently, this field only works for BatchAnnotateFiles requests. It does not work for
   * AsyncBatchAnnotateFiles requests.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * File content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   *
   * Currently, this field only works for BatchAnnotateFiles requests. It does not work for
   * AsyncBatchAnnotateFiles requests.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1InputConfig setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * File content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   *
   * Currently, this field only works for BatchAnnotateFiles requests. It does not work for
   * AsyncBatchAnnotateFiles requests.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudVisionV1p4beta1InputConfig encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * The Google Cloud Storage location to read the input from.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1GcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * The Google Cloud Storage location to read the input from.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1InputConfig setGcsSource(GoogleCloudVisionV1p4beta1GcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * The type of the file. Currently only "application/pdf" and "image/tiff" are supported.
   * Wildcards are not supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * The type of the file. Currently only "application/pdf" and "image/tiff" are supported.
   * Wildcards are not supported.
   * @param mimeType mimeType or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1InputConfig setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p4beta1InputConfig set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p4beta1InputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p4beta1InputConfig clone() {
    return (GoogleCloudVisionV1p4beta1InputConfig) super.clone();
  }

}