
package shiver.me.timbers.aws.sagemaker;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Endpoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RetainAllVariantProperties",
    "EndpointName",
    "ExcludeRetainedVariantProperties",
    "EndpointConfigName",
    "Tags"
})
public class Endpoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties
     * 
     */
    @JsonProperty("RetainAllVariantProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties")
    private CharSequence retainAllVariantProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname
     * 
     */
    @JsonProperty("EndpointName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname")
    private CharSequence endpointName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties
     * 
     */
    @JsonProperty("ExcludeRetainedVariantProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties")
    private List<Property<EndpointVariantProperty>> excludeRetainedVariantProperties = new ArrayList<Property<EndpointVariantProperty>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname
     * 
     */
    @JsonProperty("EndpointConfigName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname")
    private CharSequence endpointConfigName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties
     * 
     */
    @JsonIgnore
    public CharSequence getRetainAllVariantProperties() {
        return retainAllVariantProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties
     * 
     */
    @JsonIgnore
    public void setRetainAllVariantProperties(CharSequence retainAllVariantProperties) {
        this.retainAllVariantProperties = retainAllVariantProperties;
    }

    public Endpoint withRetainAllVariantProperties(CharSequence retainAllVariantProperties) {
        this.retainAllVariantProperties = retainAllVariantProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointName() {
        return endpointName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname
     * 
     */
    @JsonIgnore
    public void setEndpointName(CharSequence endpointName) {
        this.endpointName = endpointName;
    }

    public Endpoint withEndpointName(CharSequence endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties
     * 
     */
    @JsonIgnore
    public List<Property<EndpointVariantProperty>> getExcludeRetainedVariantProperties() {
        return excludeRetainedVariantProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties
     * 
     */
    @JsonIgnore
    public void setExcludeRetainedVariantProperties(List<Property<EndpointVariantProperty>> excludeRetainedVariantProperties) {
        this.excludeRetainedVariantProperties = excludeRetainedVariantProperties;
    }

    public Endpoint withExcludeRetainedVariantProperties(List<Property<EndpointVariantProperty>> excludeRetainedVariantProperties) {
        this.excludeRetainedVariantProperties = excludeRetainedVariantProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointConfigName() {
        return endpointConfigName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname
     * 
     */
    @JsonIgnore
    public void setEndpointConfigName(CharSequence endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    public Endpoint withEndpointConfigName(CharSequence endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Endpoint withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("retainAllVariantProperties", retainAllVariantProperties).append("endpointName", endpointName).append("excludeRetainedVariantProperties", excludeRetainedVariantProperties).append("endpointConfigName", endpointConfigName).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpointName).append(endpointConfigName).append(retainAllVariantProperties).append(excludeRetainedVariantProperties).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endpoint) == false) {
            return false;
        }
        Endpoint rhs = ((Endpoint) other);
        return new EqualsBuilder().append(endpointName, rhs.endpointName).append(endpointConfigName, rhs.endpointConfigName).append(retainAllVariantProperties, rhs.retainAllVariantProperties).append(excludeRetainedVariantProperties, rhs.excludeRetainedVariantProperties).append(tags, rhs.tags).isEquals();
    }

}
