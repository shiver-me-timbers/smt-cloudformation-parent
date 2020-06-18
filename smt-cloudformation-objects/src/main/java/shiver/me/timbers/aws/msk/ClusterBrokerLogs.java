
package shiver.me.timbers.aws.msk;

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
 * ClusterBrokerLogs
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3",
    "Firehose",
    "CloudWatchLogs"
})
public class ClusterBrokerLogs implements Property<ClusterBrokerLogs>
{

    /**
     * ClusterS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html
     * 
     */
    @JsonProperty("S3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html")
    private Property<ClusterS3> s3;
    /**
     * ClusterFirehose
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html
     * 
     */
    @JsonProperty("Firehose")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html")
    private Property<ClusterFirehose> firehose;
    /**
     * ClusterCloudWatchLogs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html
     * 
     */
    @JsonProperty("CloudWatchLogs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html")
    private Property<ClusterCloudWatchLogs> cloudWatchLogs;

    /**
     * ClusterS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html
     * 
     */
    @JsonIgnore
    public Property<ClusterS3> getS3() {
        return s3;
    }

    /**
     * ClusterS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html
     * 
     */
    @JsonIgnore
    public void setS3(Property<ClusterS3> s3) {
        this.s3 = s3;
    }

    public ClusterBrokerLogs withS3(Property<ClusterS3> s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * ClusterFirehose
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html
     * 
     */
    @JsonIgnore
    public Property<ClusterFirehose> getFirehose() {
        return firehose;
    }

    /**
     * ClusterFirehose
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html
     * 
     */
    @JsonIgnore
    public void setFirehose(Property<ClusterFirehose> firehose) {
        this.firehose = firehose;
    }

    public ClusterBrokerLogs withFirehose(Property<ClusterFirehose> firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * ClusterCloudWatchLogs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html
     * 
     */
    @JsonIgnore
    public Property<ClusterCloudWatchLogs> getCloudWatchLogs() {
        return cloudWatchLogs;
    }

    /**
     * ClusterCloudWatchLogs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchLogs(Property<ClusterCloudWatchLogs> cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    public ClusterBrokerLogs withCloudWatchLogs(Property<ClusterCloudWatchLogs> cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3", s3).append("firehose", firehose).append("cloudWatchLogs", cloudWatchLogs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3).append(firehose).append(cloudWatchLogs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterBrokerLogs) == false) {
            return false;
        }
        ClusterBrokerLogs rhs = ((ClusterBrokerLogs) other);
        return new EqualsBuilder().append(s3, rhs.s3).append(firehose, rhs.firehose).append(cloudWatchLogs, rhs.cloudWatchLogs).isEquals();
    }

}
