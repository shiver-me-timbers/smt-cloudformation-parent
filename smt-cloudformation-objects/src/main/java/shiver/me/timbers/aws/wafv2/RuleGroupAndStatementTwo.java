
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
 * RuleGroupAndStatementTwo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatementtwo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statements"
})
public class RuleGroupAndStatementTwo implements Property<RuleGroupAndStatementTwo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatementtwo.html#cfn-wafv2-rulegroup-andstatementtwo-statements
     * 
     */
    @JsonProperty("Statements")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatementtwo.html#cfn-wafv2-rulegroup-andstatementtwo-statements")
    private List<Property<RuleGroupStatementThree>> statements = new ArrayList<Property<RuleGroupStatementThree>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatementtwo.html#cfn-wafv2-rulegroup-andstatementtwo-statements
     * 
     */
    @JsonIgnore
    public List<Property<RuleGroupStatementThree>> getStatements() {
        return statements;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatementtwo.html#cfn-wafv2-rulegroup-andstatementtwo-statements
     * 
     */
    @JsonIgnore
    public void setStatements(List<Property<RuleGroupStatementThree>> statements) {
        this.statements = statements;
    }

    public RuleGroupAndStatementTwo withStatements(List<Property<RuleGroupStatementThree>> statements) {
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
        if ((other instanceof RuleGroupAndStatementTwo) == false) {
            return false;
        }
        RuleGroupAndStatementTwo rhs = ((RuleGroupAndStatementTwo) other);
        return new EqualsBuilder().append(statements, rhs.statements).isEquals();
    }

}
