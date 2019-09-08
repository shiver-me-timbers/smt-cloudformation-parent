
package shiver.me.timbers.aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * BucketCorsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CorsRules"
})
public class BucketCorsConfiguration implements Property<BucketCorsConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule
     * 
     */
    @JsonProperty("CorsRules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule")
    private Set<Property<BucketCorsRule>> corsRules = new LinkedHashSet<Property<BucketCorsRule>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule
     * 
     */
    @JsonIgnore
    public Set<Property<BucketCorsRule>> getCorsRules() {
        return corsRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule
     * 
     */
    @JsonIgnore
    public void setCorsRules(Set<Property<BucketCorsRule>> corsRules) {
        this.corsRules = corsRules;
    }

    public BucketCorsConfiguration withCorsRules(Set<Property<BucketCorsRule>> corsRules) {
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
        if ((other instanceof BucketCorsConfiguration) == false) {
            return false;
        }
        BucketCorsConfiguration rhs = ((BucketCorsConfiguration) other);
        return new EqualsBuilder().append(corsRules, rhs.corsRules).isEquals();
    }

}
