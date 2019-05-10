
package aws.greengrass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DefaultConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Execution"
})
public class DefaultConfig {

    /**
     * Execution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonProperty("Execution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html")
    private Execution execution;

    /**
     * Execution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonIgnore
    public Execution getExecution() {
        return execution;
    }

    /**
     * Execution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonIgnore
    public void setExecution(Execution execution) {
        this.execution = execution;
    }

    public DefaultConfig withExecution(Execution execution) {
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
        if ((other instanceof DefaultConfig) == false) {
            return false;
        }
        DefaultConfig rhs = ((DefaultConfig) other);
        return new EqualsBuilder().append(execution, rhs.execution).isEquals();
    }

}
