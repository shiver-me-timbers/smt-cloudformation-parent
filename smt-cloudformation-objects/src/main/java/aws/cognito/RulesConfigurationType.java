
package aws.cognito;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RulesConfigurationType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Rules"
})
public class RulesConfigurationType {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules")
    private List<MappingRule> rules = new ArrayList<MappingRule>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules
     * 
     */
    public List<MappingRule> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules
     * 
     */
    public void setRules(List<MappingRule> rules) {
        this.rules = rules;
    }

    public RulesConfigurationType withRules(List<MappingRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rules", rules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RulesConfigurationType) == false) {
            return false;
        }
        RulesConfigurationType rhs = ((RulesConfigurationType) other);
        return new EqualsBuilder().append(rules, rhs.rules).isEquals();
    }

}
