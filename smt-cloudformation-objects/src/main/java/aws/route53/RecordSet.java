
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
    private String comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover
     * 
     */
    @JsonProperty("Failover")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover")
    private String failover;
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
    private String healthCheckId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid")
    private String hostedZoneId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename")
    private String hostedZoneName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region")
    private String region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords
     * 
     */
    @JsonProperty("ResourceRecords")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords")
    private List<String> resourceRecords = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier
     * 
     */
    @JsonProperty("SetIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier")
    private String setIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl
     * 
     */
    @JsonProperty("TTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl")
    private String tTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type")
    private String type;
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
    @JsonProperty("AliasTarget")
    public AliasTarget getAliasTarget() {
        return aliasTarget;
    }

    /**
     * AliasTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
     * 
     */
    @JsonProperty("AliasTarget")
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
    @JsonProperty("Comment")
    public String getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment
     * 
     */
    @JsonProperty("Comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public RecordSet withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover
     * 
     */
    @JsonProperty("Failover")
    public String getFailover() {
        return failover;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover
     * 
     */
    @JsonProperty("Failover")
    public void setFailover(String failover) {
        this.failover = failover;
    }

    public RecordSet withFailover(String failover) {
        this.failover = failover;
        return this;
    }

    /**
     * GeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    @JsonProperty("GeoLocation")
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * GeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    @JsonProperty("GeoLocation")
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
    @JsonProperty("HealthCheckId")
    public String getHealthCheckId() {
        return healthCheckId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid
     * 
     */
    @JsonProperty("HealthCheckId")
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    public RecordSet withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    public RecordSet withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    public String getHostedZoneName() {
        return hostedZoneName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    public void setHostedZoneName(String hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
    }

    public RecordSet withHostedZoneName(String hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public RecordSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region
     * 
     */
    @JsonProperty("Region")
    public String getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region
     * 
     */
    @JsonProperty("Region")
    public void setRegion(String region) {
        this.region = region;
    }

    public RecordSet withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords
     * 
     */
    @JsonProperty("ResourceRecords")
    public List<String> getResourceRecords() {
        return resourceRecords;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords
     * 
     */
    @JsonProperty("ResourceRecords")
    public void setResourceRecords(List<String> resourceRecords) {
        this.resourceRecords = resourceRecords;
    }

    public RecordSet withResourceRecords(List<String> resourceRecords) {
        this.resourceRecords = resourceRecords;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier
     * 
     */
    @JsonProperty("SetIdentifier")
    public String getSetIdentifier() {
        return setIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier
     * 
     */
    @JsonProperty("SetIdentifier")
    public void setSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
    }

    public RecordSet withSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl
     * 
     */
    @JsonProperty("TTL")
    public String getTTL() {
        return tTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl
     * 
     */
    @JsonProperty("TTL")
    public void setTTL(String tTL) {
        this.tTL = tTL;
    }

    public RecordSet withTTL(String tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type
     * 
     */
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type
     * 
     */
    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public RecordSet withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight
     * 
     */
    @JsonProperty("Weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight
     * 
     */
    @JsonProperty("Weight")
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
