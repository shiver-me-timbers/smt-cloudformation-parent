
package aws.athena;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NamedQuery
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "QueryString",
    "Database",
    "Name"
})
public class NamedQuery {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring
     * 
     */
    @JsonProperty("QueryString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring")
    private CharSequence queryString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database
     * 
     */
    @JsonProperty("Database")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database")
    private CharSequence database;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public NamedQuery withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring
     * 
     */
    public CharSequence getQueryString() {
        return queryString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring
     * 
     */
    public void setQueryString(CharSequence queryString) {
        this.queryString = queryString;
    }

    public NamedQuery withQueryString(CharSequence queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database
     * 
     */
    public CharSequence getDatabase() {
        return database;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database
     * 
     */
    public void setDatabase(CharSequence database) {
        this.database = database;
    }

    public NamedQuery withDatabase(CharSequence database) {
        this.database = database;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public NamedQuery withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("queryString", queryString).append("database", database).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(database).append(queryString).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NamedQuery) == false) {
            return false;
        }
        NamedQuery rhs = ((NamedQuery) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(database, rhs.database).append(queryString, rhs.queryString).isEquals();
    }

}
