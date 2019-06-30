
package aws.apigateway;

import java.util.Map;
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
 * StageCanarySetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeploymentId",
    "PercentTraffic",
    "StageVariableOverrides",
    "UseStageCache"
})
public class StageCanarySetting implements Property<StageCanarySetting>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid
     * 
     */
    @JsonProperty("DeploymentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid")
    private CharSequence deploymentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic
     * 
     */
    @JsonProperty("PercentTraffic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic")
    private Number percentTraffic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides
     * 
     */
    @JsonProperty("StageVariableOverrides")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides")
    private Map<String, CharSequence> stageVariableOverrides;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache
     * 
     */
    @JsonProperty("UseStageCache")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache")
    private CharSequence useStageCache;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentId() {
        return deploymentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid
     * 
     */
    @JsonIgnore
    public void setDeploymentId(CharSequence deploymentId) {
        this.deploymentId = deploymentId;
    }

    public StageCanarySetting withDeploymentId(CharSequence deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic
     * 
     */
    @JsonIgnore
    public Number getPercentTraffic() {
        return percentTraffic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic
     * 
     */
    @JsonIgnore
    public void setPercentTraffic(Number percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    public StageCanarySetting withPercentTraffic(Number percentTraffic) {
        this.percentTraffic = percentTraffic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides
     * 
     */
    @JsonIgnore
    public void setStageVariableOverrides(Map<String, CharSequence> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    public StageCanarySetting withStageVariableOverrides(Map<String, CharSequence> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache
     * 
     */
    @JsonIgnore
    public CharSequence getUseStageCache() {
        return useStageCache;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache
     * 
     */
    @JsonIgnore
    public void setUseStageCache(CharSequence useStageCache) {
        this.useStageCache = useStageCache;
    }

    public StageCanarySetting withUseStageCache(CharSequence useStageCache) {
        this.useStageCache = useStageCache;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("deploymentId", deploymentId).append("percentTraffic", percentTraffic).append("stageVariableOverrides", stageVariableOverrides).append("useStageCache", useStageCache).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stageVariableOverrides).append(percentTraffic).append(useStageCache).append(deploymentId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StageCanarySetting) == false) {
            return false;
        }
        StageCanarySetting rhs = ((StageCanarySetting) other);
        return new EqualsBuilder().append(stageVariableOverrides, rhs.stageVariableOverrides).append(percentTraffic, rhs.percentTraffic).append(useStageCache, rhs.useStageCache).append(deploymentId, rhs.deploymentId).isEquals();
    }

}
