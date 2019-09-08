
package shiver.me.timbers.aws.appstream;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StackFleetAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FleetName",
    "StackName"
})
public class StackFleetAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname
     * 
     */
    @JsonProperty("FleetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname")
    private CharSequence fleetName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname
     * 
     */
    @JsonProperty("StackName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname")
    private CharSequence stackName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname
     * 
     */
    @JsonIgnore
    public CharSequence getFleetName() {
        return fleetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname
     * 
     */
    @JsonIgnore
    public void setFleetName(CharSequence fleetName) {
        this.fleetName = fleetName;
    }

    public StackFleetAssociation withFleetName(CharSequence fleetName) {
        this.fleetName = fleetName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname
     * 
     */
    @JsonIgnore
    public CharSequence getStackName() {
        return stackName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname
     * 
     */
    @JsonIgnore
    public void setStackName(CharSequence stackName) {
        this.stackName = stackName;
    }

    public StackFleetAssociation withStackName(CharSequence stackName) {
        this.stackName = stackName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fleetName", fleetName).append("stackName", stackName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fleetName).append(stackName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackFleetAssociation) == false) {
            return false;
        }
        StackFleetAssociation rhs = ((StackFleetAssociation) other);
        return new EqualsBuilder().append(fleetName, rhs.fleetName).append(stackName, rhs.stackName).isEquals();
    }

}
