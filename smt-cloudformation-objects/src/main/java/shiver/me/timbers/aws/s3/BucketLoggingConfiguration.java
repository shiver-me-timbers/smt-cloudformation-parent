
package shiver.me.timbers.aws.s3;

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
 * BucketLoggingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DestinationBucketName",
    "LogFilePrefix"
})
public class BucketLoggingConfiguration implements Property<BucketLoggingConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname
     * 
     */
    @JsonProperty("DestinationBucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname")
    private CharSequence destinationBucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix
     * 
     */
    @JsonProperty("LogFilePrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix")
    private CharSequence logFilePrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationBucketName() {
        return destinationBucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname
     * 
     */
    @JsonIgnore
    public void setDestinationBucketName(CharSequence destinationBucketName) {
        this.destinationBucketName = destinationBucketName;
    }

    public BucketLoggingConfiguration withDestinationBucketName(CharSequence destinationBucketName) {
        this.destinationBucketName = destinationBucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix
     * 
     */
    @JsonIgnore
    public CharSequence getLogFilePrefix() {
        return logFilePrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix
     * 
     */
    @JsonIgnore
    public void setLogFilePrefix(CharSequence logFilePrefix) {
        this.logFilePrefix = logFilePrefix;
    }

    public BucketLoggingConfiguration withLogFilePrefix(CharSequence logFilePrefix) {
        this.logFilePrefix = logFilePrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationBucketName", destinationBucketName).append("logFilePrefix", logFilePrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationBucketName).append(logFilePrefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketLoggingConfiguration) == false) {
            return false;
        }
        BucketLoggingConfiguration rhs = ((BucketLoggingConfiguration) other);
        return new EqualsBuilder().append(destinationBucketName, rhs.destinationBucketName).append(logFilePrefix, rhs.logFilePrefix).isEquals();
    }

}
