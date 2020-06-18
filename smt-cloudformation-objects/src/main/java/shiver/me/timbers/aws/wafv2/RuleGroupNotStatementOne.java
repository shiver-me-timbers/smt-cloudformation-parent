
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
 * RuleGroupNotStatementOne
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-notstatementone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statement"
})
public class RuleGroupNotStatementOne implements Property<RuleGroupNotStatementOne>
{

    /**
     * RuleGroupRateBasedStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html
     * 
     */
    @JsonProperty("Statement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html")
    private Property<RuleGroupStatementTwo> statement;

    /**
     * RuleGroupRateBasedStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupStatementTwo> getStatement() {
        return statement;
    }

    /**
     * RuleGroupRateBasedStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html
     * 
     */
    @JsonIgnore
    public void setStatement(Property<RuleGroupStatementTwo> statement) {
        this.statement = statement;
    }

    public RuleGroupNotStatementOne withStatement(Property<RuleGroupStatementTwo> statement) {
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
        if ((other instanceof RuleGroupNotStatementOne) == false) {
            return false;
        }
        RuleGroupNotStatementOne rhs = ((RuleGroupNotStatementOne) other);
        return new EqualsBuilder().append(statement, rhs.statement).isEquals();
    }

}
