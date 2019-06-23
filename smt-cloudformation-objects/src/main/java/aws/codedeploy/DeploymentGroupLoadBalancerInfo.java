
package aws.codedeploy;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeploymentGroupLoadBalancerInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ElbInfoList",
    "TargetGroupInfoList"
})
public class DeploymentGroupLoadBalancerInfo implements Property<DeploymentGroupLoadBalancerInfo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist
     * 
     */
    @JsonProperty("ElbInfoList")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist")
    private Set<Property<DeploymentGroupELBInfo>> elbInfoList = new LinkedHashSet<Property<DeploymentGroupELBInfo>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist
     * 
     */
    @JsonProperty("TargetGroupInfoList")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist")
    private Set<Property<DeploymentGroupTargetGroupInfo>> targetGroupInfoList = new LinkedHashSet<Property<DeploymentGroupTargetGroupInfo>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupELBInfo>> getElbInfoList() {
        return elbInfoList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist
     * 
     */
    @JsonIgnore
    public void setElbInfoList(Set<Property<DeploymentGroupELBInfo>> elbInfoList) {
        this.elbInfoList = elbInfoList;
    }

    public DeploymentGroupLoadBalancerInfo withElbInfoList(Set<Property<DeploymentGroupELBInfo>> elbInfoList) {
        this.elbInfoList = elbInfoList;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupTargetGroupInfo>> getTargetGroupInfoList() {
        return targetGroupInfoList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist
     * 
     */
    @JsonIgnore
    public void setTargetGroupInfoList(Set<Property<DeploymentGroupTargetGroupInfo>> targetGroupInfoList) {
        this.targetGroupInfoList = targetGroupInfoList;
    }

    public DeploymentGroupLoadBalancerInfo withTargetGroupInfoList(Set<Property<DeploymentGroupTargetGroupInfo>> targetGroupInfoList) {
        this.targetGroupInfoList = targetGroupInfoList;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("elbInfoList", elbInfoList).append("targetGroupInfoList", targetGroupInfoList).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(elbInfoList).append(targetGroupInfoList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentGroupLoadBalancerInfo) == false) {
            return false;
        }
        DeploymentGroupLoadBalancerInfo rhs = ((DeploymentGroupLoadBalancerInfo) other);
        return new EqualsBuilder().append(elbInfoList, rhs.elbInfoList).append(targetGroupInfoList, rhs.targetGroupInfoList).isEquals();
    }

}
