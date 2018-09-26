
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RoleMapping
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "AmbiguousRoleResolution",
    "RulesConfiguration"
})
public class RoleMapping {

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
     * RulesConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
     * 
     */
    @JsonProperty("RulesConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html")
    private RulesConfigurationType rulesConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public RoleMapping withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution
     * 
     */
    public CharSequence getAmbiguousRoleResolution() {
        return ambiguousRoleResolution;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution
     * 
     */
    public void setAmbiguousRoleResolution(CharSequence ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
    }

    public RoleMapping withAmbiguousRoleResolution(CharSequence ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
        return this;
    }

    /**
     * RulesConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
     * 
     */
    public RulesConfigurationType getRulesConfiguration() {
        return rulesConfiguration;
    }

    /**
     * RulesConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
     * 
     */
    public void setRulesConfiguration(RulesConfigurationType rulesConfiguration) {
        this.rulesConfiguration = rulesConfiguration;
    }

    public RoleMapping withRulesConfiguration(RulesConfigurationType rulesConfiguration) {
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
        if ((other instanceof RoleMapping) == false) {
            return false;
        }
        RoleMapping rhs = ((RoleMapping) other);
        return new EqualsBuilder().append(rulesConfiguration, rhs.rulesConfiguration).append(type, rhs.type).append(ambiguousRoleResolution, rhs.ambiguousRoleResolution).isEquals();
    }

}
