
package aws.batch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ComputeEnvironment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "ServiceRole",
    "ComputeEnvironmentName",
    "ComputeResources",
    "State"
})
public class ComputeEnvironment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole")
    private CharSequence serviceRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname
     * 
     */
    @JsonProperty("ComputeEnvironmentName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname")
    private CharSequence computeEnvironmentName;
    /**
     * ComputeResources
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html
     * 
     */
    @JsonProperty("ComputeResources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html")
    private ComputeResources computeResources;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state
     * 
     */
    @JsonProperty("State")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state")
    private CharSequence state;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ComputeEnvironment withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole
     * 
     */
    public CharSequence getServiceRole() {
        return serviceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole
     * 
     */
    public void setServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
    }

    public ComputeEnvironment withServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname
     * 
     */
    public CharSequence getComputeEnvironmentName() {
        return computeEnvironmentName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname
     * 
     */
    public void setComputeEnvironmentName(CharSequence computeEnvironmentName) {
        this.computeEnvironmentName = computeEnvironmentName;
    }

    public ComputeEnvironment withComputeEnvironmentName(CharSequence computeEnvironmentName) {
        this.computeEnvironmentName = computeEnvironmentName;
        return this;
    }

    /**
     * ComputeResources
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html
     * 
     */
    public ComputeResources getComputeResources() {
        return computeResources;
    }

    /**
     * ComputeResources
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html
     * 
     */
    public void setComputeResources(ComputeResources computeResources) {
        this.computeResources = computeResources;
    }

    public ComputeEnvironment withComputeResources(ComputeResources computeResources) {
        this.computeResources = computeResources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state
     * 
     */
    public CharSequence getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state
     * 
     */
    public void setState(CharSequence state) {
        this.state = state;
    }

    public ComputeEnvironment withState(CharSequence state) {
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("serviceRole", serviceRole).append("computeEnvironmentName", computeEnvironmentName).append("computeResources", computeResources).append("state", state).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(computeResources).append(state).append(type).append(serviceRole).append(computeEnvironmentName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputeEnvironment) == false) {
            return false;
        }
        ComputeEnvironment rhs = ((ComputeEnvironment) other);
        return new EqualsBuilder().append(computeResources, rhs.computeResources).append(state, rhs.state).append(type, rhs.type).append(serviceRole, rhs.serviceRole).append(computeEnvironmentName, rhs.computeEnvironmentName).isEquals();
    }

}
