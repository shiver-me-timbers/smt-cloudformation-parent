
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalingRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Action",
    "Description",
    "Name",
    "Trigger"
})
public class ScalingRule {

    /**
     * ScalingAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html")
    private ScalingAction action;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name")
    private CharSequence name;
    /**
     * ScalingTrigger
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html
     * 
     */
    @JsonProperty("Trigger")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html")
    private ScalingTrigger trigger;

    /**
     * ScalingAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html
     * 
     */
    public ScalingAction getAction() {
        return action;
    }

    /**
     * ScalingAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html
     * 
     */
    public void setAction(ScalingAction action) {
        this.action = action;
    }

    public ScalingRule withAction(ScalingAction action) {
        this.action = action;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ScalingRule withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ScalingRule withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * ScalingTrigger
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html
     * 
     */
    public ScalingTrigger getTrigger() {
        return trigger;
    }

    /**
     * ScalingTrigger
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html
     * 
     */
    public void setTrigger(ScalingTrigger trigger) {
        this.trigger = trigger;
    }

    public ScalingRule withTrigger(ScalingTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).append("description", description).append("name", name).append("trigger", trigger).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(action).append(description).append(trigger).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingRule) == false) {
            return false;
        }
        ScalingRule rhs = ((ScalingRule) other);
        return new EqualsBuilder().append(name, rhs.name).append(action, rhs.action).append(description, rhs.description).append(trigger, rhs.trigger).isEquals();
    }

}
