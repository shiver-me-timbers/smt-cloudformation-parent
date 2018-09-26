
package aws.lambda;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeadLetterConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TargetArn"
})
public class DeadLetterConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn
     * 
     */
    @JsonProperty("TargetArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn")
    private CharSequence targetArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn
     * 
     */
    public CharSequence getTargetArn() {
        return targetArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn
     * 
     */
    public void setTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
    }

    public DeadLetterConfig withTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetArn", targetArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeadLetterConfig) == false) {
            return false;
        }
        DeadLetterConfig rhs = ((DeadLetterConfig) other);
        return new EqualsBuilder().append(targetArn, rhs.targetArn).isEquals();
    }

}
