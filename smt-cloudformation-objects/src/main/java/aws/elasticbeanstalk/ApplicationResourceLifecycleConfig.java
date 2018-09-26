
package aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationResourceLifecycleConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ServiceRole",
    "VersionLifecycleConfig"
})
public class ApplicationResourceLifecycleConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole")
    private CharSequence serviceRole;
    /**
     * ApplicationVersionLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
     * 
     */
    @JsonProperty("VersionLifecycleConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html")
    private ApplicationVersionLifecycleConfig versionLifecycleConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole
     * 
     */
    public CharSequence getServiceRole() {
        return serviceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole
     * 
     */
    public void setServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
    }

    public ApplicationResourceLifecycleConfig withServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * ApplicationVersionLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
     * 
     */
    public ApplicationVersionLifecycleConfig getVersionLifecycleConfig() {
        return versionLifecycleConfig;
    }

    /**
     * ApplicationVersionLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
     * 
     */
    public void setVersionLifecycleConfig(ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        this.versionLifecycleConfig = versionLifecycleConfig;
    }

    public ApplicationResourceLifecycleConfig withVersionLifecycleConfig(ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        this.versionLifecycleConfig = versionLifecycleConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serviceRole", serviceRole).append("versionLifecycleConfig", versionLifecycleConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceRole).append(versionLifecycleConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationResourceLifecycleConfig) == false) {
            return false;
        }
        ApplicationResourceLifecycleConfig rhs = ((ApplicationResourceLifecycleConfig) other);
        return new EqualsBuilder().append(serviceRole, rhs.serviceRole).append(versionLifecycleConfig, rhs.versionLifecycleConfig).isEquals();
    }

}
