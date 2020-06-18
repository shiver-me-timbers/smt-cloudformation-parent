
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
 * RuleGroupOrStatementOne
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statements"
})
public class RuleGroupOrStatementOne implements Property<RuleGroupOrStatementOne>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html#cfn-wafv2-rulegroup-orstatementone-statements
     * 
     */
    @JsonProperty("Statements")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html#cfn-wafv2-rulegroup-orstatementone-statements")
    private List<Property<RuleGroupStatementTwo>> statements = new ArrayList<Property<RuleGroupStatementTwo>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html#cfn-wafv2-rulegroup-orstatementone-statements
     * 
     */
    @JsonIgnore
    public List<Property<RuleGroupStatementTwo>> getStatements() {
        return statements;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html#cfn-wafv2-rulegroup-orstatementone-statements
     * 
     */
    @JsonIgnore
    public void setStatements(List<Property<RuleGroupStatementTwo>> statements) {
        this.statements = statements;
    }

    public RuleGroupOrStatementOne withStatements(List<Property<RuleGroupStatementTwo>> statements) {
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
        if ((other instanceof RuleGroupOrStatementOne) == false) {
            return false;
        }
        RuleGroupOrStatementOne rhs = ((RuleGroupOrStatementOne) other);
        return new EqualsBuilder().append(statements, rhs.statements).isEquals();
    }

}
