
package aws.servicediscovery;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HealthCheckConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "ResourcePath",
    "FailureThreshold"
})
public class HealthCheckConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath
     * 
     */
    @JsonProperty("ResourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath")
    private CharSequence resourcePath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold
     * 
     */
    @JsonProperty("FailureThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold")
    private Double failureThreshold;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public HealthCheckConfig withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath
     * 
     */
    public CharSequence getResourcePath() {
        return resourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath
     * 
     */
    public void setResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
    }

    public HealthCheckConfig withResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold
     * 
     */
    public Double getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold
     * 
     */
    public void setFailureThreshold(Double failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public HealthCheckConfig withFailureThreshold(Double failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("resourcePath", resourcePath).append("failureThreshold", failureThreshold).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(failureThreshold).append(resourcePath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealthCheckConfig) == false) {
            return false;
        }
        HealthCheckConfig rhs = ((HealthCheckConfig) other);
        return new EqualsBuilder().append(type, rhs.type).append(failureThreshold, rhs.failureThreshold).append(resourcePath, rhs.resourcePath).isEquals();
    }

}
