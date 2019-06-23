
package aws.greengrass;

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
 * FunctionDefinitionVersionDefaultConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Execution"
})
public class FunctionDefinitionVersionDefaultConfig implements Property<FunctionDefinitionVersionDefaultConfig>
{

    /**
     * FunctionDefinitionVersionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html
     * 
     */
    @JsonProperty("Execution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html")
    private Property<FunctionDefinitionVersionExecution> execution;

    /**
     * FunctionDefinitionVersionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionVersionExecution> getExecution() {
        return execution;
    }

    /**
     * FunctionDefinitionVersionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html
     * 
     */
    @JsonIgnore
    public void setExecution(Property<FunctionDefinitionVersionExecution> execution) {
        this.execution = execution;
    }

    public FunctionDefinitionVersionDefaultConfig withExecution(Property<FunctionDefinitionVersionExecution> execution) {
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
        if ((other instanceof FunctionDefinitionVersionDefaultConfig) == false) {
            return false;
        }
        FunctionDefinitionVersionDefaultConfig rhs = ((FunctionDefinitionVersionDefaultConfig) other);
        return new EqualsBuilder().append(execution, rhs.execution).isEquals();
    }

}
