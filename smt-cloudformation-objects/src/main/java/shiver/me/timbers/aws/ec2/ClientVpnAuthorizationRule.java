
package shiver.me.timbers.aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ClientVpnAuthorizationRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientVpnEndpointId",
    "Description",
    "AccessGroupId",
    "TargetNetworkCidr",
    "AuthorizeAllGroups"
})
public class ClientVpnAuthorizationRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid
     * 
     */
    @JsonProperty("ClientVpnEndpointId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid")
    private CharSequence clientVpnEndpointId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid
     * 
     */
    @JsonProperty("AccessGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid")
    private CharSequence accessGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr
     * 
     */
    @JsonProperty("TargetNetworkCidr")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr")
    private CharSequence targetNetworkCidr;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups
     * 
     */
    @JsonProperty("AuthorizeAllGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups")
    private CharSequence authorizeAllGroups;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid
     * 
     */
    @JsonIgnore
    public CharSequence getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-clientvpnendpointid
     * 
     */
    @JsonIgnore
    public void setClientVpnEndpointId(CharSequence clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    public ClientVpnAuthorizationRule withClientVpnEndpointId(CharSequence clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ClientVpnAuthorizationRule withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid
     * 
     */
    @JsonIgnore
    public CharSequence getAccessGroupId() {
        return accessGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-accessgroupid
     * 
     */
    @JsonIgnore
    public void setAccessGroupId(CharSequence accessGroupId) {
        this.accessGroupId = accessGroupId;
    }

    public ClientVpnAuthorizationRule withAccessGroupId(CharSequence accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr
     * 
     */
    @JsonIgnore
    public CharSequence getTargetNetworkCidr() {
        return targetNetworkCidr;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-targetnetworkcidr
     * 
     */
    @JsonIgnore
    public void setTargetNetworkCidr(CharSequence targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
    }

    public ClientVpnAuthorizationRule withTargetNetworkCidr(CharSequence targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups
     * 
     */
    @JsonIgnore
    public CharSequence getAuthorizeAllGroups() {
        return authorizeAllGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html#cfn-ec2-clientvpnauthorizationrule-authorizeallgroups
     * 
     */
    @JsonIgnore
    public void setAuthorizeAllGroups(CharSequence authorizeAllGroups) {
        this.authorizeAllGroups = authorizeAllGroups;
    }

    public ClientVpnAuthorizationRule withAuthorizeAllGroups(CharSequence authorizeAllGroups) {
        this.authorizeAllGroups = authorizeAllGroups;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientVpnEndpointId", clientVpnEndpointId).append("description", description).append("accessGroupId", accessGroupId).append("targetNetworkCidr", targetNetworkCidr).append("authorizeAllGroups", authorizeAllGroups).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accessGroupId).append(clientVpnEndpointId).append(description).append(authorizeAllGroups).append(targetNetworkCidr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientVpnAuthorizationRule) == false) {
            return false;
        }
        ClientVpnAuthorizationRule rhs = ((ClientVpnAuthorizationRule) other);
        return new EqualsBuilder().append(accessGroupId, rhs.accessGroupId).append(clientVpnEndpointId, rhs.clientVpnEndpointId).append(description, rhs.description).append(authorizeAllGroups, rhs.authorizeAllGroups).append(targetNetworkCidr, rhs.targetNetworkCidr).isEquals();
    }

}
