
package shiver.me.timbers.aws.ec2;

import java.util.ArrayList;
import java.util.List;
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
 * CapacityReservation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Tenancy",
    "EndDateType",
    "InstanceCount",
    "TagSpecifications",
    "AvailabilityZone",
    "InstancePlatform",
    "InstanceType",
    "EphemeralStorage",
    "InstanceMatchCriteria",
    "EndDate",
    "EbsOptimized"
})
public class CapacityReservation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy")
    private CharSequence tenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype
     * 
     */
    @JsonProperty("EndDateType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype")
    private CharSequence endDateType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount
     * 
     */
    @JsonProperty("InstanceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount")
    private Number instanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications")
    private List<Property<CapacityReservationTagSpecification>> tagSpecifications = new ArrayList<Property<CapacityReservationTagSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform
     * 
     */
    @JsonProperty("InstancePlatform")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform")
    private CharSequence instancePlatform;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage
     * 
     */
    @JsonProperty("EphemeralStorage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage")
    private CharSequence ephemeralStorage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria
     * 
     */
    @JsonProperty("InstanceMatchCriteria")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria")
    private CharSequence instanceMatchCriteria;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddate
     * 
     */
    @JsonProperty("EndDate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddate")
    private CharSequence endDate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized")
    private CharSequence ebsOptimized;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy
     * 
     */
    @JsonIgnore
    public CharSequence getTenancy() {
        return tenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy
     * 
     */
    @JsonIgnore
    public void setTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
    }

    public CapacityReservation withTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype
     * 
     */
    @JsonIgnore
    public CharSequence getEndDateType() {
        return endDateType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype
     * 
     */
    @JsonIgnore
    public void setEndDateType(CharSequence endDateType) {
        this.endDateType = endDateType;
    }

    public CapacityReservation withEndDateType(CharSequence endDateType) {
        this.endDateType = endDateType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount
     * 
     */
    @JsonIgnore
    public Number getInstanceCount() {
        return instanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount
     * 
     */
    @JsonIgnore
    public void setInstanceCount(Number instanceCount) {
        this.instanceCount = instanceCount;
    }

    public CapacityReservation withInstanceCount(Number instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications
     * 
     */
    @JsonIgnore
    public List<Property<CapacityReservationTagSpecification>> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications
     * 
     */
    @JsonIgnore
    public void setTagSpecifications(List<Property<CapacityReservationTagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
    }

    public CapacityReservation withTagSpecifications(List<Property<CapacityReservationTagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone
     * 
     */
    @JsonIgnore
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CapacityReservation withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform
     * 
     */
    @JsonIgnore
    public CharSequence getInstancePlatform() {
        return instancePlatform;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform
     * 
     */
    @JsonIgnore
    public void setInstancePlatform(CharSequence instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    public CapacityReservation withInstancePlatform(CharSequence instancePlatform) {
        this.instancePlatform = instancePlatform;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public CapacityReservation withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage
     * 
     */
    @JsonIgnore
    public CharSequence getEphemeralStorage() {
        return ephemeralStorage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage
     * 
     */
    @JsonIgnore
    public void setEphemeralStorage(CharSequence ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    public CapacityReservation withEphemeralStorage(CharSequence ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceMatchCriteria() {
        return instanceMatchCriteria;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria
     * 
     */
    @JsonIgnore
    public void setInstanceMatchCriteria(CharSequence instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
    }

    public CapacityReservation withInstanceMatchCriteria(CharSequence instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddate
     * 
     */
    @JsonIgnore
    public CharSequence getEndDate() {
        return endDate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddate
     * 
     */
    @JsonIgnore
    public void setEndDate(CharSequence endDate) {
        this.endDate = endDate;
    }

    public CapacityReservation withEndDate(CharSequence endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized
     * 
     */
    @JsonIgnore
    public CharSequence getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized
     * 
     */
    @JsonIgnore
    public void setEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public CapacityReservation withEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tenancy", tenancy).append("endDateType", endDateType).append("instanceCount", instanceCount).append("tagSpecifications", tagSpecifications).append("availabilityZone", availabilityZone).append("instancePlatform", instancePlatform).append("instanceType", instanceType).append("ephemeralStorage", ephemeralStorage).append("instanceMatchCriteria", instanceMatchCriteria).append("endDate", endDate).append("ebsOptimized", ebsOptimized).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagSpecifications).append(ephemeralStorage).append(ebsOptimized).append(endDate).append(instanceCount).append(instancePlatform).append(instanceType).append(tenancy).append(endDateType).append(availabilityZone).append(instanceMatchCriteria).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapacityReservation) == false) {
            return false;
        }
        CapacityReservation rhs = ((CapacityReservation) other);
        return new EqualsBuilder().append(tagSpecifications, rhs.tagSpecifications).append(ephemeralStorage, rhs.ephemeralStorage).append(ebsOptimized, rhs.ebsOptimized).append(endDate, rhs.endDate).append(instanceCount, rhs.instanceCount).append(instancePlatform, rhs.instancePlatform).append(instanceType, rhs.instanceType).append(tenancy, rhs.tenancy).append(endDateType, rhs.endDateType).append(availabilityZone, rhs.availabilityZone).append(instanceMatchCriteria, rhs.instanceMatchCriteria).isEquals();
    }

}
