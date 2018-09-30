
package aws.sagemaker;

import aws.CreationPolicy;
import aws.DeletionPolicy;
import aws.HasAttributes;
import aws.Resource;
import aws.UpdatePolicy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;


/**
 * NotebookInstanceLifecycleConfigResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class NotebookInstanceLifecycleConfigResource
    extends Resource
    implements HasAttributes<NotebookInstanceLifecycleConfigAttributes>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::SageMaker::NotebookInstanceLifecycleConfig";
    /**
     * NotebookInstanceLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html")
    private NotebookInstanceLifecycleConfig properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NotebookInstanceLifecycleConfigResource() {
    }

    /**
     * 
     * @param name
     */
    public NotebookInstanceLifecycleConfigResource(java.lang.String name) {
        super(name);
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public NotebookInstanceLifecycleConfigResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * NotebookInstanceLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html
     * 
     */
    public NotebookInstanceLifecycleConfig getProperties() {
        return properties;
    }

    /**
     * NotebookInstanceLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html
     * 
     */
    public void setProperties(NotebookInstanceLifecycleConfig properties) {
        this.properties = properties;
    }

    public NotebookInstanceLifecycleConfigResource withProperties(NotebookInstanceLifecycleConfig properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public NotebookInstanceLifecycleConfigResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public NotebookInstanceLifecycleConfigResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public NotebookInstanceLifecycleConfigResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public NotebookInstanceLifecycleConfigResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public NotebookInstanceLifecycleConfigResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public NotebookInstanceLifecycleConfigResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public NotebookInstanceLifecycleConfigResource withName(java.lang.String name) {
        super.withName(name);
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("type", type).append("properties", properties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(type).append(properties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotebookInstanceLifecycleConfigResource) == false) {
            return false;
        }
        NotebookInstanceLifecycleConfigResource rhs = ((NotebookInstanceLifecycleConfigResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}