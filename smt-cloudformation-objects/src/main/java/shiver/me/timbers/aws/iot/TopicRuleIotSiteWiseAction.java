
package shiver.me.timbers.aws.iot;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TopicRuleIotSiteWiseAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PutAssetPropertyValueEntries",
    "RoleArn"
})
public class TopicRuleIotSiteWiseAction implements Property<TopicRuleIotSiteWiseAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-putassetpropertyvalueentries
     * 
     */
    @JsonProperty("PutAssetPropertyValueEntries")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-putassetpropertyvalueentries")
    private Set<Property<TopicRulePutAssetPropertyValueEntry>> putAssetPropertyValueEntries = new LinkedHashSet<Property<TopicRulePutAssetPropertyValueEntry>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-putassetpropertyvalueentries
     * 
     */
    @JsonIgnore
    public Set<Property<TopicRulePutAssetPropertyValueEntry>> getPutAssetPropertyValueEntries() {
        return putAssetPropertyValueEntries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-putassetpropertyvalueentries
     * 
     */
    @JsonIgnore
    public void setPutAssetPropertyValueEntries(Set<Property<TopicRulePutAssetPropertyValueEntry>> putAssetPropertyValueEntries) {
        this.putAssetPropertyValueEntries = putAssetPropertyValueEntries;
    }

    public TopicRuleIotSiteWiseAction withPutAssetPropertyValueEntries(Set<Property<TopicRulePutAssetPropertyValueEntry>> putAssetPropertyValueEntries) {
        this.putAssetPropertyValueEntries = putAssetPropertyValueEntries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public TopicRuleIotSiteWiseAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("putAssetPropertyValueEntries", putAssetPropertyValueEntries).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(putAssetPropertyValueEntries).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRuleIotSiteWiseAction) == false) {
            return false;
        }
        TopicRuleIotSiteWiseAction rhs = ((TopicRuleIotSiteWiseAction) other);
        return new EqualsBuilder().append(putAssetPropertyValueEntries, rhs.putAssetPropertyValueEntries).append(roleArn, rhs.roleArn).isEquals();
    }

}
