
package aws.lambda;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Environment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Variables"
})
public class Environment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables")
    private Map<String, String> variables;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables
     * 
     */
    public Map<String, String> getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables
     * 
     */
    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public Environment withVariables(Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("variables", variables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variables).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Environment) == false) {
            return false;
        }
        Environment rhs = ((Environment) other);
        return new EqualsBuilder().append(variables, rhs.variables).isEquals();
    }

}
