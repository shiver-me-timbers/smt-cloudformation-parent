
package aws.codedeploy;

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
 * EC2TagSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ec2TagSetList"
})
public class EC2TagSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html#cfn-codedeploy-deploymentgroup-ec2tagset-ec2tagsetlist
     * 
     */
    @JsonProperty("Ec2TagSetList")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html#cfn-codedeploy-deploymentgroup-ec2tagset-ec2tagsetlist")
    private Set<EC2TagSetListObject> ec2TagSetList = new LinkedHashSet<EC2TagSetListObject>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html#cfn-codedeploy-deploymentgroup-ec2tagset-ec2tagsetlist
     * 
     */
    public Set<EC2TagSetListObject> getEc2TagSetList() {
        return ec2TagSetList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html#cfn-codedeploy-deploymentgroup-ec2tagset-ec2tagsetlist
     * 
     */
    public void setEc2TagSetList(Set<EC2TagSetListObject> ec2TagSetList) {
        this.ec2TagSetList = ec2TagSetList;
    }

    public EC2TagSet withEc2TagSetList(Set<EC2TagSetListObject> ec2TagSetList) {
        this.ec2TagSetList = ec2TagSetList;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ec2TagSetList", ec2TagSetList).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ec2TagSetList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2TagSet) == false) {
            return false;
        }
        EC2TagSet rhs = ((EC2TagSet) other);
        return new EqualsBuilder().append(ec2TagSetList, rhs.ec2TagSetList).isEquals();
    }

}
