
package aws.wafregional;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResourceArn",
    "WebACLId"
})
public class WebACLAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn
     * 
     */
    @JsonProperty("ResourceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn")
    private CharSequence resourceArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid
     * 
     */
    @JsonProperty("WebACLId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid")
    private CharSequence webACLId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn
     * 
     */
    public CharSequence getResourceArn() {
        return resourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn
     * 
     */
    public void setResourceArn(CharSequence resourceArn) {
        this.resourceArn = resourceArn;
    }

    public WebACLAssociation withResourceArn(CharSequence resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid
     * 
     */
    public CharSequence getWebACLId() {
        return webACLId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid
     * 
     */
    public void setWebACLId(CharSequence webACLId) {
        this.webACLId = webACLId;
    }

    public WebACLAssociation withWebACLId(CharSequence webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceArn", resourceArn).append("webACLId", webACLId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceArn).append(webACLId).toHashCode();
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
        return new EqualsBuilder().append(resourceArn, rhs.resourceArn).append(webACLId, rhs.webACLId).isEquals();
    }

}
