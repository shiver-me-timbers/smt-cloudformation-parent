
package aws.elasticbeanstalk;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationName",
    "Description",
    "ResourceLifecycleConfig"
})
public class Application {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-name
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-name")
    private String applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-description")
    private String description;
    /**
     * ApplicationResourceLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html
     * 
     */
    @JsonProperty("ResourceLifecycleConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html")
    private ApplicationResourceLifecycleConfig resourceLifecycleConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-name
     * 
     */
    @JsonProperty("ApplicationName")
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-name
     * 
     */
    @JsonProperty("ApplicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public Application withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Application withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * ApplicationResourceLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html
     * 
     */
    @JsonProperty("ResourceLifecycleConfig")
    public ApplicationResourceLifecycleConfig getResourceLifecycleConfig() {
        return resourceLifecycleConfig;
    }

    /**
     * ApplicationResourceLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html
     * 
     */
    @JsonProperty("ResourceLifecycleConfig")
    public void setResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
    }

    public Application withResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("description", description).append("resourceLifecycleConfig", resourceLifecycleConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(resourceLifecycleConfig).append(applicationName).toHashCode();
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
        return new EqualsBuilder().append(description, rhs.description).append(resourceLifecycleConfig, rhs.resourceLifecycleConfig).append(applicationName, rhs.applicationName).isEquals();
    }

}