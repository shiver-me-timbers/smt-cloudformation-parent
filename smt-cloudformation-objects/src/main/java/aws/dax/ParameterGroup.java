
package aws.dax;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ParameterGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ParameterNameValues",
    "Description",
    "ParameterGroupName"
})
public class ParameterGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues
     * 
     */
    @JsonProperty("ParameterNameValues")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues")
    private Object parameterNameValues;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname
     * 
     */
    @JsonProperty("ParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname")
    private CharSequence parameterGroupName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues
     * 
     */
    public Object getParameterNameValues() {
        return parameterNameValues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues
     * 
     */
    public void setParameterNameValues(Object parameterNameValues) {
        this.parameterNameValues = parameterNameValues;
    }

    public ParameterGroup withParameterNameValues(Object parameterNameValues) {
        this.parameterNameValues = parameterNameValues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ParameterGroup withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname
     * 
     */
    public CharSequence getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname
     * 
     */
    public void setParameterGroupName(CharSequence parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    public ParameterGroup withParameterGroupName(CharSequence parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("parameterNameValues", parameterNameValues).append("description", description).append("parameterGroupName", parameterGroupName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parameterGroupName).append(description).append(parameterNameValues).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParameterGroup) == false) {
            return false;
        }
        ParameterGroup rhs = ((ParameterGroup) other);
        return new EqualsBuilder().append(parameterGroupName, rhs.parameterGroupName).append(description, rhs.description).append(parameterNameValues, rhs.parameterNameValues).isEquals();
    }

}
