
package shiver.me.timbers.aws.eks;

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
 * ClusterProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KeyArn"
})
public class ClusterProvider implements Property<ClusterProvider>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html#cfn-eks-cluster-provider-keyarn
     * 
     */
    @JsonProperty("KeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html#cfn-eks-cluster-provider-keyarn")
    private CharSequence keyArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html#cfn-eks-cluster-provider-keyarn
     * 
     */
    @JsonIgnore
    public CharSequence getKeyArn() {
        return keyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html#cfn-eks-cluster-provider-keyarn
     * 
     */
    @JsonIgnore
    public void setKeyArn(CharSequence keyArn) {
        this.keyArn = keyArn;
    }

    public ClusterProvider withKeyArn(CharSequence keyArn) {
        this.keyArn = keyArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("keyArn", keyArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterProvider) == false) {
            return false;
        }
        ClusterProvider rhs = ((ClusterProvider) other);
        return new EqualsBuilder().append(keyArn, rhs.keyArn).isEquals();
    }

}
