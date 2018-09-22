
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
    private String complianceResourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes
     * 
     */
    @JsonProperty("ComplianceResourceTypes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes")
    private Set<String> complianceResourceTypes = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey
     * 
     */
    @JsonProperty("TagKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey")
    private String tagKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue
     * 
     */
    @JsonProperty("TagValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue")
    private String tagValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid
     * 
     */
    @JsonProperty("ComplianceResourceId")
    public String getComplianceResourceId() {
        return complianceResourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid
     * 
     */
    @JsonProperty("ComplianceResourceId")
    public void setComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
    }

    public Scope withComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes
     * 
     */
    @JsonProperty("ComplianceResourceTypes")
    public Set<String> getComplianceResourceTypes() {
        return complianceResourceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes
     * 
     */
    @JsonProperty("ComplianceResourceTypes")
    public void setComplianceResourceTypes(Set<String> complianceResourceTypes) {
        this.complianceResourceTypes = complianceResourceTypes;
    }

    public Scope withComplianceResourceTypes(Set<String> complianceResourceTypes) {
        this.complianceResourceTypes = complianceResourceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey
     * 
     */
    @JsonProperty("TagKey")
    public String getTagKey() {
        return tagKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey
     * 
     */
    @JsonProperty("TagKey")
    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public Scope withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue
     * 
     */
    @JsonProperty("TagValue")
    public String getTagValue() {
        return tagValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue
     * 
     */
    @JsonProperty("TagValue")
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public Scope withTagValue(String tagValue) {
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
