
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
 * FunctionDefinitionVersionExecution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IsolationMode",
    "RunAs"
})
public class FunctionDefinitionVersionExecution implements Property<FunctionDefinitionVersionExecution>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-isolationmode
     * 
     */
    @JsonProperty("IsolationMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-isolationmode")
    private CharSequence isolationMode;
    /**
     * FunctionDefinitionVersionRunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonProperty("RunAs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html")
    private Property<FunctionDefinitionVersionRunAs> runAs;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-isolationmode
     * 
     */
    @JsonIgnore
    public CharSequence getIsolationMode() {
        return isolationMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-isolationmode
     * 
     */
    @JsonIgnore
    public void setIsolationMode(CharSequence isolationMode) {
        this.isolationMode = isolationMode;
    }

    public FunctionDefinitionVersionExecution withIsolationMode(CharSequence isolationMode) {
        this.isolationMode = isolationMode;
        return this;
    }

    /**
     * FunctionDefinitionVersionRunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionVersionRunAs> getRunAs() {
        return runAs;
    }

    /**
     * FunctionDefinitionVersionRunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonIgnore
    public void setRunAs(Property<FunctionDefinitionVersionRunAs> runAs) {
        this.runAs = runAs;
    }

    public FunctionDefinitionVersionExecution withRunAs(Property<FunctionDefinitionVersionRunAs> runAs) {
        this.runAs = runAs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isolationMode", isolationMode).append("runAs", runAs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isolationMode).append(runAs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionDefinitionVersionExecution) == false) {
            return false;
        }
        FunctionDefinitionVersionExecution rhs = ((FunctionDefinitionVersionExecution) other);
        return new EqualsBuilder().append(isolationMode, rhs.isolationMode).append(runAs, rhs.runAs).isEquals();
    }

}
