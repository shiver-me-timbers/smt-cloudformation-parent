
package shiver.me.timbers.aws.imagebuilder;

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
 * DistributionConfigurationDistribution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Region",
    "AmiDistributionConfiguration",
    "LicenseConfigurationArns"
})
public class DistributionConfigurationDistribution implements Property<DistributionConfigurationDistribution>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-region")
    private CharSequence region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-amidistributionconfiguration
     * 
     */
    @JsonProperty("AmiDistributionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-amidistributionconfiguration")
    private Object amiDistributionConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-licenseconfigurationarns
     * 
     */
    @JsonProperty("LicenseConfigurationArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-licenseconfigurationarns")
    private List<CharSequence> licenseConfigurationArns = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-region
     * 
     */
    @JsonIgnore
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-region
     * 
     */
    @JsonIgnore
    public void setRegion(CharSequence region) {
        this.region = region;
    }

    public DistributionConfigurationDistribution withRegion(CharSequence region) {
        this.region = region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-amidistributionconfiguration
     * 
     */
    @JsonIgnore
    public Object getAmiDistributionConfiguration() {
        return amiDistributionConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-amidistributionconfiguration
     * 
     */
    @JsonIgnore
    public void setAmiDistributionConfiguration(Object amiDistributionConfiguration) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
    }

    public DistributionConfigurationDistribution withAmiDistributionConfiguration(Object amiDistributionConfiguration) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-licenseconfigurationarns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getLicenseConfigurationArns() {
        return licenseConfigurationArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-licenseconfigurationarns
     * 
     */
    @JsonIgnore
    public void setLicenseConfigurationArns(List<CharSequence> licenseConfigurationArns) {
        this.licenseConfigurationArns = licenseConfigurationArns;
    }

    public DistributionConfigurationDistribution withLicenseConfigurationArns(List<CharSequence> licenseConfigurationArns) {
        this.licenseConfigurationArns = licenseConfigurationArns;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("region", region).append("amiDistributionConfiguration", amiDistributionConfiguration).append("licenseConfigurationArns", licenseConfigurationArns).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(licenseConfigurationArns).append(amiDistributionConfiguration).append(region).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionConfigurationDistribution) == false) {
            return false;
        }
        DistributionConfigurationDistribution rhs = ((DistributionConfigurationDistribution) other);
        return new EqualsBuilder().append(licenseConfigurationArns, rhs.licenseConfigurationArns).append(amiDistributionConfiguration, rhs.amiDistributionConfiguration).append(region, rhs.region).isEquals();
    }

}
