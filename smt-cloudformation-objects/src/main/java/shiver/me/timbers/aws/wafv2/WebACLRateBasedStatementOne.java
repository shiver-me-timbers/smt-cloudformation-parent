
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
 * WebACLRateBasedStatementOne
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Limit",
    "AggregateKeyType",
    "ScopeDownStatement"
})
public class WebACLRateBasedStatementOne implements Property<WebACLRateBasedStatementOne>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-limit
     * 
     */
    @JsonProperty("Limit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-limit")
    private Number limit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-aggregatekeytype
     * 
     */
    @JsonProperty("AggregateKeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-aggregatekeytype")
    private CharSequence aggregateKeyType;
    /**
     * WebACLOrStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html
     * 
     */
    @JsonProperty("ScopeDownStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html")
    private Property<WebACLStatementTwo> scopeDownStatement;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-limit
     * 
     */
    @JsonIgnore
    public Number getLimit() {
        return limit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-limit
     * 
     */
    @JsonIgnore
    public void setLimit(Number limit) {
        this.limit = limit;
    }

    public WebACLRateBasedStatementOne withLimit(Number limit) {
        this.limit = limit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-aggregatekeytype
     * 
     */
    @JsonIgnore
    public CharSequence getAggregateKeyType() {
        return aggregateKeyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html#cfn-wafv2-webacl-ratebasedstatementone-aggregatekeytype
     * 
     */
    @JsonIgnore
    public void setAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
    }

    public WebACLRateBasedStatementOne withAggregateKeyType(CharSequence aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
        return this;
    }

    /**
     * WebACLOrStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html
     * 
     */
    @JsonIgnore
    public Property<WebACLStatementTwo> getScopeDownStatement() {
        return scopeDownStatement;
    }

    /**
     * WebACLOrStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html
     * 
     */
    @JsonIgnore
    public void setScopeDownStatement(Property<WebACLStatementTwo> scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
    }

    public WebACLRateBasedStatementOne withScopeDownStatement(Property<WebACLStatementTwo> scopeDownStatement) {
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
        if ((other instanceof WebACLRateBasedStatementOne) == false) {
            return false;
        }
        WebACLRateBasedStatementOne rhs = ((WebACLRateBasedStatementOne) other);
        return new EqualsBuilder().append(limit, rhs.limit).append(scopeDownStatement, rhs.scopeDownStatement).append(aggregateKeyType, rhs.aggregateKeyType).isEquals();
    }

}
