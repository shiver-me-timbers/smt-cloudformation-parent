
package shiver.me.timbers.aws.greengrass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * FunctionDefinitionDefaultConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Execution"
})
public class FunctionDefinitionDefaultConfig implements Property<FunctionDefinitionDefaultConfig>
{

    /**
     * FunctionDefinitionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonProperty("Execution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html")
    private Property<FunctionDefinitionExecution> execution;

    /**
     * FunctionDefinitionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionExecution> getExecution() {
        return execution;
    }

    /**
     * FunctionDefinitionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonIgnore
    public void setExecution(Property<FunctionDefinitionExecution> execution) {
        this.execution = execution;
    }

    public FunctionDefinitionDefaultConfig withExecution(Property<FunctionDefinitionExecution> execution) {
        this.execution = execution;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("execution", execution).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(execution).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionDefinitionDefaultConfig) == false) {
            return false;
        }
        FunctionDefinitionDefaultConfig rhs = ((FunctionDefinitionDefaultConfig) other);
        return new EqualsBuilder().append(execution, rhs.execution).isEquals();
    }

}
