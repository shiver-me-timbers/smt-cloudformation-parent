
package shiver.me.timbers.aws.route53;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * RecordSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AliasTarget",
    "Comment",
    "Failover",
    "GeoLocation",
    "HealthCheckId",
    "HostedZoneId",
    "HostedZoneName",
    "MultiValueAnswer",
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
     * RecordSetGroupAliasTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
     * 
     */
    @JsonProperty("AliasTarget")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html")
    private Property<RecordSetAliasTarget> aliasTarget;
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
     * RecordSetGeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    @JsonProperty("GeoLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html")
    private Property<RecordSetGeoLocation> geoLocation;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-multivalueanswer
     * 
     */
    @JsonProperty("MultiValueAnswer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-multivalueanswer")
    private CharSequence multiValueAnswer;
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
    private Number weight;

    /**
     * RecordSetGroupAliasTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
     * 
     */
    @JsonIgnore
    public Property<RecordSetAliasTarget> getAliasTarget() {
        return aliasTarget;
    }

    /**
     * RecordSetGroupAliasTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
     * 
     */
    @JsonIgnore
    public void setAliasTarget(Property<RecordSetAliasTarget> aliasTarget) {
        this.aliasTarget = aliasTarget;
    }

    public RecordSet withAliasTarget(Property<RecordSetAliasTarget> aliasTarget) {
        this.aliasTarget = aliasTarget;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment
     * 
     */
    @JsonIgnore
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getFailover() {
        return failover;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover
     * 
     */
    @JsonIgnore
    public void setFailover(CharSequence failover) {
        this.failover = failover;
    }

    public RecordSet withFailover(CharSequence failover) {
        this.failover = failover;
        return this;
    }

    /**
     * RecordSetGeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    @JsonIgnore
    public Property<RecordSetGeoLocation> getGeoLocation() {
        return geoLocation;
    }

    /**
     * RecordSetGeoLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
     * 
     */
    @JsonIgnore
    public void setGeoLocation(Property<RecordSetGeoLocation> geoLocation) {
        this.geoLocation = geoLocation;
    }

    public RecordSet withGeoLocation(Property<RecordSetGeoLocation> geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckId() {
        return healthCheckId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getHostedZoneName() {
        return hostedZoneName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename
     * 
     */
    @JsonIgnore
    public void setHostedZoneName(CharSequence hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
    }

    public RecordSet withHostedZoneName(CharSequence hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-multivalueanswer
     * 
     */
    @JsonIgnore
    public CharSequence getMultiValueAnswer() {
        return multiValueAnswer;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-multivalueanswer
     * 
     */
    @JsonIgnore
    public void setMultiValueAnswer(CharSequence multiValueAnswer) {
        this.multiValueAnswer = multiValueAnswer;
    }

    public RecordSet withMultiValueAnswer(CharSequence multiValueAnswer) {
        this.multiValueAnswer = multiValueAnswer;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<CharSequence> getResourceRecords() {
        return resourceRecords;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getSetIdentifier() {
        return setIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getTTL() {
        return tTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Number getWeight() {
        return weight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight
     * 
     */
    @JsonIgnore
    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public RecordSet withWeight(Number weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aliasTarget", aliasTarget).append("comment", comment).append("failover", failover).append("geoLocation", geoLocation).append("healthCheckId", healthCheckId).append("hostedZoneId", hostedZoneId).append("hostedZoneName", hostedZoneName).append("multiValueAnswer", multiValueAnswer).append("name", name).append("region", region).append("resourceRecords", resourceRecords).append("setIdentifier", setIdentifier).append("tTL", tTL).append("type", type).append("weight", weight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(setIdentifier).append(weight).append(resourceRecords).append(type).append(hostedZoneName).append(tTL).append(healthCheckId).append(hostedZoneId).append(multiValueAnswer).append(failover).append(geoLocation).append(aliasTarget).append(name).append(comment).append(region).toHashCode();
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
        return new EqualsBuilder().append(setIdentifier, rhs.setIdentifier).append(weight, rhs.weight).append(resourceRecords, rhs.resourceRecords).append(type, rhs.type).append(hostedZoneName, rhs.hostedZoneName).append(tTL, rhs.tTL).append(healthCheckId, rhs.healthCheckId).append(hostedZoneId, rhs.hostedZoneId).append(multiValueAnswer, rhs.multiValueAnswer).append(failover, rhs.failover).append(geoLocation, rhs.geoLocation).append(aliasTarget, rhs.aliasTarget).append(name, rhs.name).append(comment, rhs.comment).append(region, rhs.region).isEquals();
    }

}
