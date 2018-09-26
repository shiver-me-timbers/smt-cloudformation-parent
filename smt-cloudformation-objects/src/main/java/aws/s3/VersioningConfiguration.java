
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VersioningConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Status"
})
public class VersioningConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status")
    private CharSequence status;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public VersioningConfiguration withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersioningConfiguration) == false) {
            return false;
        }
        VersioningConfiguration rhs = ((VersioningConfiguration) other);
        return new EqualsBuilder().append(status, rhs.status).isEquals();
    }

}
