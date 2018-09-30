
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FlowLog
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeliverLogsPermissionArn",
    "LogDestination",
    "LogDestinationType",
    "LogGroupName",
    "ResourceId",
    "ResourceType",
    "TrafficType"
})
public class FlowLog {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn
     * 
     */
    @JsonProperty("DeliverLogsPermissionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn")
    private CharSequence deliverLogsPermissionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestination
     * 
     */
    @JsonProperty("LogDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestination")
    private CharSequence logDestination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestinationtype
     * 
     */
    @JsonProperty("LogDestinationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestinationtype")
    private CharSequence logDestinationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname")
    private CharSequence logGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid")
    private CharSequence resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype")
    private CharSequence resourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype
     * 
     */
    @JsonProperty("TrafficType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype")
    private CharSequence trafficType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn
     * 
     */
    public CharSequence getDeliverLogsPermissionArn() {
        return deliverLogsPermissionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn
     * 
     */
    public void setDeliverLogsPermissionArn(CharSequence deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    public FlowLog withDeliverLogsPermissionArn(CharSequence deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestination
     * 
     */
    public CharSequence getLogDestination() {
        return logDestination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestination
     * 
     */
    public void setLogDestination(CharSequence logDestination) {
        this.logDestination = logDestination;
    }

    public FlowLog withLogDestination(CharSequence logDestination) {
        this.logDestination = logDestination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestinationtype
     * 
     */
    public CharSequence getLogDestinationType() {
        return logDestinationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestinationtype
     * 
     */
    public void setLogDestinationType(CharSequence logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    public FlowLog withLogDestinationType(CharSequence logDestinationType) {
        this.logDestinationType = logDestinationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname
     * 
     */
    public CharSequence getLogGroupName() {
        return logGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname
     * 
     */
    public void setLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
    }

    public FlowLog withLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid
     * 
     */
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid
     * 
     */
    public void setResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
    }

    public FlowLog withResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype
     * 
     */
    public CharSequence getResourceType() {
        return resourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype
     * 
     */
    public void setResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
    }

    public FlowLog withResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype
     * 
     */
    public CharSequence getTrafficType() {
        return trafficType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype
     * 
     */
    public void setTrafficType(CharSequence trafficType) {
        this.trafficType = trafficType;
    }

    public FlowLog withTrafficType(CharSequence trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliverLogsPermissionArn", deliverLogsPermissionArn).append("logDestination", logDestination).append("logDestinationType", logDestinationType).append("logGroupName", logGroupName).append("resourceId", resourceId).append("resourceType", resourceType).append("trafficType", trafficType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logDestination).append(resourceId).append(deliverLogsPermissionArn).append(logDestinationType).append(logGroupName).append(trafficType).append(resourceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlowLog) == false) {
            return false;
        }
        FlowLog rhs = ((FlowLog) other);
        return new EqualsBuilder().append(logDestination, rhs.logDestination).append(resourceId, rhs.resourceId).append(deliverLogsPermissionArn, rhs.deliverLogsPermissionArn).append(logDestinationType, rhs.logDestinationType).append(logGroupName, rhs.logGroupName).append(trafficType, rhs.trafficType).append(resourceType, rhs.resourceType).isEquals();
    }

}
