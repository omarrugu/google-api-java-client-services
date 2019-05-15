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

package com.google.api.services.analyticsreporting.v4.model;

/**
 * The request to fetch User Report from Reporting API `userActivity:get` call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchUserActivityRequest extends com.google.api.client.json.GenericJson {

  /**
   * Set of all activity types being requested. Only acvities matching these types will be returned
   * in the response. If empty, all activies will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> activityTypes;

  /**
   * Date range for which to retrieve the user activity. If a date range is not provided, the
   * default date range is (startDate: current date - 7 days, endDate: current date - 1 day).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateRange dateRange;

  /**
   * Page size is for paging and specifies the maximum number of returned rows. Page size should be
   * > 0. If the value is 0 or if the field isn't specified, the request returns the default of 1000
   * rows per page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A continuation token to get the next page of the results. Adding this to the request will
   * return the rows after the pageToken. The pageToken should be the value returned in the
   * nextPageToken parameter in the response to the
   * [SearchUserActivityRequest](#SearchUserActivityRequest) request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Required. Unique user Id to query for. Every
   * [SearchUserActivityRequest](#SearchUserActivityRequest) must contain this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User user;

  /**
   * Required. The Analytics [view ID](https://support.google.com/analytics/answer/1009618) from
   * which to retrieve data. Every [SearchUserActivityRequest](#SearchUserActivityRequest) must
   * contain the `viewId`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String viewId;

  /**
   * Set of all activity types being requested. Only acvities matching these types will be returned
   * in the response. If empty, all activies will be returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getActivityTypes() {
    return activityTypes;
  }

  /**
   * Set of all activity types being requested. Only acvities matching these types will be returned
   * in the response. If empty, all activies will be returned.
   * @param activityTypes activityTypes or {@code null} for none
   */
  public SearchUserActivityRequest setActivityTypes(java.util.List<java.lang.String> activityTypes) {
    this.activityTypes = activityTypes;
    return this;
  }

  /**
   * Date range for which to retrieve the user activity. If a date range is not provided, the
   * default date range is (startDate: current date - 7 days, endDate: current date - 1 day).
   * @return value or {@code null} for none
   */
  public DateRange getDateRange() {
    return dateRange;
  }

  /**
   * Date range for which to retrieve the user activity. If a date range is not provided, the
   * default date range is (startDate: current date - 7 days, endDate: current date - 1 day).
   * @param dateRange dateRange or {@code null} for none
   */
  public SearchUserActivityRequest setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Page size is for paging and specifies the maximum number of returned rows. Page size should be
   * > 0. If the value is 0 or if the field isn't specified, the request returns the default of 1000
   * rows per page.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Page size is for paging and specifies the maximum number of returned rows. Page size should be
   * > 0. If the value is 0 or if the field isn't specified, the request returns the default of 1000
   * rows per page.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchUserActivityRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A continuation token to get the next page of the results. Adding this to the request will
   * return the rows after the pageToken. The pageToken should be the value returned in the
   * nextPageToken parameter in the response to the
   * [SearchUserActivityRequest](#SearchUserActivityRequest) request.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A continuation token to get the next page of the results. Adding this to the request will
   * return the rows after the pageToken. The pageToken should be the value returned in the
   * nextPageToken parameter in the response to the
   * [SearchUserActivityRequest](#SearchUserActivityRequest) request.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchUserActivityRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Required. Unique user Id to query for. Every
   * [SearchUserActivityRequest](#SearchUserActivityRequest) must contain this field.
   * @return value or {@code null} for none
   */
  public User getUser() {
    return user;
  }

  /**
   * Required. Unique user Id to query for. Every
   * [SearchUserActivityRequest](#SearchUserActivityRequest) must contain this field.
   * @param user user or {@code null} for none
   */
  public SearchUserActivityRequest setUser(User user) {
    this.user = user;
    return this;
  }

  /**
   * Required. The Analytics [view ID](https://support.google.com/analytics/answer/1009618) from
   * which to retrieve data. Every [SearchUserActivityRequest](#SearchUserActivityRequest) must
   * contain the `viewId`.
   * @return value or {@code null} for none
   */
  public java.lang.String getViewId() {
    return viewId;
  }

  /**
   * Required. The Analytics [view ID](https://support.google.com/analytics/answer/1009618) from
   * which to retrieve data. Every [SearchUserActivityRequest](#SearchUserActivityRequest) must
   * contain the `viewId`.
   * @param viewId viewId or {@code null} for none
   */
  public SearchUserActivityRequest setViewId(java.lang.String viewId) {
    this.viewId = viewId;
    return this;
  }

  @Override
  public SearchUserActivityRequest set(String fieldName, Object value) {
    return (SearchUserActivityRequest) super.set(fieldName, value);
  }

  @Override
  public SearchUserActivityRequest clone() {
    return (SearchUserActivityRequest) super.clone();
  }

}