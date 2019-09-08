
package shiver.me.timbers.aws.cloudtrail;

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
 * TrailEventSelector
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DataResources",
    "IncludeManagementEvents",
    "ReadWriteType"
})
public class TrailEventSelector implements Property<TrailEventSelector>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources
     * 
     */
    @JsonProperty("DataResources")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources")
    private Set<Property<TrailDataResource>> dataResources = new LinkedHashSet<Property<TrailDataResource>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents
     * 
     */
    @JsonProperty("IncludeManagementEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents")
    private CharSequence includeManagementEvents;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype
     * 
     */
    @JsonProperty("ReadWriteType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype")
    private CharSequence readWriteType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources
     * 
     */
    @JsonIgnore
    public Set<Property<TrailDataResource>> getDataResources() {
        return dataResources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources
     * 
     */
    @JsonIgnore
    public void setDataResources(Set<Property<TrailDataResource>> dataResources) {
        this.dataResources = dataResources;
    }

    public TrailEventSelector withDataResources(Set<Property<TrailDataResource>> dataResources) {
        this.dataResources = dataResources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeManagementEvents() {
        return includeManagementEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents
     * 
     */
    @JsonIgnore
    public void setIncludeManagementEvents(CharSequence includeManagementEvents) {
        this.includeManagementEvents = includeManagementEvents;
    }

    public TrailEventSelector withIncludeManagementEvents(CharSequence includeManagementEvents) {
        this.includeManagementEvents = includeManagementEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype
     * 
     */
    @JsonIgnore
    public CharSequence getReadWriteType() {
        return readWriteType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype
     * 
     */
    @JsonIgnore
    public void setReadWriteType(CharSequence readWriteType) {
        this.readWriteType = readWriteType;
    }

    public TrailEventSelector withReadWriteType(CharSequence readWriteType) {
        this.readWriteType = readWriteType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataResources", dataResources).append("includeManagementEvents", includeManagementEvents).append("readWriteType", readWriteType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataResources).append(readWriteType).append(includeManagementEvents).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrailEventSelector) == false) {
            return false;
        }
        TrailEventSelector rhs = ((TrailEventSelector) other);
        return new EqualsBuilder().append(dataResources, rhs.dataResources).append(readWriteType, rhs.readWriteType).append(includeManagementEvents, rhs.includeManagementEvents).isEquals();
    }

}
