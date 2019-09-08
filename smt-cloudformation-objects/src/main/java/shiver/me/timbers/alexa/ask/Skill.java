
package shiver.me.timbers.alexa.ask;

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
 * Skill
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AuthenticationConfiguration",
    "VendorId",
    "SkillPackage"
})
public class Skill {

    /**
     * SkillAuthenticationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html
     * 
     */
    @JsonProperty("AuthenticationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html")
    private Property<SkillAuthenticationConfiguration> authenticationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid
     * 
     */
    @JsonProperty("VendorId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid")
    private CharSequence vendorId;
    /**
     * SkillSkillPackage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html
     * 
     */
    @JsonProperty("SkillPackage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html")
    private Property<SkillSkillPackage> skillPackage;

    /**
     * SkillAuthenticationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<SkillAuthenticationConfiguration> getAuthenticationConfiguration() {
        return authenticationConfiguration;
    }

    /**
     * SkillAuthenticationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAuthenticationConfiguration(Property<SkillAuthenticationConfiguration> authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    public Skill withAuthenticationConfiguration(Property<SkillAuthenticationConfiguration> authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid
     * 
     */
    @JsonIgnore
    public CharSequence getVendorId() {
        return vendorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid
     * 
     */
    @JsonIgnore
    public void setVendorId(CharSequence vendorId) {
        this.vendorId = vendorId;
    }

    public Skill withVendorId(CharSequence vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    /**
     * SkillSkillPackage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html
     * 
     */
    @JsonIgnore
    public Property<SkillSkillPackage> getSkillPackage() {
        return skillPackage;
    }

    /**
     * SkillSkillPackage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html
     * 
     */
    @JsonIgnore
    public void setSkillPackage(Property<SkillSkillPackage> skillPackage) {
        this.skillPackage = skillPackage;
    }

    public Skill withSkillPackage(Property<SkillSkillPackage> skillPackage) {
        this.skillPackage = skillPackage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("authenticationConfiguration", authenticationConfiguration).append("vendorId", vendorId).append("skillPackage", skillPackage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vendorId).append(skillPackage).append(authenticationConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Skill) == false) {
            return false;
        }
        Skill rhs = ((Skill) other);
        return new EqualsBuilder().append(vendorId, rhs.vendorId).append(skillPackage, rhs.skillPackage).append(authenticationConfiguration, rhs.authenticationConfiguration).isEquals();
    }

}
