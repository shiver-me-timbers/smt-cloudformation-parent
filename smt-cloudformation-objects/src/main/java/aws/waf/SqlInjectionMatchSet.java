
package aws.waf;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SqlInjectionMatchSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "SqlInjectionMatchTuples"
})
public class SqlInjectionMatchSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples
     * 
     */
    @JsonProperty("SqlInjectionMatchTuples")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples")
    private Set<SqlInjectionMatchTuple> sqlInjectionMatchTuples = new LinkedHashSet<SqlInjectionMatchTuple>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public SqlInjectionMatchSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples
     * 
     */
    public Set<SqlInjectionMatchTuple> getSqlInjectionMatchTuples() {
        return sqlInjectionMatchTuples;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples
     * 
     */
    public void setSqlInjectionMatchTuples(Set<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
    }

    public SqlInjectionMatchSet withSqlInjectionMatchTuples(Set<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("sqlInjectionMatchTuples", sqlInjectionMatchTuples).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(sqlInjectionMatchTuples).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SqlInjectionMatchSet) == false) {
            return false;
        }
        SqlInjectionMatchSet rhs = ((SqlInjectionMatchSet) other);
        return new EqualsBuilder().append(name, rhs.name).append(sqlInjectionMatchTuples, rhs.sqlInjectionMatchTuples).isEquals();
    }

}
