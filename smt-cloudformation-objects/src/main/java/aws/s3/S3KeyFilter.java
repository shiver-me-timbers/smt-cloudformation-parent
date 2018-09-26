
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
 * S3KeyFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Rules"
})
public class S3KeyFilter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules")
    private Set<FilterRule> rules = new LinkedHashSet<FilterRule>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules
     * 
     */
    public Set<FilterRule> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules
     * 
     */
    public void setRules(Set<FilterRule> rules) {
        this.rules = rules;
    }

    public S3KeyFilter withRules(Set<FilterRule> rules) {
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
        if ((other instanceof S3KeyFilter) == false) {
            return false;
        }
        S3KeyFilter rhs = ((S3KeyFilter) other);
        return new EqualsBuilder().append(rules, rhs.rules).isEquals();
    }

}
