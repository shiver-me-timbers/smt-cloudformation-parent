
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
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
 * FunctionDefinitionVersionEnvironment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Variables",
    "Execution",
    "ResourceAccessPolicies",
    "AccessSysfs"
})
public class FunctionDefinitionVersionEnvironment implements Property<FunctionDefinitionVersionEnvironment>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-variables")
    private Object variables;
    /**
     * FunctionDefinitionVersionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html
     * 
     */
    @JsonProperty("Execution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html")
    private Property<FunctionDefinitionVersionExecution> execution;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-resourceaccesspolicies
     * 
     */
    @JsonProperty("ResourceAccessPolicies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-resourceaccesspolicies")
    private List<Property<FunctionDefinitionVersionResourceAccessPolicy>> resourceAccessPolicies = new ArrayList<Property<FunctionDefinitionVersionResourceAccessPolicy>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-accesssysfs
     * 
     */
    @JsonProperty("AccessSysfs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-accesssysfs")
    private CharSequence accessSysfs;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-variables
     * 
     */
    @JsonIgnore
    public Object getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-variables
     * 
     */
    @JsonIgnore
    public void setVariables(Object variables) {
        this.variables = variables;
    }

    public FunctionDefinitionVersionEnvironment withVariables(Object variables) {
        this.variables = variables;
        return this;
    }

    /**
     * FunctionDefinitionVersionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionVersionExecution> getExecution() {
        return execution;
    }

    /**
     * FunctionDefinitionVersionExecution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html
     * 
     */
    @JsonIgnore
    public void setExecution(Property<FunctionDefinitionVersionExecution> execution) {
        this.execution = execution;
    }

    public FunctionDefinitionVersionEnvironment withExecution(Property<FunctionDefinitionVersionExecution> execution) {
        this.execution = execution;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-resourceaccesspolicies
     * 
     */
    @JsonIgnore
    public List<Property<FunctionDefinitionVersionResourceAccessPolicy>> getResourceAccessPolicies() {
        return resourceAccessPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-resourceaccesspolicies
     * 
     */
    @JsonIgnore
    public void setResourceAccessPolicies(List<Property<FunctionDefinitionVersionResourceAccessPolicy>> resourceAccessPolicies) {
        this.resourceAccessPolicies = resourceAccessPolicies;
    }

    public FunctionDefinitionVersionEnvironment withResourceAccessPolicies(List<Property<FunctionDefinitionVersionResourceAccessPolicy>> resourceAccessPolicies) {
        this.resourceAccessPolicies = resourceAccessPolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-accesssysfs
     * 
     */
    @JsonIgnore
    public CharSequence getAccessSysfs() {
        return accessSysfs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-accesssysfs
     * 
     */
    @JsonIgnore
    public void setAccessSysfs(CharSequence accessSysfs) {
        this.accessSysfs = accessSysfs;
    }

    public FunctionDefinitionVersionEnvironment withAccessSysfs(CharSequence accessSysfs) {
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
        if ((other instanceof FunctionDefinitionVersionEnvironment) == false) {
            return false;
        }
        FunctionDefinitionVersionEnvironment rhs = ((FunctionDefinitionVersionEnvironment) other);
        return new EqualsBuilder().append(execution, rhs.execution).append(variables, rhs.variables).append(resourceAccessPolicies, rhs.resourceAccessPolicies).append(accessSysfs, rhs.accessSysfs).isEquals();
    }

}
