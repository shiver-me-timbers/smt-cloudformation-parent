
package aws.codedeploy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeploymentStyle
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeploymentOption",
    "DeploymentType"
})
public class DeploymentStyle {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption
     * 
     */
    @JsonProperty("DeploymentOption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption")
    private CharSequence deploymentOption;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype
     * 
     */
    @JsonProperty("DeploymentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype")
    private CharSequence deploymentType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption
     * 
     */
    public CharSequence getDeploymentOption() {
        return deploymentOption;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption
     * 
     */
    public void setDeploymentOption(CharSequence deploymentOption) {
        this.deploymentOption = deploymentOption;
    }

    public DeploymentStyle withDeploymentOption(CharSequence deploymentOption) {
        this.deploymentOption = deploymentOption;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype
     * 
     */
    public CharSequence getDeploymentType() {
        return deploymentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype
     * 
     */
    public void setDeploymentType(CharSequence deploymentType) {
        this.deploymentType = deploymentType;
    }

    public DeploymentStyle withDeploymentType(CharSequence deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deploymentOption", deploymentOption).append("deploymentType", deploymentType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deploymentOption).append(deploymentType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentStyle) == false) {
            return false;
        }
        DeploymentStyle rhs = ((DeploymentStyle) other);
        return new EqualsBuilder().append(deploymentOption, rhs.deploymentOption).append(deploymentType, rhs.deploymentType).isEquals();
    }

}
