
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticGpuSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type"
})
public class ElasticGpuSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ElasticGpuSpecification withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticGpuSpecification) == false) {
            return false;
        }
        ElasticGpuSpecification rhs = ((ElasticGpuSpecification) other);
        return new EqualsBuilder().append(type, rhs.type).isEquals();
    }

}
