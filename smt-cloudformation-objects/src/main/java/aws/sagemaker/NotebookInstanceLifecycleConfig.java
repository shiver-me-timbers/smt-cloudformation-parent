
package aws.sagemaker;

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
 * NotebookInstanceLifecycleConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OnStart",
    "NotebookInstanceLifecycleConfigName",
    "OnCreate"
})
public class NotebookInstanceLifecycleConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart
     * 
     */
    @JsonProperty("OnStart")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart")
    private List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> onStart = new ArrayList<Property<aws.sagemaker.NotebookInstanceLifecycleHook>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname
     * 
     */
    @JsonProperty("NotebookInstanceLifecycleConfigName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname")
    private CharSequence notebookInstanceLifecycleConfigName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate
     * 
     */
    @JsonProperty("OnCreate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate")
    private List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> onCreate = new ArrayList<Property<aws.sagemaker.NotebookInstanceLifecycleHook>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart
     * 
     */
    @JsonIgnore
    public List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> getOnStart() {
        return onStart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart
     * 
     */
    @JsonIgnore
    public void setOnStart(List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> onStart) {
        this.onStart = onStart;
    }

    public NotebookInstanceLifecycleConfig withOnStart(List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> onStart) {
        this.onStart = onStart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname
     * 
     */
    @JsonIgnore
    public CharSequence getNotebookInstanceLifecycleConfigName() {
        return notebookInstanceLifecycleConfigName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname
     * 
     */
    @JsonIgnore
    public void setNotebookInstanceLifecycleConfigName(CharSequence notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    public NotebookInstanceLifecycleConfig withNotebookInstanceLifecycleConfigName(CharSequence notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate
     * 
     */
    @JsonIgnore
    public List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> getOnCreate() {
        return onCreate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate
     * 
     */
    @JsonIgnore
    public void setOnCreate(List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> onCreate) {
        this.onCreate = onCreate;
    }

    public NotebookInstanceLifecycleConfig withOnCreate(List<Property<aws.sagemaker.NotebookInstanceLifecycleHook>> onCreate) {
        this.onCreate = onCreate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onStart", onStart).append("notebookInstanceLifecycleConfigName", notebookInstanceLifecycleConfigName).append("onCreate", onCreate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onCreate).append(onStart).append(notebookInstanceLifecycleConfigName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotebookInstanceLifecycleConfig) == false) {
            return false;
        }
        NotebookInstanceLifecycleConfig rhs = ((NotebookInstanceLifecycleConfig) other);
        return new EqualsBuilder().append(onCreate, rhs.onCreate).append(onStart, rhs.onStart).append(notebookInstanceLifecycleConfigName, rhs.notebookInstanceLifecycleConfigName).isEquals();
    }

}
