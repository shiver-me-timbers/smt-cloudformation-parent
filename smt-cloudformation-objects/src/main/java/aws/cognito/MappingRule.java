
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MappingRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MatchType",
    "Value",
    "Claim",
    "RoleARN"
})
public class MappingRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype
     * 
     */
    @JsonProperty("MatchType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype")
    private CharSequence matchType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value")
    private CharSequence value;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim
     * 
     */
    @JsonProperty("Claim")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim")
    private CharSequence claim;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn")
    private CharSequence roleARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype
     * 
     */
    public CharSequence getMatchType() {
        return matchType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype
     * 
     */
    public void setMatchType(CharSequence matchType) {
        this.matchType = matchType;
    }

    public MappingRule withMatchType(CharSequence matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public MappingRule withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim
     * 
     */
    public CharSequence getClaim() {
        return claim;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim
     * 
     */
    public void setClaim(CharSequence claim) {
        this.claim = claim;
    }

    public MappingRule withClaim(CharSequence claim) {
        this.claim = claim;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn
     * 
     */
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn
     * 
     */
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public MappingRule withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("matchType", matchType).append("value", value).append("claim", claim).append("roleARN", roleARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(claim).append(value).append(matchType).append(roleARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MappingRule) == false) {
            return false;
        }
        MappingRule rhs = ((MappingRule) other);
        return new EqualsBuilder().append(claim, rhs.claim).append(value, rhs.value).append(matchType, rhs.matchType).append(roleARN, rhs.roleARN).isEquals();
    }

}
