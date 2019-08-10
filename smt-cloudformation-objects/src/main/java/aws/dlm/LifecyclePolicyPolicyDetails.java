
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
 * LifecyclePolicyPolicyDetails
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceTypes",
    "Schedules",
    "PolicyType",
    "Parameters",
    "TargetTags"
})
public class LifecyclePolicyPolicyDetails implements Property<LifecyclePolicyPolicyDetails>
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
    private List<Property<LifecyclePolicySchedule>> schedules = new ArrayList<Property<LifecyclePolicySchedule>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policytype
     * 
     */
    @JsonProperty("PolicyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policytype")
    private CharSequence policyType;
    /**
     * LifecyclePolicyParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html")
    private Property<LifecyclePolicyParameters> parameters;
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

    public LifecyclePolicyPolicyDetails withResourceTypes(List<CharSequence> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules
     * 
     */
    @JsonIgnore
    public List<Property<LifecyclePolicySchedule>> getSchedules() {
        return schedules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules
     * 
     */
    @JsonIgnore
    public void setSchedules(List<Property<LifecyclePolicySchedule>> schedules) {
        this.schedules = schedules;
    }

    public LifecyclePolicyPolicyDetails withSchedules(List<Property<LifecyclePolicySchedule>> schedules) {
        this.schedules = schedules;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policytype
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policytype
     * 
     */
    @JsonIgnore
    public void setPolicyType(CharSequence policyType) {
        this.policyType = policyType;
    }

    public LifecyclePolicyPolicyDetails withPolicyType(CharSequence policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * LifecyclePolicyParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html
     * 
     */
    @JsonIgnore
    public Property<LifecyclePolicyParameters> getParameters() {
        return parameters;
    }

    /**
     * LifecyclePolicyParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html
     * 
     */
    @JsonIgnore
    public void setParameters(Property<LifecyclePolicyParameters> parameters) {
        this.parameters = parameters;
    }

    public LifecyclePolicyPolicyDetails withParameters(Property<LifecyclePolicyParameters> parameters) {
        this.parameters = parameters;
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

    public LifecyclePolicyPolicyDetails withTargetTags(List<Property<Tag>> targetTags) {
        this.targetTags = targetTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceTypes", resourceTypes).append("schedules", schedules).append("policyType", policyType).append("parameters", parameters).append("targetTags", targetTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceTypes).append(targetTags).append(parameters).append(schedules).append(policyType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicyPolicyDetails) == false) {
            return false;
        }
        LifecyclePolicyPolicyDetails rhs = ((LifecyclePolicyPolicyDetails) other);
        return new EqualsBuilder().append(resourceTypes, rhs.resourceTypes).append(targetTags, rhs.targetTags).append(parameters, rhs.parameters).append(schedules, rhs.schedules).append(policyType, rhs.policyType).isEquals();
    }

}
