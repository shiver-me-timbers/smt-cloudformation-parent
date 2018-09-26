
package aws.cloudtrail;

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
 * EventSelector
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DataResources",
    "IncludeManagementEvents",
    "ReadWriteType"
})
public class EventSelector {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources
     * 
     */
    @JsonProperty("DataResources")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources")
    private Set<DataResource> dataResources = new LinkedHashSet<DataResource>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents
     * 
     */
    @JsonProperty("IncludeManagementEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents")
    private Boolean includeManagementEvents;
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
    public Set<DataResource> getDataResources() {
        return dataResources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources
     * 
     */
    public void setDataResources(Set<DataResource> dataResources) {
        this.dataResources = dataResources;
    }

    public EventSelector withDataResources(Set<DataResource> dataResources) {
        this.dataResources = dataResources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents
     * 
     */
    public Boolean getIncludeManagementEvents() {
        return includeManagementEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents
     * 
     */
    public void setIncludeManagementEvents(Boolean includeManagementEvents) {
        this.includeManagementEvents = includeManagementEvents;
    }

    public EventSelector withIncludeManagementEvents(Boolean includeManagementEvents) {
        this.includeManagementEvents = includeManagementEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype
     * 
     */
    public CharSequence getReadWriteType() {
        return readWriteType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype
     * 
     */
    public void setReadWriteType(CharSequence readWriteType) {
        this.readWriteType = readWriteType;
    }

    public EventSelector withReadWriteType(CharSequence readWriteType) {
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
        if ((other instanceof EventSelector) == false) {
            return false;
        }
        EventSelector rhs = ((EventSelector) other);
        return new EqualsBuilder().append(dataResources, rhs.dataResources).append(readWriteType, rhs.readWriteType).append(includeManagementEvents, rhs.includeManagementEvents).isEquals();
    }

}
