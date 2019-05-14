
package aws.kinesisanalyticsv2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PropertyGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PropertyMap",
    "PropertyGroupId"
})
public class PropertyGroup implements Property<PropertyGroup>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap
     * 
     */
    @JsonProperty("PropertyMap")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap")
    private Object propertyMap;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid
     * 
     */
    @JsonProperty("PropertyGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid")
    private CharSequence propertyGroupId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap
     * 
     */
    @JsonIgnore
    public Object getPropertyMap() {
        return propertyMap;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap
     * 
     */
    @JsonIgnore
    public void setPropertyMap(Object propertyMap) {
        this.propertyMap = propertyMap;
    }

    public PropertyGroup withPropertyMap(Object propertyMap) {
        this.propertyMap = propertyMap;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid
     * 
     */
    @JsonIgnore
    public CharSequence getPropertyGroupId() {
        return propertyGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid
     * 
     */
    @JsonIgnore
    public void setPropertyGroupId(CharSequence propertyGroupId) {
        this.propertyGroupId = propertyGroupId;
    }

    public PropertyGroup withPropertyGroupId(CharSequence propertyGroupId) {
        this.propertyGroupId = propertyGroupId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("propertyMap", propertyMap).append("propertyGroupId", propertyGroupId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(propertyMap).append(propertyGroupId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PropertyGroup) == false) {
            return false;
        }
        PropertyGroup rhs = ((PropertyGroup) other);
        return new EqualsBuilder().append(propertyMap, rhs.propertyMap).append(propertyGroupId, rhs.propertyGroupId).isEquals();
    }

}
