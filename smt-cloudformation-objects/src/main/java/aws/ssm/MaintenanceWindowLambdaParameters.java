
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
    private String clientContext;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier
     * 
     */
    @JsonProperty("Qualifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier")
    private String qualifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload
     * 
     */
    @JsonProperty("Payload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload")
    private String payload;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext
     * 
     */
    @JsonProperty("ClientContext")
    public String getClientContext() {
        return clientContext;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext
     * 
     */
    @JsonProperty("ClientContext")
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    public MaintenanceWindowLambdaParameters withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier
     * 
     */
    @JsonProperty("Qualifier")
    public String getQualifier() {
        return qualifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier
     * 
     */
    @JsonProperty("Qualifier")
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public MaintenanceWindowLambdaParameters withQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload
     * 
     */
    @JsonProperty("Payload")
    public String getPayload() {
        return payload;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload
     * 
     */
    @JsonProperty("Payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    public MaintenanceWindowLambdaParameters withPayload(String payload) {
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
