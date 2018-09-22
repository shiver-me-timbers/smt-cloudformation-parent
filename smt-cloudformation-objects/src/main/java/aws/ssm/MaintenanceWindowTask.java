
package aws.ssm;

import java.util.ArrayList;
import java.util.List;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private String maxErrors;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn")
    private String serviceRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority")
    private Integer priority;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency
     * 
     */
    @JsonProperty("MaxConcurrency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency")
    private String maxConcurrency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets
     * 
     */
    @JsonProperty("Targets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets")
    private List<Target> targets = new ArrayList<Target>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn
     * 
     */
    @JsonProperty("TaskArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn")
    private String taskArn;
    /**
     * TaskInvocationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
     * 
     */
    @JsonProperty("TaskInvocationParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html")
    private TaskInvocationParameters taskInvocationParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid
     * 
     */
    @JsonProperty("WindowId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid")
    private String windowId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters
     * 
     */
    @JsonProperty("TaskParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters")
    private TaskParameters taskParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype
     * 
     */
    @JsonProperty("TaskType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype")
    private String taskType;
    /**
     * LoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
     * 
     */
    @JsonProperty("LoggingInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html")
    private LoggingInfo loggingInfo;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors
     * 
     */
    @JsonProperty("MaxErrors")
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors
     * 
     */
    @JsonProperty("MaxErrors")
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    public MaintenanceWindowTask withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MaintenanceWindowTask withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public MaintenanceWindowTask withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority
     * 
     */
    @JsonProperty("Priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority
     * 
     */
    @JsonProperty("Priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public MaintenanceWindowTask withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency
     * 
     */
    @JsonProperty("MaxConcurrency")
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency
     * 
     */
    @JsonProperty("MaxConcurrency")
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public MaintenanceWindowTask withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets
     * 
     */
    @JsonProperty("Targets")
    public List<Target> getTargets() {
        return targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets
     * 
     */
    @JsonProperty("Targets")
    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public MaintenanceWindowTask withTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public MaintenanceWindowTask withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn
     * 
     */
    @JsonProperty("TaskArn")
    public String getTaskArn() {
        return taskArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn
     * 
     */
    @JsonProperty("TaskArn")
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    public MaintenanceWindowTask withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * TaskInvocationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
     * 
     */
    @JsonProperty("TaskInvocationParameters")
    public TaskInvocationParameters getTaskInvocationParameters() {
        return taskInvocationParameters;
    }

    /**
     * TaskInvocationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
     * 
     */
    @JsonProperty("TaskInvocationParameters")
    public void setTaskInvocationParameters(TaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
    }

    public MaintenanceWindowTask withTaskInvocationParameters(TaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid
     * 
     */
    @JsonProperty("WindowId")
    public String getWindowId() {
        return windowId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid
     * 
     */
    @JsonProperty("WindowId")
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    public MaintenanceWindowTask withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters
     * 
     */
    @JsonProperty("TaskParameters")
    public TaskParameters getTaskParameters() {
        return taskParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters
     * 
     */
    @JsonProperty("TaskParameters")
    public void setTaskParameters(TaskParameters taskParameters) {
        this.taskParameters = taskParameters;
    }

    public MaintenanceWindowTask withTaskParameters(TaskParameters taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype
     * 
     */
    @JsonProperty("TaskType")
    public String getTaskType() {
        return taskType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype
     * 
     */
    @JsonProperty("TaskType")
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public MaintenanceWindowTask withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * LoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
     * 
     */
    @JsonProperty("LoggingInfo")
    public LoggingInfo getLoggingInfo() {
        return loggingInfo;
    }

    /**
     * LoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
     * 
     */
    @JsonProperty("LoggingInfo")
    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    public MaintenanceWindowTask withLoggingInfo(LoggingInfo loggingInfo) {
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
