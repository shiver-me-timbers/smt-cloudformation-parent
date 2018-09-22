
package aws.elasticloadbalancingv2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TargetGroupAttribute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Key",
    "Value"
})
public class TargetGroupAttribute {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key")
    private String key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value")
    private String value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key
     * 
     */
    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key
     * 
     */
    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

    public TargetGroupAttribute withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value
     * 
     */
    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value
     * 
     */
    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    public TargetGroupAttribute withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TargetGroupAttribute) == false) {
            return false;
        }
        TargetGroupAttribute rhs = ((TargetGroupAttribute) other);
        return new EqualsBuilder().append(value, rhs.value).append(key, rhs.key).isEquals();
    }

}
