
package aws.ec2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DHCPOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DomainName",
    "DomainNameServers",
    "NetbiosNameServers",
    "NetbiosNodeType",
    "NtpServers",
    "Tags"
})
public class DHCPOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainname")
    private String domainName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainnameservers
     * 
     */
    @JsonProperty("DomainNameServers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainnameservers")
    private Set<String> domainNameServers = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnameservers
     * 
     */
    @JsonProperty("NetbiosNameServers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnameservers")
    private Set<String> netbiosNameServers = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnodetype
     * 
     */
    @JsonProperty("NetbiosNodeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnodetype")
    private Integer netbiosNodeType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-ntpservers
     * 
     */
    @JsonProperty("NtpServers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-ntpservers")
    private List<String> ntpServers = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainname
     * 
     */
    @JsonProperty("DomainName")
    public String getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainname
     * 
     */
    @JsonProperty("DomainName")
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DHCPOptions withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainnameservers
     * 
     */
    @JsonProperty("DomainNameServers")
    public Set<String> getDomainNameServers() {
        return domainNameServers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainnameservers
     * 
     */
    @JsonProperty("DomainNameServers")
    public void setDomainNameServers(Set<String> domainNameServers) {
        this.domainNameServers = domainNameServers;
    }

    public DHCPOptions withDomainNameServers(Set<String> domainNameServers) {
        this.domainNameServers = domainNameServers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnameservers
     * 
     */
    @JsonProperty("NetbiosNameServers")
    public Set<String> getNetbiosNameServers() {
        return netbiosNameServers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnameservers
     * 
     */
    @JsonProperty("NetbiosNameServers")
    public void setNetbiosNameServers(Set<String> netbiosNameServers) {
        this.netbiosNameServers = netbiosNameServers;
    }

    public DHCPOptions withNetbiosNameServers(Set<String> netbiosNameServers) {
        this.netbiosNameServers = netbiosNameServers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnodetype
     * 
     */
    @JsonProperty("NetbiosNodeType")
    public Integer getNetbiosNodeType() {
        return netbiosNodeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnodetype
     * 
     */
    @JsonProperty("NetbiosNodeType")
    public void setNetbiosNodeType(Integer netbiosNodeType) {
        this.netbiosNodeType = netbiosNodeType;
    }

    public DHCPOptions withNetbiosNodeType(Integer netbiosNodeType) {
        this.netbiosNodeType = netbiosNodeType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-ntpservers
     * 
     */
    @JsonProperty("NtpServers")
    public List<String> getNtpServers() {
        return ntpServers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-ntpservers
     * 
     */
    @JsonProperty("NtpServers")
    public void setNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
    }

    public DHCPOptions withNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DHCPOptions withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domainName", domainName).append("domainNameServers", domainNameServers).append("netbiosNameServers", netbiosNameServers).append("netbiosNodeType", netbiosNodeType).append("ntpServers", ntpServers).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(netbiosNodeType).append(netbiosNameServers).append(ntpServers).append(domainName).append(domainNameServers).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DHCPOptions) == false) {
            return false;
        }
        DHCPOptions rhs = ((DHCPOptions) other);
        return new EqualsBuilder().append(netbiosNodeType, rhs.netbiosNodeType).append(netbiosNameServers, rhs.netbiosNameServers).append(ntpServers, rhs.ntpServers).append(domainName, rhs.domainName).append(domainNameServers, rhs.domainNameServers).append(tags, rhs.tags).isEquals();
    }

}
