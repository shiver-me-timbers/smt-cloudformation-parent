
package shiver.me.timbers.aws.pinpoint;

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
 * CampaignCampaignHook
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Mode",
    "WebUrl",
    "LambdaFunctionName"
})
public class CampaignCampaignHook implements Property<CampaignCampaignHook>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-mode
     * 
     */
    @JsonProperty("Mode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-mode")
    private CharSequence mode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-weburl
     * 
     */
    @JsonProperty("WebUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-weburl")
    private CharSequence webUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-lambdafunctionname
     * 
     */
    @JsonProperty("LambdaFunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-lambdafunctionname")
    private CharSequence lambdaFunctionName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-mode
     * 
     */
    @JsonIgnore
    public CharSequence getMode() {
        return mode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-mode
     * 
     */
    @JsonIgnore
    public void setMode(CharSequence mode) {
        this.mode = mode;
    }

    public CampaignCampaignHook withMode(CharSequence mode) {
        this.mode = mode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-weburl
     * 
     */
    @JsonIgnore
    public CharSequence getWebUrl() {
        return webUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-weburl
     * 
     */
    @JsonIgnore
    public void setWebUrl(CharSequence webUrl) {
        this.webUrl = webUrl;
    }

    public CampaignCampaignHook withWebUrl(CharSequence webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-lambdafunctionname
     * 
     */
    @JsonIgnore
    public CharSequence getLambdaFunctionName() {
        return lambdaFunctionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html#cfn-pinpoint-campaign-campaignhook-lambdafunctionname
     * 
     */
    @JsonIgnore
    public void setLambdaFunctionName(CharSequence lambdaFunctionName) {
        this.lambdaFunctionName = lambdaFunctionName;
    }

    public CampaignCampaignHook withLambdaFunctionName(CharSequence lambdaFunctionName) {
        this.lambdaFunctionName = lambdaFunctionName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mode", mode).append("webUrl", webUrl).append("lambdaFunctionName", lambdaFunctionName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mode).append(webUrl).append(lambdaFunctionName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignCampaignHook) == false) {
            return false;
        }
        CampaignCampaignHook rhs = ((CampaignCampaignHook) other);
        return new EqualsBuilder().append(mode, rhs.mode).append(webUrl, rhs.webUrl).append(lambdaFunctionName, rhs.lambdaFunctionName).isEquals();
    }

}
