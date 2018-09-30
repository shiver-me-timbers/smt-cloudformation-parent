
package aws.apigateway;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CanarySetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PercentTraffic",
    "StageVariableOverrides",
    "UseStageCache"
})
public class CanarySetting {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic
     * 
     */
    @JsonProperty("PercentTraffic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic")
    private Double percentTraffic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides
     * 
     */
    @JsonProperty("StageVariableOverrides")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides")
    private Map<String, String> stageVariableOverrides;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache
     * 
     */
    @JsonProperty("UseStageCache")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache")
    private Boolean useStageCache;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic
     * 
     */
    public Double getPercentTraffic() {
        return percentTraffic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic
     * 
     */
    public void setPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    public CanarySetting withPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides
     * 
     */
    public Map<String, String> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides
     * 
     */
    public void setStageVariableOverrides(Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    public CanarySetting withStageVariableOverrides(Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache
     * 
     */
    public Boolean getUseStageCache() {
        return useStageCache;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache
     * 
     */
    public void setUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
    }

    public CanarySetting withUseStageCache(Boolean useStageCache) {
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
        if ((other instanceof CanarySetting) == false) {
            return false;
        }
        CanarySetting rhs = ((CanarySetting) other);
        return new EqualsBuilder().append(stageVariableOverrides, rhs.stageVariableOverrides).append(percentTraffic, rhs.percentTraffic).append(useStageCache, rhs.useStageCache).isEquals();
    }

}
