
package aws.secretsmanager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ResourcePolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SecretId",
    "ResourcePolicy"
})
public class ResourcePolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid
     * 
     */
    @JsonProperty("SecretId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid")
    private CharSequence secretId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy
     * 
     */
    @JsonProperty("ResourcePolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy")
    private Object resourcePolicy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid
     * 
     */
    @JsonIgnore
    public CharSequence getSecretId() {
        return secretId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid
     * 
     */
    @JsonIgnore
    public void setSecretId(CharSequence secretId) {
        this.secretId = secretId;
    }

    public ResourcePolicy withSecretId(CharSequence secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy
     * 
     */
    @JsonIgnore
    public Object getResourcePolicy() {
        return resourcePolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy
     * 
     */
    @JsonIgnore
    public void setResourcePolicy(Object resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    public ResourcePolicy withResourcePolicy(Object resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("secretId", secretId).append("resourcePolicy", resourcePolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secretId).append(resourcePolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourcePolicy) == false) {
            return false;
        }
        ResourcePolicy rhs = ((ResourcePolicy) other);
        return new EqualsBuilder().append(secretId, rhs.secretId).append(resourcePolicy, rhs.resourcePolicy).isEquals();
    }

}
