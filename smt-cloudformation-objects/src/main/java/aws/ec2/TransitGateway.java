
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TransitGateway
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DefaultRouteTablePropagation",
    "Description",
    "AutoAcceptSharedAttachments",
    "DefaultRouteTableAssociation",
    "VpnEcmpSupport",
    "DnsSupport",
    "AmazonSideAsn",
    "Tags"
})
public class TransitGateway {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation
     * 
     */
    @JsonProperty("DefaultRouteTablePropagation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation")
    private CharSequence defaultRouteTablePropagation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments
     * 
     */
    @JsonProperty("AutoAcceptSharedAttachments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments")
    private CharSequence autoAcceptSharedAttachments;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation
     * 
     */
    @JsonProperty("DefaultRouteTableAssociation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation")
    private CharSequence defaultRouteTableAssociation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport
     * 
     */
    @JsonProperty("VpnEcmpSupport")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport")
    private CharSequence vpnEcmpSupport;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport
     * 
     */
    @JsonProperty("DnsSupport")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport")
    private CharSequence dnsSupport;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn
     * 
     */
    @JsonProperty("AmazonSideAsn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn")
    private Integer amazonSideAsn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultRouteTablePropagation() {
        return defaultRouteTablePropagation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation
     * 
     */
    @JsonIgnore
    public void setDefaultRouteTablePropagation(CharSequence defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    }

    public TransitGateway withDefaultRouteTablePropagation(CharSequence defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public TransitGateway withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments
     * 
     */
    @JsonIgnore
    public CharSequence getAutoAcceptSharedAttachments() {
        return autoAcceptSharedAttachments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments
     * 
     */
    @JsonIgnore
    public void setAutoAcceptSharedAttachments(CharSequence autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    public TransitGateway withAutoAcceptSharedAttachments(CharSequence autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultRouteTableAssociation() {
        return defaultRouteTableAssociation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation
     * 
     */
    @JsonIgnore
    public void setDefaultRouteTableAssociation(CharSequence defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    }

    public TransitGateway withDefaultRouteTableAssociation(CharSequence defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport
     * 
     */
    @JsonIgnore
    public CharSequence getVpnEcmpSupport() {
        return vpnEcmpSupport;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport
     * 
     */
    @JsonIgnore
    public void setVpnEcmpSupport(CharSequence vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    public TransitGateway withVpnEcmpSupport(CharSequence vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport
     * 
     */
    @JsonIgnore
    public CharSequence getDnsSupport() {
        return dnsSupport;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport
     * 
     */
    @JsonIgnore
    public void setDnsSupport(CharSequence dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    public TransitGateway withDnsSupport(CharSequence dnsSupport) {
        this.dnsSupport = dnsSupport;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn
     * 
     */
    @JsonIgnore
    public Integer getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn
     * 
     */
    @JsonIgnore
    public void setAmazonSideAsn(Integer amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    public TransitGateway withAmazonSideAsn(Integer amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags
     * 
     */
    @JsonIgnore
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public TransitGateway withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultRouteTablePropagation", defaultRouteTablePropagation).append("description", description).append("autoAcceptSharedAttachments", autoAcceptSharedAttachments).append("defaultRouteTableAssociation", defaultRouteTableAssociation).append("vpnEcmpSupport", vpnEcmpSupport).append("dnsSupport", dnsSupport).append("amazonSideAsn", amazonSideAsn).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultRouteTablePropagation).append(amazonSideAsn).append(vpnEcmpSupport).append(description).append(autoAcceptSharedAttachments).append(defaultRouteTableAssociation).append(dnsSupport).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransitGateway) == false) {
            return false;
        }
        TransitGateway rhs = ((TransitGateway) other);
        return new EqualsBuilder().append(defaultRouteTablePropagation, rhs.defaultRouteTablePropagation).append(amazonSideAsn, rhs.amazonSideAsn).append(vpnEcmpSupport, rhs.vpnEcmpSupport).append(description, rhs.description).append(autoAcceptSharedAttachments, rhs.autoAcceptSharedAttachments).append(defaultRouteTableAssociation, rhs.defaultRouteTableAssociation).append(dnsSupport, rhs.dnsSupport).append(tags, rhs.tags).isEquals();
    }

}
