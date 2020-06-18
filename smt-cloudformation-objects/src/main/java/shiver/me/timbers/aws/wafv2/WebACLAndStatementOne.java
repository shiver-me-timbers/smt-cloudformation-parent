
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
 * WebACLAndStatementOne
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Statements"
})
public class WebACLAndStatementOne implements Property<WebACLAndStatementOne>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html#cfn-wafv2-webacl-andstatementone-statements
     * 
     */
    @JsonProperty("Statements")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html#cfn-wafv2-webacl-andstatementone-statements")
    private List<Property<WebACLStatementTwo>> statements = new ArrayList<Property<WebACLStatementTwo>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html#cfn-wafv2-webacl-andstatementone-statements
     * 
     */
    @JsonIgnore
    public List<Property<WebACLStatementTwo>> getStatements() {
        return statements;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatementone.html#cfn-wafv2-webacl-andstatementone-statements
     * 
     */
    @JsonIgnore
    public void setStatements(List<Property<WebACLStatementTwo>> statements) {
        this.statements = statements;
    }

    public WebACLAndStatementOne withStatements(List<Property<WebACLStatementTwo>> statements) {
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
        if ((other instanceof WebACLAndStatementOne) == false) {
            return false;
        }
        WebACLAndStatementOne rhs = ((WebACLAndStatementOne) other);
        return new EqualsBuilder().append(statements, rhs.statements).isEquals();
    }

}
