
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
 * DeploymentCanarySetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PercentTraffic",
    "StageVariableOverrides",
    "UseStageCache"
})
public class DeploymentCanarySetting implements Property<DeploymentCanarySetting>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic
     * 
     */
    @JsonProperty("PercentTraffic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic")
    private Number percentTraffic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides
     * 
     */
    @JsonProperty("StageVariableOverrides")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides")
    private Map<String, CharSequence> stageVariableOverrides;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache
     * 
     */
    @JsonProperty("UseStageCache")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache")
    private CharSequence useStageCache;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic
     * 
     */
    @JsonIgnore
    public Number getPercentTraffic() {
        return percentTraffic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic
     * 
     */
    @JsonIgnore
    public void setPercentTraffic(Number percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    public DeploymentCanarySetting withPercentTraffic(Number percentTraffic) {
        this.percentTraffic = percentTraffic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides
     * 
     */
    @JsonIgnore
    public void setStageVariableOverrides(Map<String, CharSequence> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    public DeploymentCanarySetting withStageVariableOverrides(Map<String, CharSequence> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache
     * 
     */
    @JsonIgnore
    public CharSequence getUseStageCache() {
        return useStageCache;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache
     * 
     */
    @JsonIgnore
    public void setUseStageCache(CharSequence useStageCache) {
        this.useStageCache = useStageCache;
    }

    public DeploymentCanarySetting withUseStageCache(CharSequence useStageCache) {
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
        if ((other instanceof DeploymentCanarySetting) == false) {
            return false;
        }
        DeploymentCanarySetting rhs = ((DeploymentCanarySetting) other);
        return new EqualsBuilder().append(stageVariableOverrides, rhs.stageVariableOverrides).append(percentTraffic, rhs.percentTraffic).append(useStageCache, rhs.useStageCache).isEquals();
    }

}
