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

package com.google.api.services.chat.v1.model;

/**
 * An image button with an onclick action.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Hangouts Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageButton extends com.google.api.client.json.GenericJson {

  /**
   * The icon specified by an enum that indices to an icon provided by Chat API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String icon;

  /**
   * The icon specified by a URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * The name of this image_button which will be used for accessibility. Default value will be
   * provided if developers don't specify.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The onclick action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnClick onClick;

  /**
   * The icon specified by an enum that indices to an icon provided by Chat API.
   * @return value or {@code null} for none
   */
  public java.lang.String getIcon() {
    return icon;
  }

  /**
   * The icon specified by an enum that indices to an icon provided by Chat API.
   * @param icon icon or {@code null} for none
   */
  public ImageButton setIcon(java.lang.String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The icon specified by a URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * The icon specified by a URL.
   * @param iconUrl iconUrl or {@code null} for none
   */
  public ImageButton setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The name of this image_button which will be used for accessibility. Default value will be
   * provided if developers don't specify.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this image_button which will be used for accessibility. Default value will be
   * provided if developers don't specify.
   * @param name name or {@code null} for none
   */
  public ImageButton setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The onclick action.
   * @return value or {@code null} for none
   */
  public OnClick getOnClick() {
    return onClick;
  }

  /**
   * The onclick action.
   * @param onClick onClick or {@code null} for none
   */
  public ImageButton setOnClick(OnClick onClick) {
    this.onClick = onClick;
    return this;
  }

  @Override
  public ImageButton set(String fieldName, Object value) {
    return (ImageButton) super.set(fieldName, value);
  }

  @Override
  public ImageButton clone() {
    return (ImageButton) super.clone();
  }

}