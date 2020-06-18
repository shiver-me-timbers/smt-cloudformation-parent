
package shiver.me.timbers.aws.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PrimaryTaskSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Cluster",
    "TaskSetId",
    "Service"
})
public class PrimaryTaskSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster
     * 
     */
    @JsonProperty("Cluster")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster")
    private CharSequence cluster;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid
     * 
     */
    @JsonProperty("TaskSetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid")
    private CharSequence taskSetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service
     * 
     */
    @JsonProperty("Service")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service")
    private CharSequence service;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster
     * 
     */
    @JsonIgnore
    public CharSequence getCluster() {
        return cluster;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster
     * 
     */
    @JsonIgnore
    public void setCluster(CharSequence cluster) {
        this.cluster = cluster;
    }

    public PrimaryTaskSet withCluster(CharSequence cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid
     * 
     */
    @JsonIgnore
    public CharSequence getTaskSetId() {
        return taskSetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid
     * 
     */
    @JsonIgnore
    public void setTaskSetId(CharSequence taskSetId) {
        this.taskSetId = taskSetId;
    }

    public PrimaryTaskSet withTaskSetId(CharSequence taskSetId) {
        this.taskSetId = taskSetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service
     * 
     */
    @JsonIgnore
    public CharSequence getService() {
        return service;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service
     * 
     */
    @JsonIgnore
    public void setService(CharSequence service) {
        this.service = service;
    }

    public PrimaryTaskSet withService(CharSequence service) {
        this.service = service;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cluster", cluster).append("taskSetId", taskSetId).append("service", service).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(taskSetId).append(cluster).append(service).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryTaskSet) == false) {
            return false;
        }
        PrimaryTaskSet rhs = ((PrimaryTaskSet) other);
        return new EqualsBuilder().append(taskSetId, rhs.taskSetId).append(cluster, rhs.cluster).append(service, rhs.service).isEquals();
    }

}
