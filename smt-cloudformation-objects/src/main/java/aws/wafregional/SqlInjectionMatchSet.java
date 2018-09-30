
package aws.wafregional;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SqlInjectionMatchSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SqlInjectionMatchTuples",
    "Name"
})
public class SqlInjectionMatchSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples
     * 
     */
    @JsonProperty("SqlInjectionMatchTuples")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples")
    private List<SqlInjectionMatchTuple> sqlInjectionMatchTuples = new ArrayList<SqlInjectionMatchTuple>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples
     * 
     */
    public List<SqlInjectionMatchTuple> getSqlInjectionMatchTuples() {
        return sqlInjectionMatchTuples;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples
     * 
     */
    public void setSqlInjectionMatchTuples(List<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
    }

    public SqlInjectionMatchSet withSqlInjectionMatchTuples(List<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public SqlInjectionMatchSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sqlInjectionMatchTuples", sqlInjectionMatchTuples).append("name", name).toString();
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
