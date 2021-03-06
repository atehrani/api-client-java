/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Variation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureFlagBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T14:52:38.201-07:00")
public class FeatureFlagBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("variations")
  private List<Variation> variations = new ArrayList<Variation>();

  @SerializedName("temporary")
  private Boolean temporary = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("includeInSnippet")
  private Boolean includeInSnippet = null;

  public FeatureFlagBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name for the feature flag. Remember to note if this flag is intended to be temporary or permanent.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A human-friendly name for the feature flag. Remember to note if this flag is intended to be temporary or permanent.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureFlagBody key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A unique key that will be used to reference the flag in your code
   * @return key
  **/
  @ApiModelProperty(required = true, value = "A unique key that will be used to reference the flag in your code")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FeatureFlagBody variations(List<Variation> variations) {
    this.variations = variations;
    return this;
  }

  public FeatureFlagBody addVariationsItem(Variation variationsItem) {
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * An array of possible variations for the flag.
   * @return variations
  **/
  @ApiModelProperty(required = true, value = "An array of possible variations for the flag.")
  public List<Variation> getVariations() {
    return variations;
  }

  public void setVariations(List<Variation> variations) {
    this.variations = variations;
  }

  public FeatureFlagBody temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * Whether or not the flag is a temporary flag
   * @return temporary
  **/
  @ApiModelProperty(value = "Whether or not the flag is a temporary flag")
  public Boolean getTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public FeatureFlagBody tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FeatureFlagBody addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags for the feature flag
   * @return tags
  **/
  @ApiModelProperty(value = "Tags for the feature flag")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FeatureFlagBody includeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
    return this;
  }

   /**
   * Whether or not this flag should be made available to the client-side JavaScript SDK
   * @return includeInSnippet
  **/
  @ApiModelProperty(value = "Whether or not this flag should be made available to the client-side JavaScript SDK")
  public Boolean getIncludeInSnippet() {
    return includeInSnippet;
  }

  public void setIncludeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagBody featureFlagBody = (FeatureFlagBody) o;
    return Objects.equals(this.name, featureFlagBody.name) &&
        Objects.equals(this.key, featureFlagBody.key) &&
        Objects.equals(this.variations, featureFlagBody.variations) &&
        Objects.equals(this.temporary, featureFlagBody.temporary) &&
        Objects.equals(this.tags, featureFlagBody.tags) &&
        Objects.equals(this.includeInSnippet, featureFlagBody.includeInSnippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, variations, temporary, tags, includeInSnippet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    includeInSnippet: ").append(toIndentedString(includeInSnippet)).append("\n");
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

