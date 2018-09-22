
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
    private String edition;
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
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password")
    private String password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname
     * 
     */
    @JsonProperty("ShortName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname")
    private String shortName;
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
    @JsonProperty("CreateAlias")
    public Boolean getCreateAlias() {
        return createAlias;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias
     * 
     */
    @JsonProperty("CreateAlias")
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
    @JsonProperty("Edition")
    public String getEdition() {
        return edition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition
     * 
     */
    @JsonProperty("Edition")
    public void setEdition(String edition) {
        this.edition = edition;
    }

    public MicrosoftAD withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso
     * 
     */
    @JsonProperty("EnableSso")
    public Boolean getEnableSso() {
        return enableSso;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso
     * 
     */
    @JsonProperty("EnableSso")
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
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public MicrosoftAD withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password
     * 
     */
    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password
     * 
     */
    @JsonProperty("Password")
    public void setPassword(String password) {
        this.password = password;
    }

    public MicrosoftAD withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname
     * 
     */
    @JsonProperty("ShortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname
     * 
     */
    @JsonProperty("ShortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public MicrosoftAD withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * VpcSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html
     * 
     */
    @JsonProperty("VpcSettings")
    public VpcSettings getVpcSettings() {
        return vpcSettings;
    }

    /**
     * VpcSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html
     * 
     */
    @JsonProperty("VpcSettings")
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
