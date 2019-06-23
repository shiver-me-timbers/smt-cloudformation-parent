
package aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BucketNotificationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LambdaConfigurations",
    "QueueConfigurations",
    "TopicConfigurations"
})
public class BucketNotificationConfiguration implements Property<BucketNotificationConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig
     * 
     */
    @JsonProperty("LambdaConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig")
    private Set<Property<BucketLambdaConfiguration>> lambdaConfigurations = new LinkedHashSet<Property<BucketLambdaConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig
     * 
     */
    @JsonProperty("QueueConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig")
    private Set<Property<BucketQueueConfiguration>> queueConfigurations = new LinkedHashSet<Property<BucketQueueConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig
     * 
     */
    @JsonProperty("TopicConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig")
    private Set<Property<BucketTopicConfiguration>> topicConfigurations = new LinkedHashSet<Property<BucketTopicConfiguration>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig
     * 
     */
    @JsonIgnore
    public Set<Property<BucketLambdaConfiguration>> getLambdaConfigurations() {
        return lambdaConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig
     * 
     */
    @JsonIgnore
    public void setLambdaConfigurations(Set<Property<BucketLambdaConfiguration>> lambdaConfigurations) {
        this.lambdaConfigurations = lambdaConfigurations;
    }

    public BucketNotificationConfiguration withLambdaConfigurations(Set<Property<BucketLambdaConfiguration>> lambdaConfigurations) {
        this.lambdaConfigurations = lambdaConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig
     * 
     */
    @JsonIgnore
    public Set<Property<BucketQueueConfiguration>> getQueueConfigurations() {
        return queueConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig
     * 
     */
    @JsonIgnore
    public void setQueueConfigurations(Set<Property<BucketQueueConfiguration>> queueConfigurations) {
        this.queueConfigurations = queueConfigurations;
    }

    public BucketNotificationConfiguration withQueueConfigurations(Set<Property<BucketQueueConfiguration>> queueConfigurations) {
        this.queueConfigurations = queueConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig
     * 
     */
    @JsonIgnore
    public Set<Property<BucketTopicConfiguration>> getTopicConfigurations() {
        return topicConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig
     * 
     */
    @JsonIgnore
    public void setTopicConfigurations(Set<Property<BucketTopicConfiguration>> topicConfigurations) {
        this.topicConfigurations = topicConfigurations;
    }

    public BucketNotificationConfiguration withTopicConfigurations(Set<Property<BucketTopicConfiguration>> topicConfigurations) {
        this.topicConfigurations = topicConfigurations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lambdaConfigurations", lambdaConfigurations).append("queueConfigurations", queueConfigurations).append("topicConfigurations", topicConfigurations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topicConfigurations).append(lambdaConfigurations).append(queueConfigurations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketNotificationConfiguration) == false) {
            return false;
        }
        BucketNotificationConfiguration rhs = ((BucketNotificationConfiguration) other);
        return new EqualsBuilder().append(topicConfigurations, rhs.topicConfigurations).append(lambdaConfigurations, rhs.lambdaConfigurations).append(queueConfigurations, rhs.queueConfigurations).isEquals();
    }

}
