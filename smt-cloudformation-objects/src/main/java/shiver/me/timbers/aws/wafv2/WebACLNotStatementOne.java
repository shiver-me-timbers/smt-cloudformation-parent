
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
 * WebACLNotStatementOne
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatementone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statement"
})
public class WebACLNotStatementOne implements Property<WebACLNotStatementOne>
{

    /**
     * WebACLOrStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html
     * 
     */
    @JsonProperty("Statement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html")
    private Property<WebACLStatementTwo> statement;

    /**
     * WebACLOrStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html
     * 
     */
    @JsonIgnore
    public Property<WebACLStatementTwo> getStatement() {
        return statement;
    }

    /**
     * WebACLOrStatementTwo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html
     * 
     */
    @JsonIgnore
    public void setStatement(Property<WebACLStatementTwo> statement) {
        this.statement = statement;
    }

    public WebACLNotStatementOne withStatement(Property<WebACLStatementTwo> statement) {
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
        if ((other instanceof WebACLNotStatementOne) == false) {
            return false;
        }
        WebACLNotStatementOne rhs = ((WebACLNotStatementOne) other);
        return new EqualsBuilder().append(statement, rhs.statement).isEquals();
    }

}
