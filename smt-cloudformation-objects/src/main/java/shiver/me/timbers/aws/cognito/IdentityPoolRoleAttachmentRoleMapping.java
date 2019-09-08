
package shiver.me.timbers.aws.cognito;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * IdentityPoolRoleAttachmentRoleMapping
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "AmbiguousRoleResolution",
    "RulesConfiguration"
})
public class IdentityPoolRoleAttachmentRoleMapping implements Property<IdentityPoolRoleAttachmentRoleMapping>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution
     * 
     */
    @JsonProperty("AmbiguousRoleResolution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution")
    private CharSequence ambiguousRoleResolution;
    /**
     * IdentityPoolRoleAttachmentRulesConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
     * 
     */
    @JsonProperty("RulesConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html")
    private Property<IdentityPoolRoleAttachmentRulesConfigurationType> rulesConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public IdentityPoolRoleAttachmentRoleMapping withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution
     * 
     */
    @JsonIgnore
    public CharSequence getAmbiguousRoleResolution() {
        return ambiguousRoleResolution;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution
     * 
     */
    @JsonIgnore
    public void setAmbiguousRoleResolution(CharSequence ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
    }

    public IdentityPoolRoleAttachmentRoleMapping withAmbiguousRoleResolution(CharSequence ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
        return this;
    }

    /**
     * IdentityPoolRoleAttachmentRulesConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
     * 
     */
    @JsonIgnore
    public Property<IdentityPoolRoleAttachmentRulesConfigurationType> getRulesConfiguration() {
        return rulesConfiguration;
    }

    /**
     * IdentityPoolRoleAttachmentRulesConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
     * 
     */
    @JsonIgnore
    public void setRulesConfiguration(Property<IdentityPoolRoleAttachmentRulesConfigurationType> rulesConfiguration) {
        this.rulesConfiguration = rulesConfiguration;
    }

    public IdentityPoolRoleAttachmentRoleMapping withRulesConfiguration(Property<IdentityPoolRoleAttachmentRulesConfigurationType> rulesConfiguration) {
        this.rulesConfiguration = rulesConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("ambiguousRoleResolution", ambiguousRoleResolution).append("rulesConfiguration", rulesConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rulesConfiguration).append(type).append(ambiguousRoleResolution).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentityPoolRoleAttachmentRoleMapping) == false) {
            return false;
        }
        IdentityPoolRoleAttachmentRoleMapping rhs = ((IdentityPoolRoleAttachmentRoleMapping) other);
        return new EqualsBuilder().append(rulesConfiguration, rhs.rulesConfiguration).append(type, rhs.type).append(ambiguousRoleResolution, rhs.ambiguousRoleResolution).isEquals();
    }

}
