
package aws.apigateway;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeploymentCanarySettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PercentTraffic",
    "StageVariableOverrides",
    "UseStageCache"
})
public class DeploymentCanarySettings {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-percenttraffic
     * 
     */
    @JsonProperty("PercentTraffic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-percenttraffic")
    private Double percentTraffic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-stagevariableoverrides
     * 
     */
    @JsonProperty("StageVariableOverrides")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-stagevariableoverrides")
    private Map<String, String> stageVariableOverrides;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-usestagecache
     * 
     */
    @JsonProperty("UseStageCache")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-usestagecache")
    private Boolean useStageCache;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-percenttraffic
     * 
     */
    @JsonIgnore
    public Double getPercentTraffic() {
        return percentTraffic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-percenttraffic
     * 
     */
    @JsonIgnore
    public void setPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    public DeploymentCanarySettings withPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-stagevariableoverrides
     * 
     */
    @JsonIgnore
    public Map<String, String> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-stagevariableoverrides
     * 
     */
    @JsonIgnore
    public void setStageVariableOverrides(Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    public DeploymentCanarySettings withStageVariableOverrides(Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-usestagecache
     * 
     */
    @JsonIgnore
    public Boolean getUseStageCache() {
        return useStageCache;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-usestagecache
     * 
     */
    @JsonIgnore
    public void setUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
    }

    public DeploymentCanarySettings withUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("percentTraffic", percentTraffic).append("stageVariableOverrides", stageVariableOverrides).append("useStageCache", useStageCache).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stageVariableOverrides).append(percentTraffic).append(useStageCache).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentCanarySettings) == false) {
            return false;
        }
        DeploymentCanarySettings rhs = ((DeploymentCanarySettings) other);
        return new EqualsBuilder().append(stageVariableOverrides, rhs.stageVariableOverrides).append(percentTraffic, rhs.percentTraffic).append(useStageCache, rhs.useStageCache).isEquals();
    }

}
