
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MaintenanceWindowStepFunctionsParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Input",
    "Name"
})
public class MaintenanceWindowStepFunctionsParameters {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input
     * 
     */
    @JsonProperty("Input")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input")
    private CharSequence input;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input
     * 
     */
    public CharSequence getInput() {
        return input;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input
     * 
     */
    public void setInput(CharSequence input) {
        this.input = input;
    }

    public MaintenanceWindowStepFunctionsParameters withInput(CharSequence input) {
        this.input = input;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public MaintenanceWindowStepFunctionsParameters withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("input", input).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(input).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaintenanceWindowStepFunctionsParameters) == false) {
            return false;
        }
        MaintenanceWindowStepFunctionsParameters rhs = ((MaintenanceWindowStepFunctionsParameters) other);
        return new EqualsBuilder().append(name, rhs.name).append(input, rhs.input).isEquals();
    }

}
