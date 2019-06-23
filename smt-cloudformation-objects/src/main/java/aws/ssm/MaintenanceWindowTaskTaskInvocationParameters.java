
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
 * MaintenanceWindowTaskTaskInvocationParameters
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
public class MaintenanceWindowTaskTaskInvocationParameters implements Property<MaintenanceWindowTaskTaskInvocationParameters>
{

    /**
     * MaintenanceWindowTaskMaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowRunCommandParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html")
    private Property<MaintenanceWindowTaskMaintenanceWindowRunCommandParameters> maintenanceWindowRunCommandParameters;
    /**
     * MaintenanceWindowTaskMaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowAutomationParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html")
    private Property<MaintenanceWindowTaskMaintenanceWindowAutomationParameters> maintenanceWindowAutomationParameters;
    /**
     * MaintenanceWindowTaskMaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowStepFunctionsParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html")
    private Property<MaintenanceWindowTaskMaintenanceWindowStepFunctionsParameters> maintenanceWindowStepFunctionsParameters;
    /**
     * MaintenanceWindowTaskMaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    @JsonProperty("MaintenanceWindowLambdaParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html")
    private Property<MaintenanceWindowTaskMaintenanceWindowLambdaParameters> maintenanceWindowLambdaParameters;

    /**
     * MaintenanceWindowTaskMaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowTaskMaintenanceWindowRunCommandParameters> getMaintenanceWindowRunCommandParameters() {
        return maintenanceWindowRunCommandParameters;
    }

    /**
     * MaintenanceWindowTaskMaintenanceWindowRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowRunCommandParameters(Property<MaintenanceWindowTaskMaintenanceWindowRunCommandParameters> maintenanceWindowRunCommandParameters) {
        this.maintenanceWindowRunCommandParameters = maintenanceWindowRunCommandParameters;
    }

    public MaintenanceWindowTaskTaskInvocationParameters withMaintenanceWindowRunCommandParameters(Property<MaintenanceWindowTaskMaintenanceWindowRunCommandParameters> maintenanceWindowRunCommandParameters) {
        this.maintenanceWindowRunCommandParameters = maintenanceWindowRunCommandParameters;
        return this;
    }

    /**
     * MaintenanceWindowTaskMaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowTaskMaintenanceWindowAutomationParameters> getMaintenanceWindowAutomationParameters() {
        return maintenanceWindowAutomationParameters;
    }

    /**
     * MaintenanceWindowTaskMaintenanceWindowAutomationParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowAutomationParameters(Property<MaintenanceWindowTaskMaintenanceWindowAutomationParameters> maintenanceWindowAutomationParameters) {
        this.maintenanceWindowAutomationParameters = maintenanceWindowAutomationParameters;
    }

    public MaintenanceWindowTaskTaskInvocationParameters withMaintenanceWindowAutomationParameters(Property<MaintenanceWindowTaskMaintenanceWindowAutomationParameters> maintenanceWindowAutomationParameters) {
        this.maintenanceWindowAutomationParameters = maintenanceWindowAutomationParameters;
        return this;
    }

    /**
     * MaintenanceWindowTaskMaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowTaskMaintenanceWindowStepFunctionsParameters> getMaintenanceWindowStepFunctionsParameters() {
        return maintenanceWindowStepFunctionsParameters;
    }

    /**
     * MaintenanceWindowTaskMaintenanceWindowStepFunctionsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowStepFunctionsParameters(Property<MaintenanceWindowTaskMaintenanceWindowStepFunctionsParameters> maintenanceWindowStepFunctionsParameters) {
        this.maintenanceWindowStepFunctionsParameters = maintenanceWindowStepFunctionsParameters;
    }

    public MaintenanceWindowTaskTaskInvocationParameters withMaintenanceWindowStepFunctionsParameters(Property<MaintenanceWindowTaskMaintenanceWindowStepFunctionsParameters> maintenanceWindowStepFunctionsParameters) {
        this.maintenanceWindowStepFunctionsParameters = maintenanceWindowStepFunctionsParameters;
        return this;
    }

    /**
     * MaintenanceWindowTaskMaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    @JsonIgnore
    public Property<MaintenanceWindowTaskMaintenanceWindowLambdaParameters> getMaintenanceWindowLambdaParameters() {
        return maintenanceWindowLambdaParameters;
    }

    /**
     * MaintenanceWindowTaskMaintenanceWindowLambdaParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowLambdaParameters(Property<MaintenanceWindowTaskMaintenanceWindowLambdaParameters> maintenanceWindowLambdaParameters) {
        this.maintenanceWindowLambdaParameters = maintenanceWindowLambdaParameters;
    }

    public MaintenanceWindowTaskTaskInvocationParameters withMaintenanceWindowLambdaParameters(Property<MaintenanceWindowTaskMaintenanceWindowLambdaParameters> maintenanceWindowLambdaParameters) {
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
        if ((other instanceof MaintenanceWindowTaskTaskInvocationParameters) == false) {
            return false;
        }
        MaintenanceWindowTaskTaskInvocationParameters rhs = ((MaintenanceWindowTaskTaskInvocationParameters) other);
        return new EqualsBuilder().append(maintenanceWindowAutomationParameters, rhs.maintenanceWindowAutomationParameters).append(maintenanceWindowStepFunctionsParameters, rhs.maintenanceWindowStepFunctionsParameters).append(maintenanceWindowRunCommandParameters, rhs.maintenanceWindowRunCommandParameters).append(maintenanceWindowLambdaParameters, rhs.maintenanceWindowLambdaParameters).isEquals();
    }

}
