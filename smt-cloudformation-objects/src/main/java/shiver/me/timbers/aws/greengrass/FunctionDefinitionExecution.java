
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
 * FunctionDefinitionExecution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IsolationMode",
    "RunAs"
})
public class FunctionDefinitionExecution implements Property<FunctionDefinitionExecution>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode
     * 
     */
    @JsonProperty("IsolationMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode")
    private CharSequence isolationMode;
    /**
     * FunctionDefinitionVersionRunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonProperty("RunAs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html")
    private Property<FunctionDefinitionRunAs> runAs;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode
     * 
     */
    @JsonIgnore
    public CharSequence getIsolationMode() {
        return isolationMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode
     * 
     */
    @JsonIgnore
    public void setIsolationMode(CharSequence isolationMode) {
        this.isolationMode = isolationMode;
    }

    public FunctionDefinitionExecution withIsolationMode(CharSequence isolationMode) {
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
    public Property<FunctionDefinitionRunAs> getRunAs() {
        return runAs;
    }

    /**
     * FunctionDefinitionVersionRunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonIgnore
    public void setRunAs(Property<FunctionDefinitionRunAs> runAs) {
        this.runAs = runAs;
    }

    public FunctionDefinitionExecution withRunAs(Property<FunctionDefinitionRunAs> runAs) {
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
        if ((other instanceof FunctionDefinitionExecution) == false) {
            return false;
        }
        FunctionDefinitionExecution rhs = ((FunctionDefinitionExecution) other);
        return new EqualsBuilder().append(isolationMode, rhs.isolationMode).append(runAs, rhs.runAs).isEquals();
    }

}
