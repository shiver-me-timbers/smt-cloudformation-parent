
package shiver.me.timbers.aws.kinesisanalyticsv2;

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
 * ApplicationEnvironmentProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PropertyGroups"
})
public class ApplicationEnvironmentProperties implements Property<ApplicationEnvironmentProperties>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups
     * 
     */
    @JsonProperty("PropertyGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups")
    private List<Property<ApplicationPropertyGroup>> propertyGroups = new ArrayList<Property<ApplicationPropertyGroup>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups
     * 
     */
    @JsonIgnore
    public List<Property<ApplicationPropertyGroup>> getPropertyGroups() {
        return propertyGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups
     * 
     */
    @JsonIgnore
    public void setPropertyGroups(List<Property<ApplicationPropertyGroup>> propertyGroups) {
        this.propertyGroups = propertyGroups;
    }

    public ApplicationEnvironmentProperties withPropertyGroups(List<Property<ApplicationPropertyGroup>> propertyGroups) {
        this.propertyGroups = propertyGroups;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("propertyGroups", propertyGroups).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(propertyGroups).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationEnvironmentProperties) == false) {
            return false;
        }
        ApplicationEnvironmentProperties rhs = ((ApplicationEnvironmentProperties) other);
        return new EqualsBuilder().append(propertyGroups, rhs.propertyGroups).isEquals();
    }

}
