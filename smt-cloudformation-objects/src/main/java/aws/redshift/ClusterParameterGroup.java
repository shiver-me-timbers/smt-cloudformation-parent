
package aws.redshift;

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
 * ClusterParameterGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "ParameterGroupFamily",
    "Parameters",
    "Tags"
})
public class ClusterParameterGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily
     * 
     */
    @JsonProperty("ParameterGroupFamily")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily")
    private CharSequence parameterGroupFamily;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters")
    private List<Parameter> parameters = new ArrayList<Parameter>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ClusterParameterGroup withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily
     * 
     */
    public CharSequence getParameterGroupFamily() {
        return parameterGroupFamily;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily
     * 
     */
    public void setParameterGroupFamily(CharSequence parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }

    public ClusterParameterGroup withParameterGroupFamily(CharSequence parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters
     * 
     */
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters
     * 
     */
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public ClusterParameterGroup withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ClusterParameterGroup withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("parameterGroupFamily", parameterGroupFamily).append("parameters", parameters).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(parameterGroupFamily).append(parameters).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterParameterGroup) == false) {
            return false;
        }
        ClusterParameterGroup rhs = ((ClusterParameterGroup) other);
        return new EqualsBuilder().append(description, rhs.description).append(parameterGroupFamily, rhs.parameterGroupFamily).append(parameters, rhs.parameters).append(tags, rhs.tags).isEquals();
    }

}
