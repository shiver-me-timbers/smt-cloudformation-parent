
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
 * WebACLStatementOne
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ByteMatchStatement",
    "SqliMatchStatement",
    "XssMatchStatement",
    "SizeConstraintStatement",
    "GeoMatchStatement",
    "RuleGroupReferenceStatement",
    "IPSetReferenceStatement",
    "RegexPatternSetReferenceStatement",
    "ManagedRuleGroupStatement",
    "RateBasedStatement",
    "AndStatement",
    "OrStatement",
    "NotStatement"
})
public class WebACLStatementOne implements Property<WebACLStatementOne>
{

    /**
     * WebACLByteMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html
     * 
     */
    @JsonProperty("ByteMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html")
    private Property<WebACLByteMatchStatement> byteMatchStatement;
    /**
     * WebACLSqliMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html
     * 
     */
    @JsonProperty("SqliMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html")
    private Property<WebACLSqliMatchStatement> sqliMatchStatement;
    /**
     * WebACLXssMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html
     * 
     */
    @JsonProperty("XssMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html")
    private Property<WebACLXssMatchStatement> xssMatchStatement;
    /**
     * WebACLSizeConstraintStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html
     * 
     */
    @JsonProperty("SizeConstraintStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html")
    private Property<WebACLSizeConstraintStatement> sizeConstraintStatement;
    /**
     * WebACLGeoMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html
     * 
     */
    @JsonProperty("GeoMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html")
    private Property<WebACLGeoMatchStatement> geoMatchStatement;
    /**
     * WebACLRuleGroupReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html
     * 
     */
    @JsonProperty("RuleGroupReferenceStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html")
    private Property<WebACLRuleGroupReferenceStatement> ruleGroupReferenceStatement;
    /**
     * WebACLIPSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html
     * 
     */
    @JsonProperty("IPSetReferenceStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html")
    private Property<WebACLIPSetReferenceStatement> iPSetReferenceStatement;
    /**
     * WebACLRegexPatternSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html
     * 
     */
    @JsonProperty("RegexPatternSetReferenceStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html")
    private Property<WebACLRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement;
    /**
     * WebACLManagedRuleGroupStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html
     * 
     */
    @JsonProperty("ManagedRuleGroupStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html")
    private Property<WebACLManagedRuleGroupStatement> managedRuleGroupStatement;
    /**
     * WebACLRateBasedStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html
     * 
     */
    @JsonProperty("RateBasedStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html")
    private Property<WebACLRateBasedStatementOne> rateBasedStatement;
    /**
     * WebACLAndStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html
     * 
     */
    @JsonProperty("AndStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html")
    private Property<WebACLAndStatementOne> andStatement;
    /**
     * WebACLOrStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementone.html
     * 
     */
    @JsonProperty("OrStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementone.html")
    private Property<WebACLOrStatementOne> orStatement;
    /**
     * WebACLNotStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatementone.html
     * 
     */
    @JsonProperty("NotStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatementone.html")
    private Property<WebACLNotStatementOne> notStatement;

    /**
     * WebACLByteMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLByteMatchStatement> getByteMatchStatement() {
        return byteMatchStatement;
    }

    /**
     * WebACLByteMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html
     * 
     */
    @JsonIgnore
    public void setByteMatchStatement(Property<WebACLByteMatchStatement> byteMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
    }

    public WebACLStatementOne withByteMatchStatement(Property<WebACLByteMatchStatement> byteMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        return this;
    }

    /**
     * WebACLSqliMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLSqliMatchStatement> getSqliMatchStatement() {
        return sqliMatchStatement;
    }

    /**
     * WebACLSqliMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html
     * 
     */
    @JsonIgnore
    public void setSqliMatchStatement(Property<WebACLSqliMatchStatement> sqliMatchStatement) {
        this.sqliMatchStatement = sqliMatchStatement;
    }

    public WebACLStatementOne withSqliMatchStatement(Property<WebACLSqliMatchStatement> sqliMatchStatement) {
        this.sqliMatchStatement = sqliMatchStatement;
        return this;
    }

