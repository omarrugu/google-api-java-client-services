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

package com.google.api.services.cloudprivatecatalogproducer.v1beta1.model;

/**
 * An association tuple that pairs a `Catalog` to a resource that can use the `Catalog`. After
 * association, a google.cloud.privatecatalog.v1beta1.Catalog becomes available to consumers under
 * specified Association.resource and all of its child nodes. Users who have the
 * `cloudprivatecatalog.targets.get` permission on any of the resource nodes can access the catalog
 * and child products under the node.
 *
 * For example, suppose the cloud resource hierarchy is as follows:
 *
 * * organizations/example.com   * folders/team     * projects/test
 *
 * After creating an association with `organizations/example.com`, the catalog `catalogs/1`  is
 * accessible from the following paths:
 *
 * * organizations/example.com * folders/team * projects/test
 *
 * Users can access them by google.cloud.v1beta1.PrivateCatalog.SearchCatalogs action.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Private Catalog Producer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPrivatecatalogproducerV1beta1Association extends com.google.api.client.json.GenericJson {

  /**
   * The creation time of the association.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The resource name of the catalog association, in the format
   * `catalogs/{catalog_id}/associations/{association_id}'.
   *
   * A unique identifier for the catalog association, which is generated by catalog service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The user-supplied fully qualified name of the `Resource` associated to the `Catalog`.
   * It supports `Organization`, `Folder`, and `Project`. Values are of the form
   *
   * * `//cloudresourcemanager.googleapis.com/projects/{product_number}` *
   * `//cloudresourcemanager.googleapis.com/folders/{folder_id}` *
   * `//cloudresourcemanager.googleapis.com/organizations/{organization_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * The creation time of the association.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The creation time of the association.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Association setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The resource name of the catalog association, in the format
   * `catalogs/{catalog_id}/associations/{association_id}'.
   *
   * A unique identifier for the catalog association, which is generated by catalog service.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the catalog association, in the format
   * `catalogs/{catalog_id}/associations/{association_id}'.
   *
   * A unique identifier for the catalog association, which is generated by catalog service.
   * @param name name or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Association setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The user-supplied fully qualified name of the `Resource` associated to the `Catalog`.
   * It supports `Organization`, `Folder`, and `Project`. Values are of the form
   *
   * * `//cloudresourcemanager.googleapis.com/projects/{product_number}` *
   * `//cloudresourcemanager.googleapis.com/folders/{folder_id}` *
   * `//cloudresourcemanager.googleapis.com/organizations/{organization_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Required. The user-supplied fully qualified name of the `Resource` associated to the `Catalog`.
   * It supports `Organization`, `Folder`, and `Project`. Values are of the form
   *
   * * `//cloudresourcemanager.googleapis.com/projects/{product_number}` *
   * `//cloudresourcemanager.googleapis.com/folders/{folder_id}` *
   * `//cloudresourcemanager.googleapis.com/organizations/{organization_id}`
   * @param resource resource or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Association setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1Association set(String fieldName, Object value) {
    return (GoogleCloudPrivatecatalogproducerV1beta1Association) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1Association clone() {
    return (GoogleCloudPrivatecatalogproducerV1beta1Association) super.clone();
  }

}