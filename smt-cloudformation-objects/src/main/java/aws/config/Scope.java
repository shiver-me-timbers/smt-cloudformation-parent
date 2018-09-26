
package aws.config;

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
 * Scope
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComplianceResourceId",
    "ComplianceResourceTypes",
    "TagKey",
    "TagValue"
})
public class Scope {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid
     * 
     */
    @JsonProperty("ComplianceResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid")
    private CharSequence complianceResourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes
     * 
     */
    @JsonProperty("ComplianceResourceTypes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes")
    private Set<CharSequence> complianceResourceTypes = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey
     * 
     */
    @JsonProperty("TagKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey")
    private CharSequence tagKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue
     * 
     */
    @JsonProperty("TagValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue")
    private CharSequence tagValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid
     * 
     */
    public CharSequence getComplianceResourceId() {
        return complianceResourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid
     * 
     */
    public void setComplianceResourceId(CharSequence complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
    }

    public Scope withComplianceResourceId(CharSequence complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes
     * 
     */
    public Set<CharSequence> getComplianceResourceTypes() {
        return complianceResourceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes
     * 
     */
    public void setComplianceResourceTypes(Set<CharSequence> complianceResourceTypes) {
        this.complianceResourceTypes = complianceResourceTypes;
    }

    public Scope withComplianceResourceTypes(Set<CharSequence> complianceResourceTypes) {
        this.complianceResourceTypes = complianceResourceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey
     * 
     */
    public CharSequence getTagKey() {
        return tagKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey
     * 
     */
    public void setTagKey(CharSequence tagKey) {
        this.tagKey = tagKey;
    }

    public Scope withTagKey(CharSequence tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue
     * 
     */
    public CharSequence getTagValue() {
        return tagValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue
     * 
     */
    public void setTagValue(CharSequence tagValue) {
        this.tagValue = tagValue;
    }

    public Scope withTagValue(CharSequence tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("complianceResourceId", complianceResourceId).append("complianceResourceTypes", complianceResourceTypes).append("tagKey", tagKey).append("tagValue", tagValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(complianceResourceId).append(tagKey).append(complianceResourceTypes).append(tagValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scope) == false) {
            return false;
        }
        Scope rhs = ((Scope) other);
        return new EqualsBuilder().append(complianceResourceId, rhs.complianceResourceId).append(tagKey, rhs.tagKey).append(complianceResourceTypes, rhs.complianceResourceTypes).append(tagValue, rhs.tagValue).isEquals();
    }

}
