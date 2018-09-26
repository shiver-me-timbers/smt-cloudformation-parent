
package aws.codedeploy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Application
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationName",
    "ComputePlatform"
})
public class Application {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname")
    private CharSequence applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform
     * 
     */
    @JsonProperty("ComputePlatform")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform")
    private CharSequence computePlatform;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname
     * 
     */
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname
     * 
     */
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public Application withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform
     * 
     */
    public CharSequence getComputePlatform() {
        return computePlatform;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform
     * 
     */
    public void setComputePlatform(CharSequence computePlatform) {
        this.computePlatform = computePlatform;
    }

    public Application withComputePlatform(CharSequence computePlatform) {
        this.computePlatform = computePlatform;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("computePlatform", computePlatform).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(computePlatform).append(applicationName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Application) == false) {
            return false;
        }
        Application rhs = ((Application) other);
        return new EqualsBuilder().append(computePlatform, rhs.computePlatform).append(applicationName, rhs.applicationName).isEquals();
    }

}
