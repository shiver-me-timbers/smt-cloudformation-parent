
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AddHeaderAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HeaderValue",
    "HeaderName"
})
public class AddHeaderAction {

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
    public CharSequence getHeaderValue() {
        return headerValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue
     * 
     */
    public void setHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
    }

    public AddHeaderAction withHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername
     * 
     */
    public CharSequence getHeaderName() {
        return headerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername
     * 
     */
    public void setHeaderName(CharSequence headerName) {
        this.headerName = headerName;
    }

    public AddHeaderAction withHeaderName(CharSequence headerName) {
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
        if ((other instanceof AddHeaderAction) == false) {
            return false;
        }
        AddHeaderAction rhs = ((AddHeaderAction) other);
        return new EqualsBuilder().append(headerValue, rhs.headerValue).append(headerName, rhs.headerName).isEquals();
    }

}
