
package aws.elasticache;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ParameterGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CacheParameterGroupFamily",
    "Description",
    "Properties"
})
public class ParameterGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-cacheparametergroupfamily
     * 
     */
    @JsonProperty("CacheParameterGroupFamily")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-cacheparametergroupfamily")
    private java.lang.String cacheParameterGroupFamily;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-description")
    private java.lang.String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-properties
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-properties")
    private Map<String, String> properties;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-cacheparametergroupfamily
     * 
     */
    @JsonProperty("CacheParameterGroupFamily")
    public java.lang.String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-cacheparametergroupfamily
     * 
     */
    @JsonProperty("CacheParameterGroupFamily")
    public void setCacheParameterGroupFamily(java.lang.String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }

    public ParameterGroup withCacheParameterGroupFamily(java.lang.String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-description
     * 
     */
    @JsonProperty("Description")
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public ParameterGroup withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-properties
     * 
     */
    @JsonProperty("Properties")
    public Map<String, String> getProperties() {
        return properties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-properties
     * 
     */
    @JsonProperty("Properties")
    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public ParameterGroup withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("cacheParameterGroupFamily", cacheParameterGroupFamily).append("description", description).append("properties", properties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cacheParameterGroupFamily).append(description).append(properties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParameterGroup) == false) {
            return false;
        }
        ParameterGroup rhs = ((ParameterGroup) other);
        return new EqualsBuilder().append(cacheParameterGroupFamily, rhs.cacheParameterGroupFamily).append(description, rhs.description).append(properties, rhs.properties).isEquals();
    }

}
