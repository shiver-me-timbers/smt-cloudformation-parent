
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotProvisioningSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BlockDurationMinutes",
    "TimeoutAction",
    "TimeoutDurationMinutes"
})
public class SpotProvisioningSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes
     * 
     */
    @JsonProperty("BlockDurationMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes")
    private Integer blockDurationMinutes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction
     * 
     */
    @JsonProperty("TimeoutAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction")
    private CharSequence timeoutAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    @JsonProperty("TimeoutDurationMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes")
    private Integer timeoutDurationMinutes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes
     * 
     */
    public Integer getBlockDurationMinutes() {
        return blockDurationMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes
     * 
     */
    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    public SpotProvisioningSpecification withBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction
     * 
     */
    public CharSequence getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction
     * 
     */
    public void setTimeoutAction(CharSequence timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    public SpotProvisioningSpecification withTimeoutAction(CharSequence timeoutAction) {
        this.timeoutAction = timeoutAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    public Integer getTimeoutDurationMinutes() {
        return timeoutDurationMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    public void setTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
        this.timeoutDurationMinutes = timeoutDurationMinutes;
    }

    public SpotProvisioningSpecification withTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
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
        if ((other instanceof SpotProvisioningSpecification) == false) {
            return false;
        }
        SpotProvisioningSpecification rhs = ((SpotProvisioningSpecification) other);
        return new EqualsBuilder().append(blockDurationMinutes, rhs.blockDurationMinutes).append(timeoutAction, rhs.timeoutAction).append(timeoutDurationMinutes, rhs.timeoutDurationMinutes).isEquals();
    }

}
