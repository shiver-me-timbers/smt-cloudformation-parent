
package aws.elasticloadbalancingv2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TargetGroupMatcher
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HttpCode"
})
public class TargetGroupMatcher implements Property<TargetGroupMatcher>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode
     * 
     */
    @JsonProperty("HttpCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode")
    private CharSequence httpCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode
     * 
     */
    @JsonIgnore
    public CharSequence getHttpCode() {
        return httpCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode
     * 
     */
    @JsonIgnore
    public void setHttpCode(CharSequence httpCode) {
        this.httpCode = httpCode;
    }

    public TargetGroupMatcher withHttpCode(CharSequence httpCode) {
        this.httpCode = httpCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("httpCode", httpCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(httpCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TargetGroupMatcher) == false) {
            return false;
        }
        TargetGroupMatcher rhs = ((TargetGroupMatcher) other);
        return new EqualsBuilder().append(httpCode, rhs.httpCode).isEquals();
    }

}
