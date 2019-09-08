
package shiver.me.timbers.aws.ses;

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
 * ReceiptRuleAddHeaderAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HeaderValue",
    "HeaderName"
})
public class ReceiptRuleAddHeaderAction implements Property<ReceiptRuleAddHeaderAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue
     * 
     */
    @JsonProperty("HeaderValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue")
    private CharSequence headerValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername
     * 
     */
    @JsonProperty("HeaderName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername")
    private CharSequence headerName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue
     * 
     */
    @JsonIgnore
    public CharSequence getHeaderValue() {
        return headerValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue
     * 
     */
    @JsonIgnore
    public void setHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
    }

    public ReceiptRuleAddHeaderAction withHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername
     * 
     */
    @JsonIgnore
    public CharSequence getHeaderName() {
        return headerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername
     * 
     */
    @JsonIgnore
    public void setHeaderName(CharSequence headerName) {
        this.headerName = headerName;
    }

    public ReceiptRuleAddHeaderAction withHeaderName(CharSequence headerName) {
        this.headerName = headerName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("headerValue", headerValue).append("headerName", headerName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(headerValue).append(headerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptRuleAddHeaderAction) == false) {
            return false;
        }
        ReceiptRuleAddHeaderAction rhs = ((ReceiptRuleAddHeaderAction) other);
        return new EqualsBuilder().append(headerValue, rhs.headerValue).append(headerName, rhs.headerName).isEquals();
    }

}
