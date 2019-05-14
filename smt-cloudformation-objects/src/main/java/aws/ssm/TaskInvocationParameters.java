
package aws.ssm;

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
 * TaskInvocationParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaintenanceWindowRunCommandParameters",
    "MaintenanceWindowAutomationParameters",
    "MaintenanceWindowStepFunctionsParameters",
    "MaintenanceWindowLambdaParameters"
})
public class TaskInvocationParameters implements Property<TaskInvocationParameters>
{

    /**
     * MaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowRunCommandParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html")
    private Property<MaintenanceWindowRunCommandParameters> maintenanceWindowRunCommandParameters;
    /**
     * MaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowAutomationParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html")
    private Property<MaintenanceWindowAutomationParameters> maintenanceWindowAutomationParameters;
    /**
     * MaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowStepFunctionsParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html")
    private Property<MaintenanceWindowStepFunctionsParameters> maintenanceWindowStepFunctionsParameters;
    /**
     * MaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowLambdaParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html")
    private Property<MaintenanceWindowLambdaParameters> maintenanceWindowLambdaParameters;

    /**
     * MaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowRunCommandParameters> getMaintenanceWindowRunCommandParameters() {
        return maintenanceWindowRunCommandParameters;
    }

    /**
     * MaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowRunCommandParameters(Property<MaintenanceWindowRunCommandParameters> maintenanceWindowRunCommandParameters) {
        this.maintenanceWindowRunCommandParameters = maintenanceWindowRunCommandParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowRunCommandParameters(Property<MaintenanceWindowRunCommandParameters> maintenanceWindowRunCommandParameters) {
        this.maintenanceWindowRunCommandParameters = maintenanceWindowRunCommandParameters;
        return this;
    }

    /**
     * MaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowAutomationParameters> getMaintenanceWindowAutomationParameters() {
        return maintenanceWindowAutomationParameters;
    }

    /**
     * MaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowAutomationParameters(Property<MaintenanceWindowAutomationParameters> maintenanceWindowAutomationParameters) {
        this.maintenanceWindowAutomationParameters = maintenanceWindowAutomationParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowAutomationParameters(Property<MaintenanceWindowAutomationParameters> maintenanceWindowAutomationParameters) {
        this.maintenanceWindowAutomationParameters = maintenanceWindowAutomationParameters;
        return this;
    }

    /**
     * MaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowStepFunctionsParameters> getMaintenanceWindowStepFunctionsParameters() {
        return maintenanceWindowStepFunctionsParameters;
    }

    /**
     * MaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowStepFunctionsParameters(Property<MaintenanceWindowStepFunctionsParameters> maintenanceWindowStepFunctionsParameters) {
        this.maintenanceWindowStepFunctionsParameters = maintenanceWindowStepFunctionsParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowStepFunctionsParameters(Property<MaintenanceWindowStepFunctionsParameters> maintenanceWindowStepFunctionsParameters) {
        this.maintenanceWindowStepFunctionsParameters = maintenanceWindowStepFunctionsParameters;
        return this;
    }

    /**
     * MaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowLambdaParameters> getMaintenanceWindowLambdaParameters() {
        return maintenanceWindowLambdaParameters;
    }

    /**
     * MaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowLambdaParameters(Property<MaintenanceWindowLambdaParameters> maintenanceWindowLambdaParameters) {
        this.maintenanceWindowLambdaParameters = maintenanceWindowLambdaParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowLambdaParameters(Property<MaintenanceWindowLambdaParameters> maintenanceWindowLambdaParameters) {
        this.maintenanceWindowLambdaParameters = maintenanceWindowLambdaParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maintenanceWindowRunCommandParameters", maintenanceWindowRunCommandParameters).append("maintenanceWindowAutomationParameters", maintenanceWindowAutomationParameters).append("maintenanceWindowStepFunctionsParameters", maintenanceWindowStepFunctionsParameters).append("maintenanceWindowLambdaParameters", maintenanceWindowLambdaParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maintenanceWindowAutomationParameters).append(maintenanceWindowStepFunctionsParameters).append(maintenanceWindowRunCommandParameters).append(maintenanceWindowLambdaParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskInvocationParameters) == false) {
            return false;
        }
        TaskInvocationParameters rhs = ((TaskInvocationParameters) other);
        return new EqualsBuilder().append(maintenanceWindowAutomationParameters, rhs.maintenanceWindowAutomationParameters).append(maintenanceWindowStepFunctionsParameters, rhs.maintenanceWindowStepFunctionsParameters).append(maintenanceWindowRunCommandParameters, rhs.maintenanceWindowRunCommandParameters).append(maintenanceWindowLambdaParameters, rhs.maintenanceWindowLambdaParameters).isEquals();
    }

}
