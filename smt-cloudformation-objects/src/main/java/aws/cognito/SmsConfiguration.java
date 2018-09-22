
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SmsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ExternalId",
    "SnsCallerArn"
})
public class SmsConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid
     * 
     */
    @JsonProperty("ExternalId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid")
    private String externalId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn
     * 
     */
    @JsonProperty("SnsCallerArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn")
    private String snsCallerArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid
     * 
     */
    @JsonProperty("ExternalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid
     * 
     */
    @JsonProperty("ExternalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public SmsConfiguration withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn
     * 
     */
    @JsonProperty("SnsCallerArn")
    public String getSnsCallerArn() {
        return snsCallerArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn
     * 
     */
    @JsonProperty("SnsCallerArn")
    public void setSnsCallerArn(String snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
    }

    public SmsConfiguration withSnsCallerArn(String snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("externalId", externalId).append("snsCallerArn", snsCallerArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(externalId).append(snsCallerArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SmsConfiguration) == false) {
            return false;
        }
        SmsConfiguration rhs = ((SmsConfiguration) other);
        return new EqualsBuilder().append(externalId, rhs.externalId).append(snsCallerArn, rhs.snsCallerArn).isEquals();
    }

}
