
package aws.rds;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Family",
    "Parameters",
    "Tags"
})
public class DBParameterGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family
     * 
     */
    @JsonProperty("Family")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family")
    private CharSequence family;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters")
    private Map<String, String> parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family
     * 
     */
    public CharSequence getFamily() {
        return family;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters
     * 
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters
     * 
     */
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public DBParameterGroup withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DBParameterGroup withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("description", description).append("family", family).append("parameters", parameters).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(family).append(parameters).append(tags).toHashCode();
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
        return new EqualsBuilder().append(description, rhs.description).append(family, rhs.family).append(parameters, rhs.parameters).append(tags, rhs.tags).isEquals();
    }

}
