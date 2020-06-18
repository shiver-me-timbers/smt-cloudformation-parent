
package shiver.me.timbers.aws.eventschemas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RegistryPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Policy",
    "RegistryName",
    "RevisionId"
})
public class RegistryPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy
     * 
     */
    @JsonProperty("Policy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy")
    private Object policy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname
     * 
     */
    @JsonProperty("RegistryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname")
    private CharSequence registryName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid
     * 
     */
    @JsonProperty("RevisionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid")
    private CharSequence revisionId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy
     * 
     */
    @JsonIgnore
    public Object getPolicy() {
        return policy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy
     * 
     */
    @JsonIgnore
    public void setPolicy(Object policy) {
        this.policy = policy;
    }

    public RegistryPolicy withPolicy(Object policy) {
        this.policy = policy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname
     * 
     */
    @JsonIgnore
    public CharSequence getRegistryName() {
        return registryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname
     * 
     */
    @JsonIgnore
    public void setRegistryName(CharSequence registryName) {
        this.registryName = registryName;
    }

    public RegistryPolicy withRegistryName(CharSequence registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid
     * 
     */
    @JsonIgnore
    public CharSequence getRevisionId() {
        return revisionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid
     * 
     */
    @JsonIgnore
    public void setRevisionId(CharSequence revisionId) {
        this.revisionId = revisionId;
    }

    public RegistryPolicy withRevisionId(CharSequence revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policy", policy).append("registryName", registryName).append("revisionId", revisionId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(revisionId).append(registryName).append(policy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistryPolicy) == false) {
            return false;
        }
        RegistryPolicy rhs = ((RegistryPolicy) other);
        return new EqualsBuilder().append(revisionId, rhs.revisionId).append(registryName, rhs.registryName).append(policy, rhs.policy).isEquals();
    }

}
