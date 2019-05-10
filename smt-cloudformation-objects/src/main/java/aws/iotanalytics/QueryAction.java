
package aws.iotanalytics;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * QueryAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Filters",
    "SqlQuery"
})
public class QueryAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters
     * 
     */
    @JsonProperty("Filters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters")
    private List<Filter> filters = new ArrayList<Filter>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-sqlquery
     * 
     */
    @JsonProperty("SqlQuery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-sqlquery")
    private CharSequence sqlQuery;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters
     * 
     */
    @JsonIgnore
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters
     * 
     */
    @JsonIgnore
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public QueryAction withFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-sqlquery
     * 
     */
    @JsonIgnore
    public CharSequence getSqlQuery() {
        return sqlQuery;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-sqlquery
     * 
     */
    @JsonIgnore
    public void setSqlQuery(CharSequence sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    public QueryAction withSqlQuery(CharSequence sqlQuery) {
        this.sqlQuery = sqlQuery;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("filters", filters).append("sqlQuery", sqlQuery).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sqlQuery).append(filters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryAction) == false) {
            return false;
        }
        QueryAction rhs = ((QueryAction) other);
        return new EqualsBuilder().append(sqlQuery, rhs.sqlQuery).append(filters, rhs.filters).isEquals();
    }

}
