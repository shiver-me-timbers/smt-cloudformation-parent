
package aws.directoryservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SimpleAD
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CreateAlias",
    "Description",
    "EnableSso",
    "Name",
    "Password",
    "ShortName",
    "Size",
    "VpcSettings"
})
public class SimpleAD {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias
     * 
     */
    @JsonProperty("CreateAlias")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias")
    private Boolean createAlias;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso
     * 
     */
    @JsonProperty("EnableSso")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso")
    private Boolean enableSso;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password")
    private CharSequence password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname
     * 
     */
    @JsonProperty("ShortName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname")
    private CharSequence shortName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size
     * 
     */
    @JsonProperty("Size")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size")
    private CharSequence size;
    /**
     * VpcSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html
     * 
     */
    @JsonProperty("VpcSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html")
    private VpcSettings vpcSettings;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias
     * 
     */
    public Boolean getCreateAlias() {
        return createAlias;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias
     * 
     */
    public void setCreateAlias(Boolean createAlias) {
        this.createAlias = createAlias;
    }

    public SimpleAD withCreateAlias(Boolean createAlias) {
        this.createAlias = createAlias;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public SimpleAD withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso
     * 
     */
    public Boolean getEnableSso() {
        return enableSso;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso
     * 
     */
    public void setEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
    }

    public SimpleAD withEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public SimpleAD withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password
     * 
     */
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password
     * 
     */
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public SimpleAD withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname
     * 
     */
    public CharSequence getShortName() {
        return shortName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname
     * 
     */
    public void setShortName(CharSequence shortName) {
        this.shortName = shortName;
    }

    public SimpleAD withShortName(CharSequence shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size
     * 
     */
    public CharSequence getSize() {
        return size;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size
     * 
     */
    public void setSize(CharSequence size) {
        this.size = size;
    }

    public SimpleAD withSize(CharSequence size) {
        this.size = size;
        return this;
    }

    /**
     * VpcSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html
     * 
     */
    public VpcSettings getVpcSettings() {
        return vpcSettings;
    }

    /**
     * VpcSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html
     * 
     */
    public void setVpcSettings(VpcSettings vpcSettings) {
        this.vpcSettings = vpcSettings;
    }

    public SimpleAD withVpcSettings(VpcSettings vpcSettings) {
        this.vpcSettings = vpcSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("createAlias", createAlias).append("description", description).append("enableSso", enableSso).append("name", name).append("password", password).append("shortName", shortName).append("size", size).append("vpcSettings", vpcSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(password).append(vpcSettings).append(size).append(enableSso).append(name).append(description).append(shortName).append(createAlias).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleAD) == false) {
            return false;
        }
        SimpleAD rhs = ((SimpleAD) other);
        return new EqualsBuilder().append(password, rhs.password).append(vpcSettings, rhs.vpcSettings).append(size, rhs.size).append(enableSso, rhs.enableSso).append(name, rhs.name).append(description, rhs.description).append(shortName, rhs.shortName).append(createAlias, rhs.createAlias).isEquals();
    }

}
