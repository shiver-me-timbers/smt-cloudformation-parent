
package aws.ssm;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MaintenanceWindowRunCommandParameters",
    "MaintenanceWindowAutomationParameters",
    "MaintenanceWindowStepFunctionsParameters",
    "MaintenanceWindowLambdaParameters"
})
public class TaskInvocationParameters {

    /**
     * MaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowRunCommandParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html")
    private MaintenanceWindowRunCommandParameters maintenanceWindowRunCommandParameters;
    /**
     * MaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowAutomationParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html")
    private MaintenanceWindowAutomationParameters maintenanceWindowAutomationParameters;
    /**
     * MaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowStepFunctionsParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html")
    private MaintenanceWindowStepFunctionsParameters maintenanceWindowStepFunctionsParameters;
    /**
     * MaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowLambdaParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html")
    private MaintenanceWindowLambdaParameters maintenanceWindowLambdaParameters;

    /**
     * MaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    public MaintenanceWindowRunCommandParameters getMaintenanceWindowRunCommandParameters() {
        return maintenanceWindowRunCommandParameters;
    }

    /**
     * MaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    public void setMaintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParameters maintenanceWindowRunCommandParameters) {
        this.maintenanceWindowRunCommandParameters = maintenanceWindowRunCommandParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParameters maintenanceWindowRunCommandParameters) {
        this.maintenanceWindowRunCommandParameters = maintenanceWindowRunCommandParameters;
        return this;
    }

    /**
     * MaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    public MaintenanceWindowAutomationParameters getMaintenanceWindowAutomationParameters() {
        return maintenanceWindowAutomationParameters;
    }

    /**
     * MaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    public void setMaintenanceWindowAutomationParameters(MaintenanceWindowAutomationParameters maintenanceWindowAutomationParameters) {
        this.maintenanceWindowAutomationParameters = maintenanceWindowAutomationParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowAutomationParameters(MaintenanceWindowAutomationParameters maintenanceWindowAutomationParameters) {
        this.maintenanceWindowAutomationParameters = maintenanceWindowAutomationParameters;
        return this;
    }

    /**
     * MaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    public MaintenanceWindowStepFunctionsParameters getMaintenanceWindowStepFunctionsParameters() {
        return maintenanceWindowStepFunctionsParameters;
    }

    /**
     * MaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    public void setMaintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParameters maintenanceWindowStepFunctionsParameters) {
        this.maintenanceWindowStepFunctionsParameters = maintenanceWindowStepFunctionsParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParameters maintenanceWindowStepFunctionsParameters) {
        this.maintenanceWindowStepFunctionsParameters = maintenanceWindowStepFunctionsParameters;
        return this;
    }

    /**
     * MaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    public MaintenanceWindowLambdaParameters getMaintenanceWindowLambdaParameters() {
        return maintenanceWindowLambdaParameters;
    }

    /**
     * MaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    public void setMaintenanceWindowLambdaParameters(MaintenanceWindowLambdaParameters maintenanceWindowLambdaParameters) {
        this.maintenanceWindowLambdaParameters = maintenanceWindowLambdaParameters;
    }

    public TaskInvocationParameters withMaintenanceWindowLambdaParameters(MaintenanceWindowLambdaParameters maintenanceWindowLambdaParameters) {
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
