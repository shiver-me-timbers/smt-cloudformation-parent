
package aws.dlm;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PolicyDetails
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceTypes",
    "Schedules",
    "TargetTags"
})
public class PolicyDetails implements Property<PolicyDetails>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetypes
     * 
     */
    @JsonProperty("ResourceTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetypes")
    private List<CharSequence> resourceTypes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules
     * 
     */
    @JsonProperty("Schedules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules")
    private List<Property<Schedule>> schedules = new ArrayList<Property<Schedule>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-targettags
     * 
     */
    @JsonProperty("TargetTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-targettags")
    private List<Property<Tag>> targetTags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetypes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetypes
     * 
     */
    @JsonIgnore
    public void setResourceTypes(List<CharSequence> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public PolicyDetails withResourceTypes(List<CharSequence> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules
     * 
     */
    @JsonIgnore
    public List<Property<Schedule>> getSchedules() {
        return schedules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules
     * 
     */
    @JsonIgnore
    public void setSchedules(List<Property<Schedule>> schedules) {
        this.schedules = schedules;
    }

    public PolicyDetails withSchedules(List<Property<Schedule>> schedules) {
        this.schedules = schedules;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-targettags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTargetTags() {
        return targetTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-targettags
     * 
     */
    @JsonIgnore
    public void setTargetTags(List<Property<Tag>> targetTags) {
        this.targetTags = targetTags;
    }

    public PolicyDetails withTargetTags(List<Property<Tag>> targetTags) {
        this.targetTags = targetTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceTypes", resourceTypes).append("schedules", schedules).append("targetTags", targetTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceTypes).append(targetTags).append(schedules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolicyDetails) == false) {
            return false;
        }
        PolicyDetails rhs = ((PolicyDetails) other);
        return new EqualsBuilder().append(resourceTypes, rhs.resourceTypes).append(targetTags, rhs.targetTags).append(schedules, rhs.schedules).isEquals();
    }

}
