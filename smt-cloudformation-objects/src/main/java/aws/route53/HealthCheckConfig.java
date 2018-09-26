
package aws.route53;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HealthCheckConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
public class HealthCheckConfig {

    /**
     * AlarmIdentifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
     * 
     */
    @JsonProperty("AlarmIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html")
    private AlarmIdentifier alarmIdentifier;
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
    private Boolean enableSNI;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold
     * 
     */
    @JsonProperty("FailureThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold")
    private Integer failureThreshold;
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
    private Integer healthThreshold;
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
    private Boolean inverted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency
     * 
     */
    @JsonProperty("MeasureLatency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency")
    private Boolean measureLatency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port")
    private Integer port;
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
    private Integer requestInterval;
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
     * AlarmIdentifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
     * 
     */
    public AlarmIdentifier getAlarmIdentifier() {
        return alarmIdentifier;
    }

    /**
     * AlarmIdentifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
     * 
     */
    public void setAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
    }

    public HealthCheckConfig withAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks
     * 
     */
    public Set<CharSequence> getChildHealthChecks() {
        return childHealthChecks;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks
     * 
     */
    public void setChildHealthChecks(Set<CharSequence> childHealthChecks) {
        this.childHealthChecks = childHealthChecks;
    }

    public HealthCheckConfig withChildHealthChecks(Set<CharSequence> childHealthChecks) {
        this.childHealthChecks = childHealthChecks;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni
     * 
     */
    public Boolean getEnableSNI() {
        return enableSNI;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni
     * 
     */
    public void setEnableSNI(Boolean enableSNI) {
        this.enableSNI = enableSNI;
    }

    public HealthCheckConfig withEnableSNI(Boolean enableSNI) {
        this.enableSNI = enableSNI;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold
     * 
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold
     * 
     */
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public HealthCheckConfig withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname
     * 
     */
    public CharSequence getFullyQualifiedDomainName() {
        return fullyQualifiedDomainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname
     * 
     */
    public void setFullyQualifiedDomainName(CharSequence fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }

    public HealthCheckConfig withFullyQualifiedDomainName(CharSequence fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold
     * 
     */
    public Integer getHealthThreshold() {
        return healthThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold
     * 
     */
    public void setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
    }

    public HealthCheckConfig withHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress
     * 
     */
    public CharSequence getIPAddress() {
        return iPAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress
     * 
     */
    public void setIPAddress(CharSequence iPAddress) {
        this.iPAddress = iPAddress;
    }

    public HealthCheckConfig withIPAddress(CharSequence iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus
     * 
     */
    public CharSequence getInsufficientDataHealthStatus() {
        return insufficientDataHealthStatus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus
     * 
     */
    public void setInsufficientDataHealthStatus(CharSequence insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
    }

    public HealthCheckConfig withInsufficientDataHealthStatus(CharSequence insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted
     * 
     */
    public Boolean getInverted() {
        return inverted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted
     * 
     */
    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    public HealthCheckConfig withInverted(Boolean inverted) {
        this.inverted = inverted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency
     * 
     */
    public Boolean getMeasureLatency() {
        return measureLatency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency
     * 
     */
    public void setMeasureLatency(Boolean measureLatency) {
        this.measureLatency = measureLatency;
    }

    public HealthCheckConfig withMeasureLatency(Boolean measureLatency) {
        this.measureLatency = measureLatency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public HealthCheckConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions
     * 
     */
    public Set<CharSequence> getRegions() {
        return regions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions
     * 
     */
    public void setRegions(Set<CharSequence> regions) {
        this.regions = regions;
    }

    public HealthCheckConfig withRegions(Set<CharSequence> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval
     * 
     */
    public Integer getRequestInterval() {
        return requestInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval
     * 
     */
    public void setRequestInterval(Integer requestInterval) {
        this.requestInterval = requestInterval;
    }

    public HealthCheckConfig withRequestInterval(Integer requestInterval) {
        this.requestInterval = requestInterval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath
     * 
     */
    public CharSequence getResourcePath() {
        return resourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath
     * 
     */
    public void setResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
    }

    public HealthCheckConfig withResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring
     * 
     */
    public CharSequence getSearchString() {
        return searchString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring
     * 
     */
    public void setSearchString(CharSequence searchString) {
        this.searchString = searchString;
    }

    public HealthCheckConfig withSearchString(CharSequence searchString) {
        this.searchString = searchString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public HealthCheckConfig withType(CharSequence type) {
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
        if ((other instanceof HealthCheckConfig) == false) {
            return false;
        }
        HealthCheckConfig rhs = ((HealthCheckConfig) other);
        return new EqualsBuilder().append(childHealthChecks, rhs.childHealthChecks).append(regions, rhs.regions).append(requestInterval, rhs.requestInterval).append(fullyQualifiedDomainName, rhs.fullyQualifiedDomainName).append(resourcePath, rhs.resourcePath).append(alarmIdentifier, rhs.alarmIdentifier).append(healthThreshold, rhs.healthThreshold).append(type, rhs.type).append(insufficientDataHealthStatus, rhs.insufficientDataHealthStatus).append(enableSNI, rhs.enableSNI).append(iPAddress, rhs.iPAddress).append(searchString, rhs.searchString).append(failureThreshold, rhs.failureThreshold).append(port, rhs.port).append(inverted, rhs.inverted).append(measureLatency, rhs.measureLatency).isEquals();
    }

}
