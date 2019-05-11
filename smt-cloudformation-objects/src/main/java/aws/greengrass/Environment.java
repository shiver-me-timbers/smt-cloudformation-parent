
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Environment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Variables",
    "Execution",
    "ResourceAccessPolicies",
    "AccessSysfs"
})
public class Environment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-variables")
    private Object variables;
    /**
     * Execution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonProperty("Execution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html")
    private Execution execution;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-resourceaccesspolicies
     * 
     */
    @JsonProperty("ResourceAccessPolicies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-resourceaccesspolicies")
    private List<ResourceAccessPolicy> resourceAccessPolicies = new ArrayList<ResourceAccessPolicy>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-accesssysfs
     * 
     */
    @JsonProperty("AccessSysfs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-accesssysfs")
    private Boolean accessSysfs;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-variables
     * 
     */
    @JsonIgnore
    public Object getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-variables
     * 
     */
    @JsonIgnore
    public void setVariables(Object variables) {
        this.variables = variables;
    }

    public Environment withVariables(Object variables) {
        this.variables = variables;
        return this;
    }

    /**
     * Execution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonIgnore
    public Execution getExecution() {
        return execution;
    }

    /**
     * Execution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html
     * 
     */
    @JsonIgnore
    public void setExecution(Execution execution) {
        this.execution = execution;
    }

    public Environment withExecution(Execution execution) {
        this.execution = execution;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-resourceaccesspolicies
     * 
     */
    @JsonIgnore
    public List<ResourceAccessPolicy> getResourceAccessPolicies() {
        return resourceAccessPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-resourceaccesspolicies
     * 
     */
    @JsonIgnore
    public void setResourceAccessPolicies(List<ResourceAccessPolicy> resourceAccessPolicies) {
        this.resourceAccessPolicies = resourceAccessPolicies;
    }

    public Environment withResourceAccessPolicies(List<ResourceAccessPolicy> resourceAccessPolicies) {
        this.resourceAccessPolicies = resourceAccessPolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-accesssysfs
     * 
     */
    @JsonIgnore
    public Boolean getAccessSysfs() {
        return accessSysfs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-accesssysfs
     * 
     */
    @JsonIgnore
    public void setAccessSysfs(Boolean accessSysfs) {
        this.accessSysfs = accessSysfs;
    }

    public Environment withAccessSysfs(Boolean accessSysfs) {
        this.accessSysfs = accessSysfs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("variables", variables).append("execution", execution).append("resourceAccessPolicies", resourceAccessPolicies).append("accessSysfs", accessSysfs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(execution).append(variables).append(resourceAccessPolicies).append(accessSysfs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Environment) == false) {
            return false;
        }
        Environment rhs = ((Environment) other);
        return new EqualsBuilder().append(execution, rhs.execution).append(variables, rhs.variables).append(resourceAccessPolicies, rhs.resourceAccessPolicies).append(accessSysfs, rhs.accessSysfs).isEquals();
    }

}
