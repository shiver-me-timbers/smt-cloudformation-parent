
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LambdaConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LambdaFunctionArn"
})
public class LambdaConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn
     * 
     */
    @JsonProperty("LambdaFunctionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn")
    private CharSequence lambdaFunctionArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn
     * 
     */
    public CharSequence getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn
     * 
     */
    public void setLambdaFunctionArn(CharSequence lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    public LambdaConfig withLambdaFunctionArn(CharSequence lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lambdaFunctionArn", lambdaFunctionArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lambdaFunctionArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LambdaConfig) == false) {
            return false;
        }
        LambdaConfig rhs = ((LambdaConfig) other);
        return new EqualsBuilder().append(lambdaFunctionArn, rhs.lambdaFunctionArn).isEquals();
    }

}
