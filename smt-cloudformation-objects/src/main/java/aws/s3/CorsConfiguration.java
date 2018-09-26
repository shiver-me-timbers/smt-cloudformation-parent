
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
 * CorsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CorsRules"
})
public class CorsConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule
     * 
     */
    @JsonProperty("CorsRules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule")
    private Set<CorsRule> corsRules = new LinkedHashSet<CorsRule>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule
     * 
     */
    public Set<CorsRule> getCorsRules() {
        return corsRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule
     * 
     */
    public void setCorsRules(Set<CorsRule> corsRules) {
        this.corsRules = corsRules;
    }

    public CorsConfiguration withCorsRules(Set<CorsRule> corsRules) {
        this.corsRules = corsRules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("corsRules", corsRules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(corsRules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CorsConfiguration) == false) {
            return false;
        }
        CorsConfiguration rhs = ((CorsConfiguration) other);
        return new EqualsBuilder().append(corsRules, rhs.corsRules).isEquals();
    }

}
