
package aws.route53;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RecordSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AliasTarget",
    "Comment",
    "Failover",
    "GeoLocation",
    "HealthCheckId",
    "HostedZoneId",
    "HostedZoneName",
    "Name",
    "Region",
    "ResourceRecords",
    "SetIdentifier",
    "TTL",
    "Type",
    "Weight"
})
public class RecordSet {

    /**
     * AliasTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
     * 
     */
    @JsonProperty("AliasTarget")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html")
    private AliasTarget aliasTarget;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment")
    private CharSequence comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover
     * 
     */
    @JsonProperty("Failover")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover")
    private CharSequence failover;
    /**
     * GeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    @JsonProperty("GeoLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html")
    private GeoLocation geoLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid
     * 
     */
    @JsonProperty("HealthCheckId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid")
    private CharSequence healthCheckId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid")
    private CharSequence hostedZoneId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename")
    private CharSequence hostedZoneName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region")
    private CharSequence region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords
     * 
     */
    @JsonProperty("ResourceRecords")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords")
    private List<CharSequence> resourceRecords = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier
     * 
     */
    @JsonProperty("SetIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier")
    private CharSequence setIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl
     * 
     */
    @JsonProperty("TTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl")
    private CharSequence tTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight
     * 
     */
    @JsonProperty("Weight")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight")
    private Integer weight;

    /**
     * AliasTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
     * 
     */
    public AliasTarget getAliasTarget() {
        return aliasTarget;
    }

    /**
     * AliasTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
     * 
     */
    public void setAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
    }

    public RecordSet withAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment
     * 
     */
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment
     * 
     */
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public RecordSet withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover
     * 
     */
    public CharSequence getFailover() {
        return failover;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover
     * 
     */
    public void setFailover(CharSequence failover) {
        this.failover = failover;
    }

    public RecordSet withFailover(CharSequence failover) {
        this.failover = failover;
        return this;
    }

    /**
     * GeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * GeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public RecordSet withGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid
     * 
     */
    public CharSequence getHealthCheckId() {
        return healthCheckId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid
     * 
     */
    public void setHealthCheckId(CharSequence healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    public RecordSet withHealthCheckId(CharSequence healthCheckId) {
        this.healthCheckId = healthCheckId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid
     * 
     */
    public CharSequence getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid
     * 
     */
    public void setHostedZoneId(CharSequence hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    public RecordSet withHostedZoneId(CharSequence hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename
     * 
     */
    public CharSequence getHostedZoneName() {
        return hostedZoneName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename
     * 
     */
    public void setHostedZoneName(CharSequence hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
    }

    public RecordSet withHostedZoneName(CharSequence hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RecordSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region
     * 
     */
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region
     * 
     */
    public void setRegion(CharSequence region) {
        this.region = region;
    }

    public RecordSet withRegion(CharSequence region) {
        this.region = region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords
     * 
     */
    public List<CharSequence> getResourceRecords() {
        return resourceRecords;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords
     * 
     */
    public void setResourceRecords(List<CharSequence> resourceRecords) {
        this.resourceRecords = resourceRecords;
    }

    public RecordSet withResourceRecords(List<CharSequence> resourceRecords) {
        this.resourceRecords = resourceRecords;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier
     * 
     */
    public CharSequence getSetIdentifier() {
        return setIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier
     * 
     */
    public void setSetIdentifier(CharSequence setIdentifier) {
        this.setIdentifier = setIdentifier;
    }

    public RecordSet withSetIdentifier(CharSequence setIdentifier) {
        this.setIdentifier = setIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl
     * 
     */
    public CharSequence getTTL() {
        return tTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl
     * 
     */
    public void setTTL(CharSequence tTL) {
        this.tTL = tTL;
    }

    public RecordSet withTTL(CharSequence tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public RecordSet withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight
     * 
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight
     * 
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public RecordSet withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aliasTarget", aliasTarget).append("comment", comment).append("failover", failover).append("geoLocation", geoLocation).append("healthCheckId", healthCheckId).append("hostedZoneId", hostedZoneId).append("hostedZoneName", hostedZoneName).append("name", name).append("region", region).append("resourceRecords", resourceRecords).append("setIdentifier", setIdentifier).append("tTL", tTL).append("type", type).append("weight", weight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(setIdentifier).append(weight).append(resourceRecords).append(type).append(hostedZoneName).append(tTL).append(healthCheckId).append(hostedZoneId).append(failover).append(geoLocation).append(aliasTarget).append(name).append(comment).append(region).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordSet) == false) {
            return false;
        }
        RecordSet rhs = ((RecordSet) other);
        return new EqualsBuilder().append(setIdentifier, rhs.setIdentifier).append(weight, rhs.weight).append(resourceRecords, rhs.resourceRecords).append(type, rhs.type).append(hostedZoneName, rhs.hostedZoneName).append(tTL, rhs.tTL).append(healthCheckId, rhs.healthCheckId).append(hostedZoneId, rhs.hostedZoneId).append(failover, rhs.failover).append(geoLocation, rhs.geoLocation).append(aliasTarget, rhs.aliasTarget).append(name, rhs.name).append(comment, rhs.comment).append(region, rhs.region).isEquals();
    }

}
