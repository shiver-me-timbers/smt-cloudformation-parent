
package aws.directoryservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MicrosoftAD
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CreateAlias",
    "Edition",
    "EnableSso",
    "Name",
    "Password",
    "ShortName",
    "VpcSettings"
})
public class MicrosoftAD {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias
     * 
     */
    @JsonProperty("CreateAlias")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias")
    private Boolean createAlias;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition
     * 
     */
    @JsonProperty("Edition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition")
    private CharSequence edition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso
     * 
     */
    @JsonProperty("EnableSso")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso")
    private Boolean enableSso;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password")
    private CharSequence password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname
     * 
     */
    @JsonProperty("ShortName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname")
    private CharSequence shortName;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias
     * 
     */
    public Boolean getCreateAlias() {
        return createAlias;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias
     * 
     */
    public void setCreateAlias(Boolean createAlias) {
        this.createAlias = createAlias;
    }

    public MicrosoftAD withCreateAlias(Boolean createAlias) {
        this.createAlias = createAlias;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition
     * 
     */
    public CharSequence getEdition() {
        return edition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition
     * 
     */
    public void setEdition(CharSequence edition) {
        this.edition = edition;
    }

    public MicrosoftAD withEdition(CharSequence edition) {
        this.edition = edition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso
     * 
     */
    public Boolean getEnableSso() {
        return enableSso;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso
     * 
     */
    public void setEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
    }

    public MicrosoftAD withEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public MicrosoftAD withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password
     * 
     */
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password
     * 
     */
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public MicrosoftAD withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname
     * 
     */
    public CharSequence getShortName() {
        return shortName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname
     * 
     */
    public void setShortName(CharSequence shortName) {
        this.shortName = shortName;
    }

    public MicrosoftAD withShortName(CharSequence shortName) {
        this.shortName = shortName;
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

    public MicrosoftAD withVpcSettings(VpcSettings vpcSettings) {
        this.vpcSettings = vpcSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("createAlias", createAlias).append("edition", edition).append("enableSso", enableSso).append("name", name).append("password", password).append("shortName", shortName).append("vpcSettings", vpcSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(password).append(vpcSettings).append(enableSso).append(name).append(edition).append(shortName).append(createAlias).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MicrosoftAD) == false) {
            return false;
        }
        MicrosoftAD rhs = ((MicrosoftAD) other);
        return new EqualsBuilder().append(password, rhs.password).append(vpcSettings, rhs.vpcSettings).append(enableSso, rhs.enableSso).append(name, rhs.name).append(edition, rhs.edition).append(shortName, rhs.shortName).append(createAlias, rhs.createAlias).isEquals();
    }

}
