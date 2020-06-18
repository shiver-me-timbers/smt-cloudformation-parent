
package shiver.me.timbers.aws.ec2;

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
 * TrafficMirrorFilterRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DestinationPortRange",
    "Description",
    "SourcePortRange",
    "RuleAction",
    "SourceCidrBlock",
    "RuleNumber",
    "DestinationCidrBlock",
    "TrafficMirrorFilterId",
    "TrafficDirection",
    "Protocol"
})
public class TrafficMirrorFilterRule {

    /**
     * TrafficMirrorFilterRuleTrafficMirrorPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html
     * 
     */
    @JsonProperty("DestinationPortRange")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html")
    private Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> destinationPortRange;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description")
    private CharSequence description;
    /**
     * TrafficMirrorFilterRuleTrafficMirrorPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html
     * 
     */
    @JsonProperty("SourcePortRange")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html")
    private Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> sourcePortRange;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction
     * 
     */
    @JsonProperty("RuleAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction")
    private CharSequence ruleAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock
     * 
     */
    @JsonProperty("SourceCidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock")
    private CharSequence sourceCidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber
     * 
     */
    @JsonProperty("RuleNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber")
    private Number ruleNumber;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock
     * 
     */
    @JsonProperty("DestinationCidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock")
    private CharSequence destinationCidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid
     * 
     */
    @JsonProperty("TrafficMirrorFilterId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid")
    private CharSequence trafficMirrorFilterId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection
     * 
     */
    @JsonProperty("TrafficDirection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection")
    private CharSequence trafficDirection;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol")
    private Number protocol;

    /**
     * TrafficMirrorFilterRuleTrafficMirrorPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> getDestinationPortRange() {
        return destinationPortRange;
    }

    /**
     * TrafficMirrorFilterRuleTrafficMirrorPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html
     * 
     */
    @JsonIgnore
    public void setDestinationPortRange(Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    public TrafficMirrorFilterRule withDestinationPortRange(Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public TrafficMirrorFilterRule withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * TrafficMirrorFilterRuleTrafficMirrorPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> getSourcePortRange() {
        return sourcePortRange;
    }

    /**
     * TrafficMirrorFilterRuleTrafficMirrorPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html
     * 
     */
    @JsonIgnore
    public void setSourcePortRange(Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    public TrafficMirrorFilterRule withSourcePortRange(Property<shiver.me.timbers.aws.ec2.TrafficMirrorFilterRuleTrafficMirrorPortRange> sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction
     * 
     */
    @JsonIgnore
    public CharSequence getRuleAction() {
        return ruleAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction
     * 
     */
    @JsonIgnore
    public void setRuleAction(CharSequence ruleAction) {
        this.ruleAction = ruleAction;
    }

    public TrafficMirrorFilterRule withRuleAction(CharSequence ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getSourceCidrBlock() {
        return sourceCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock
     * 
     */
    @JsonIgnore
    public void setSourceCidrBlock(CharSequence sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    public TrafficMirrorFilterRule withSourceCidrBlock(CharSequence sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber
     * 
     */
    @JsonIgnore
    public Number getRuleNumber() {
        return ruleNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber
     * 
     */
    @JsonIgnore
    public void setRuleNumber(Number ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    public TrafficMirrorFilterRule withRuleNumber(Number ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock
     * 
     */
    @JsonIgnore
    public void setDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public TrafficMirrorFilterRule withDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid
     * 
     */
    @JsonIgnore
    public CharSequence getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid
     * 
     */
    @JsonIgnore
    public void setTrafficMirrorFilterId(CharSequence trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    public TrafficMirrorFilterRule withTrafficMirrorFilterId(CharSequence trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection
     * 
     */
    @JsonIgnore
    public CharSequence getTrafficDirection() {
        return trafficDirection;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection
     * 
     */
    @JsonIgnore
    public void setTrafficDirection(CharSequence trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    public TrafficMirrorFilterRule withTrafficDirection(CharSequence trafficDirection) {
        this.trafficDirection = trafficDirection;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol
     * 
     */
    @JsonIgnore
    public Number getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol
     * 
     */
    @JsonIgnore
    public void setProtocol(Number protocol) {
        this.protocol = protocol;
    }

    public TrafficMirrorFilterRule withProtocol(Number protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationPortRange", destinationPortRange).append("description", description).append("sourcePortRange", sourcePortRange).append("ruleAction", ruleAction).append("sourceCidrBlock", sourceCidrBlock).append("ruleNumber", ruleNumber).append("destinationCidrBlock", destinationCidrBlock).append("trafficMirrorFilterId", trafficMirrorFilterId).append("trafficDirection", trafficDirection).append("protocol", protocol).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationCidrBlock).append(ruleAction).append(protocol).append(sourcePortRange).append(destinationPortRange).append(ruleNumber).append(description).append(sourceCidrBlock).append(trafficDirection).append(trafficMirrorFilterId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrafficMirrorFilterRule) == false) {
            return false;
        }
        TrafficMirrorFilterRule rhs = ((TrafficMirrorFilterRule) other);
        return new EqualsBuilder().append(destinationCidrBlock, rhs.destinationCidrBlock).append(ruleAction, rhs.ruleAction).append(protocol, rhs.protocol).append(sourcePortRange, rhs.sourcePortRange).append(destinationPortRange, rhs.destinationPortRange).append(ruleNumber, rhs.ruleNumber).append(description, rhs.description).append(sourceCidrBlock, rhs.sourceCidrBlock).append(trafficDirection, rhs.trafficDirection).append(trafficMirrorFilterId, rhs.trafficMirrorFilterId).isEquals();
    }

}
