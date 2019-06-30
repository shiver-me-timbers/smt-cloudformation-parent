
package aws.ssm;

import java.util.ArrayList;
import java.util.List;
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
 * MaintenanceWindowTask
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxErrors",
    "Description",
    "ServiceRoleArn",
    "Priority",
    "MaxConcurrency",
    "Targets",
    "Name",
    "TaskArn",
    "TaskInvocationParameters",
    "WindowId",
    "TaskParameters",
    "TaskType",
    "LoggingInfo"
})
public class MaintenanceWindowTask {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors
     * 
     */
    @JsonProperty("MaxErrors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors")
    private CharSequence maxErrors;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn")
    private CharSequence serviceRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority")
    private Number priority;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency
     * 
     */
    @JsonProperty("MaxConcurrency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency")
    private CharSequence maxConcurrency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets
     * 
     */
    @JsonProperty("Targets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets")
    private List<Property<MaintenanceWindowTaskTarget>> targets = new ArrayList<Property<MaintenanceWindowTaskTarget>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn
     * 
     */
    @JsonProperty("TaskArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn")
    private CharSequence taskArn;
    /**
     * MaintenanceWindowTaskTaskInvocationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
     * 
     */
    @JsonProperty("TaskInvocationParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html")
    private Property<MaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid
     * 
     */
    @JsonProperty("WindowId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid")
    private CharSequence windowId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters
     * 
     */
    @JsonProperty("TaskParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters")
    private Object taskParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype
     * 
     */
    @JsonProperty("TaskType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype")
    private CharSequence taskType;
    /**
     * MaintenanceWindowTaskLoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
     * 
     */
    @JsonProperty("LoggingInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html")
    private Property<MaintenanceWindowTaskLoggingInfo> loggingInfo;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors
     * 
     */
    @JsonIgnore
    public CharSequence getMaxErrors() {
        return maxErrors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors
     * 
     */
    @JsonIgnore
    public void setMaxErrors(CharSequence maxErrors) {
        this.maxErrors = maxErrors;
    }

    public MaintenanceWindowTask withMaxErrors(CharSequence maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public MaintenanceWindowTask withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn
     * 
     */
    @JsonIgnore
    public void setServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public MaintenanceWindowTask withServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority
     * 
     */
    @JsonIgnore
    public Number getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority
     * 
     */
    @JsonIgnore
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public MaintenanceWindowTask withPriority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency
     * 
     */
    @JsonIgnore
    public CharSequence getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency
     * 
     */
    @JsonIgnore
    public void setMaxConcurrency(CharSequence maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public MaintenanceWindowTask withMaxConcurrency(CharSequence maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets
     * 
     */
    @JsonIgnore
    public List<Property<MaintenanceWindowTaskTarget>> getTargets() {
        return targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets
     * 
     */
    @JsonIgnore
    public void setTargets(List<Property<MaintenanceWindowTaskTarget>> targets) {
        this.targets = targets;
    }

    public MaintenanceWindowTask withTargets(List<Property<MaintenanceWindowTaskTarget>> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public MaintenanceWindowTask withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn
     * 
     */
    @JsonIgnore
    public CharSequence getTaskArn() {
        return taskArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn
     * 
     */
    @JsonIgnore
    public void setTaskArn(CharSequence taskArn) {
        this.taskArn = taskArn;
    }

    public MaintenanceWindowTask withTaskArn(CharSequence taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * MaintenanceWindowTaskTaskInvocationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowTaskTaskInvocationParameters> getTaskInvocationParameters() {
        return taskInvocationParameters;
    }

    /**
     * MaintenanceWindowTaskTaskInvocationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
     * 
     */
    @JsonIgnore
    public void setTaskInvocationParameters(Property<MaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
    }

    public MaintenanceWindowTask withTaskInvocationParameters(Property<MaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid
     * 
     */
    @JsonIgnore
    public CharSequence getWindowId() {
        return windowId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid
     * 
     */
    @JsonIgnore
    public void setWindowId(CharSequence windowId) {
        this.windowId = windowId;
    }

    public MaintenanceWindowTask withWindowId(CharSequence windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters
     * 
     */
    @JsonIgnore
    public Object getTaskParameters() {
        return taskParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters
     * 
     */
    @JsonIgnore
    public void setTaskParameters(Object taskParameters) {
        this.taskParameters = taskParameters;
    }

    public MaintenanceWindowTask withTaskParameters(Object taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype
     * 
     */
    @JsonIgnore
    public CharSequence getTaskType() {
        return taskType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype
     * 
     */
    @JsonIgnore
    public void setTaskType(CharSequence taskType) {
        this.taskType = taskType;
    }

    public MaintenanceWindowTask withTaskType(CharSequence taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * MaintenanceWindowTaskLoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowTaskLoggingInfo> getLoggingInfo() {
        return loggingInfo;
    }

    /**
     * MaintenanceWindowTaskLoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
     * 
     */
    @JsonIgnore
    public void setLoggingInfo(Property<MaintenanceWindowTaskLoggingInfo> loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    public MaintenanceWindowTask withLoggingInfo(Property<MaintenanceWindowTaskLoggingInfo> loggingInfo) {
        this.loggingInfo = loggingInfo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxErrors", maxErrors).append("description", description).append("serviceRoleArn", serviceRoleArn).append("priority", priority).append("maxConcurrency", maxConcurrency).append("targets", targets).append("name", name).append("taskArn", taskArn).append("taskInvocationParameters", taskInvocationParameters).append("windowId", windowId).append("taskParameters", taskParameters).append("taskType", taskType).append("loggingInfo", loggingInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(taskArn).append(description).append(loggingInfo).append(priority).append(targets).append(maxConcurrency).append(windowId).append(taskType).append(maxErrors).append(name).append(serviceRoleArn).append(taskParameters).append(taskInvocationParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaintenanceWindowTask) == false) {
            return false;
        }
        MaintenanceWindowTask rhs = ((MaintenanceWindowTask) other);
        return new EqualsBuilder().append(taskArn, rhs.taskArn).append(description, rhs.description).append(loggingInfo, rhs.loggingInfo).append(priority, rhs.priority).append(targets, rhs.targets).append(maxConcurrency, rhs.maxConcurrency).append(windowId, rhs.windowId).append(taskType, rhs.taskType).append(maxErrors, rhs.maxErrors).append(name, rhs.name).append(serviceRoleArn, rhs.serviceRoleArn).append(taskParameters, rhs.taskParameters).append(taskInvocationParameters, rhs.taskInvocationParameters).isEquals();
    }

}
