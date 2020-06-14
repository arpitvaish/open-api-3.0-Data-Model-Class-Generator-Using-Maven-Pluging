/*
 * Taxation Domain Model
 * Domain model for Tax data for Reporting Engine
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.dataModel;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
/**
 * CollectionData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-14T08:14:19.396797400+05:30[Asia/Calcutta]")
public class CollectionData {
  @JsonProperty("creationDate")
  private LocalDate creationDate = null;

  @JsonProperty("creationReference")
  private String creationReference = null;

  @JsonProperty("collectionDate")
  private LocalDate collectionDate = null;

  @JsonProperty("collectionReference")
  private String collectionReference = null;

  public CollectionData creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public CollectionData creationReference(String creationReference) {
    this.creationReference = creationReference;
    return this;
  }

   /**
   * Get creationReference
   * @return creationReference
  **/
  @Schema(description = "")
  public String getCreationReference() {
    return creationReference;
  }

  public void setCreationReference(String creationReference) {
    this.creationReference = creationReference;
  }

  public CollectionData collectionDate(LocalDate collectionDate) {
    this.collectionDate = collectionDate;
    return this;
  }

   /**
   * Get collectionDate
   * @return collectionDate
  **/
  @Schema(description = "")
  public LocalDate getCollectionDate() {
    return collectionDate;
  }

  public void setCollectionDate(LocalDate collectionDate) {
    this.collectionDate = collectionDate;
  }

  public CollectionData collectionReference(String collectionReference) {
    this.collectionReference = collectionReference;
    return this;
  }

   /**
   * Get collectionReference
   * @return collectionReference
  **/
  @Schema(description = "")
  public String getCollectionReference() {
    return collectionReference;
  }

  public void setCollectionReference(String collectionReference) {
    this.collectionReference = collectionReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionData collectionData = (CollectionData) o;
    return Objects.equals(this.creationDate, collectionData.creationDate) &&
        Objects.equals(this.creationReference, collectionData.creationReference) &&
        Objects.equals(this.collectionDate, collectionData.collectionDate) &&
        Objects.equals(this.collectionReference, collectionData.collectionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, creationReference, collectionDate, collectionReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionData {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creationReference: ").append(toIndentedString(creationReference)).append("\n");
    sb.append("    collectionDate: ").append(toIndentedString(collectionDate)).append("\n");
    sb.append("    collectionReference: ").append(toIndentedString(collectionReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
