
package aws.codedeploy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MinimumHealthyHosts
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Value"
})
public class MinimumHealthyHosts {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value")
    private Integer value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public MinimumHealthyHosts withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value
     * 
     */
    public Integer getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value
     * 
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    public MinimumHealthyHosts withValue(Integer value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MinimumHealthyHosts) == false) {
            return false;
        }
        MinimumHealthyHosts rhs = ((MinimumHealthyHosts) other);
        return new EqualsBuilder().append(type, rhs.type).append(value, rhs.value).isEquals();
    }

}
