
package shiver.me.timbers.aws.appsync;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DataSourceLambdaConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LambdaFunctionArn"
})
public class DataSourceLambdaConfig implements Property<DataSourceLambdaConfig>
{

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
    @JsonIgnore
    public CharSequence getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn
     * 
     */
    @JsonIgnore
    public void setLambdaFunctionArn(CharSequence lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    public DataSourceLambdaConfig withLambdaFunctionArn(CharSequence lambdaFunctionArn) {
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
        if ((other instanceof DataSourceLambdaConfig) == false) {
            return false;
        }
        DataSourceLambdaConfig rhs = ((DataSourceLambdaConfig) other);
        return new EqualsBuilder().append(lambdaFunctionArn, rhs.lambdaFunctionArn).isEquals();
    }

}
