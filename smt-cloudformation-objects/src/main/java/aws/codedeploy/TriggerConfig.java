
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
 * TriggerConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TriggerEvents",
    "TriggerName",
    "TriggerTargetArn"
})
public class TriggerConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents
     * 
     */
    @JsonProperty("TriggerEvents")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents")
    private Set<CharSequence> triggerEvents = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername
     * 
     */
    @JsonProperty("TriggerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername")
    private CharSequence triggerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn
     * 
     */
    @JsonProperty("TriggerTargetArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn")
    private CharSequence triggerTargetArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents
     * 
     */
    public Set<CharSequence> getTriggerEvents() {
        return triggerEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents
     * 
     */
    public void setTriggerEvents(Set<CharSequence> triggerEvents) {
        this.triggerEvents = triggerEvents;
    }

    public TriggerConfig withTriggerEvents(Set<CharSequence> triggerEvents) {
        this.triggerEvents = triggerEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername
     * 
     */
    public CharSequence getTriggerName() {
        return triggerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername
     * 
     */
    public void setTriggerName(CharSequence triggerName) {
        this.triggerName = triggerName;
    }

    public TriggerConfig withTriggerName(CharSequence triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn
     * 
     */
    public CharSequence getTriggerTargetArn() {
        return triggerTargetArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn
     * 
     */
    public void setTriggerTargetArn(CharSequence triggerTargetArn) {
        this.triggerTargetArn = triggerTargetArn;
    }

    public TriggerConfig withTriggerTargetArn(CharSequence triggerTargetArn) {
        this.triggerTargetArn = triggerTargetArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("triggerEvents", triggerEvents).append("triggerName", triggerName).append("triggerTargetArn", triggerTargetArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(triggerName).append(triggerTargetArn).append(triggerEvents).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TriggerConfig) == false) {
            return false;
        }
        TriggerConfig rhs = ((TriggerConfig) other);
        return new EqualsBuilder().append(triggerName, rhs.triggerName).append(triggerTargetArn, rhs.triggerTargetArn).append(triggerEvents, rhs.triggerEvents).isEquals();
    }

}
