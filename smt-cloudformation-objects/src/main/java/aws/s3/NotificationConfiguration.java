
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
 * NotificationConfiguration
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
public class NotificationConfiguration implements Property<NotificationConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig
     * 
     */
    @JsonProperty("LambdaConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig")
    private Set<Property<LambdaConfiguration>> lambdaConfigurations = new LinkedHashSet<Property<LambdaConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig
     * 
     */
    @JsonProperty("QueueConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig")
    private Set<Property<QueueConfiguration>> queueConfigurations = new LinkedHashSet<Property<QueueConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig
     * 
     */
    @JsonProperty("TopicConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig")
    private Set<Property<TopicConfiguration>> topicConfigurations = new LinkedHashSet<Property<TopicConfiguration>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig
     * 
     */
    @JsonIgnore
    public Set<Property<LambdaConfiguration>> getLambdaConfigurations() {
        return lambdaConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig
     * 
     */
    @JsonIgnore
    public void setLambdaConfigurations(Set<Property<LambdaConfiguration>> lambdaConfigurations) {
        this.lambdaConfigurations = lambdaConfigurations;
    }

    public NotificationConfiguration withLambdaConfigurations(Set<Property<LambdaConfiguration>> lambdaConfigurations) {
        this.lambdaConfigurations = lambdaConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig
     * 
     */
    @JsonIgnore
    public Set<Property<QueueConfiguration>> getQueueConfigurations() {
        return queueConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig
     * 
     */
    @JsonIgnore
    public void setQueueConfigurations(Set<Property<QueueConfiguration>> queueConfigurations) {
        this.queueConfigurations = queueConfigurations;
    }

    public NotificationConfiguration withQueueConfigurations(Set<Property<QueueConfiguration>> queueConfigurations) {
        this.queueConfigurations = queueConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig
     * 
     */
    @JsonIgnore
    public Set<Property<TopicConfiguration>> getTopicConfigurations() {
        return topicConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig
     * 
     */
    @JsonIgnore
    public void setTopicConfigurations(Set<Property<TopicConfiguration>> topicConfigurations) {
        this.topicConfigurations = topicConfigurations;
    }

    public NotificationConfiguration withTopicConfigurations(Set<Property<TopicConfiguration>> topicConfigurations) {
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
        if ((other instanceof NotificationConfiguration) == false) {
            return false;
        }
        NotificationConfiguration rhs = ((NotificationConfiguration) other);
        return new EqualsBuilder().append(topicConfigurations, rhs.topicConfigurations).append(lambdaConfigurations, rhs.lambdaConfigurations).append(queueConfigurations, rhs.queueConfigurations).isEquals();
    }

}
