
package aws.iotanalytics;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DatasetQueryAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Filters",
    "SqlQuery"
})
public class DatasetQueryAction implements Property<DatasetQueryAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters
     * 
     */
    @JsonProperty("Filters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters")
    private List<Property<DatasetFilter>> filters = new ArrayList<Property<DatasetFilter>>();
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
    public List<Property<DatasetFilter>> getFilters() {
        return filters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters
     * 
     */
    @JsonIgnore
    public void setFilters(List<Property<DatasetFilter>> filters) {
        this.filters = filters;
    }

    public DatasetQueryAction withFilters(List<Property<DatasetFilter>> filters) {
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

    public DatasetQueryAction withSqlQuery(CharSequence sqlQuery) {
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
        if ((other instanceof DatasetQueryAction) == false) {
            return false;
        }
        DatasetQueryAction rhs = ((DatasetQueryAction) other);
        return new EqualsBuilder().append(sqlQuery, rhs.sqlQuery).append(filters, rhs.filters).isEquals();
    }

}
