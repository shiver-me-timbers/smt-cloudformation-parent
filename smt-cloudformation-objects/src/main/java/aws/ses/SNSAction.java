
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SNSAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TopicArn",
    "Encoding"
})
public class SNSAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn")
    private CharSequence topicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding
     * 
     */
    @JsonProperty("Encoding")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding")
    private CharSequence encoding;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn
     * 
     */
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn
     * 
     */
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public SNSAction withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding
     * 
     */
    public CharSequence getEncoding() {
        return encoding;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding
     * 
     */
    public void setEncoding(CharSequence encoding) {
        this.encoding = encoding;
    }

    public SNSAction withEncoding(CharSequence encoding) {
        this.encoding = encoding;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("topicArn", topicArn).append("encoding", encoding).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encoding).append(topicArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SNSAction) == false) {
            return false;
        }
        SNSAction rhs = ((SNSAction) other);
        return new EqualsBuilder().append(encoding, rhs.encoding).append(topicArn, rhs.topicArn).isEquals();
    }

}
