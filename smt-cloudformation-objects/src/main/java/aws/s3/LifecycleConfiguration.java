
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
 * LifecycleConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Rules"
})
public class LifecycleConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules")
    private Set<ReplicationRule> rules = new LinkedHashSet<ReplicationRule>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules
     * 
     */
    public Set<ReplicationRule> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules
     * 
     */
    public void setRules(Set<ReplicationRule> rules) {
        this.rules = rules;
    }

    public LifecycleConfiguration withRules(Set<ReplicationRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rules", rules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecycleConfiguration) == false) {
            return false;
        }
        LifecycleConfiguration rhs = ((LifecycleConfiguration) other);
        return new EqualsBuilder().append(rules, rhs.rules).isEquals();
    }

}
