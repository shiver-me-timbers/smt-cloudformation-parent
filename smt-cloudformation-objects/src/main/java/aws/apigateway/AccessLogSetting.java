
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AccessLogSetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DestinationArn",
    "Format"
})
public class AccessLogSetting {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-destinationarn
     * 
     */
    @JsonProperty("DestinationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-destinationarn")
    private CharSequence destinationArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-format
     * 
     */
    @JsonProperty("Format")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-format")
    private CharSequence format;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-destinationarn
     * 
     */
    public CharSequence getDestinationArn() {
        return destinationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-destinationarn
     * 
     */
    public void setDestinationArn(CharSequence destinationArn) {
        this.destinationArn = destinationArn;
    }

    public AccessLogSetting withDestinationArn(CharSequence destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-format
     * 
     */
    public CharSequence getFormat() {
        return format;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-format
     * 
     */
    public void setFormat(CharSequence format) {
        this.format = format;
    }

    public AccessLogSetting withFormat(CharSequence format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationArn", destinationArn).append("format", format).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(format).append(destinationArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessLogSetting) == false) {
            return false;
        }
        AccessLogSetting rhs = ((AccessLogSetting) other);
        return new EqualsBuilder().append(format, rhs.format).append(destinationArn, rhs.destinationArn).isEquals();
    }

}
