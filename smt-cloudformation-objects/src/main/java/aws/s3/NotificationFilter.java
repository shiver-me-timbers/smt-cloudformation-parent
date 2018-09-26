
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NotificationFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "S3Key"
})
public class NotificationFilter {

    /**
     * S3KeyFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html
     * 
     */
    @JsonProperty("S3Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html")
    private S3KeyFilter s3Key;

    /**
     * S3KeyFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html
     * 
     */
    public S3KeyFilter getS3Key() {
        return s3Key;
    }

    /**
     * S3KeyFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html
     * 
     */
    public void setS3Key(S3KeyFilter s3Key) {
        this.s3Key = s3Key;
    }

    public NotificationFilter withS3Key(S3KeyFilter s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Key", s3Key).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotificationFilter) == false) {
            return false;
        }
        NotificationFilter rhs = ((NotificationFilter) other);
        return new EqualsBuilder().append(s3Key, rhs.s3Key).isEquals();
    }

}
