
package aws.logs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Destination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DestinationName",
    "DestinationPolicy",
    "RoleArn",
    "TargetArn"
})
public class Destination {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname
     * 
     */
    @JsonProperty("DestinationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname")
    private CharSequence destinationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy
     * 
     */
    @JsonProperty("DestinationPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy")
    private CharSequence destinationPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn
     * 
     */
    @JsonProperty("TargetArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn")
    private CharSequence targetArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname
     * 
     */
    public CharSequence getDestinationName() {
        return destinationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname
     * 
     */
    public void setDestinationName(CharSequence destinationName) {
        this.destinationName = destinationName;
    }

    public Destination withDestinationName(CharSequence destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy
     * 
     */
    public CharSequence getDestinationPolicy() {
        return destinationPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy
     * 
     */
    public void setDestinationPolicy(CharSequence destinationPolicy) {
        this.destinationPolicy = destinationPolicy;
    }

    public Destination withDestinationPolicy(CharSequence destinationPolicy) {
        this.destinationPolicy = destinationPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public Destination withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn
     * 
     */
    public CharSequence getTargetArn() {
        return targetArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn
     * 
     */
    public void setTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
    }

    public Destination withTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationName", destinationName).append("destinationPolicy", destinationPolicy).append("roleArn", roleArn).append("targetArn", targetArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationPolicy).append(roleArn).append(targetArn).append(destinationName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destination) == false) {
            return false;
        }
        Destination rhs = ((Destination) other);
        return new EqualsBuilder().append(destinationPolicy, rhs.destinationPolicy).append(roleArn, rhs.roleArn).append(targetArn, rhs.targetArn).append(destinationName, rhs.destinationName).isEquals();
    }

}
