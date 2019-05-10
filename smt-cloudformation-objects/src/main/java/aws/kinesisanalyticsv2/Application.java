
package aws.kinesisanalyticsv2;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApplicationName",
    "RuntimeEnvironment",
    "ApplicationConfiguration",
    "ApplicationDescription",
    "ServiceExecutionRole"
})
public class Application {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname")
    private CharSequence applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment
     * 
     */
    @JsonProperty("RuntimeEnvironment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment")
    private CharSequence runtimeEnvironment;
    /**
     * FlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonProperty("ApplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html")
    private FlinkApplicationConfiguration applicationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription
     * 
     */
    @JsonProperty("ApplicationDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription")
    private CharSequence applicationDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole
     * 
     */
    @JsonProperty("ServiceExecutionRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole")
    private CharSequence serviceExecutionRole;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname
     * 
     */
    @JsonIgnore
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public Application withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment
     * 
     */
    @JsonIgnore
    public CharSequence getRuntimeEnvironment() {
        return runtimeEnvironment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment
     * 
     */
    @JsonIgnore
    public void setRuntimeEnvironment(CharSequence runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment;
    }

    public Application withRuntimeEnvironment(CharSequence runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment;
        return this;
    }

    /**
     * FlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public FlinkApplicationConfiguration getApplicationConfiguration() {
        return applicationConfiguration;
    }

    /**
     * FlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setApplicationConfiguration(FlinkApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    public Application withApplicationConfiguration(FlinkApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationDescription() {
        return applicationDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription
     * 
     */
    @JsonIgnore
    public void setApplicationDescription(CharSequence applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    public Application withApplicationDescription(CharSequence applicationDescription) {
        this.applicationDescription = applicationDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole
     * 
     */
    @JsonIgnore
    public CharSequence getServiceExecutionRole() {
        return serviceExecutionRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole
     * 
     */
    @JsonIgnore
    public void setServiceExecutionRole(CharSequence serviceExecutionRole) {
        this.serviceExecutionRole = serviceExecutionRole;
    }

    public Application withServiceExecutionRole(CharSequence serviceExecutionRole) {
        this.serviceExecutionRole = serviceExecutionRole;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("runtimeEnvironment", runtimeEnvironment).append("applicationConfiguration", applicationConfiguration).append("applicationDescription", applicationDescription).append("serviceExecutionRole", serviceExecutionRole).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceExecutionRole).append(applicationConfiguration).append(applicationDescription).append(applicationName).append(runtimeEnvironment).toHashCode();
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
        return new EqualsBuilder().append(serviceExecutionRole, rhs.serviceExecutionRole).append(applicationConfiguration, rhs.applicationConfiguration).append(applicationDescription, rhs.applicationDescription).append(applicationName, rhs.applicationName).append(runtimeEnvironment, rhs.runtimeEnvironment).isEquals();
    }

}
