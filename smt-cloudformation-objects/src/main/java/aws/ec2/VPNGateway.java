
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPNGateway
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AmazonSideAsn",
    "Tags",
    "Type"
})
public class VPNGateway {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-amazonsideasn
     * 
     */
    @JsonProperty("AmazonSideAsn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-amazonsideasn")
    private Integer amazonSideAsn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-amazonsideasn
     * 
     */
    public Integer getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-amazonsideasn
     * 
     */
    public void setAmazonSideAsn(Integer amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    public VPNGateway withAmazonSideAsn(Integer amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VPNGateway withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html#cfn-ec2-vpngateway-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public VPNGateway withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amazonSideAsn", amazonSideAsn).append("tags", tags).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amazonSideAsn).append(type).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPNGateway) == false) {
            return false;
        }
        VPNGateway rhs = ((VPNGateway) other);
        return new EqualsBuilder().append(amazonSideAsn, rhs.amazonSideAsn).append(type, rhs.type).append(tags, rhs.tags).isEquals();
    }

}
