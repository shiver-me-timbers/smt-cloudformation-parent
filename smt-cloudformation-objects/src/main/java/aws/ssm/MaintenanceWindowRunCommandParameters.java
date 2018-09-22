
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MaintenanceWindowRunCommandParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TimeoutSeconds",
    "Comment",
    "OutputS3KeyPrefix",
    "Parameters",
    "DocumentHashType",
    "ServiceRoleArn",
    "NotificationConfig",
    "OutputS3BucketName",
    "DocumentHash"
})
public class MaintenanceWindowRunCommandParameters {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds
     * 
     */
    @JsonProperty("TimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds")
    private Integer timeoutSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment")
    private String comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix
     * 
     */
    @JsonProperty("OutputS3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix")
    private String outputS3KeyPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters")
    private Parameters_ parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype
     * 
     */
    @JsonProperty("DocumentHashType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype")
    private String documentHashType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn")
    private String serviceRoleArn;
    /**
     * NotificationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
     * 
     */
    @JsonProperty("NotificationConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html")
    private NotificationConfig notificationConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname
     * 
     */
    @JsonProperty("OutputS3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname")
    private String outputS3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash
     * 
     */
    @JsonProperty("DocumentHash")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash")
    private String documentHash;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds
     * 
     */
    @JsonProperty("TimeoutSeconds")
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds
     * 
     */
    @JsonProperty("TimeoutSeconds")
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public MaintenanceWindowRunCommandParameters withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment
     * 
     */
    @JsonProperty("Comment")
    public String getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment
     * 
     */
    @JsonProperty("Comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public MaintenanceWindowRunCommandParameters withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix
     * 
     */
    @JsonProperty("OutputS3KeyPrefix")
    public String getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix
     * 
     */
    @JsonProperty("OutputS3KeyPrefix")
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    public MaintenanceWindowRunCommandParameters withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters
     * 
     */
    @JsonProperty("Parameters")
    public Parameters_ getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters
     * 
     */
    @JsonProperty("Parameters")
    public void setParameters(Parameters_ parameters) {
        this.parameters = parameters;
    }

    public MaintenanceWindowRunCommandParameters withParameters(Parameters_ parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype
     * 
     */
    @JsonProperty("DocumentHashType")
    public String getDocumentHashType() {
        return documentHashType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype
     * 
     */
    @JsonProperty("DocumentHashType")
    public void setDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
    }

    public MaintenanceWindowRunCommandParameters withDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public MaintenanceWindowRunCommandParameters withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * NotificationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
     * 
     */
    @JsonProperty("NotificationConfig")
    public NotificationConfig getNotificationConfig() {
        return notificationConfig;
    }

    /**
     * NotificationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
     * 
     */
    @JsonProperty("NotificationConfig")
    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    public MaintenanceWindowRunCommandParameters withNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname
     * 
     */
    @JsonProperty("OutputS3BucketName")
    public String getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname
     * 
     */
    @JsonProperty("OutputS3BucketName")
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    public MaintenanceWindowRunCommandParameters withOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash
     * 
     */
    @JsonProperty("DocumentHash")
    public String getDocumentHash() {
        return documentHash;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash
     * 
     */
    @JsonProperty("DocumentHash")
    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    public MaintenanceWindowRunCommandParameters withDocumentHash(String documentHash) {
        this.documentHash = documentHash;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timeoutSeconds", timeoutSeconds).append("comment", comment).append("outputS3KeyPrefix", outputS3KeyPrefix).append("parameters", parameters).append("documentHashType", documentHashType).append("serviceRoleArn", serviceRoleArn).append("notificationConfig", notificationConfig).append("outputS3BucketName", outputS3BucketName).append("documentHash", documentHash).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(documentHashType).append(outputS3BucketName).append(documentHash).append(timeoutSeconds).append(comment).append(notificationConfig).append(outputS3KeyPrefix).append(parameters).append(serviceRoleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaintenanceWindowRunCommandParameters) == false) {
            return false;
        }
        MaintenanceWindowRunCommandParameters rhs = ((MaintenanceWindowRunCommandParameters) other);
        return new EqualsBuilder().append(documentHashType, rhs.documentHashType).append(outputS3BucketName, rhs.outputS3BucketName).append(documentHash, rhs.documentHash).append(timeoutSeconds, rhs.timeoutSeconds).append(comment, rhs.comment).append(notificationConfig, rhs.notificationConfig).append(outputS3KeyPrefix, rhs.outputS3KeyPrefix).append(parameters, rhs.parameters).append(serviceRoleArn, rhs.serviceRoleArn).isEquals();
    }

}
