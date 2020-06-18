
package shiver.me.timbers.aws.mediastore;

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
 * ContainerMetricPolicyRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ObjectGroup",
    "ObjectGroupName"
})
public class ContainerMetricPolicyRule implements Property<ContainerMetricPolicyRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroup
     * 
     */
    @JsonProperty("ObjectGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroup")
    private CharSequence objectGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroupname
     * 
     */
    @JsonProperty("ObjectGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroupname")
    private CharSequence objectGroupName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroup
     * 
     */
    @JsonIgnore
    public CharSequence getObjectGroup() {
        return objectGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroup
     * 
     */
    @JsonIgnore
    public void setObjectGroup(CharSequence objectGroup) {
        this.objectGroup = objectGroup;
    }

    public ContainerMetricPolicyRule withObjectGroup(CharSequence objectGroup) {
        this.objectGroup = objectGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroupname
     * 
     */
    @JsonIgnore
    public CharSequence getObjectGroupName() {
        return objectGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroupname
     * 
     */
    @JsonIgnore
    public void setObjectGroupName(CharSequence objectGroupName) {
        this.objectGroupName = objectGroupName;
    }

    public ContainerMetricPolicyRule withObjectGroupName(CharSequence objectGroupName) {
        this.objectGroupName = objectGroupName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("objectGroup", objectGroup).append("objectGroupName", objectGroupName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(objectGroup).append(objectGroupName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerMetricPolicyRule) == false) {
            return false;
        }
        ContainerMetricPolicyRule rhs = ((ContainerMetricPolicyRule) other);
        return new EqualsBuilder().append(objectGroup, rhs.objectGroup).append(objectGroupName, rhs.objectGroupName).isEquals();
    }

}
