
package shiver.me.timbers.aws.wafv2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * WebACLAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceArn",
    "WebACLArn"
})
public class WebACLAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-resourcearn
     * 
     */
    @JsonProperty("ResourceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-resourcearn")
    private CharSequence resourceArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn
     * 
     */
    @JsonProperty("WebACLArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn")
    private CharSequence webACLArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-resourcearn
     * 
     */
    @JsonIgnore
    public CharSequence getResourceArn() {
        return resourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-resourcearn
     * 
     */
    @JsonIgnore
    public void setResourceArn(CharSequence resourceArn) {
        this.resourceArn = resourceArn;
    }

    public WebACLAssociation withResourceArn(CharSequence resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn
     * 
     */
    @JsonIgnore
    public CharSequence getWebACLArn() {
        return webACLArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn
     * 
     */
    @JsonIgnore
    public void setWebACLArn(CharSequence webACLArn) {
        this.webACLArn = webACLArn;
    }

    public WebACLAssociation withWebACLArn(CharSequence webACLArn) {
        this.webACLArn = webACLArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceArn", resourceArn).append("webACLArn", webACLArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(webACLArn).append(resourceArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLAssociation) == false) {
            return false;
        }
        WebACLAssociation rhs = ((WebACLAssociation) other);
        return new EqualsBuilder().append(webACLArn, rhs.webACLArn).append(resourceArn, rhs.resourceArn).isEquals();
    }

}
