
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
 * ResolverLambdaConflictHandlerConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LambdaConflictHandlerArn"
})
public class ResolverLambdaConflictHandlerConfig implements Property<ResolverLambdaConflictHandlerConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html#cfn-appsync-resolver-lambdaconflicthandlerconfig-lambdaconflicthandlerarn
     * 
     */
    @JsonProperty("LambdaConflictHandlerArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html#cfn-appsync-resolver-lambdaconflicthandlerconfig-lambdaconflicthandlerarn")
    private CharSequence lambdaConflictHandlerArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html#cfn-appsync-resolver-lambdaconflicthandlerconfig-lambdaconflicthandlerarn
     * 
     */
    @JsonIgnore
    public CharSequence getLambdaConflictHandlerArn() {
        return lambdaConflictHandlerArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html#cfn-appsync-resolver-lambdaconflicthandlerconfig-lambdaconflicthandlerarn
     * 
     */
    @JsonIgnore
    public void setLambdaConflictHandlerArn(CharSequence lambdaConflictHandlerArn) {
        this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
    }

    public ResolverLambdaConflictHandlerConfig withLambdaConflictHandlerArn(CharSequence lambdaConflictHandlerArn) {
        this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lambdaConflictHandlerArn", lambdaConflictHandlerArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lambdaConflictHandlerArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResolverLambdaConflictHandlerConfig) == false) {
            return false;
        }
        ResolverLambdaConflictHandlerConfig rhs = ((ResolverLambdaConflictHandlerConfig) other);
        return new EqualsBuilder().append(lambdaConflictHandlerArn, rhs.lambdaConflictHandlerArn).isEquals();
    }

}
