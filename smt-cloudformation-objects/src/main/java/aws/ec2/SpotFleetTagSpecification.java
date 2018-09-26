
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotFleetTagSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResourceType"
})
public class SpotFleetTagSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype")
    private CharSequence resourceType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype
     * 
     */
    public CharSequence getResourceType() {
        return resourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype
     * 
     */
    public void setResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
    }

    public SpotFleetTagSpecification withResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceType", resourceType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpotFleetTagSpecification) == false) {
            return false;
        }
        SpotFleetTagSpecification rhs = ((SpotFleetTagSpecification) other);
        return new EqualsBuilder().append(resourceType, rhs.resourceType).isEquals();
    }

}
