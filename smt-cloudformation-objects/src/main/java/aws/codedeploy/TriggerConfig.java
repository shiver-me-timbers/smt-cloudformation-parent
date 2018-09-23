
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
    private Set<String> triggerEvents = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername
     * 
     */
    @JsonProperty("TriggerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername")
    private String triggerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn
     * 
     */
    @JsonProperty("TriggerTargetArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn")
    private String triggerTargetArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents
     * 
     */
    @JsonProperty("TriggerEvents")
    public Set<String> getTriggerEvents() {
        return triggerEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents
     * 
     */
    @JsonProperty("TriggerEvents")
    public void setTriggerEvents(Set<String> triggerEvents) {
        this.triggerEvents = triggerEvents;
    }

    public TriggerConfig withTriggerEvents(Set<String> triggerEvents) {
        this.triggerEvents = triggerEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername
     * 
     */
    @JsonProperty("TriggerName")
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername
     * 
     */
    @JsonProperty("TriggerName")
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public TriggerConfig withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn
     * 
     */
    @JsonProperty("TriggerTargetArn")
    public String getTriggerTargetArn() {
        return triggerTargetArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn
     * 
     */
    @JsonProperty("TriggerTargetArn")
    public void setTriggerTargetArn(String triggerTargetArn) {
        this.triggerTargetArn = triggerTargetArn;
    }

    public TriggerConfig withTriggerTargetArn(String triggerTargetArn) {
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