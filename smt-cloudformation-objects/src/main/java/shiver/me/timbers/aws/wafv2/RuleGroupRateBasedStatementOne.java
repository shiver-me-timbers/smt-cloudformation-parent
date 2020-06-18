
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
 * RuleGroupRateBasedStatementOne
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Limit",
    "AggregateKeyType",
    "ScopeDownStatement"
})
public class RuleGroupRateBasedStatementOne implements Property<RuleGroupRateBasedStatementOne>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-limit
     * 
     */
    @JsonProperty("Limit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-limit")
    private Number limit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-aggregatekeytype
     * 
     */
    @JsonProperty("AggregateKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-aggregatekeytype")
    private CharSequence aggregateKeyType;
    /**
     * RuleGroupRateBasedStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html
     * 
     */
    @JsonProperty("ScopeDownStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html")
    private Property<RuleGroupStatementTwo> scopeDownStatement;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-limit
     * 
     */
    @JsonIgnore
    public Number getLimit() {
        return limit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-limit
     * 
     */
    @JsonIgnore
    public void setLimit(Number limit) {
        this.limit = limit;
    }

    public RuleGroupRateBasedStatementOne withLimit(Number limit) {
        this.limit = limit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-aggregatekeytype
     * 
     */
    @JsonIgnore
    public CharSequence getAggregateKeyType() {
        return aggregateKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementone.html#cfn-wafv2-rulegroup-ratebasedstatementone-aggregatekeytype
     * 
     */
    @JsonIgnore
    public void setAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
    }

    public RuleGroupRateBasedStatementOne withAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
        return this;
    }

    /**
     * RuleGroupRateBasedStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupStatementTwo> getScopeDownStatement() {
        return scopeDownStatement;
    }

    /**
     * RuleGroupRateBasedStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementtwo.html
     * 
     */
    @JsonIgnore
    public void setScopeDownStatement(Property<RuleGroupStatementTwo> scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
    }

    public RuleGroupRateBasedStatementOne withScopeDownStatement(Property<RuleGroupStatementTwo> scopeDownStatement) {
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
        if ((other instanceof RuleGroupRateBasedStatementOne) == false) {
            return false;
        }
        RuleGroupRateBasedStatementOne rhs = ((RuleGroupRateBasedStatementOne) other);
        return new EqualsBuilder().append(limit, rhs.limit).append(scopeDownStatement, rhs.scopeDownStatement).append(aggregateKeyType, rhs.aggregateKeyType).isEquals();
    }

}
