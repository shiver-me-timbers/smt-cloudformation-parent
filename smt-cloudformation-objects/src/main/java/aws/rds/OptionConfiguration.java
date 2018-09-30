
package aws.rds;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
 * OptionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DBSecurityGroupMemberships",
    "OptionName",
    "OptionSettings",
    "OptionVersion",
    "Port",
    "VpcSecurityGroupMemberships"
})
public class OptionConfiguration {

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
    private Set<OptionSetting> optionSettings = new LinkedHashSet<OptionSetting>();
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
    private Integer port;
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
    public List<CharSequence> getDBSecurityGroupMemberships() {
        return dBSecurityGroupMemberships;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships
     * 
     */
    public void setDBSecurityGroupMemberships(List<CharSequence> dBSecurityGroupMemberships) {
        this.dBSecurityGroupMemberships = dBSecurityGroupMemberships;
    }

    public OptionConfiguration withDBSecurityGroupMemberships(List<CharSequence> dBSecurityGroupMemberships) {
        this.dBSecurityGroupMemberships = dBSecurityGroupMemberships;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    public CharSequence getOptionName() {
        return optionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    public void setOptionName(CharSequence optionName) {
        this.optionName = optionName;
    }

    public OptionConfiguration withOptionName(CharSequence optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings
     * 
     */
    public Set<OptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings
     * 
     */
    public void setOptionSettings(Set<OptionSetting> optionSettings) {
        this.optionSettings = optionSettings;
    }

    public OptionConfiguration withOptionSettings(Set<OptionSetting> optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    public CharSequence getOptionVersion() {
        return optionVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    public void setOptionVersion(CharSequence optionVersion) {
        this.optionVersion = optionVersion;
    }

    public OptionConfiguration withOptionVersion(CharSequence optionVersion) {
        this.optionVersion = optionVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public OptionConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships
     * 
     */
    public List<CharSequence> getVpcSecurityGroupMemberships() {
        return vpcSecurityGroupMemberships;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships
     * 
     */
    public void setVpcSecurityGroupMemberships(List<CharSequence> vpcSecurityGroupMemberships) {
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
    }

    public OptionConfiguration withVpcSecurityGroupMemberships(List<CharSequence> vpcSecurityGroupMemberships) {
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
        if ((other instanceof OptionConfiguration) == false) {
            return false;
        }
        OptionConfiguration rhs = ((OptionConfiguration) other);
        return new EqualsBuilder().append(optionVersion, rhs.optionVersion).append(dBSecurityGroupMemberships, rhs.dBSecurityGroupMemberships).append(vpcSecurityGroupMemberships, rhs.vpcSecurityGroupMemberships).append(port, rhs.port).append(optionName, rhs.optionName).append(optionSettings, rhs.optionSettings).isEquals();
    }

}
