
package shiver.me.timbers.aws.emr;

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
 * ClusterSpotProvisioningSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockDurationMinutes",
    "TimeoutAction",
    "TimeoutDurationMinutes"
})
public class ClusterSpotProvisioningSpecification implements Property<ClusterSpotProvisioningSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes
     * 
     */
    @JsonProperty("BlockDurationMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes")
    private Number blockDurationMinutes;
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
    private Number timeoutDurationMinutes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes
     * 
     */
    @JsonIgnore
    public Number getBlockDurationMinutes() {
        return blockDurationMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes
     * 
     */
    @JsonIgnore
    public void setBlockDurationMinutes(Number blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    public ClusterSpotProvisioningSpecification withBlockDurationMinutes(Number blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction
     * 
     */
    @JsonIgnore
    public CharSequence getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction
     * 
     */
    @JsonIgnore
    public void setTimeoutAction(CharSequence timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    public ClusterSpotProvisioningSpecification withTimeoutAction(CharSequence timeoutAction) {
        this.timeoutAction = timeoutAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    @JsonIgnore
    public Number getTimeoutDurationMinutes() {
        return timeoutDurationMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes
     * 
     */
    @JsonIgnore
    public void setTimeoutDurationMinutes(Number timeoutDurationMinutes) {
        this.timeoutDurationMinutes = timeoutDurationMinutes;
    }

    public ClusterSpotProvisioningSpecification withTimeoutDurationMinutes(Number timeoutDurationMinutes) {
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
        if ((other instanceof ClusterSpotProvisioningSpecification) == false) {
            return false;
        }
        ClusterSpotProvisioningSpecification rhs = ((ClusterSpotProvisioningSpecification) other);
        return new EqualsBuilder().append(blockDurationMinutes, rhs.blockDurationMinutes).append(timeoutAction, rhs.timeoutAction).append(timeoutDurationMinutes, rhs.timeoutDurationMinutes).isEquals();
    }

}
