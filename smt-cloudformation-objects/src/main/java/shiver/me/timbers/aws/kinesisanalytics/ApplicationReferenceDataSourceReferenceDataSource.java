
package shiver.me.timbers.aws.kinesisanalytics;

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
 * ApplicationReferenceDataSourceReferenceDataSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReferenceSchema",
    "TableName",
    "S3ReferenceDataSource"
})
public class ApplicationReferenceDataSourceReferenceDataSource implements Property<ApplicationReferenceDataSourceReferenceDataSource>
{

    /**
     * ApplicationReferenceDataSourceReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
     * 
     */
    @JsonProperty("ReferenceSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html")
    private Property<ApplicationReferenceDataSourceReferenceSchema> referenceSchema;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename")
    private CharSequence tableName;
    /**
     * ApplicationReferenceDataSourceS3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonProperty("S3ReferenceDataSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html")
    private Property<ApplicationReferenceDataSourceS3ReferenceDataSource> s3ReferenceDataSource;

    /**
     * ApplicationReferenceDataSourceReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationReferenceDataSourceReferenceSchema> getReferenceSchema() {
        return referenceSchema;
    }

    /**
     * ApplicationReferenceDataSourceReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
     * 
     */
    @JsonIgnore
    public void setReferenceSchema(Property<ApplicationReferenceDataSourceReferenceSchema> referenceSchema) {
        this.referenceSchema = referenceSchema;
    }

    public ApplicationReferenceDataSourceReferenceDataSource withReferenceSchema(Property<ApplicationReferenceDataSourceReferenceSchema> referenceSchema) {
        this.referenceSchema = referenceSchema;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public ApplicationReferenceDataSourceReferenceDataSource withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * ApplicationReferenceDataSourceS3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationReferenceDataSourceS3ReferenceDataSource> getS3ReferenceDataSource() {
        return s3ReferenceDataSource;
    }

    /**
     * ApplicationReferenceDataSourceS3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonIgnore
    public void setS3ReferenceDataSource(Property<ApplicationReferenceDataSourceS3ReferenceDataSource> s3ReferenceDataSource) {
        this.s3ReferenceDataSource = s3ReferenceDataSource;
    }

    public ApplicationReferenceDataSourceReferenceDataSource withS3ReferenceDataSource(Property<ApplicationReferenceDataSourceS3ReferenceDataSource> s3ReferenceDataSource) {
        this.s3ReferenceDataSource = s3ReferenceDataSource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("referenceSchema", referenceSchema).append("tableName", tableName).append("s3ReferenceDataSource", s3ReferenceDataSource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3ReferenceDataSource).append(referenceSchema).append(tableName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationReferenceDataSourceReferenceDataSource) == false) {
            return false;
        }
        ApplicationReferenceDataSourceReferenceDataSource rhs = ((ApplicationReferenceDataSourceReferenceDataSource) other);
        return new EqualsBuilder().append(s3ReferenceDataSource, rhs.s3ReferenceDataSource).append(referenceSchema, rhs.referenceSchema).append(tableName, rhs.tableName).isEquals();
    }

}
