
package shiver.me.timbers.aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ApplicationApplicationResourceLifecycleConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ServiceRole",
    "VersionLifecycleConfig"
})
public class ApplicationApplicationResourceLifecycleConfig implements Property<ApplicationApplicationResourceLifecycleConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole")
    private CharSequence serviceRole;
    /**
     * ApplicationApplicationVersionLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
     * 
     */
    @JsonProperty("VersionLifecycleConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html")
    private Property<ApplicationApplicationVersionLifecycleConfig> versionLifecycleConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRole() {
        return serviceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole
     * 
     */
    @JsonIgnore
    public void setServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
    }

    public ApplicationApplicationResourceLifecycleConfig withServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * ApplicationApplicationVersionLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationApplicationVersionLifecycleConfig> getVersionLifecycleConfig() {
        return versionLifecycleConfig;
    }

    /**
     * ApplicationApplicationVersionLifecycleConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
     * 
     */
    @JsonIgnore
    public void setVersionLifecycleConfig(Property<ApplicationApplicationVersionLifecycleConfig> versionLifecycleConfig) {
        this.versionLifecycleConfig = versionLifecycleConfig;
    }

    public ApplicationApplicationResourceLifecycleConfig withVersionLifecycleConfig(Property<ApplicationApplicationVersionLifecycleConfig> versionLifecycleConfig) {
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
        if ((other instanceof ApplicationApplicationResourceLifecycleConfig) == false) {
            return false;
        }
        ApplicationApplicationResourceLifecycleConfig rhs = ((ApplicationApplicationResourceLifecycleConfig) other);
        return new EqualsBuilder().append(serviceRole, rhs.serviceRole).append(versionLifecycleConfig, rhs.versionLifecycleConfig).isEquals();
    }

}
