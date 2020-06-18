
package shiver.me.timbers.aws.wafv2;

import java.util.ArrayList;
import java.util.List;
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
 * RuleGroupOrStatementTwo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementtwo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statements"
})
public class RuleGroupOrStatementTwo implements Property<RuleGroupOrStatementTwo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementtwo.html#cfn-wafv2-rulegroup-orstatementtwo-statements
     * 
     */
    @JsonProperty("Statements")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementtwo.html#cfn-wafv2-rulegroup-orstatementtwo-statements")
    private List<Property<RuleGroupStatementThree>> statements = new ArrayList<Property<RuleGroupStatementThree>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementtwo.html#cfn-wafv2-rulegroup-orstatementtwo-statements
     * 
     */
    @JsonIgnore
    public List<Property<RuleGroupStatementThree>> getStatements() {
        return statements;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementtwo.html#cfn-wafv2-rulegroup-orstatementtwo-statements
     * 
     */
    @JsonIgnore
    public void setStatements(List<Property<RuleGroupStatementThree>> statements) {
        this.statements = statements;
    }

    public RuleGroupOrStatementTwo withStatements(List<Property<RuleGroupStatementThree>> statements) {
        this.statements = statements;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statements", statements).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statements).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupOrStatementTwo) == false) {
            return false;
        }
        RuleGroupOrStatementTwo rhs = ((RuleGroupOrStatementTwo) other);
        return new EqualsBuilder().append(statements, rhs.statements).isEquals();
    }

}
