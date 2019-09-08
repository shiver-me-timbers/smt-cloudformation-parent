
package shiver.me.timbers.aws.config;

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


/**
 * ConfigurationAggregator
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccountAggregationSources",
    "ConfigurationAggregatorName",
    "OrganizationAggregationSource"
})
public class ConfigurationAggregator {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources
     * 
     */
    @JsonProperty("AccountAggregationSources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources")
    private List<Property<ConfigurationAggregatorAccountAggregationSource>> accountAggregationSources = new ArrayList<Property<ConfigurationAggregatorAccountAggregationSource>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname
     * 
     */
    @JsonProperty("ConfigurationAggregatorName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname")
    private CharSequence configurationAggregatorName;
    /**
     * ConfigurationAggregatorOrganizationAggregationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html
     * 
     */
    @JsonProperty("OrganizationAggregationSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html")
    private Property<ConfigurationAggregatorOrganizationAggregationSource> organizationAggregationSource;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources
     * 
     */
    @JsonIgnore
    public List<Property<ConfigurationAggregatorAccountAggregationSource>> getAccountAggregationSources() {
        return accountAggregationSources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources
     * 
     */
    @JsonIgnore
    public void setAccountAggregationSources(List<Property<ConfigurationAggregatorAccountAggregationSource>> accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
    }

    public ConfigurationAggregator withAccountAggregationSources(List<Property<ConfigurationAggregatorAccountAggregationSource>> accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationAggregatorName() {
        return configurationAggregatorName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname
     * 
     */
    @JsonIgnore
    public void setConfigurationAggregatorName(CharSequence configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    public ConfigurationAggregator withConfigurationAggregatorName(CharSequence configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
        return this;
    }

    /**
     * ConfigurationAggregatorOrganizationAggregationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationAggregatorOrganizationAggregationSource> getOrganizationAggregationSource() {
        return organizationAggregationSource;
    }

    /**
     * ConfigurationAggregatorOrganizationAggregationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html
     * 
     */
    @JsonIgnore
    public void setOrganizationAggregationSource(Property<ConfigurationAggregatorOrganizationAggregationSource> organizationAggregationSource) {
        this.organizationAggregationSource = organizationAggregationSource;
    }

    public ConfigurationAggregator withOrganizationAggregationSource(Property<ConfigurationAggregatorOrganizationAggregationSource> organizationAggregationSource) {
        this.organizationAggregationSource = organizationAggregationSource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accountAggregationSources", accountAggregationSources).append("configurationAggregatorName", configurationAggregatorName).append("organizationAggregationSource", organizationAggregationSource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountAggregationSources).append(organizationAggregationSource).append(configurationAggregatorName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationAggregator) == false) {
            return false;
        }
        ConfigurationAggregator rhs = ((ConfigurationAggregator) other);
        return new EqualsBuilder().append(accountAggregationSources, rhs.accountAggregationSources).append(organizationAggregationSource, rhs.organizationAggregationSource).append(configurationAggregatorName, rhs.configurationAggregatorName).isEquals();
    }

}
