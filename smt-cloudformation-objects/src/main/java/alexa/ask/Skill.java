
package alexa.ask;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


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
     * AuthenticationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html
     * 
     */
    @JsonProperty("AuthenticationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html")
    private AuthenticationConfiguration authenticationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid
     * 
     */
    @JsonProperty("VendorId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid")
    private CharSequence vendorId;
    /**
     * SkillPackage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html
     * 
     */
    @JsonProperty("SkillPackage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html")
    private SkillPackage skillPackage;

    /**
     * AuthenticationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html
     * 
     */
    @JsonIgnore
    public AuthenticationConfiguration getAuthenticationConfiguration() {
        return authenticationConfiguration;
    }

    /**
     * AuthenticationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    public Skill withAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
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
     * SkillPackage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html
     * 
     */
    @JsonIgnore
    public SkillPackage getSkillPackage() {
        return skillPackage;
    }

    /**
     * SkillPackage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html
     * 
     */
    @JsonIgnore
    public void setSkillPackage(SkillPackage skillPackage) {
        this.skillPackage = skillPackage;
    }

    public Skill withSkillPackage(SkillPackage skillPackage) {
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
