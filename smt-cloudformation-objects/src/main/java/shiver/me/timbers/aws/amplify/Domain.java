
package shiver.me.timbers.aws.amplify;

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
 * Domain
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SubDomainSettings",
    "AppId",
    "DomainName"
})
public class Domain {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings
     * 
     */
    @JsonProperty("SubDomainSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings")
    private List<Property<DomainSubDomainSetting>> subDomainSettings = new ArrayList<Property<DomainSubDomainSetting>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid
     * 
     */
    @JsonProperty("AppId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid")
    private CharSequence appId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname")
    private CharSequence domainName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings
     * 
     */
    @JsonIgnore
    public List<Property<DomainSubDomainSetting>> getSubDomainSettings() {
        return subDomainSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings
     * 
     */
    @JsonIgnore
    public void setSubDomainSettings(List<Property<DomainSubDomainSetting>> subDomainSettings) {
        this.subDomainSettings = subDomainSettings;
    }

    public Domain withSubDomainSettings(List<Property<DomainSubDomainSetting>> subDomainSettings) {
        this.subDomainSettings = subDomainSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid
     * 
     */
    @JsonIgnore
    public CharSequence getAppId() {
        return appId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid
     * 
     */
    @JsonIgnore
    public void setAppId(CharSequence appId) {
        this.appId = appId;
    }

    public Domain withAppId(CharSequence appId) {
        this.appId = appId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname
     * 
     */
    @JsonIgnore
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname
     * 
     */
    @JsonIgnore
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public Domain withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("subDomainSettings", subDomainSettings).append("appId", appId).append("domainName", domainName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subDomainSettings).append(appId).append(domainName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return new EqualsBuilder().append(subDomainSettings, rhs.subDomainSettings).append(appId, rhs.appId).append(domainName, rhs.domainName).isEquals();
    }

}
