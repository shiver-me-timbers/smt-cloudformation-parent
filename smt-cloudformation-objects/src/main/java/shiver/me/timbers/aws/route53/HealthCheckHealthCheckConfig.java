
package shiver.me.timbers.aws.route53;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * HealthCheckHealthCheckConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AlarmIdentifier",
    "ChildHealthChecks",
    "EnableSNI",
    "FailureThreshold",
    "FullyQualifiedDomainName",
    "HealthThreshold",
    "IPAddress",
    "InsufficientDataHealthStatus",
    "Inverted",
    "MeasureLatency",
    "Port",
    "Regions",
    "RequestInterval",
    "ResourcePath",
    "SearchString",
    "Type"
})
public class HealthCheckHealthCheckConfig implements Property<HealthCheckHealthCheckConfig>
{

    /**
     * HealthCheckAlarmIdentifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
     * 
     */
    @JsonProperty("AlarmIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html")
    private Property<HealthCheckAlarmIdentifier> alarmIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks
     * 
     */
    @JsonProperty("ChildHealthChecks")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks")
    private Set<CharSequence> childHealthChecks = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni
     * 
     */
    @JsonProperty("EnableSNI")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni")
    private CharSequence enableSNI;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold
     * 
     */
    @JsonProperty("FailureThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold")
    private Number failureThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname
     * 
     */
    @JsonProperty("FullyQualifiedDomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname")
    private CharSequence fullyQualifiedDomainName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold
     * 
     */
    @JsonProperty("HealthThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold")
    private Number healthThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress
     * 
     */
    @JsonProperty("IPAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress")
    private CharSequence iPAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus
     * 
     */
    @JsonProperty("InsufficientDataHealthStatus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus")
    private CharSequence insufficientDataHealthStatus;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted
     * 
     */
    @JsonProperty("Inverted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted")
    private CharSequence inverted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency
     * 
     */
    @JsonProperty("MeasureLatency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency")
    private CharSequence measureLatency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port")
    private Number port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions
     * 
     */
    @JsonProperty("Regions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions")
    private Set<CharSequence> regions = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval
     * 
     */
    @JsonProperty("RequestInterval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval")
    private Number requestInterval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath
     * 
     */
    @JsonProperty("ResourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath")
    private CharSequence resourcePath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring
     * 
     */
    @JsonProperty("SearchString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring")
    private CharSequence searchString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type")
    private CharSequence type;

    /**
     * HealthCheckAlarmIdentifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
     * 
     */
    @JsonIgnore
    public Property<HealthCheckAlarmIdentifier> getAlarmIdentifier() {
        return alarmIdentifier;
    }

    /**
     * HealthCheckAlarmIdentifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
     * 
     */
    @JsonIgnore
    public void setAlarmIdentifier(Property<HealthCheckAlarmIdentifier> alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
    }

