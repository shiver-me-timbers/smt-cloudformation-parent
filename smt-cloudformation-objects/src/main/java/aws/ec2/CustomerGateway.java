
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
 * CustomerGateway
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BgpAsn",
    "IpAddress",
    "Tags",
    "Type"
})
public class CustomerGateway {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-bgpasn
     * 
     */
    @JsonProperty("BgpAsn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-bgpasn")
    private Integer bgpAsn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-ipaddress
     * 
     */
    @JsonProperty("IpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-ipaddress")
    private CharSequence ipAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-bgpasn
     * 
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-bgpasn
     * 
     */
    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CustomerGateway withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-ipaddress
     * 
     */
    public CharSequence getIpAddress() {
        return ipAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-ipaddress
     * 
     */
    public void setIpAddress(CharSequence ipAddress) {
        this.ipAddress = ipAddress;
    }

    public CustomerGateway withIpAddress(CharSequence ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CustomerGateway withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public CustomerGateway withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bgpAsn", bgpAsn).append("ipAddress", ipAddress).append("tags", tags).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ipAddress).append(bgpAsn).append(type).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomerGateway) == false) {
            return false;
        }
        CustomerGateway rhs = ((CustomerGateway) other);
        return new EqualsBuilder().append(ipAddress, rhs.ipAddress).append(bgpAsn, rhs.bgpAsn).append(type, rhs.type).append(tags, rhs.tags).isEquals();
    }

}
