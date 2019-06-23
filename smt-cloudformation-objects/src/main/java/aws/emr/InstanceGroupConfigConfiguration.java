
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceGroupConfigConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Classification",
    "ConfigurationProperties",
    "Configurations"
})
public class InstanceGroupConfigConfiguration implements Property<InstanceGroupConfigConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification
     * 
     */
    @JsonProperty("Classification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification")
    private CharSequence classification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties
     * 
     */
    @JsonProperty("ConfigurationProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties")
    private Map<String, String> configurationProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations")
    private Set<Property<aws.emr.InstanceGroupConfigConfiguration>> configurations = new LinkedHashSet<Property<aws.emr.InstanceGroupConfigConfiguration>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification
     * 
     */
    @JsonIgnore
    public CharSequence getClassification() {
        return classification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification
     * 
     */
    @JsonIgnore
    public void setClassification(CharSequence classification) {
        this.classification = classification;
    }

    public InstanceGroupConfigConfiguration withClassification(CharSequence classification) {
        this.classification = classification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties
     * 
     */
    @JsonIgnore
    public Map<String, String> getConfigurationProperties() {
        return configurationProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties
     * 
     */
    @JsonIgnore
    public void setConfigurationProperties(Map<String, String> configurationProperties) {
        this.configurationProperties = configurationProperties;
    }

    public InstanceGroupConfigConfiguration withConfigurationProperties(Map<String, String> configurationProperties) {
        this.configurationProperties = configurationProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations
     * 
     */
    @JsonIgnore
    public Set<Property<aws.emr.InstanceGroupConfigConfiguration>> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations
     * 
     */
    @JsonIgnore
    public void setConfigurations(Set<Property<aws.emr.InstanceGroupConfigConfiguration>> configurations) {
        this.configurations = configurations;
    }

    public InstanceGroupConfigConfiguration withConfigurations(Set<Property<aws.emr.InstanceGroupConfigConfiguration>> configurations) {
        this.configurations = configurations;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("classification", classification).append("configurationProperties", configurationProperties).append("configurations", configurations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(classification).append(configurationProperties).append(configurations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceGroupConfigConfiguration) == false) {
            return false;
        }
        InstanceGroupConfigConfiguration rhs = ((InstanceGroupConfigConfiguration) other);
        return new EqualsBuilder().append(classification, rhs.classification).append(configurationProperties, rhs.configurationProperties).append(configurations, rhs.configurations).isEquals();
    }

}