    public HealthCheckHealthCheckConfig withAlarmIdentifier(Property<HealthCheckAlarmIdentifier> alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getChildHealthChecks() {
        return childHealthChecks;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks
     * 
     */
    @JsonIgnore
    public void setChildHealthChecks(Set<CharSequence> childHealthChecks) {
        this.childHealthChecks = childHealthChecks;
    }

    public HealthCheckHealthCheckConfig withChildHealthChecks(Set<CharSequence> childHealthChecks) {
        this.childHealthChecks = childHealthChecks;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni
     * 
     */
    @JsonIgnore
    public CharSequence getEnableSNI() {
        return enableSNI;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni
     * 
     */
    @JsonIgnore
    public void setEnableSNI(CharSequence enableSNI) {
        this.enableSNI = enableSNI;
    }

    public HealthCheckHealthCheckConfig withEnableSNI(CharSequence enableSNI) {
        this.enableSNI = enableSNI;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold
     * 
     */
    @JsonIgnore
    public Number getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold
     * 
     */
    @JsonIgnore
    public void setFailureThreshold(Number failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public HealthCheckHealthCheckConfig withFailureThreshold(Number failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname
     * 
     */
    @JsonIgnore
    public CharSequence getFullyQualifiedDomainName() {
        return fullyQualifiedDomainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname
     * 
     */
    @JsonIgnore
    public void setFullyQualifiedDomainName(CharSequence fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }

    public HealthCheckHealthCheckConfig withFullyQualifiedDomainName(CharSequence fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold
     * 
     */
    @JsonIgnore
    public Number getHealthThreshold() {
        return healthThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold
     * 
     */
    @JsonIgnore
    public void setHealthThreshold(Number healthThreshold) {
        this.healthThreshold = healthThreshold;
    }

    public HealthCheckHealthCheckConfig withHealthThreshold(Number healthThreshold) {
        this.healthThreshold = healthThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress
     * 
     */
    @JsonIgnore
    public CharSequence getIPAddress() {
        return iPAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress
     * 
     */
    @JsonIgnore
    public void setIPAddress(CharSequence iPAddress) {
        this.iPAddress = iPAddress;
    }

    public HealthCheckHealthCheckConfig withIPAddress(CharSequence iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus
     * 
     */
    @JsonIgnore
    public CharSequence getInsufficientDataHealthStatus() {
        return insufficientDataHealthStatus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus
     * 
     */
    @JsonIgnore
    public void setInsufficientDataHealthStatus(CharSequence insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
    }

    public HealthCheckHealthCheckConfig withInsufficientDataHealthStatus(CharSequence insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted
     * 
     */
    @JsonIgnore
    public CharSequence getInverted() {
        return inverted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted
     * 
     */
    @JsonIgnore
    public void setInverted(CharSequence inverted) {
        this.inverted = inverted;
    }

    public HealthCheckHealthCheckConfig withInverted(CharSequence inverted) {
        this.inverted = inverted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency
     * 
     */
    @JsonIgnore
    public CharSequence getMeasureLatency() {
        return measureLatency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency
     * 
     */
    @JsonIgnore
    public void setMeasureLatency(CharSequence measureLatency) {
        this.measureLatency = measureLatency;
    }

    public HealthCheckHealthCheckConfig withMeasureLatency(CharSequence measureLatency) {
        this.measureLatency = measureLatency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port
     * 
     */
    @JsonIgnore
    public Number getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port
     * 
     */
    @JsonIgnore
    public void setPort(Number port) {
        this.port = port;
    }

    public HealthCheckHealthCheckConfig withPort(Number port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getRegions() {
        return regions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions
     * 
     */
    @JsonIgnore
    public void setRegions(Set<CharSequence> regions) {
        this.regions = regions;
    }

    public HealthCheckHealthCheckConfig withRegions(Set<CharSequence> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval
     * 
     */
    @JsonIgnore
    public Number getRequestInterval() {
        return requestInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval
     * 
     */
    @JsonIgnore
    public void setRequestInterval(Number requestInterval) {
        this.requestInterval = requestInterval;
    }

    public HealthCheckHealthCheckConfig withRequestInterval(Number requestInterval) {
        this.requestInterval = requestInterval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath
     * 
     */
    @JsonIgnore
    public CharSequence getResourcePath() {
        return resourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath
     * 
     */
    @JsonIgnore
    public void setResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
    }

    public HealthCheckHealthCheckConfig withResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring
     * 
     */
    @JsonIgnore
    public CharSequence getSearchString() {
        return searchString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring
     * 
     */
    @JsonIgnore
    public void setSearchString(CharSequence searchString) {
        this.searchString = searchString;
    }

    public HealthCheckHealthCheckConfig withSearchString(CharSequence searchString) {
        this.searchString = searchString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public HealthCheckHealthCheckConfig withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alarmIdentifier", alarmIdentifier).append("childHealthChecks", childHealthChecks).append("enableSNI", enableSNI).append("failureThreshold", failureThreshold).append("fullyQualifiedDomainName", fullyQualifiedDomainName).append("healthThreshold", healthThreshold).append("iPAddress", iPAddress).append("insufficientDataHealthStatus", insufficientDataHealthStatus).append("inverted", inverted).append("measureLatency", measureLatency).append("port", port).append("regions", regions).append("requestInterval", requestInterval).append("resourcePath", resourcePath).append("searchString", searchString).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(childHealthChecks).append(regions).append(requestInterval).append(fullyQualifiedDomainName).append(resourcePath).append(alarmIdentifier).append(healthThreshold).append(type).append(insufficientDataHealthStatus).append(enableSNI).append(iPAddress).append(searchString).append(failureThreshold).append(port).append(inverted).append(measureLatency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealthCheckHealthCheckConfig) == false) {
            return false;
        }
        HealthCheckHealthCheckConfig rhs = ((HealthCheckHealthCheckConfig) other);
        return new EqualsBuilder().append(childHealthChecks, rhs.childHealthChecks).append(regions, rhs.regions).append(requestInterval, rhs.requestInterval).append(fullyQualifiedDomainName, rhs.fullyQualifiedDomainName).append(resourcePath, rhs.resourcePath).append(alarmIdentifier, rhs.alarmIdentifier).append(healthThreshold, rhs.healthThreshold).append(type, rhs.type).append(insufficientDataHealthStatus, rhs.insufficientDataHealthStatus).append(enableSNI, rhs.enableSNI).append(iPAddress, rhs.iPAddress).append(searchString, rhs.searchString).append(failureThreshold, rhs.failureThreshold).append(port, rhs.port).append(inverted, rhs.inverted).append(measureLatency, rhs.measureLatency).isEquals();
    }

}
