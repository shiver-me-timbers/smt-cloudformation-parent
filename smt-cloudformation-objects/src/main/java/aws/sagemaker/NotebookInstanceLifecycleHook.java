
package aws.sagemaker;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NotebookInstanceLifecycleHook
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Content"
})
public class NotebookInstanceLifecycleHook {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content
     * 
     */
    @JsonProperty("Content")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content")
    private CharSequence content;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content
     * 
     */
    public CharSequence getContent() {
        return content;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content
     * 
     */
    public void setContent(CharSequence content) {
        this.content = content;
    }

    public NotebookInstanceLifecycleHook withContent(CharSequence content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(content).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotebookInstanceLifecycleHook) == false) {
            return false;
        }
        NotebookInstanceLifecycleHook rhs = ((NotebookInstanceLifecycleHook) other);
        return new EqualsBuilder().append(content, rhs.content).isEquals();
    }

}
