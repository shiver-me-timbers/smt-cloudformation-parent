
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
 * Execution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IsolationMode",
    "RunAs"
})
public class Execution {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode
     * 
     */
    @JsonProperty("IsolationMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode")
    private CharSequence isolationMode;
    /**
     * RunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonProperty("RunAs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html")
    private RunAs runAs;

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

    public Execution withIsolationMode(CharSequence isolationMode) {
        this.isolationMode = isolationMode;
        return this;
    }

    /**
     * RunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonIgnore
    public RunAs getRunAs() {
        return runAs;
    }

    /**
     * RunAs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
     * 
     */
    @JsonIgnore
    public void setRunAs(RunAs runAs) {
        this.runAs = runAs;
    }

    public Execution withRunAs(RunAs runAs) {
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
        if ((other instanceof Execution) == false) {
            return false;
        }
        Execution rhs = ((Execution) other);
        return new EqualsBuilder().append(isolationMode, rhs.isolationMode).append(runAs, rhs.runAs).isEquals();
    }

}
