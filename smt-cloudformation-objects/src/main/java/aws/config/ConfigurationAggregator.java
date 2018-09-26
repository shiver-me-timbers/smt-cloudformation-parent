
package aws.config;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationAggregator
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private List<AccountAggregationSource> accountAggregationSources = new ArrayList<AccountAggregationSource>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname
     * 
     */
    @JsonProperty("ConfigurationAggregatorName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname")
    private CharSequence configurationAggregatorName;
    /**
     * OrganizationAggregationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html
     * 
     */
    @JsonProperty("OrganizationAggregationSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html")
    private OrganizationAggregationSource organizationAggregationSource;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources
     * 
     */
    public List<AccountAggregationSource> getAccountAggregationSources() {
        return accountAggregationSources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources
     * 
     */
    public void setAccountAggregationSources(List<AccountAggregationSource> accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
    }

    public ConfigurationAggregator withAccountAggregationSources(List<AccountAggregationSource> accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname
     * 
     */
    public CharSequence getConfigurationAggregatorName() {
        return configurationAggregatorName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname
     * 
     */
    public void setConfigurationAggregatorName(CharSequence configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    public ConfigurationAggregator withConfigurationAggregatorName(CharSequence configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
        return this;
    }

    /**
     * OrganizationAggregationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html
     * 
     */
    public OrganizationAggregationSource getOrganizationAggregationSource() {
        return organizationAggregationSource;
    }

    /**
     * OrganizationAggregationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html
     * 
     */
    public void setOrganizationAggregationSource(OrganizationAggregationSource organizationAggregationSource) {
        this.organizationAggregationSource = organizationAggregationSource;
    }

    public ConfigurationAggregator withOrganizationAggregationSource(OrganizationAggregationSource organizationAggregationSource) {
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
