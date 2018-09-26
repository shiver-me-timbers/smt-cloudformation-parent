
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Configuration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Classification",
    "ConfigurationProperties",
    "Configurations"
})
public class Configuration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification
     * 
     */
    @JsonProperty("Classification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification")
    private CharSequence classification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurationproperties
     * 
     */
    @JsonProperty("ConfigurationProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurationproperties")
    private Map<String, String> configurationProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations")
    private Set<Configuration> configurations = new LinkedHashSet<Configuration>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification
     * 
     */
    public CharSequence getClassification() {
        return classification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification
     * 
     */
    public void setClassification(CharSequence classification) {
        this.classification = classification;
    }

    public Configuration withClassification(CharSequence classification) {
        this.classification = classification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurationproperties
     * 
     */
    public Map<String, String> getConfigurationProperties() {
        return configurationProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurationproperties
     * 
     */
    public void setConfigurationProperties(Map<String, String> configurationProperties) {
        this.configurationProperties = configurationProperties;
    }

    public Configuration withConfigurationProperties(Map<String, String> configurationProperties) {
        this.configurationProperties = configurationProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations
     * 
     */
    public Set<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations
     * 
     */
    public void setConfigurations(Set<Configuration> configurations) {
        this.configurations = configurations;
    }

    public Configuration withConfigurations(Set<Configuration> configurations) {
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
        if ((other instanceof Configuration) == false) {
            return false;
        }
        Configuration rhs = ((Configuration) other);
        return new EqualsBuilder().append(classification, rhs.classification).append(configurationProperties, rhs.configurationProperties).append(configurations, rhs.configurations).isEquals();
    }

}
