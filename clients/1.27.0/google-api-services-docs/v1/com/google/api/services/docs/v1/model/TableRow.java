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
 * The contents and style of a row in a Table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableRow extends com.google.api.client.json.GenericJson {

  /**
   * The zero-based end index of this row, exclusive, in Unicode code units of the UTF-16 encoding.
   *
   * Unicode code units of the UTF-16 encoding means that surrogate pairs consume two indices. For
   * example, the "GRINNING FACE" emoji would be represented as "\uD83D\uDE00" and would consume two
   * indices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer endIndex;

  /**
   * The zero-based start index of this row, in Unicode code units of the UTF-16 encoding.
   *
   * Unicode code units of the UTF-16 encoding means that surrogate pairs consume two indices. For
   * example, the "GRINNING FACE" emoji would be represented as "\uD83D\uDE00" and would consume two
   * indices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedDeletionIds;

  /**
   * The suggested insertion IDs. A TableRow may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedInsertionIds;

  /**
   * The suggested style changes to this row, keyed by suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedTableRowStyle> suggestedTableRowStyleChanges;

  static {
    // hack to force ProGuard to consider SuggestedTableRowStyle used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SuggestedTableRowStyle.class);
  }

  /**
   * The contents and style of each cell in this row.
   *
   * It is possible for a table to be non-rectangular, so some rows may have a different number of
   * cells than other rows in the same table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableCell> tableCells;

  static {
    // hack to force ProGuard to consider TableCell used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TableCell.class);
  }

  /**
   * The style of the table row.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableRowStyle tableRowStyle;

  /**
   * The zero-based end index of this row, exclusive, in Unicode code units of the UTF-16 encoding.
   *
   * Unicode code units of the UTF-16 encoding means that surrogate pairs consume two indices. For
   * example, the "GRINNING FACE" emoji would be represented as "\uD83D\uDE00" and would consume two
   * indices.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEndIndex() {
    return endIndex;
  }

  /**
   * The zero-based end index of this row, exclusive, in Unicode code units of the UTF-16 encoding.
   *
   * Unicode code units of the UTF-16 encoding means that surrogate pairs consume two indices. For
   * example, the "GRINNING FACE" emoji would be represented as "\uD83D\uDE00" and would consume two
   * indices.
   * @param endIndex endIndex or {@code null} for none
   */
  public TableRow setEndIndex(java.lang.Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * The zero-based start index of this row, in Unicode code units of the UTF-16 encoding.
   *
   * Unicode code units of the UTF-16 encoding means that surrogate pairs consume two indices. For
   * example, the "GRINNING FACE" emoji would be represented as "\uD83D\uDE00" and would consume two
   * indices.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * The zero-based start index of this row, in Unicode code units of the UTF-16 encoding.
   *
   * Unicode code units of the UTF-16 encoding means that surrogate pairs consume two indices. For
   * example, the "GRINNING FACE" emoji would be represented as "\uD83D\uDE00" and would consume two
   * indices.
   * @param startIndex startIndex or {@code null} for none
   */
  public TableRow setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedDeletionIds() {
    return suggestedDeletionIds;
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @param suggestedDeletionIds suggestedDeletionIds or {@code null} for none
   */
  public TableRow setSuggestedDeletionIds(java.util.List<java.lang.String> suggestedDeletionIds) {
    this.suggestedDeletionIds = suggestedDeletionIds;
    return this;
  }

  /**
   * The suggested insertion IDs. A TableRow may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedInsertionIds() {
    return suggestedInsertionIds;
  }

  /**
   * The suggested insertion IDs. A TableRow may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * @param suggestedInsertionIds suggestedInsertionIds or {@code null} for none
   */
  public TableRow setSuggestedInsertionIds(java.util.List<java.lang.String> suggestedInsertionIds) {
    this.suggestedInsertionIds = suggestedInsertionIds;
    return this;
  }

  /**
   * The suggested style changes to this row, keyed by suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedTableRowStyle> getSuggestedTableRowStyleChanges() {
    return suggestedTableRowStyleChanges;
  }

  /**
   * The suggested style changes to this row, keyed by suggestion ID.
   * @param suggestedTableRowStyleChanges suggestedTableRowStyleChanges or {@code null} for none
   */
  public TableRow setSuggestedTableRowStyleChanges(java.util.Map<String, SuggestedTableRowStyle> suggestedTableRowStyleChanges) {
    this.suggestedTableRowStyleChanges = suggestedTableRowStyleChanges;
    return this;
  }

  /**
   * The contents and style of each cell in this row.
   *
   * It is possible for a table to be non-rectangular, so some rows may have a different number of
   * cells than other rows in the same table.
   * @return value or {@code null} for none
   */
  public java.util.List<TableCell> getTableCells() {
    return tableCells;
  }

  /**
   * The contents and style of each cell in this row.
   *
   * It is possible for a table to be non-rectangular, so some rows may have a different number of
   * cells than other rows in the same table.
   * @param tableCells tableCells or {@code null} for none
   */
  public TableRow setTableCells(java.util.List<TableCell> tableCells) {
    this.tableCells = tableCells;
    return this;
  }

  /**
   * The style of the table row.
   * @return value or {@code null} for none
   */
  public TableRowStyle getTableRowStyle() {
    return tableRowStyle;
  }

  /**
   * The style of the table row.
   * @param tableRowStyle tableRowStyle or {@code null} for none
   */
  public TableRow setTableRowStyle(TableRowStyle tableRowStyle) {
    this.tableRowStyle = tableRowStyle;
    return this;
  }

  @Override
  public TableRow set(String fieldName, Object value) {
    return (TableRow) super.set(fieldName, value);
  }

  @Override
  public TableRow clone() {
    return (TableRow) super.clone();
  }

}
