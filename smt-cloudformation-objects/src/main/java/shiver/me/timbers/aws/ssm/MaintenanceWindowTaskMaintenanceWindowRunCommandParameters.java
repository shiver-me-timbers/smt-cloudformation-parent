
package shiver.me.timbers.aws.ssm;

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
 * MaintenanceWindowTaskMaintenanceWindowRunCommandParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
public class MaintenanceWindowTaskMaintenanceWindowRunCommandParameters implements Property<MaintenanceWindowTaskMaintenanceWindowRunCommandParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds
     * 
     */
    @JsonProperty("TimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds")
    private Number timeoutSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment")
    private CharSequence comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix
     * 
     */
    @JsonProperty("OutputS3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix")
    private CharSequence outputS3KeyPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters")
    private Object parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype
     * 
     */
    @JsonProperty("DocumentHashType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype")
    private CharSequence documentHashType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn")
    private CharSequence serviceRoleArn;
    /**
     * MaintenanceWindowTaskNotificationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
     * 
     */
    @JsonProperty("NotificationConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html")
    private Property<MaintenanceWindowTaskNotificationConfig> notificationConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname
     * 
     */
    @JsonProperty("OutputS3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname")
    private CharSequence outputS3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash
     * 
     */
    @JsonProperty("DocumentHash")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash")
    private CharSequence documentHash;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds
     * 
     */
    @JsonIgnore
    public Number getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds
     * 
     */
    @JsonIgnore
    public void setTimeoutSeconds(Number timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withTimeoutSeconds(Number timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment
     * 
     */
    @JsonIgnore
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment
     * 
     */
    @JsonIgnore
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix
     * 
     */
    @JsonIgnore
    public CharSequence getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix
     * 
     */
    @JsonIgnore
    public void setOutputS3KeyPrefix(CharSequence outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withOutputS3KeyPrefix(CharSequence outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters
     * 
     */
    @JsonIgnore
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype
     * 
     */
    @JsonIgnore
    public CharSequence getDocumentHashType() {
        return documentHashType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype
     * 
     */
    @JsonIgnore
    public void setDocumentHashType(CharSequence documentHashType) {
        this.documentHashType = documentHashType;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withDocumentHashType(CharSequence documentHashType) {
        this.documentHashType = documentHashType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn
     * 
     */
    @JsonIgnore
    public void setServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * MaintenanceWindowTaskNotificationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowTaskNotificationConfig> getNotificationConfig() {
        return notificationConfig;
    }

    /**
     * MaintenanceWindowTaskNotificationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
     * 
     */
    @JsonIgnore
    public void setNotificationConfig(Property<MaintenanceWindowTaskNotificationConfig> notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withNotificationConfig(Property<MaintenanceWindowTaskNotificationConfig> notificationConfig) {
        this.notificationConfig = notificationConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname
     * 
     */
    @JsonIgnore
    public void setOutputS3BucketName(CharSequence outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withOutputS3BucketName(CharSequence outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash
     * 
     */
    @JsonIgnore
    public CharSequence getDocumentHash() {
        return documentHash;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash
     * 
     */
    @JsonIgnore
    public void setDocumentHash(CharSequence documentHash) {
        this.documentHash = documentHash;
    }

    public MaintenanceWindowTaskMaintenanceWindowRunCommandParameters withDocumentHash(CharSequence documentHash) {
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
        if ((other instanceof MaintenanceWindowTaskMaintenanceWindowRunCommandParameters) == false) {
            return false;
        }
        MaintenanceWindowTaskMaintenanceWindowRunCommandParameters rhs = ((MaintenanceWindowTaskMaintenanceWindowRunCommandParameters) other);
        return new EqualsBuilder().append(documentHashType, rhs.documentHashType).append(outputS3BucketName, rhs.outputS3BucketName).append(documentHash, rhs.documentHash).append(timeoutSeconds, rhs.timeoutSeconds).append(comment, rhs.comment).append(notificationConfig, rhs.notificationConfig).append(outputS3KeyPrefix, rhs.outputS3KeyPrefix).append(parameters, rhs.parameters).append(serviceRoleArn, rhs.serviceRoleArn).isEquals();
    }

}
