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

package com.google.api.services.customsearch.v1.model;

/**
 * Promotion result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Custom Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Promotion extends com.google.api.client.json.GenericJson {

  /**
   * An array of block objects for this promotion. See Google WebSearch Protocol reference for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BodyLines> bodyLines;

  static {
    // hack to force ProGuard to consider BodyLines used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BodyLines.class);
  }

  /**
   * An abridged version of this search's result URL, e.g. www.example.com.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayLink;

  /**
   * The title of the promotion, in HTML.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String htmlTitle;

  /**
   * Image belonging to a promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image image;

  /**
   * The URL of the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String link;

  /**
   * The title of the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * An array of block objects for this promotion. See Google WebSearch Protocol reference for more
   * information.
   * @return value or {@code null} for none
   */
  public java.util.List<BodyLines> getBodyLines() {
    return bodyLines;
  }

  /**
   * An array of block objects for this promotion. See Google WebSearch Protocol reference for more
   * information.
   * @param bodyLines bodyLines or {@code null} for none
   */
  public Promotion setBodyLines(java.util.List<BodyLines> bodyLines) {
    this.bodyLines = bodyLines;
    return this;
  }

  /**
   * An abridged version of this search's result URL, e.g. www.example.com.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayLink() {
    return displayLink;
  }

  /**
   * An abridged version of this search's result URL, e.g. www.example.com.
   * @param displayLink displayLink or {@code null} for none
   */
  public Promotion setDisplayLink(java.lang.String displayLink) {
    this.displayLink = displayLink;
    return this;
  }

  /**
   * The title of the promotion, in HTML.
   * @return value or {@code null} for none
   */
  public java.lang.String getHtmlTitle() {
    return htmlTitle;
  }

  /**
   * The title of the promotion, in HTML.
   * @param htmlTitle htmlTitle or {@code null} for none
   */
  public Promotion setHtmlTitle(java.lang.String htmlTitle) {
    this.htmlTitle = htmlTitle;
    return this;
  }

  /**
   * Image belonging to a promotion.
   * @return value or {@code null} for none
   */
  public Image getImage() {
    return image;
  }

  /**
   * Image belonging to a promotion.
   * @param image image or {@code null} for none
   */
  public Promotion setImage(Image image) {
    this.image = image;
    return this;
  }

  /**
   * The URL of the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getLink() {
    return link;
  }

  /**
   * The URL of the promotion.
   * @param link link or {@code null} for none
   */
  public Promotion setLink(java.lang.String link) {
    this.link = link;
    return this;
  }

  /**
   * The title of the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the promotion.
   * @param title title or {@code null} for none
   */
  public Promotion setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Promotion set(String fieldName, Object value) {
    return (Promotion) super.set(fieldName, value);
  }

  @Override
  public Promotion clone() {
    return (Promotion) super.clone();
  }

  /**
   * Block object belonging to a promotion.
   */
  public static final class BodyLines extends com.google.api.client.json.GenericJson {

    /**
     * The block object's text in HTML, if it has text.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String htmlTitle;

    /**
     * The anchor text of the block object's link, if it has a link.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String link;

    /**
     * The block object's text, if it has text.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * The URL of the block object's link, if it has one.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * The block object's text in HTML, if it has text.
     * @return value or {@code null} for none
     */
    public java.lang.String getHtmlTitle() {
      return htmlTitle;
    }

    /**
     * The block object's text in HTML, if it has text.
     * @param htmlTitle htmlTitle or {@code null} for none
     */
    public BodyLines setHtmlTitle(java.lang.String htmlTitle) {
      this.htmlTitle = htmlTitle;
      return this;
    }

    /**
     * The anchor text of the block object's link, if it has a link.
     * @return value or {@code null} for none
     */
    public java.lang.String getLink() {
      return link;
    }

    /**
     * The anchor text of the block object's link, if it has a link.
     * @param link link or {@code null} for none
     */
    public BodyLines setLink(java.lang.String link) {
      this.link = link;
      return this;
    }

    /**
     * The block object's text, if it has text.
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle() {
      return title;
    }

    /**
     * The block object's text, if it has text.
     * @param title title or {@code null} for none
     */
    public BodyLines setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    /**
     * The URL of the block object's link, if it has one.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * The URL of the block object's link, if it has one.
     * @param url url or {@code null} for none
     */
    public BodyLines setUrl(java.lang.String url) {
      this.url = url;
      return this;
    }

    @Override
    public BodyLines set(String fieldName, Object value) {
      return (BodyLines) super.set(fieldName, value);
    }

    @Override
    public BodyLines clone() {
      return (BodyLines) super.clone();
    }

  }

  /**
   * Image belonging to a promotion.
   */
  public static final class Image extends com.google.api.client.json.GenericJson {

    /**
     * Image height in pixels.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer height;

    /**
     * URL of the image for this promotion link.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String source;

    /**
     * Image width in pixels.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer width;

    /**
     * Image height in pixels.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getHeight() {
      return height;
    }

    /**
     * Image height in pixels.
     * @param height height or {@code null} for none
     */
    public Image setHeight(java.lang.Integer height) {
      this.height = height;
      return this;
    }

    /**
     * URL of the image for this promotion link.
     * @return value or {@code null} for none
     */
    public java.lang.String getSource() {
      return source;
    }

    /**
     * URL of the image for this promotion link.
     * @param source source or {@code null} for none
     */
    public Image setSource(java.lang.String source) {
      this.source = source;
      return this;
    }

    /**
     * Image width in pixels.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getWidth() {
      return width;
    }

    /**
     * Image width in pixels.
     * @param width width or {@code null} for none
     */
    public Image setWidth(java.lang.Integer width) {
      this.width = width;
      return this;
    }

    @Override
    public Image set(String fieldName, Object value) {
      return (Image) super.set(fieldName, value);
    }

    @Override
    public Image clone() {
      return (Image) super.clone();
    }

  }

}