    /**
     * WebACLXssMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLXssMatchStatement> getXssMatchStatement() {
        return xssMatchStatement;
    }

    /**
     * WebACLXssMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html
     * 
     */
    @JsonIgnore
    public void setXssMatchStatement(Property<WebACLXssMatchStatement> xssMatchStatement) {
        this.xssMatchStatement = xssMatchStatement;
    }

    public WebACLStatementOne withXssMatchStatement(Property<WebACLXssMatchStatement> xssMatchStatement) {
        this.xssMatchStatement = xssMatchStatement;
        return this;
    }

    /**
     * WebACLSizeConstraintStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLSizeConstraintStatement> getSizeConstraintStatement() {
        return sizeConstraintStatement;
    }

    /**
     * WebACLSizeConstraintStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html
     * 
     */
    @JsonIgnore
    public void setSizeConstraintStatement(Property<WebACLSizeConstraintStatement> sizeConstraintStatement) {
        this.sizeConstraintStatement = sizeConstraintStatement;
    }

    public WebACLStatementOne withSizeConstraintStatement(Property<WebACLSizeConstraintStatement> sizeConstraintStatement) {
        this.sizeConstraintStatement = sizeConstraintStatement;
        return this;
    }

    /**
     * WebACLGeoMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLGeoMatchStatement> getGeoMatchStatement() {
        return geoMatchStatement;
    }

    /**
     * WebACLGeoMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html
     * 
     */
    @JsonIgnore
    public void setGeoMatchStatement(Property<WebACLGeoMatchStatement> geoMatchStatement) {
        this.geoMatchStatement = geoMatchStatement;
    }

    public WebACLStatementOne withGeoMatchStatement(Property<WebACLGeoMatchStatement> geoMatchStatement) {
        this.geoMatchStatement = geoMatchStatement;
        return this;
    }

    /**
     * WebACLRuleGroupReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLRuleGroupReferenceStatement> getRuleGroupReferenceStatement() {
        return ruleGroupReferenceStatement;
    }

    /**
     * WebACLRuleGroupReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html
     * 
     */
    @JsonIgnore
    public void setRuleGroupReferenceStatement(Property<WebACLRuleGroupReferenceStatement> ruleGroupReferenceStatement) {
        this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
    }

    public WebACLStatementOne withRuleGroupReferenceStatement(Property<WebACLRuleGroupReferenceStatement> ruleGroupReferenceStatement) {
        this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
        return this;
    }

    /**
     * WebACLIPSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLIPSetReferenceStatement> getIPSetReferenceStatement() {
        return iPSetReferenceStatement;
    }

    /**
     * WebACLIPSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public void setIPSetReferenceStatement(Property<WebACLIPSetReferenceStatement> iPSetReferenceStatement) {
        this.iPSetReferenceStatement = iPSetReferenceStatement;
    }

    public WebACLStatementOne withIPSetReferenceStatement(Property<WebACLIPSetReferenceStatement> iPSetReferenceStatement) {
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        return this;
    }

    /**
     * WebACLRegexPatternSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return regexPatternSetReferenceStatement;
    }

    /**
     * WebACLRegexPatternSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public void setRegexPatternSetReferenceStatement(Property<WebACLRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement) {
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
    }

    public WebACLStatementOne withRegexPatternSetReferenceStatement(Property<WebACLRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement) {
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        return this;
    }

    /**
     * WebACLManagedRuleGroupStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html
     * 
     */
    @JsonIgnore
    public Property<WebACLManagedRuleGroupStatement> getManagedRuleGroupStatement() {
        return managedRuleGroupStatement;
    }

    /**
     * WebACLManagedRuleGroupStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html
     * 
     */
    @JsonIgnore
    public void setManagedRuleGroupStatement(Property<WebACLManagedRuleGroupStatement> managedRuleGroupStatement) {
        this.managedRuleGroupStatement = managedRuleGroupStatement;
    }

    public WebACLStatementOne withManagedRuleGroupStatement(Property<WebACLManagedRuleGroupStatement> managedRuleGroupStatement) {
        this.managedRuleGroupStatement = managedRuleGroupStatement;
        return this;
    }

    /**
     * WebACLRateBasedStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html
     * 
     */
    @JsonIgnore
    public Property<WebACLRateBasedStatementOne> getRateBasedStatement() {
        return rateBasedStatement;
    }

