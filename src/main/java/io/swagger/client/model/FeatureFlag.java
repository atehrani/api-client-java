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
import io.swagger.client.model.FeatureFlagConfig;
import io.swagger.client.model.Links;
import io.swagger.client.model.Member;
import io.swagger.client.model.Variation;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FeatureFlag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T14:52:38.201-07:00")
public class FeatureFlag {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("creationDate")
  private BigDecimal creationDate = null;

  @SerializedName("includeInSnippet")
  private Boolean includeInSnippet = null;

  @SerializedName("temporary")
  private Boolean temporary = null;

  @SerializedName("maintainerId")
  private String maintainerId = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("variations")
  private List<Variation> variations = null;

  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_maintainer")
  private Member maintainer = null;

  @SerializedName("environments")
  private Map<String, FeatureFlagConfig> environments = null;

  public FeatureFlag key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FeatureFlag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureFlag kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public FeatureFlag creationDate(BigDecimal creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(BigDecimal creationDate) {
    this.creationDate = creationDate;
  }

  public FeatureFlag includeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
    return this;
  }

   /**
   * Get includeInSnippet
   * @return includeInSnippet
  **/
  @ApiModelProperty(value = "")
  public Boolean getIncludeInSnippet() {
    return includeInSnippet;
  }

  public void setIncludeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
  }

  public FeatureFlag temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * Get temporary
   * @return temporary
  **/
  @ApiModelProperty(value = "")
  public Boolean getTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public FeatureFlag maintainerId(String maintainerId) {
    this.maintainerId = maintainerId;
    return this;
  }

   /**
   * Get maintainerId
   * @return maintainerId
  **/
  @ApiModelProperty(value = "")
  public String getMaintainerId() {
    return maintainerId;
  }

  public void setMaintainerId(String maintainerId) {
    this.maintainerId = maintainerId;
  }

  public FeatureFlag tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FeatureFlag addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FeatureFlag variations(List<Variation> variations) {
    this.variations = variations;
    return this;
  }

  public FeatureFlag addVariationsItem(Variation variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<Variation>();
    }
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Get variations
   * @return variations
  **/
  @ApiModelProperty(value = "")
  public List<Variation> getVariations() {
    return variations;
  }

  public void setVariations(List<Variation> variations) {
    this.variations = variations;
  }

  public FeatureFlag links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public FeatureFlag maintainer(Member maintainer) {
    this.maintainer = maintainer;
    return this;
  }

   /**
   * Get maintainer
   * @return maintainer
  **/
  @ApiModelProperty(value = "")
  public Member getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(Member maintainer) {
    this.maintainer = maintainer;
  }

  public FeatureFlag environments(Map<String, FeatureFlagConfig> environments) {
    this.environments = environments;
    return this;
  }

  public FeatureFlag putEnvironmentsItem(String key, FeatureFlagConfig environmentsItem) {
    if (this.environments == null) {
      this.environments = new HashMap<String, FeatureFlagConfig>();
    }
    this.environments.put(key, environmentsItem);
    return this;
  }

   /**
   * Get environments
   * @return environments
  **/
  @ApiModelProperty(value = "")
  public Map<String, FeatureFlagConfig> getEnvironments() {
    return environments;
  }

  public void setEnvironments(Map<String, FeatureFlagConfig> environments) {
    this.environments = environments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlag featureFlag = (FeatureFlag) o;
    return Objects.equals(this.key, featureFlag.key) &&
        Objects.equals(this.name, featureFlag.name) &&
        Objects.equals(this.kind, featureFlag.kind) &&
        Objects.equals(this.creationDate, featureFlag.creationDate) &&
        Objects.equals(this.includeInSnippet, featureFlag.includeInSnippet) &&
        Objects.equals(this.temporary, featureFlag.temporary) &&
        Objects.equals(this.maintainerId, featureFlag.maintainerId) &&
        Objects.equals(this.tags, featureFlag.tags) &&
        Objects.equals(this.variations, featureFlag.variations) &&
        Objects.equals(this.links, featureFlag.links) &&
        Objects.equals(this.maintainer, featureFlag.maintainer) &&
        Objects.equals(this.environments, featureFlag.environments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, kind, creationDate, includeInSnippet, temporary, maintainerId, tags, variations, links, maintainer, environments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlag {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    includeInSnippet: ").append(toIndentedString(includeInSnippet)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    maintainerId: ").append(toIndentedString(maintainerId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

