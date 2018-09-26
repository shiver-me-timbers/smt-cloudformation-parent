
package aws.datapipeline;

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
 * ParameterObject
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Attributes",
    "Id"
})
public class ParameterObject {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes")
    private List<ParameterAttribute> attributes = new ArrayList<ParameterAttribute>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id")
    private CharSequence id;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes
     * 
     */
    public List<ParameterAttribute> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes
     * 
     */
    public void setAttributes(List<ParameterAttribute> attributes) {
        this.attributes = attributes;
    }

    public ParameterObject withAttributes(List<ParameterAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public ParameterObject withId(CharSequence id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributes", attributes).append("id", id).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParameterObject) == false) {
            return false;
        }
        ParameterObject rhs = ((ParameterObject) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(id, rhs.id).isEquals();
    }

}
