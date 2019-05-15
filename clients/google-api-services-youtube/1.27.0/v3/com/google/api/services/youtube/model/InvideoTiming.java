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

package com.google.api.services.youtube.model;

/**
 * Describes a temporal position of a visual widget inside a video.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InvideoTiming extends com.google.api.client.json.GenericJson {

  /**
   * Defines the duration in milliseconds for which the promotion should be displayed. If missing,
   * the client should use the default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger durationMs;

  /**
   * Defines the time at which the promotion will appear. Depending on the value of type the value
   * of the offsetMs field will represent a time offset from the start or from the end of the video,
   * expressed in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger offsetMs;

  /**
   * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an
   * offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field
   * represents an offset from the end of the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Defines the duration in milliseconds for which the promotion should be displayed. If missing,
   * the client should use the default.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getDurationMs() {
    return durationMs;
  }

  /**
   * Defines the duration in milliseconds for which the promotion should be displayed. If missing,
   * the client should use the default.
   * @param durationMs durationMs or {@code null} for none
   */
  public InvideoTiming setDurationMs(java.math.BigInteger durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Defines the time at which the promotion will appear. Depending on the value of type the value
   * of the offsetMs field will represent a time offset from the start or from the end of the video,
   * expressed in milliseconds.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getOffsetMs() {
    return offsetMs;
  }

  /**
   * Defines the time at which the promotion will appear. Depending on the value of type the value
   * of the offsetMs field will represent a time offset from the start or from the end of the video,
   * expressed in milliseconds.
   * @param offsetMs offsetMs or {@code null} for none
   */
  public InvideoTiming setOffsetMs(java.math.BigInteger offsetMs) {
    this.offsetMs = offsetMs;
    return this;
  }

  /**
   * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an
   * offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field
   * represents an offset from the end of the video.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an
   * offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field
   * represents an offset from the end of the video.
   * @param type type or {@code null} for none
   */
  public InvideoTiming setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public InvideoTiming set(String fieldName, Object value) {
    return (InvideoTiming) super.set(fieldName, value);
  }

  @Override
  public InvideoTiming clone() {
    return (InvideoTiming) super.clone();
  }

}