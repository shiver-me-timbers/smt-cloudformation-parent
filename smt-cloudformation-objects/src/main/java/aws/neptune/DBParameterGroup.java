
package aws.neptune;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DBParameterGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Parameters",
    "Family",
    "Tags",
    "Name"
})
public class DBParameterGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters")
    private Object parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family
     * 
     */
    @JsonProperty("Family")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family")
    private CharSequence family;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public DBParameterGroup withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters
     * 
     */
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters
     * 
     */
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public DBParameterGroup withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family
     * 
     */
    public CharSequence getFamily() {
        return family;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family
     * 
     */
    public void setFamily(CharSequence family) {
        this.family = family;
    }

    public DBParameterGroup withFamily(CharSequence family) {
        this.family = family;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DBParameterGroup withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public DBParameterGroup withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("parameters", parameters).append("family", family).append("tags", tags).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(family).append(parameters).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBParameterGroup) == false) {
            return false;
        }
        DBParameterGroup rhs = ((DBParameterGroup) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(family, rhs.family).append(parameters, rhs.parameters).append(tags, rhs.tags).isEquals();
    }

}
