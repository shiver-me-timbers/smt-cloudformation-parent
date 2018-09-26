
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
 * LoadBalancerInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ElbInfoList",
    "TargetGroupInfoList"
})
public class LoadBalancerInfo {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist
     * 
     */
    @JsonProperty("ElbInfoList")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist")
    private Set<ELBInfo> elbInfoList = new LinkedHashSet<ELBInfo>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist
     * 
     */
    @JsonProperty("TargetGroupInfoList")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist")
    private Set<TargetGroupInfo> targetGroupInfoList = new LinkedHashSet<TargetGroupInfo>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist
     * 
     */
    public Set<ELBInfo> getElbInfoList() {
        return elbInfoList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist
     * 
     */
    public void setElbInfoList(Set<ELBInfo> elbInfoList) {
        this.elbInfoList = elbInfoList;
    }

    public LoadBalancerInfo withElbInfoList(Set<ELBInfo> elbInfoList) {
        this.elbInfoList = elbInfoList;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist
     * 
     */
    public Set<TargetGroupInfo> getTargetGroupInfoList() {
        return targetGroupInfoList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist
     * 
     */
    public void setTargetGroupInfoList(Set<TargetGroupInfo> targetGroupInfoList) {
        this.targetGroupInfoList = targetGroupInfoList;
    }

    public LoadBalancerInfo withTargetGroupInfoList(Set<TargetGroupInfo> targetGroupInfoList) {
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
        if ((other instanceof LoadBalancerInfo) == false) {
            return false;
        }
        LoadBalancerInfo rhs = ((LoadBalancerInfo) other);
        return new EqualsBuilder().append(elbInfoList, rhs.elbInfoList).append(targetGroupInfoList, rhs.targetGroupInfoList).isEquals();
    }

}
