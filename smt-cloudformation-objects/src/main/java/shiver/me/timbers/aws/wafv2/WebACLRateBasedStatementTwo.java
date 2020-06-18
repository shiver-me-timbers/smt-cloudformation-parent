
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
 * WebACLRateBasedStatementTwo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Limit",
    "AggregateKeyType",
    "ScopeDownStatement"
})
public class WebACLRateBasedStatementTwo implements Property<WebACLRateBasedStatementTwo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-limit
     * 
     */
    @JsonProperty("Limit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-limit")
    private Number limit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-aggregatekeytype
     * 
     */
    @JsonProperty("AggregateKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-aggregatekeytype")
    private CharSequence aggregateKeyType;
    /**
     * WebACLStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html
     * 
     */
    @JsonProperty("ScopeDownStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html")
    private Property<WebACLStatementThree> scopeDownStatement;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-limit
     * 
     */
    @JsonIgnore
    public Number getLimit() {
        return limit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-limit
     * 
     */
    @JsonIgnore
    public void setLimit(Number limit) {
        this.limit = limit;
    }

    public WebACLRateBasedStatementTwo withLimit(Number limit) {
        this.limit = limit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-aggregatekeytype
     * 
     */
    @JsonIgnore
    public CharSequence getAggregateKeyType() {
        return aggregateKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementtwo.html#cfn-wafv2-webacl-ratebasedstatementtwo-aggregatekeytype
     * 
     */
    @JsonIgnore
    public void setAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
    }

    public WebACLRateBasedStatementTwo withAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
        return this;
    }

    /**
     * WebACLStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html
     * 
     */
    @JsonIgnore
    public Property<WebACLStatementThree> getScopeDownStatement() {
        return scopeDownStatement;
    }

    /**
     * WebACLStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html
     * 
     */
    @JsonIgnore
    public void setScopeDownStatement(Property<WebACLStatementThree> scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
    }

    public WebACLRateBasedStatementTwo withScopeDownStatement(Property<WebACLStatementThree> scopeDownStatement) {
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
        if ((other instanceof WebACLRateBasedStatementTwo) == false) {
            return false;
        }
        WebACLRateBasedStatementTwo rhs = ((WebACLRateBasedStatementTwo) other);
        return new EqualsBuilder().append(limit, rhs.limit).append(scopeDownStatement, rhs.scopeDownStatement).append(aggregateKeyType, rhs.aggregateKeyType).isEquals();
    }

}
