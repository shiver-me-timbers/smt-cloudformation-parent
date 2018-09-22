
package aws.rds;

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
    private List<String> dBSecurityGroupMemberships = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    @JsonProperty("OptionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname")
    private String optionName;
    /**
     * OptionSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html
     * 
     */
    @JsonProperty("OptionSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html")
    private OptionSetting optionSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    @JsonProperty("OptionVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion")
    private String optionVersion;
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
    private List<String> vpcSecurityGroupMemberships = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships
     * 
     */
    @JsonProperty("DBSecurityGroupMemberships")
    public List<String> getDBSecurityGroupMemberships() {
        return dBSecurityGroupMemberships;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships
     * 
     */
    @JsonProperty("DBSecurityGroupMemberships")
    public void setDBSecurityGroupMemberships(List<String> dBSecurityGroupMemberships) {
        this.dBSecurityGroupMemberships = dBSecurityGroupMemberships;
    }

    public OptionConfiguration withDBSecurityGroupMemberships(List<String> dBSecurityGroupMemberships) {
        this.dBSecurityGroupMemberships = dBSecurityGroupMemberships;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    @JsonProperty("OptionName")
    public String getOptionName() {
        return optionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname
     * 
     */
    @JsonProperty("OptionName")
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public OptionConfiguration withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * OptionSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html
     * 
     */
    @JsonProperty("OptionSettings")
    public OptionSetting getOptionSettings() {
        return optionSettings;
    }

    /**
     * OptionSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html
     * 
     */
    @JsonProperty("OptionSettings")
    public void setOptionSettings(OptionSetting optionSettings) {
        this.optionSettings = optionSettings;
    }

    public OptionConfiguration withOptionSettings(OptionSetting optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    @JsonProperty("OptionVersion")
    public String getOptionVersion() {
        return optionVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion
     * 
     */
    @JsonProperty("OptionVersion")
    public void setOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
    }

    public OptionConfiguration withOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port
     * 
     */
    @JsonProperty("Port")
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port
     * 
     */
    @JsonProperty("Port")
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
    @JsonProperty("VpcSecurityGroupMemberships")
    public List<String> getVpcSecurityGroupMemberships() {
        return vpcSecurityGroupMemberships;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships
     * 
     */
    @JsonProperty("VpcSecurityGroupMemberships")
    public void setVpcSecurityGroupMemberships(List<String> vpcSecurityGroupMemberships) {
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
    }

    public OptionConfiguration withVpcSecurityGroupMemberships(List<String> vpcSecurityGroupMemberships) {
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
