
package aws.lambda;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TracingConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Mode"
})
public class TracingConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode
     * 
     */
    @JsonProperty("Mode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode")
    private CharSequence mode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode
     * 
     */
    public CharSequence getMode() {
        return mode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode
     * 
     */
    public void setMode(CharSequence mode) {
        this.mode = mode;
    }

    public TracingConfig withMode(CharSequence mode) {
        this.mode = mode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mode", mode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TracingConfig) == false) {
            return false;
        }
        TracingConfig rhs = ((TracingConfig) other);
        return new EqualsBuilder().append(mode, rhs.mode).isEquals();
    }

}
