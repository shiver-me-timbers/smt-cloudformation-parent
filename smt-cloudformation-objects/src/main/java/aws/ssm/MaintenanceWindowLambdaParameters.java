
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MaintenanceWindowLambdaParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ClientContext",
    "Qualifier",
    "Payload"
})
public class MaintenanceWindowLambdaParameters {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext
     * 
     */
    @JsonProperty("ClientContext")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext")
    private CharSequence clientContext;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier
     * 
     */
    @JsonProperty("Qualifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier")
    private CharSequence qualifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload
     * 
     */
    @JsonProperty("Payload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload")
    private CharSequence payload;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext
     * 
     */
    public CharSequence getClientContext() {
        return clientContext;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext
     * 
     */
    public void setClientContext(CharSequence clientContext) {
        this.clientContext = clientContext;
    }

    public MaintenanceWindowLambdaParameters withClientContext(CharSequence clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier
     * 
     */
    public CharSequence getQualifier() {
        return qualifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier
     * 
     */
    public void setQualifier(CharSequence qualifier) {
        this.qualifier = qualifier;
    }

    public MaintenanceWindowLambdaParameters withQualifier(CharSequence qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload
     * 
     */
    public CharSequence getPayload() {
        return payload;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload
     * 
     */
    public void setPayload(CharSequence payload) {
        this.payload = payload;
    }

    public MaintenanceWindowLambdaParameters withPayload(CharSequence payload) {
        this.payload = payload;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientContext", clientContext).append("qualifier", qualifier).append("payload", payload).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientContext).append(payload).append(qualifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaintenanceWindowLambdaParameters) == false) {
            return false;
        }
        MaintenanceWindowLambdaParameters rhs = ((MaintenanceWindowLambdaParameters) other);
        return new EqualsBuilder().append(clientContext, rhs.clientContext).append(payload, rhs.payload).append(qualifier, rhs.qualifier).isEquals();
    }

}
