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

package com.google.api.services.docs.v1.model;

/**
 * A mask that indicates which of the fields on the base DocumentStyle have been changed in this
 * suggestion. For any field set to true, there is a new suggested value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentStyleSuggestionState extends com.google.api.client.json.GenericJson {

  /**
   * A mask that indicates which of the fields in background have been changed in this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackgroundSuggestionState backgroundSuggestionState;

  /**
   * Indicates if there was a suggested change to default_footer_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean defaultFooterIdSuggested;

  /**
   * Indicates if there was a suggested change to default_header_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean defaultHeaderIdSuggested;

  /**
   * Indicates if there was a suggested change to even_page_footer_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean evenPageFooterIdSuggested;

  /**
   * Indicates if there was a suggested change to even_page_header_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean evenPageHeaderIdSuggested;

  /**
   * Indicates if there was a suggested change to first_page_footer_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean firstPageFooterIdSuggested;

  /**
   * Indicates if there was a suggested change to first_page_header_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean firstPageHeaderIdSuggested;

  /**
   * Indicates if there was a suggested change to margin_bottom.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean marginBottomSuggested;

  /**
   * Indicates if there was a suggested change to margin_left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean marginLeftSuggested;

  /**
   * Indicates if there was a suggested change to margin_right.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean marginRightSuggested;

  /**
   * Indicates if there was a suggested change to margin_top.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean marginTopSuggested;

  /**
   * Indicates if there was a suggested change to page_number_start.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pageNumberStartSuggested;

  /**
   * A mask that indicates which of the fields in size have been changed in this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SizeSuggestionState pageSizeSuggestionState;

  /**
   * Indicates if there was a suggested change to use_even_page_header_footer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useEvenPageHeaderFooterSuggested;

  /**
   * Indicates if there was a suggested change to use_first_page_header_footer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useFirstPageHeaderFooterSuggested;

  /**
   * A mask that indicates which of the fields in background have been changed in this suggestion.
   * @return value or {@code null} for none
   */
  public BackgroundSuggestionState getBackgroundSuggestionState() {
    return backgroundSuggestionState;
  }

  /**
   * A mask that indicates which of the fields in background have been changed in this suggestion.
   * @param backgroundSuggestionState backgroundSuggestionState or {@code null} for none
   */
  public DocumentStyleSuggestionState setBackgroundSuggestionState(BackgroundSuggestionState backgroundSuggestionState) {
    this.backgroundSuggestionState = backgroundSuggestionState;
    return this;
  }

  /**
   * Indicates if there was a suggested change to default_footer_id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDefaultFooterIdSuggested() {
    return defaultFooterIdSuggested;
  }

  /**
   * Indicates if there was a suggested change to default_footer_id.
   * @param defaultFooterIdSuggested defaultFooterIdSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setDefaultFooterIdSuggested(java.lang.Boolean defaultFooterIdSuggested) {
    this.defaultFooterIdSuggested = defaultFooterIdSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to default_header_id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDefaultHeaderIdSuggested() {
    return defaultHeaderIdSuggested;
  }

  /**
   * Indicates if there was a suggested change to default_header_id.
   * @param defaultHeaderIdSuggested defaultHeaderIdSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setDefaultHeaderIdSuggested(java.lang.Boolean defaultHeaderIdSuggested) {
    this.defaultHeaderIdSuggested = defaultHeaderIdSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to even_page_footer_id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEvenPageFooterIdSuggested() {
    return evenPageFooterIdSuggested;
  }

  /**
   * Indicates if there was a suggested change to even_page_footer_id.
   * @param evenPageFooterIdSuggested evenPageFooterIdSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setEvenPageFooterIdSuggested(java.lang.Boolean evenPageFooterIdSuggested) {
    this.evenPageFooterIdSuggested = evenPageFooterIdSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to even_page_header_id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEvenPageHeaderIdSuggested() {
    return evenPageHeaderIdSuggested;
  }

  /**
   * Indicates if there was a suggested change to even_page_header_id.
   * @param evenPageHeaderIdSuggested evenPageHeaderIdSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setEvenPageHeaderIdSuggested(java.lang.Boolean evenPageHeaderIdSuggested) {
    this.evenPageHeaderIdSuggested = evenPageHeaderIdSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to first_page_footer_id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFirstPageFooterIdSuggested() {
    return firstPageFooterIdSuggested;
  }

  /**
   * Indicates if there was a suggested change to first_page_footer_id.
   * @param firstPageFooterIdSuggested firstPageFooterIdSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setFirstPageFooterIdSuggested(java.lang.Boolean firstPageFooterIdSuggested) {
    this.firstPageFooterIdSuggested = firstPageFooterIdSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to first_page_header_id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFirstPageHeaderIdSuggested() {
    return firstPageHeaderIdSuggested;
  }

  /**
   * Indicates if there was a suggested change to first_page_header_id.
   * @param firstPageHeaderIdSuggested firstPageHeaderIdSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setFirstPageHeaderIdSuggested(java.lang.Boolean firstPageHeaderIdSuggested) {
    this.firstPageHeaderIdSuggested = firstPageHeaderIdSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to margin_bottom.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMarginBottomSuggested() {
    return marginBottomSuggested;
  }

  /**
   * Indicates if there was a suggested change to margin_bottom.
   * @param marginBottomSuggested marginBottomSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setMarginBottomSuggested(java.lang.Boolean marginBottomSuggested) {
    this.marginBottomSuggested = marginBottomSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to margin_left.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMarginLeftSuggested() {
    return marginLeftSuggested;
  }

  /**
   * Indicates if there was a suggested change to margin_left.
   * @param marginLeftSuggested marginLeftSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setMarginLeftSuggested(java.lang.Boolean marginLeftSuggested) {
    this.marginLeftSuggested = marginLeftSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to margin_right.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMarginRightSuggested() {
    return marginRightSuggested;
  }

  /**
   * Indicates if there was a suggested change to margin_right.
   * @param marginRightSuggested marginRightSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setMarginRightSuggested(java.lang.Boolean marginRightSuggested) {
    this.marginRightSuggested = marginRightSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to margin_top.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMarginTopSuggested() {
    return marginTopSuggested;
  }

  /**
   * Indicates if there was a suggested change to margin_top.
   * @param marginTopSuggested marginTopSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setMarginTopSuggested(java.lang.Boolean marginTopSuggested) {
    this.marginTopSuggested = marginTopSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to page_number_start.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPageNumberStartSuggested() {
    return pageNumberStartSuggested;
  }

  /**
   * Indicates if there was a suggested change to page_number_start.
   * @param pageNumberStartSuggested pageNumberStartSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setPageNumberStartSuggested(java.lang.Boolean pageNumberStartSuggested) {
    this.pageNumberStartSuggested = pageNumberStartSuggested;
    return this;
  }

  /**
   * A mask that indicates which of the fields in size have been changed in this suggestion.
   * @return value or {@code null} for none
   */
  public SizeSuggestionState getPageSizeSuggestionState() {
    return pageSizeSuggestionState;
  }

  /**
   * A mask that indicates which of the fields in size have been changed in this suggestion.
   * @param pageSizeSuggestionState pageSizeSuggestionState or {@code null} for none
   */
  public DocumentStyleSuggestionState setPageSizeSuggestionState(SizeSuggestionState pageSizeSuggestionState) {
    this.pageSizeSuggestionState = pageSizeSuggestionState;
    return this;
  }

  /**
   * Indicates if there was a suggested change to use_even_page_header_footer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseEvenPageHeaderFooterSuggested() {
    return useEvenPageHeaderFooterSuggested;
  }

  /**
   * Indicates if there was a suggested change to use_even_page_header_footer.
   * @param useEvenPageHeaderFooterSuggested useEvenPageHeaderFooterSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setUseEvenPageHeaderFooterSuggested(java.lang.Boolean useEvenPageHeaderFooterSuggested) {
    this.useEvenPageHeaderFooterSuggested = useEvenPageHeaderFooterSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to use_first_page_header_footer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseFirstPageHeaderFooterSuggested() {
    return useFirstPageHeaderFooterSuggested;
  }

  /**
   * Indicates if there was a suggested change to use_first_page_header_footer.
   * @param useFirstPageHeaderFooterSuggested useFirstPageHeaderFooterSuggested or {@code null} for none
   */
  public DocumentStyleSuggestionState setUseFirstPageHeaderFooterSuggested(java.lang.Boolean useFirstPageHeaderFooterSuggested) {
    this.useFirstPageHeaderFooterSuggested = useFirstPageHeaderFooterSuggested;
    return this;
  }

  @Override
  public DocumentStyleSuggestionState set(String fieldName, Object value) {
    return (DocumentStyleSuggestionState) super.set(fieldName, value);
  }

  @Override
  public DocumentStyleSuggestionState clone() {
    return (DocumentStyleSuggestionState) super.clone();
  }

}
