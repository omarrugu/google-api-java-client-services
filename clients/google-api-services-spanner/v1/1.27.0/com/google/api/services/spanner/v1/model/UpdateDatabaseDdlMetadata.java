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

package com.google.api.services.spanner.v1.model;

/**
 * Metadata type for the operation returned by UpdateDatabaseDdl.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateDatabaseDdlMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Reports the commit timestamps of all statements that have succeeded so far, where
   * `commit_timestamps[i]` is the commit timestamp for the statement `statements[i]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<String> commitTimestamps;

  /**
   * The database being modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String database;

  /**
   * For an update this list contains all the statements. For an individual statement, this list
   * contains only that statement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> statements;

  /**
   * Reports the commit timestamps of all statements that have succeeded so far, where
   * `commit_timestamps[i]` is the commit timestamp for the statement `statements[i]`.
   * @return value or {@code null} for none
   */
  public java.util.List<String> getCommitTimestamps() {
    return commitTimestamps;
  }

  /**
   * Reports the commit timestamps of all statements that have succeeded so far, where
   * `commit_timestamps[i]` is the commit timestamp for the statement `statements[i]`.
   * @param commitTimestamps commitTimestamps or {@code null} for none
   */
  public UpdateDatabaseDdlMetadata setCommitTimestamps(java.util.List<String> commitTimestamps) {
    this.commitTimestamps = commitTimestamps;
    return this;
  }

  /**
   * The database being modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabase() {
    return database;
  }

  /**
   * The database being modified.
   * @param database database or {@code null} for none
   */
  public UpdateDatabaseDdlMetadata setDatabase(java.lang.String database) {
    this.database = database;
    return this;
  }

  /**
   * For an update this list contains all the statements. For an individual statement, this list
   * contains only that statement.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStatements() {
    return statements;
  }

  /**
   * For an update this list contains all the statements. For an individual statement, this list
   * contains only that statement.
   * @param statements statements or {@code null} for none
   */
  public UpdateDatabaseDdlMetadata setStatements(java.util.List<java.lang.String> statements) {
    this.statements = statements;
    return this;
  }

  @Override
  public UpdateDatabaseDdlMetadata set(String fieldName, Object value) {
    return (UpdateDatabaseDdlMetadata) super.set(fieldName, value);
  }

  @Override
  public UpdateDatabaseDdlMetadata clone() {
    return (UpdateDatabaseDdlMetadata) super.clone();
  }

}