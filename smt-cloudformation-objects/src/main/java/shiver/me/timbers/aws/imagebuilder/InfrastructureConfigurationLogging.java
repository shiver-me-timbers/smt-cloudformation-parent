
package shiver.me.timbers.aws.imagebuilder;

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
 * InfrastructureConfigurationLogging
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-logging.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Logs"
})
public class InfrastructureConfigurationLogging implements Property<InfrastructureConfigurationLogging>
{

    /**
     * InfrastructureConfigurationS3Logs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html
     * 
     */
    @JsonProperty("S3Logs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html")
    private Property<InfrastructureConfigurationS3Logs> s3Logs;

    /**
     * InfrastructureConfigurationS3Logs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html
     * 
     */
    @JsonIgnore
    public Property<InfrastructureConfigurationS3Logs> getS3Logs() {
        return s3Logs;
    }

    /**
     * InfrastructureConfigurationS3Logs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html
     * 
     */
    @JsonIgnore
    public void setS3Logs(Property<InfrastructureConfigurationS3Logs> s3Logs) {
        this.s3Logs = s3Logs;
    }

    public InfrastructureConfigurationLogging withS3Logs(Property<InfrastructureConfigurationS3Logs> s3Logs) {
        this.s3Logs = s3Logs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Logs", s3Logs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Logs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InfrastructureConfigurationLogging) == false) {
            return false;
        }
        InfrastructureConfigurationLogging rhs = ((InfrastructureConfigurationLogging) other);
        return new EqualsBuilder().append(s3Logs, rhs.s3Logs).isEquals();
    }

}
