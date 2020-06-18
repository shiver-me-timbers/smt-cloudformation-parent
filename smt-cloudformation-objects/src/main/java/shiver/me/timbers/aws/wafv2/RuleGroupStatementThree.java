
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
 * RuleGroupStatementThree
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statementthree.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ByteMatchStatement",
    "SqliMatchStatement",
    "XssMatchStatement",
    "SizeConstraintStatement",
    "GeoMatchStatement",
    "IPSetReferenceStatement",
    "RegexPatternSetReferenceStatement"
})
public class RuleGroupStatementThree implements Property<RuleGroupStatementThree>
{

    /**
     * RuleGroupByteMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html
     * 
     */
    @JsonProperty("ByteMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html")
    private Property<RuleGroupByteMatchStatement> byteMatchStatement;
    /**
     * RuleGroupSqliMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html
     * 
     */
    @JsonProperty("SqliMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html")
    private Property<RuleGroupSqliMatchStatement> sqliMatchStatement;
    /**
     * RuleGroupXssMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html
     * 
     */
    @JsonProperty("XssMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html")
    private Property<RuleGroupXssMatchStatement> xssMatchStatement;
    /**
     * RuleGroupSizeConstraintStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html
     * 
     */
    @JsonProperty("SizeConstraintStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html")
    private Property<RuleGroupSizeConstraintStatement> sizeConstraintStatement;
    /**
     * RuleGroupGeoMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html
     * 
     */
    @JsonProperty("GeoMatchStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html")
    private Property<RuleGroupGeoMatchStatement> geoMatchStatement;
    /**
     * RuleGroupIPSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html
     * 
     */
    @JsonProperty("IPSetReferenceStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html")
    private Property<RuleGroupIPSetReferenceStatement> iPSetReferenceStatement;
    /**
     * RuleGroupRegexPatternSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html
     * 
     */
    @JsonProperty("RegexPatternSetReferenceStatement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html")
    private Property<RuleGroupRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement;

    /**
     * RuleGroupByteMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupByteMatchStatement> getByteMatchStatement() {
        return byteMatchStatement;
    }

    /**
     * RuleGroupByteMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html
     * 
     */
    @JsonIgnore
    public void setByteMatchStatement(Property<RuleGroupByteMatchStatement> byteMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
    }

    public RuleGroupStatementThree withByteMatchStatement(Property<RuleGroupByteMatchStatement> byteMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        return this;
    }

    /**
     * RuleGroupSqliMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupSqliMatchStatement> getSqliMatchStatement() {
        return sqliMatchStatement;
    }

    /**
     * RuleGroupSqliMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html
     * 
     */
    @JsonIgnore
    public void setSqliMatchStatement(Property<RuleGroupSqliMatchStatement> sqliMatchStatement) {
        this.sqliMatchStatement = sqliMatchStatement;
    }

    public RuleGroupStatementThree withSqliMatchStatement(Property<RuleGroupSqliMatchStatement> sqliMatchStatement) {
        this.sqliMatchStatement = sqliMatchStatement;
        return this;
    }

    /**
     * RuleGroupXssMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupXssMatchStatement> getXssMatchStatement() {
        return xssMatchStatement;
    }

    /**
     * RuleGroupXssMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html
     * 
     */
    @JsonIgnore
    public void setXssMatchStatement(Property<RuleGroupXssMatchStatement> xssMatchStatement) {
        this.xssMatchStatement = xssMatchStatement;
    }

    public RuleGroupStatementThree withXssMatchStatement(Property<RuleGroupXssMatchStatement> xssMatchStatement) {
        this.xssMatchStatement = xssMatchStatement;
        return this;
    }

    /**
     * RuleGroupSizeConstraintStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupSizeConstraintStatement> getSizeConstraintStatement() {
        return sizeConstraintStatement;
    }

    /**
     * RuleGroupSizeConstraintStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html
     * 
     */
    @JsonIgnore
    public void setSizeConstraintStatement(Property<RuleGroupSizeConstraintStatement> sizeConstraintStatement) {
        this.sizeConstraintStatement = sizeConstraintStatement;
    }

    public RuleGroupStatementThree withSizeConstraintStatement(Property<RuleGroupSizeConstraintStatement> sizeConstraintStatement) {
        this.sizeConstraintStatement = sizeConstraintStatement;
        return this;
    }

    /**
     * RuleGroupGeoMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupGeoMatchStatement> getGeoMatchStatement() {
        return geoMatchStatement;
    }

    /**
     * RuleGroupGeoMatchStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html
     * 
     */
    @JsonIgnore
    public void setGeoMatchStatement(Property<RuleGroupGeoMatchStatement> geoMatchStatement) {
        this.geoMatchStatement = geoMatchStatement;
    }

    public RuleGroupStatementThree withGeoMatchStatement(Property<RuleGroupGeoMatchStatement> geoMatchStatement) {
        this.geoMatchStatement = geoMatchStatement;
        return this;
    }

    /**
     * RuleGroupIPSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupIPSetReferenceStatement> getIPSetReferenceStatement() {
        return iPSetReferenceStatement;
    }

    /**
     * RuleGroupIPSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public void setIPSetReferenceStatement(Property<RuleGroupIPSetReferenceStatement> iPSetReferenceStatement) {
        this.iPSetReferenceStatement = iPSetReferenceStatement;
    }

    public RuleGroupStatementThree withIPSetReferenceStatement(Property<RuleGroupIPSetReferenceStatement> iPSetReferenceStatement) {
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        return this;
    }

    /**
     * RuleGroupRegexPatternSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return regexPatternSetReferenceStatement;
    }

    /**
     * RuleGroupRegexPatternSetReferenceStatement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html
     * 
     */
    @JsonIgnore
    public void setRegexPatternSetReferenceStatement(Property<RuleGroupRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement) {
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
    }

    public RuleGroupStatementThree withRegexPatternSetReferenceStatement(Property<RuleGroupRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement) {
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("byteMatchStatement", byteMatchStatement).append("sqliMatchStatement", sqliMatchStatement).append("xssMatchStatement", xssMatchStatement).append("sizeConstraintStatement", sizeConstraintStatement).append("geoMatchStatement", geoMatchStatement).append("iPSetReferenceStatement", iPSetReferenceStatement).append("regexPatternSetReferenceStatement", regexPatternSetReferenceStatement).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sqliMatchStatement).append(xssMatchStatement).append(byteMatchStatement).append(sizeConstraintStatement).append(regexPatternSetReferenceStatement).append(geoMatchStatement).append(iPSetReferenceStatement).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupStatementThree) == false) {
            return false;
        }
        RuleGroupStatementThree rhs = ((RuleGroupStatementThree) other);
        return new EqualsBuilder().append(sqliMatchStatement, rhs.sqliMatchStatement).append(xssMatchStatement, rhs.xssMatchStatement).append(byteMatchStatement, rhs.byteMatchStatement).append(sizeConstraintStatement, rhs.sizeConstraintStatement).append(regexPatternSetReferenceStatement, rhs.regexPatternSetReferenceStatement).append(geoMatchStatement, rhs.geoMatchStatement).append(iPSetReferenceStatement, rhs.iPSetReferenceStatement).isEquals();
    }

}
