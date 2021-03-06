
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
 * BucketRoutingRuleCondition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HttpErrorCodeReturnedEquals",
    "KeyPrefixEquals"
})
public class BucketRoutingRuleCondition implements Property<BucketRoutingRuleCondition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals
     * 
     */
    @JsonProperty("HttpErrorCodeReturnedEquals")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals")
    private CharSequence httpErrorCodeReturnedEquals;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals
     * 
     */
    @JsonProperty("KeyPrefixEquals")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals")
    private CharSequence keyPrefixEquals;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals
     * 
     */
    @JsonIgnore
    public CharSequence getHttpErrorCodeReturnedEquals() {
        return httpErrorCodeReturnedEquals;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals
     * 
     */
    @JsonIgnore
    public void setHttpErrorCodeReturnedEquals(CharSequence httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
    }

    public BucketRoutingRuleCondition withHttpErrorCodeReturnedEquals(CharSequence httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals
     * 
     */
    @JsonIgnore
    public CharSequence getKeyPrefixEquals() {
        return keyPrefixEquals;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals
     * 
     */
    @JsonIgnore
    public void setKeyPrefixEquals(CharSequence keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
    }

    public BucketRoutingRuleCondition withKeyPrefixEquals(CharSequence keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("httpErrorCodeReturnedEquals", httpErrorCodeReturnedEquals).append("keyPrefixEquals", keyPrefixEquals).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(httpErrorCodeReturnedEquals).append(keyPrefixEquals).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketRoutingRuleCondition) == false) {
            return false;
        }
        BucketRoutingRuleCondition rhs = ((BucketRoutingRuleCondition) other);
        return new EqualsBuilder().append(httpErrorCodeReturnedEquals, rhs.httpErrorCodeReturnedEquals).append(keyPrefixEquals, rhs.keyPrefixEquals).isEquals();
    }

}
