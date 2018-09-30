
package aws.kinesisanalytics;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RecordColumn
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Mapping",
    "SqlType",
    "Name"
})
public class RecordColumn {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping
     * 
     */
    @JsonProperty("Mapping")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping")
    private CharSequence mapping;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype
     * 
     */
    @JsonProperty("SqlType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype")
    private CharSequence sqlType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping
     * 
     */
    public CharSequence getMapping() {
        return mapping;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping
     * 
     */
    public void setMapping(CharSequence mapping) {
        this.mapping = mapping;
    }

    public RecordColumn withMapping(CharSequence mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype
     * 
     */
    public CharSequence getSqlType() {
        return sqlType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype
     * 
     */
    public void setSqlType(CharSequence sqlType) {
        this.sqlType = sqlType;
    }

    public RecordColumn withSqlType(CharSequence sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RecordColumn withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mapping", mapping).append("sqlType", sqlType).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(mapping).append(sqlType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordColumn) == false) {
            return false;
        }
        RecordColumn rhs = ((RecordColumn) other);
        return new EqualsBuilder().append(name, rhs.name).append(mapping, rhs.mapping).append(sqlType, rhs.sqlType).isEquals();
    }

}
