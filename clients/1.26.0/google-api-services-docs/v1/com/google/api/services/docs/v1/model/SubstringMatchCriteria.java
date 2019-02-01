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
 * A criteria that matches a specific string of text in the document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubstringMatchCriteria extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether the search should respect case:
   *
   * - `True`: the search is case sensitive. - `False`: the search is case insensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean matchCase;

  /**
   * The text to search for in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Indicates whether the search should respect case:
   *
   * - `True`: the search is case sensitive. - `False`: the search is case insensitive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMatchCase() {
    return matchCase;
  }

  /**
   * Indicates whether the search should respect case:
   *
   * - `True`: the search is case sensitive. - `False`: the search is case insensitive.
   * @param matchCase matchCase or {@code null} for none
   */
  public SubstringMatchCriteria setMatchCase(java.lang.Boolean matchCase) {
    this.matchCase = matchCase;
    return this;
  }

  /**
   * The text to search for in the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The text to search for in the document.
   * @param text text or {@code null} for none
   */
  public SubstringMatchCriteria setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public SubstringMatchCriteria set(String fieldName, Object value) {
    return (SubstringMatchCriteria) super.set(fieldName, value);
  }

  @Override
  public SubstringMatchCriteria clone() {
    return (SubstringMatchCriteria) super.clone();
  }

}
