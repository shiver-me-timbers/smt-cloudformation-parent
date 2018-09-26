
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Cluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ClusterName"
})
public class Cluster {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername
     * 
     */
    @JsonProperty("ClusterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername")
    private CharSequence clusterName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername
     * 
     */
    public CharSequence getClusterName() {
        return clusterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername
     * 
     */
    public void setClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
    }

    public Cluster withClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clusterName", clusterName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clusterName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cluster) == false) {
            return false;
        }
        Cluster rhs = ((Cluster) other);
        return new EqualsBuilder().append(clusterName, rhs.clusterName).isEquals();
    }

}
