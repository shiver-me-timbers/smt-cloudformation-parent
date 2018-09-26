
package aws.s3;

import java.util.LinkedHashSet;
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
 * ReplicationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Role",
    "Rules"
})
public class ReplicationConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role")
    private CharSequence role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules")
    private Set<ReplicationRule> rules = new LinkedHashSet<ReplicationRule>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role
     * 
     */
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role
     * 
     */
    public void setRole(CharSequence role) {
        this.role = role;
    }

    public ReplicationConfiguration withRole(CharSequence role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules
     * 
     */
    public Set<ReplicationRule> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules
     * 
     */
    public void setRules(Set<ReplicationRule> rules) {
        this.rules = rules;
    }

    public ReplicationConfiguration withRules(Set<ReplicationRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("role", role).append("rules", rules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rules).append(role).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationConfiguration) == false) {
            return false;
        }
        ReplicationConfiguration rhs = ((ReplicationConfiguration) other);
        return new EqualsBuilder().append(rules, rhs.rules).append(role, rhs.role).isEquals();
    }

}
