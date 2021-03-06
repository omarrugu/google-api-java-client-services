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

package com.google.api.services.games.model;

/**
 * This is a JSON template for room leave diagnostics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoomLeaveDiagnostics extends com.google.api.client.json.GenericJson {

  /**
   * Android network subtype.
   * http://developer.android.com/reference/android/net/NetworkInfo.html#getSubtype()
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer androidNetworkSubtype;

  /**
   * Android network type.
   * http://developer.android.com/reference/android/net/NetworkInfo.html#getType()
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer androidNetworkType;

  /**
   * iOS network type as defined in Reachability.h.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer iosNetworkType;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomLeaveDiagnostics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The MCC+MNC code for the client's network connection. On Android: http://developer.android.com/
   * reference/android/telephony/TelephonyManager.html#getNetworkOperator() On iOS, see: https://dev
   * eloper.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Ref
   * erence.html
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkOperatorCode;

  /**
   * The name of the carrier of the client's network connection. On Android: http://developer.androi
   * d.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName() On iOS: https:
   * //developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Referenc
   * e/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkOperatorName;

  /**
   * Diagnostics about all peer sessions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PeerSessionDiagnostics> peerSession;

  static {
    // hack to force ProGuard to consider PeerSessionDiagnostics used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PeerSessionDiagnostics.class);
  }

  /**
   * Whether or not sockets were used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean socketsUsed;

  /**
   * Android network subtype.
   * http://developer.android.com/reference/android/net/NetworkInfo.html#getSubtype()
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAndroidNetworkSubtype() {
    return androidNetworkSubtype;
  }

  /**
   * Android network subtype.
   * http://developer.android.com/reference/android/net/NetworkInfo.html#getSubtype()
   * @param androidNetworkSubtype androidNetworkSubtype or {@code null} for none
   */
  public RoomLeaveDiagnostics setAndroidNetworkSubtype(java.lang.Integer androidNetworkSubtype) {
    this.androidNetworkSubtype = androidNetworkSubtype;
    return this;
  }

  /**
   * Android network type.
   * http://developer.android.com/reference/android/net/NetworkInfo.html#getType()
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAndroidNetworkType() {
    return androidNetworkType;
  }

  /**
   * Android network type.
   * http://developer.android.com/reference/android/net/NetworkInfo.html#getType()
   * @param androidNetworkType androidNetworkType or {@code null} for none
   */
  public RoomLeaveDiagnostics setAndroidNetworkType(java.lang.Integer androidNetworkType) {
    this.androidNetworkType = androidNetworkType;
    return this;
  }

  /**
   * iOS network type as defined in Reachability.h.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIosNetworkType() {
    return iosNetworkType;
  }

  /**
   * iOS network type as defined in Reachability.h.
   * @param iosNetworkType iosNetworkType or {@code null} for none
   */
  public RoomLeaveDiagnostics setIosNetworkType(java.lang.Integer iosNetworkType) {
    this.iosNetworkType = iosNetworkType;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomLeaveDiagnostics.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomLeaveDiagnostics.
   * @param kind kind or {@code null} for none
   */
  public RoomLeaveDiagnostics setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The MCC+MNC code for the client's network connection. On Android: http://developer.android.com/
   * reference/android/telephony/TelephonyManager.html#getNetworkOperator() On iOS, see: https://dev
   * eloper.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Ref
   * erence.html
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkOperatorCode() {
    return networkOperatorCode;
  }

  /**
   * The MCC+MNC code for the client's network connection. On Android: http://developer.android.com/
   * reference/android/telephony/TelephonyManager.html#getNetworkOperator() On iOS, see: https://dev
   * eloper.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Ref
   * erence.html
   * @param networkOperatorCode networkOperatorCode or {@code null} for none
   */
  public RoomLeaveDiagnostics setNetworkOperatorCode(java.lang.String networkOperatorCode) {
    this.networkOperatorCode = networkOperatorCode;
    return this;
  }

  /**
   * The name of the carrier of the client's network connection. On Android: http://developer.androi
   * d.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName() On iOS: https:
   * //developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Referenc
   * e/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkOperatorName() {
    return networkOperatorName;
  }

  /**
   * The name of the carrier of the client's network connection. On Android: http://developer.androi
   * d.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName() On iOS: https:
   * //developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Referenc
   * e/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
   * @param networkOperatorName networkOperatorName or {@code null} for none
   */
  public RoomLeaveDiagnostics setNetworkOperatorName(java.lang.String networkOperatorName) {
    this.networkOperatorName = networkOperatorName;
    return this;
  }

  /**
   * Diagnostics about all peer sessions.
   * @return value or {@code null} for none
   */
  public java.util.List<PeerSessionDiagnostics> getPeerSession() {
    return peerSession;
  }

  /**
   * Diagnostics about all peer sessions.
   * @param peerSession peerSession or {@code null} for none
   */
  public RoomLeaveDiagnostics setPeerSession(java.util.List<PeerSessionDiagnostics> peerSession) {
    this.peerSession = peerSession;
    return this;
  }

  /**
   * Whether or not sockets were used.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSocketsUsed() {
    return socketsUsed;
  }

  /**
   * Whether or not sockets were used.
   * @param socketsUsed socketsUsed or {@code null} for none
   */
  public RoomLeaveDiagnostics setSocketsUsed(java.lang.Boolean socketsUsed) {
    this.socketsUsed = socketsUsed;
    return this;
  }

  @Override
  public RoomLeaveDiagnostics set(String fieldName, Object value) {
    return (RoomLeaveDiagnostics) super.set(fieldName, value);
  }

  @Override
  public RoomLeaveDiagnostics clone() {
    return (RoomLeaveDiagnostics) super.clone();
  }

}
