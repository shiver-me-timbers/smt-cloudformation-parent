
package aws.route53;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HostedZone
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HostedZoneConfig",
    "HostedZoneTags",
    "Name",
    "QueryLoggingConfig",
    "VPCs"
})
public class HostedZone {

    /**
     * HostedZoneConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html
     * 
     */
    @JsonProperty("HostedZoneConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html")
    private Property<HostedZoneConfig> hostedZoneConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags
     * 
     */
    @JsonProperty("HostedZoneTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags")
    private List<Property<HostedZoneTag>> hostedZoneTags = new ArrayList<Property<HostedZoneTag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name")
    private CharSequence name;
    /**
     * QueryLoggingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html
     * 
     */
    @JsonProperty("QueryLoggingConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html")
    private Property<QueryLoggingConfig> queryLoggingConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs
     * 
     */
    @JsonProperty("VPCs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs")
    private List<Property<VPC>> vPCs = new ArrayList<Property<VPC>>();

    /**
     * HostedZoneConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html
     * 
     */
    @JsonIgnore
    public Property<HostedZoneConfig> getHostedZoneConfig() {
        return hostedZoneConfig;
    }

    /**
     * HostedZoneConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html
     * 
     */
    @JsonIgnore
    public void setHostedZoneConfig(Property<HostedZoneConfig> hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
    }

    public HostedZone withHostedZoneConfig(Property<HostedZoneConfig> hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags
     * 
     */
    @JsonIgnore
    public List<Property<HostedZoneTag>> getHostedZoneTags() {
        return hostedZoneTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags
     * 
     */
    @JsonIgnore
    public void setHostedZoneTags(List<Property<HostedZoneTag>> hostedZoneTags) {
        this.hostedZoneTags = hostedZoneTags;
    }

    public HostedZone withHostedZoneTags(List<Property<HostedZoneTag>> hostedZoneTags) {
        this.hostedZoneTags = hostedZoneTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public HostedZone withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * QueryLoggingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html
     * 
     */
    @JsonIgnore
    public Property<QueryLoggingConfig> getQueryLoggingConfig() {
        return queryLoggingConfig;
    }

    /**
     * QueryLoggingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html
     * 
     */
    @JsonIgnore
    public void setQueryLoggingConfig(Property<QueryLoggingConfig> queryLoggingConfig) {
        this.queryLoggingConfig = queryLoggingConfig;
    }

    public HostedZone withQueryLoggingConfig(Property<QueryLoggingConfig> queryLoggingConfig) {
        this.queryLoggingConfig = queryLoggingConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs
     * 
     */
    @JsonIgnore
    public List<Property<VPC>> getVPCs() {
        return vPCs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs
     * 
     */
    @JsonIgnore
    public void setVPCs(List<Property<VPC>> vPCs) {
        this.vPCs = vPCs;
    }

    public HostedZone withVPCs(List<Property<VPC>> vPCs) {
        this.vPCs = vPCs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hostedZoneConfig", hostedZoneConfig).append("hostedZoneTags", hostedZoneTags).append("name", name).append("queryLoggingConfig", queryLoggingConfig).append("vPCs", vPCs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(hostedZoneTags).append(queryLoggingConfig).append(vPCs).append(hostedZoneConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HostedZone) == false) {
            return false;
        }
        HostedZone rhs = ((HostedZone) other);
        return new EqualsBuilder().append(name, rhs.name).append(hostedZoneTags, rhs.hostedZoneTags).append(queryLoggingConfig, rhs.queryLoggingConfig).append(vPCs, rhs.vPCs).append(hostedZoneConfig, rhs.hostedZoneConfig).isEquals();
    }

}
