
package aws.s3;

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
 * InventoryConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Destination",
    "Enabled",
    "Id",
    "IncludedObjectVersions",
    "OptionalFields",
    "Prefix",
    "ScheduleFrequency"
})
public class InventoryConfiguration {

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    @JsonProperty("Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html")
    private Destination destination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id")
    private String id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions
     * 
     */
    @JsonProperty("IncludedObjectVersions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions")
    private String includedObjectVersions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields
     * 
     */
    @JsonProperty("OptionalFields")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields")
    private Set<String> optionalFields = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix")
    private String prefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency
     * 
     */
    @JsonProperty("ScheduleFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency")
    private String scheduleFrequency;

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    @JsonProperty("Destination")
    public Destination getDestination() {
        return destination;
    }

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    @JsonProperty("Destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public InventoryConfiguration withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public InventoryConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id
     * 
     */
    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id
     * 
     */
    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    public InventoryConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions
     * 
     */
    @JsonProperty("IncludedObjectVersions")
    public String getIncludedObjectVersions() {
        return includedObjectVersions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions
     * 
     */
    @JsonProperty("IncludedObjectVersions")
    public void setIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
    }

    public InventoryConfiguration withIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields
     * 
     */
    @JsonProperty("OptionalFields")
    public Set<String> getOptionalFields() {
        return optionalFields;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields
     * 
     */
    @JsonProperty("OptionalFields")
    public void setOptionalFields(Set<String> optionalFields) {
        this.optionalFields = optionalFields;
    }

    public InventoryConfiguration withOptionalFields(Set<String> optionalFields) {
        this.optionalFields = optionalFields;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public InventoryConfiguration withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency
     * 
     */
    @JsonProperty("ScheduleFrequency")
    public String getScheduleFrequency() {
        return scheduleFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency
     * 
     */
    @JsonProperty("ScheduleFrequency")
    public void setScheduleFrequency(String scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
    }

    public InventoryConfiguration withScheduleFrequency(String scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destination", destination).append("enabled", enabled).append("id", id).append("includedObjectVersions", includedObjectVersions).append("optionalFields", optionalFields).append("prefix", prefix).append("scheduleFrequency", scheduleFrequency).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scheduleFrequency).append(includedObjectVersions).append(prefix).append(destination).append(id).append(enabled).append(optionalFields).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InventoryConfiguration) == false) {
            return false;
        }
        InventoryConfiguration rhs = ((InventoryConfiguration) other);
        return new EqualsBuilder().append(scheduleFrequency, rhs.scheduleFrequency).append(includedObjectVersions, rhs.includedObjectVersions).append(prefix, rhs.prefix).append(destination, rhs.destination).append(id, rhs.id).append(enabled, rhs.enabled).append(optionalFields, rhs.optionalFields).isEquals();
    }

}
