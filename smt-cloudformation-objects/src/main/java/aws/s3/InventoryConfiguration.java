
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
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions
     * 
     */
    @JsonProperty("IncludedObjectVersions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions")
    private CharSequence includedObjectVersions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields
     * 
     */
    @JsonProperty("OptionalFields")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields")
    private Set<CharSequence> optionalFields = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix")
    private CharSequence prefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency
     * 
     */
    @JsonProperty("ScheduleFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency")
    private CharSequence scheduleFrequency;

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
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
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled
     * 
     */
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
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public InventoryConfiguration withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions
     * 
     */
    public CharSequence getIncludedObjectVersions() {
        return includedObjectVersions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions
     * 
     */
    public void setIncludedObjectVersions(CharSequence includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
    }

    public InventoryConfiguration withIncludedObjectVersions(CharSequence includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields
     * 
     */
    public Set<CharSequence> getOptionalFields() {
        return optionalFields;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields
     * 
     */
    public void setOptionalFields(Set<CharSequence> optionalFields) {
        this.optionalFields = optionalFields;
    }

    public InventoryConfiguration withOptionalFields(Set<CharSequence> optionalFields) {
        this.optionalFields = optionalFields;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix
     * 
     */
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix
     * 
     */
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public InventoryConfiguration withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency
     * 
     */
    public CharSequence getScheduleFrequency() {
        return scheduleFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency
     * 
     */
    public void setScheduleFrequency(CharSequence scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
    }

    public InventoryConfiguration withScheduleFrequency(CharSequence scheduleFrequency) {
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
