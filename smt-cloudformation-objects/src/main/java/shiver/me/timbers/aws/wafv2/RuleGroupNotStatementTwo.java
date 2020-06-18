
package shiver.me.timbers.aws.wafv2;

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
 * RuleGroupNotStatementTwo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-notstatementtwo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statement"
})
public class RuleGroupNotStatementTwo implements Property<RuleGroupNotStatementTwo>
{

    /**
     * RuleGroupStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html
     * 
     */
    @JsonProperty("Statement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html")
    private Property<RuleGroupStatementThree> statement;

    /**
     * RuleGroupStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupStatementThree> getStatement() {
        return statement;
    }

    /**
     * RuleGroupStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html
     * 
     */
    @JsonIgnore
    public void setStatement(Property<RuleGroupStatementThree> statement) {
        this.statement = statement;
    }

    public RuleGroupNotStatementTwo withStatement(Property<RuleGroupStatementThree> statement) {
        this.statement = statement;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statement", statement).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statement).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupNotStatementTwo) == false) {
            return false;
        }
        RuleGroupNotStatementTwo rhs = ((RuleGroupNotStatementTwo) other);
        return new EqualsBuilder().append(statement, rhs.statement).isEquals();
    }

}
