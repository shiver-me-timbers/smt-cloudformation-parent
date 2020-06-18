
package shiver.me.timbers.aws.s3;

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
 * AccessPoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Name",
    "Bucket",
    "VpcConfiguration",
    "PublicAccessBlockConfiguration",
    "Policy",
    "PolicyStatus",
    "NetworkOrigin",
    "CreationDate"
})
public class AccessPoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket
     * 
     */
    @JsonProperty("Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket")
    private CharSequence bucket;
    /**
     * AccessPointVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html
     * 
     */
    @JsonProperty("VpcConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html")
    private Property<AccessPointVpcConfiguration> vpcConfiguration;
    /**
     * AccessPointPublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html
     * 
     */
    @JsonProperty("PublicAccessBlockConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html")
    private Property<AccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy
     * 
     */
    @JsonProperty("Policy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy")
    private Object policy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policystatus
     * 
     */
    @JsonProperty("PolicyStatus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policystatus")
    private Object policyStatus;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-networkorigin
     * 
     */
    @JsonProperty("NetworkOrigin")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-networkorigin")
    private CharSequence networkOrigin;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-creationdate
     * 
     */
    @JsonProperty("CreationDate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-creationdate")
    private CharSequence creationDate;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public AccessPoint withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket
     * 
     */
    @JsonIgnore
    public CharSequence getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket
     * 
     */
    @JsonIgnore
    public void setBucket(CharSequence bucket) {
        this.bucket = bucket;
    }

    public AccessPoint withBucket(CharSequence bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * AccessPointVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<AccessPointVpcConfiguration> getVpcConfiguration() {
        return vpcConfiguration;
    }

    /**
     * AccessPointVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html
     * 
     */
    @JsonIgnore
    public void setVpcConfiguration(Property<AccessPointVpcConfiguration> vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    public AccessPoint withVpcConfiguration(Property<AccessPointVpcConfiguration> vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }

    /**
     * AccessPointPublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<AccessPointPublicAccessBlockConfiguration> getPublicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
    }

    /**
     * AccessPointPublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html
     * 
     */
    @JsonIgnore
    public void setPublicAccessBlockConfiguration(Property<AccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    public AccessPoint withPublicAccessBlockConfiguration(Property<AccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy
     * 
     */
    @JsonIgnore
    public Object getPolicy() {
        return policy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy
     * 
     */
    @JsonIgnore
    public void setPolicy(Object policy) {
        this.policy = policy;
    }

    public AccessPoint withPolicy(Object policy) {
        this.policy = policy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policystatus
     * 
     */
    @JsonIgnore
    public Object getPolicyStatus() {
        return policyStatus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policystatus
     * 
     */
    @JsonIgnore
    public void setPolicyStatus(Object policyStatus) {
        this.policyStatus = policyStatus;
    }

    public AccessPoint withPolicyStatus(Object policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-networkorigin
     * 
     */
    @JsonIgnore
    public CharSequence getNetworkOrigin() {
        return networkOrigin;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-networkorigin
     * 
     */
    @JsonIgnore
    public void setNetworkOrigin(CharSequence networkOrigin) {
        this.networkOrigin = networkOrigin;
    }

    public AccessPoint withNetworkOrigin(CharSequence networkOrigin) {
        this.networkOrigin = networkOrigin;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-creationdate
     * 
     */
    @JsonIgnore
    public CharSequence getCreationDate() {
        return creationDate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-creationdate
     * 
     */
    @JsonIgnore
    public void setCreationDate(CharSequence creationDate) {
        this.creationDate = creationDate;
    }

    public AccessPoint withCreationDate(CharSequence creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("bucket", bucket).append("vpcConfiguration", vpcConfiguration).append("publicAccessBlockConfiguration", publicAccessBlockConfiguration).append("policy", policy).append("policyStatus", policyStatus).append("networkOrigin", networkOrigin).append("creationDate", creationDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucket).append(name).append(publicAccessBlockConfiguration).append(policyStatus).append(creationDate).append(vpcConfiguration).append(policy).append(networkOrigin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessPoint) == false) {
            return false;
        }
        AccessPoint rhs = ((AccessPoint) other);
        return new EqualsBuilder().append(bucket, rhs.bucket).append(name, rhs.name).append(publicAccessBlockConfiguration, rhs.publicAccessBlockConfiguration).append(policyStatus, rhs.policyStatus).append(creationDate, rhs.creationDate).append(vpcConfiguration, rhs.vpcConfiguration).append(policy, rhs.policy).append(networkOrigin, rhs.networkOrigin).isEquals();
    }

}
