
package aws.emr;

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
 * InstanceFleetConfigSpotProvisioningSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockDurationMinutes",
    "TimeoutAction",
    "TimeoutDurationMinutes"
})
public class InstanceFleetConfigSpotProvisioningSpecification implements Property<InstanceFleetConfigSpotProvisioningSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes
     * 
     */
    @JsonProperty("BlockDurationMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes")
    private Integer blockDurationMinutes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction
     * 
     */
    @JsonProperty("TimeoutAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction")
    private CharSequence timeoutAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    @JsonProperty("TimeoutDurationMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes")
    private Integer timeoutDurationMinutes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes
     * 
     */
    @JsonIgnore
    public Integer getBlockDurationMinutes() {
        return blockDurationMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes
     * 
     */
    @JsonIgnore
    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    public InstanceFleetConfigSpotProvisioningSpecification withBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction
     * 
     */
    @JsonIgnore
    public CharSequence getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction
     * 
     */
    @JsonIgnore
    public void setTimeoutAction(CharSequence timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    public InstanceFleetConfigSpotProvisioningSpecification withTimeoutAction(CharSequence timeoutAction) {
        this.timeoutAction = timeoutAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    @JsonIgnore
    public Integer getTimeoutDurationMinutes() {
        return timeoutDurationMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    @JsonIgnore
    public void setTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
        this.timeoutDurationMinutes = timeoutDurationMinutes;
    }

    public InstanceFleetConfigSpotProvisioningSpecification withTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
        this.timeoutDurationMinutes = timeoutDurationMinutes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockDurationMinutes", blockDurationMinutes).append("timeoutAction", timeoutAction).append("timeoutDurationMinutes", timeoutDurationMinutes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(blockDurationMinutes).append(timeoutAction).append(timeoutDurationMinutes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceFleetConfigSpotProvisioningSpecification) == false) {
            return false;
        }
        InstanceFleetConfigSpotProvisioningSpecification rhs = ((InstanceFleetConfigSpotProvisioningSpecification) other);
        return new EqualsBuilder().append(blockDurationMinutes, rhs.blockDurationMinutes).append(timeoutAction, rhs.timeoutAction).append(timeoutDurationMinutes, rhs.timeoutDurationMinutes).isEquals();
    }

}
