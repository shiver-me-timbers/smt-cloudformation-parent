
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
 * RuleGroupRateBasedStatementTwo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Limit",
    "AggregateKeyType",
    "ScopeDownStatement"
})
public class RuleGroupRateBasedStatementTwo implements Property<RuleGroupRateBasedStatementTwo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-limit
     * 
     */
    @JsonProperty("Limit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-limit")
    private Number limit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-aggregatekeytype
     * 
     */
    @JsonProperty("AggregateKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-aggregatekeytype")
    private CharSequence aggregateKeyType;
    /**
     * RuleGroupStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html
     * 
     */
    @JsonProperty("ScopeDownStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html")
    private Property<RuleGroupStatementThree> scopeDownStatement;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-limit
     * 
     */
    @JsonIgnore
    public Number getLimit() {
        return limit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-limit
     * 
     */
    @JsonIgnore
    public void setLimit(Number limit) {
        this.limit = limit;
    }

    public RuleGroupRateBasedStatementTwo withLimit(Number limit) {
        this.limit = limit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-aggregatekeytype
     * 
     */
    @JsonIgnore
    public CharSequence getAggregateKeyType() {
        return aggregateKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html#cfn-wafv2-rulegroup-ratebasedstatementtwo-aggregatekeytype
     * 
     */
    @JsonIgnore
    public void setAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
    }

    public RuleGroupRateBasedStatementTwo withAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
        return this;
    }

    /**
     * RuleGroupStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupStatementThree> getScopeDownStatement() {
        return scopeDownStatement;
    }

    /**
     * RuleGroupStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html
     * 
     */
    @JsonIgnore
    public void setScopeDownStatement(Property<RuleGroupStatementThree> scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
    }

    public RuleGroupRateBasedStatementTwo withScopeDownStatement(Property<RuleGroupStatementThree> scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("limit", limit).append("aggregateKeyType", aggregateKeyType).append("scopeDownStatement", scopeDownStatement).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(limit).append(scopeDownStatement).append(aggregateKeyType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupRateBasedStatementTwo) == false) {
            return false;
        }
        RuleGroupRateBasedStatementTwo rhs = ((RuleGroupRateBasedStatementTwo) other);
        return new EqualsBuilder().append(limit, rhs.limit).append(scopeDownStatement, rhs.scopeDownStatement).append(aggregateKeyType, rhs.aggregateKeyType).isEquals();
    }

}
