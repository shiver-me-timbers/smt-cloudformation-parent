
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
 * WebACLNotStatementTwo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatementtwo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statement"
})
public class WebACLNotStatementTwo implements Property<WebACLNotStatementTwo>
{

    /**
     * WebACLStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html
     * 
     */
    @JsonProperty("Statement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html")
    private Property<WebACLStatementThree> statement;

    /**
     * WebACLStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html
     * 
     */
    @JsonIgnore
    public Property<WebACLStatementThree> getStatement() {
        return statement;
    }

    /**
     * WebACLStatementThree
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementthree.html
     * 
     */
    @JsonIgnore
    public void setStatement(Property<WebACLStatementThree> statement) {
        this.statement = statement;
    }

    public WebACLNotStatementTwo withStatement(Property<WebACLStatementThree> statement) {
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
        if ((other instanceof WebACLNotStatementTwo) == false) {
            return false;
        }
        WebACLNotStatementTwo rhs = ((WebACLNotStatementTwo) other);
        return new EqualsBuilder().append(statement, rhs.statement).isEquals();
    }

}