    /**
     * WebACLRateBasedStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementone.html
     * 
     */
    @JsonIgnore
    public void setRateBasedStatement(Property<WebACLRateBasedStatementOne> rateBasedStatement) {
        this.rateBasedStatement = rateBasedStatement;
    }

    public WebACLStatementOne withRateBasedStatement(Property<WebACLRateBasedStatementOne> rateBasedStatement) {
        this.rateBasedStatement = rateBasedStatement;
        return this;
    }

    /**
     * WebACLAndStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html
     * 
     */
    @JsonIgnore
    public Property<WebACLAndStatementOne> getAndStatement() {
        return andStatement;
    }

    /**
     * WebACLAndStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html
     * 
     */
    @JsonIgnore
    public void setAndStatement(Property<WebACLAndStatementOne> andStatement) {
        this.andStatement = andStatement;
    }

    public WebACLStatementOne withAndStatement(Property<WebACLAndStatementOne> andStatement) {
        this.andStatement = andStatement;
        return this;
    }

    /**
     * WebACLOrStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementone.html
     * 
     */
    @JsonIgnore
    public Property<WebACLOrStatementOne> getOrStatement() {
        return orStatement;
    }

    /**
     * WebACLOrStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementone.html
     * 
     */
    @JsonIgnore
    public void setOrStatement(Property<WebACLOrStatementOne> orStatement) {
        this.orStatement = orStatement;
    }

    public WebACLStatementOne withOrStatement(Property<WebACLOrStatementOne> orStatement) {
        this.orStatement = orStatement;
        return this;
    }

    /**
     * WebACLNotStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatementone.html
     * 
     */
    @JsonIgnore
    public Property<WebACLNotStatementOne> getNotStatement() {
        return notStatement;
    }

    /**
     * WebACLNotStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatementone.html
     * 
     */
    @JsonIgnore
    public void setNotStatement(Property<WebACLNotStatementOne> notStatement) {
        this.notStatement = notStatement;
    }

    public WebACLStatementOne withNotStatement(Property<WebACLNotStatementOne> notStatement) {
        this.notStatement = notStatement;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("byteMatchStatement", byteMatchStatement).append("sqliMatchStatement", sqliMatchStatement).append("xssMatchStatement", xssMatchStatement).append("sizeConstraintStatement", sizeConstraintStatement).append("geoMatchStatement", geoMatchStatement).append("ruleGroupReferenceStatement", ruleGroupReferenceStatement).append("iPSetReferenceStatement", iPSetReferenceStatement).append("regexPatternSetReferenceStatement", regexPatternSetReferenceStatement).append("managedRuleGroupStatement", managedRuleGroupStatement).append("rateBasedStatement", rateBasedStatement).append("andStatement", andStatement).append("orStatement", orStatement).append("notStatement", notStatement).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xssMatchStatement).append(byteMatchStatement).append(regexPatternSetReferenceStatement).append(geoMatchStatement).append(iPSetReferenceStatement).append(managedRuleGroupStatement).append(orStatement).append(rateBasedStatement).append(sqliMatchStatement).append(notStatement).append(sizeConstraintStatement).append(andStatement).append(ruleGroupReferenceStatement).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLStatementOne) == false) {
            return false;
        }
        WebACLStatementOne rhs = ((WebACLStatementOne) other);
        return new EqualsBuilder().append(xssMatchStatement, rhs.xssMatchStatement).append(byteMatchStatement, rhs.byteMatchStatement).append(regexPatternSetReferenceStatement, rhs.regexPatternSetReferenceStatement).append(geoMatchStatement, rhs.geoMatchStatement).append(iPSetReferenceStatement, rhs.iPSetReferenceStatement).append(managedRuleGroupStatement, rhs.managedRuleGroupStatement).append(orStatement, rhs.orStatement).append(rateBasedStatement, rhs.rateBasedStatement).append(sqliMatchStatement, rhs.sqliMatchStatement).append(notStatement, rhs.notStatement).append(sizeConstraintStatement, rhs.sizeConstraintStatement).append(andStatement, rhs.andStatement).append(ruleGroupReferenceStatement, rhs.ruleGroupReferenceStatement).isEquals();
    }

}
