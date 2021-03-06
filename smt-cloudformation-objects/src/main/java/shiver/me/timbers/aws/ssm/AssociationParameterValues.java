
package shiver.me.timbers.aws.ssm;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * AssociationParameterValues
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ParameterValues"
})
public class AssociationParameterValues implements Property<AssociationParameterValues>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues
     * 
     */
    @JsonProperty("ParameterValues")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues")
    private Set<CharSequence> parameterValues = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getParameterValues() {
        return parameterValues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues
     * 
     */
    @JsonIgnore
    public void setParameterValues(Set<CharSequence> parameterValues) {
        this.parameterValues = parameterValues;
    }

    public AssociationParameterValues withParameterValues(Set<CharSequence> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("parameterValues", parameterValues).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parameterValues).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssociationParameterValues) == false) {
            return false;
        }
        AssociationParameterValues rhs = ((AssociationParameterValues) other);
        return new EqualsBuilder().append(parameterValues, rhs.parameterValues).isEquals();
    }

}
