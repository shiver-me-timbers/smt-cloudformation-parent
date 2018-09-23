
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EmailConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReplyToEmailAddress",
    "SourceArn"
})
public class EmailConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress
     * 
     */
    @JsonProperty("ReplyToEmailAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress")
    private String replyToEmailAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn
     * 
     */
    @JsonProperty("SourceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn")
    private String sourceArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress
     * 
     */
    @JsonProperty("ReplyToEmailAddress")
    public String getReplyToEmailAddress() {
        return replyToEmailAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress
     * 
     */
    @JsonProperty("ReplyToEmailAddress")
    public void setReplyToEmailAddress(String replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
    }

    public EmailConfiguration withReplyToEmailAddress(String replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn
     * 
     */
    @JsonProperty("SourceArn")
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn
     * 
     */
    @JsonProperty("SourceArn")
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    public EmailConfiguration withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replyToEmailAddress", replyToEmailAddress).append("sourceArn", sourceArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(replyToEmailAddress).append(sourceArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailConfiguration) == false) {
            return false;
        }
        EmailConfiguration rhs = ((EmailConfiguration) other);
        return new EqualsBuilder().append(replyToEmailAddress, rhs.replyToEmailAddress).append(sourceArn, rhs.sourceArn).isEquals();
    }

}