
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
    private String deliverLogsPermissionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname")
    private String logGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid")
    private String resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype")
    private String resourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype
     * 
     */
    @JsonProperty("TrafficType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype")
    private String trafficType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn
     * 
     */
    @JsonProperty("DeliverLogsPermissionArn")
    public String getDeliverLogsPermissionArn() {
        return deliverLogsPermissionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn
     * 
     */
    @JsonProperty("DeliverLogsPermissionArn")
    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    public FlowLog withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public FlowLog withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    public String getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public FlowLog withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public FlowLog withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype
     * 
     */
    @JsonProperty("TrafficType")
    public String getTrafficType() {
        return trafficType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype
     * 
     */
    @JsonProperty("TrafficType")
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public FlowLog withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliverLogsPermissionArn", deliverLogsPermissionArn).append("logGroupName", logGroupName).append("resourceId", resourceId).append("resourceType", resourceType).append("trafficType", trafficType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trafficType).append(resourceId).append(deliverLogsPermissionArn).append(logGroupName).append(resourceType).toHashCode();
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
        return new EqualsBuilder().append(trafficType, rhs.trafficType).append(resourceId, rhs.resourceId).append(deliverLogsPermissionArn, rhs.deliverLogsPermissionArn).append(logGroupName, rhs.logGroupName).append(resourceType, rhs.resourceType).isEquals();
    }

}
