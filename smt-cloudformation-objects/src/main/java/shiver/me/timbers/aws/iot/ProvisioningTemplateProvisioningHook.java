
package shiver.me.timbers.aws.iot;

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
 * ProvisioningTemplateProvisioningHook
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetArn",
    "PayloadVersion"
})
public class ProvisioningTemplateProvisioningHook implements Property<ProvisioningTemplateProvisioningHook>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-targetarn
     * 
     */
    @JsonProperty("TargetArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-targetarn")
    private CharSequence targetArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-payloadversion
     * 
     */
    @JsonProperty("PayloadVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-payloadversion")
    private CharSequence payloadVersion;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-targetarn
     * 
     */
    @JsonIgnore
    public CharSequence getTargetArn() {
        return targetArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-targetarn
     * 
     */
    @JsonIgnore
    public void setTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
    }

    public ProvisioningTemplateProvisioningHook withTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-payloadversion
     * 
     */
    @JsonIgnore
    public CharSequence getPayloadVersion() {
        return payloadVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html#cfn-iot-provisioningtemplate-provisioninghook-payloadversion
     * 
     */
    @JsonIgnore
    public void setPayloadVersion(CharSequence payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    public ProvisioningTemplateProvisioningHook withPayloadVersion(CharSequence payloadVersion) {
        this.payloadVersion = payloadVersion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetArn", targetArn).append("payloadVersion", payloadVersion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetArn).append(payloadVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProvisioningTemplateProvisioningHook) == false) {
            return false;
        }
        ProvisioningTemplateProvisioningHook rhs = ((ProvisioningTemplateProvisioningHook) other);
        return new EqualsBuilder().append(targetArn, rhs.targetArn).append(payloadVersion, rhs.payloadVersion).isEquals();
    }

}
