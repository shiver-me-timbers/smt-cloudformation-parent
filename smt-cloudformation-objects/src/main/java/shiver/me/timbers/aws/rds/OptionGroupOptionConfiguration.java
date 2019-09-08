
package shiver.me.timbers.aws.rds;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * OptionGroupOptionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DBSecurityGroupMemberships",
    "OptionName",
    "OptionSettings",
    "OptionVersion",
    "Port",
    "VpcSecurityGroupMemberships"
})
public class OptionGroupOptionConfiguration implements Property<OptionGroupOptionConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships
     * 
     */
    @JsonProperty("DBSecurityGroupMemberships")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships")
    private List<CharSequence> dBSecurityGroupMemberships = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    @JsonProperty("OptionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname")
    private CharSequence optionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings
     * 
     */
    @JsonProperty("OptionSettings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings")
    private Set<Property<OptionGroupOptionSetting>> optionSettings = new LinkedHashSet<Property<OptionGroupOptionSetting>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    @JsonProperty("OptionVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion")
    private CharSequence optionVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port")
    private Number port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships
     * 
     */
    @JsonProperty("VpcSecurityGroupMemberships")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships")
    private List<CharSequence> vpcSecurityGroupMemberships = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships
     * 
     */
    @JsonIgnore
    public List<CharSequence> getDBSecurityGroupMemberships() {
        return dBSecurityGroupMemberships;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships
     * 
     */
    @JsonIgnore
    public void setDBSecurityGroupMemberships(List<CharSequence> dBSecurityGroupMemberships) {
        this.dBSecurityGroupMemberships = dBSecurityGroupMemberships;
    }

    public OptionGroupOptionConfiguration withDBSecurityGroupMemberships(List<CharSequence> dBSecurityGroupMemberships) {
        this.dBSecurityGroupMemberships = dBSecurityGroupMemberships;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    @JsonIgnore
    public CharSequence getOptionName() {
        return optionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    @JsonIgnore
    public void setOptionName(CharSequence optionName) {
        this.optionName = optionName;
    }

    public OptionGroupOptionConfiguration withOptionName(CharSequence optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings
     * 
     */
    @JsonIgnore
    public Set<Property<OptionGroupOptionSetting>> getOptionSettings() {
        return optionSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings
     * 
     */
    @JsonIgnore
    public void setOptionSettings(Set<Property<OptionGroupOptionSetting>> optionSettings) {
        this.optionSettings = optionSettings;
    }

    public OptionGroupOptionConfiguration withOptionSettings(Set<Property<OptionGroupOptionSetting>> optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    @JsonIgnore
    public CharSequence getOptionVersion() {
        return optionVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    @JsonIgnore
    public void setOptionVersion(CharSequence optionVersion) {
        this.optionVersion = optionVersion;
    }

    public OptionGroupOptionConfiguration withOptionVersion(CharSequence optionVersion) {
        this.optionVersion = optionVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port
     * 
     */
    @JsonIgnore
    public Number getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port
     * 
     */
    @JsonIgnore
    public void setPort(Number port) {
        this.port = port;
    }

    public OptionGroupOptionConfiguration withPort(Number port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships
     * 
     */
    @JsonIgnore
    public List<CharSequence> getVpcSecurityGroupMemberships() {
        return vpcSecurityGroupMemberships;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships
     * 
     */
    @JsonIgnore
    public void setVpcSecurityGroupMemberships(List<CharSequence> vpcSecurityGroupMemberships) {
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
    }

    public OptionGroupOptionConfiguration withVpcSecurityGroupMemberships(List<CharSequence> vpcSecurityGroupMemberships) {
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dBSecurityGroupMemberships", dBSecurityGroupMemberships).append("optionName", optionName).append("optionSettings", optionSettings).append("optionVersion", optionVersion).append("port", port).append("vpcSecurityGroupMemberships", vpcSecurityGroupMemberships).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(optionVersion).append(dBSecurityGroupMemberships).append(vpcSecurityGroupMemberships).append(port).append(optionName).append(optionSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OptionGroupOptionConfiguration) == false) {
            return false;
        }
        OptionGroupOptionConfiguration rhs = ((OptionGroupOptionConfiguration) other);
        return new EqualsBuilder().append(optionVersion, rhs.optionVersion).append(dBSecurityGroupMemberships, rhs.dBSecurityGroupMemberships).append(vpcSecurityGroupMemberships, rhs.vpcSecurityGroupMemberships).append(port, rhs.port).append(optionName, rhs.optionName).append(optionSettings, rhs.optionSettings).isEquals();
    }

}
