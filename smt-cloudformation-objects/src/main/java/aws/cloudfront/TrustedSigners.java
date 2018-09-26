
package aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TrustedSigners
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled",
    "AwsAccountNumbers"
})
public class TrustedSigners {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers
     * 
     */
    @JsonProperty("AwsAccountNumbers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers")
    private List<CharSequence> awsAccountNumbers = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public TrustedSigners withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers
     * 
     */
    public List<CharSequence> getAwsAccountNumbers() {
        return awsAccountNumbers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers
     * 
     */
    public void setAwsAccountNumbers(List<CharSequence> awsAccountNumbers) {
        this.awsAccountNumbers = awsAccountNumbers;
    }

    public TrustedSigners withAwsAccountNumbers(List<CharSequence> awsAccountNumbers) {
        this.awsAccountNumbers = awsAccountNumbers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("awsAccountNumbers", awsAccountNumbers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enabled).append(awsAccountNumbers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrustedSigners) == false) {
            return false;
        }
        TrustedSigners rhs = ((TrustedSigners) other);
        return new EqualsBuilder().append(enabled, rhs.enabled).append(awsAccountNumbers, rhs.awsAccountNumbers).isEquals();
    }

}
