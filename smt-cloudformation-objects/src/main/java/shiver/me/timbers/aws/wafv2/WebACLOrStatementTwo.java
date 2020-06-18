
package shiver.me.timbers.aws.wafv2;

import java.util.ArrayList;
import java.util.List;
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
 * WebACLOrStatementTwo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statements"
})
public class WebACLOrStatementTwo implements Property<WebACLOrStatementTwo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html#cfn-wafv2-webacl-orstatementtwo-statements
     * 
     */
    @JsonProperty("Statements")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html#cfn-wafv2-webacl-orstatementtwo-statements")
    private List<Property<WebACLStatementThree>> statements = new ArrayList<Property<WebACLStatementThree>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html#cfn-wafv2-webacl-orstatementtwo-statements
     * 
     */
    @JsonIgnore
    public List<Property<WebACLStatementThree>> getStatements() {
        return statements;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatementtwo.html#cfn-wafv2-webacl-orstatementtwo-statements
     * 
     */
    @JsonIgnore
    public void setStatements(List<Property<WebACLStatementThree>> statements) {
        this.statements = statements;
    }

    public WebACLOrStatementTwo withStatements(List<Property<WebACLStatementThree>> statements) {
        this.statements = statements;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statements", statements).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statements).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLOrStatementTwo) == false) {
            return false;
        }
        WebACLOrStatementTwo rhs = ((WebACLOrStatementTwo) other);
        return new EqualsBuilder().append(statements, rhs.statements).isEquals();
    }

}
