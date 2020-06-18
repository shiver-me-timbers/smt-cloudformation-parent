
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
 * ResolverSyncConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConflictHandler",
    "ConflictDetection",
    "LambdaConflictHandlerConfig"
})
public class ResolverSyncConfig implements Property<ResolverSyncConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflicthandler
     * 
     */
    @JsonProperty("ConflictHandler")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflicthandler")
    private CharSequence conflictHandler;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflictdetection
     * 
     */
    @JsonProperty("ConflictDetection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflictdetection")
    private CharSequence conflictDetection;
    /**
     * ResolverLambdaConflictHandlerConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html
     * 
     */
    @JsonProperty("LambdaConflictHandlerConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html")
    private Property<ResolverLambdaConflictHandlerConfig> lambdaConflictHandlerConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflicthandler
     * 
     */
    @JsonIgnore
    public CharSequence getConflictHandler() {
        return conflictHandler;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflicthandler
     * 
     */
    @JsonIgnore
    public void setConflictHandler(CharSequence conflictHandler) {
        this.conflictHandler = conflictHandler;
    }

    public ResolverSyncConfig withConflictHandler(CharSequence conflictHandler) {
        this.conflictHandler = conflictHandler;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflictdetection
     * 
     */
    @JsonIgnore
    public CharSequence getConflictDetection() {
        return conflictDetection;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflictdetection
     * 
     */
    @JsonIgnore
    public void setConflictDetection(CharSequence conflictDetection) {
        this.conflictDetection = conflictDetection;
    }

    public ResolverSyncConfig withConflictDetection(CharSequence conflictDetection) {
        this.conflictDetection = conflictDetection;
        return this;
    }

    /**
     * ResolverLambdaConflictHandlerConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html
     * 
     */
    @JsonIgnore
    public Property<ResolverLambdaConflictHandlerConfig> getLambdaConflictHandlerConfig() {
        return lambdaConflictHandlerConfig;
    }

    /**
     * ResolverLambdaConflictHandlerConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html
     * 
     */
    @JsonIgnore
    public void setLambdaConflictHandlerConfig(Property<ResolverLambdaConflictHandlerConfig> lambdaConflictHandlerConfig) {
        this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
    }

    public ResolverSyncConfig withLambdaConflictHandlerConfig(Property<ResolverLambdaConflictHandlerConfig> lambdaConflictHandlerConfig) {
        this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("conflictHandler", conflictHandler).append("conflictDetection", conflictDetection).append("lambdaConflictHandlerConfig", lambdaConflictHandlerConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(conflictDetection).append(lambdaConflictHandlerConfig).append(conflictHandler).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResolverSyncConfig) == false) {
            return false;
        }
        ResolverSyncConfig rhs = ((ResolverSyncConfig) other);
        return new EqualsBuilder().append(conflictDetection, rhs.conflictDetection).append(lambdaConflictHandlerConfig, rhs.lambdaConflictHandlerConfig).append(conflictHandler, rhs.conflictHandler).isEquals();
    }

}
