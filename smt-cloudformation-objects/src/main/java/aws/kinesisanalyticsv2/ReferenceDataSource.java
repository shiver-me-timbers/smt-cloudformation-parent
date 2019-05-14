
package aws.kinesisanalyticsv2;

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
 * ReferenceDataSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReferenceSchema",
    "TableName",
    "S3ReferenceDataSource"
})
public class ReferenceDataSource implements Property<ReferenceDataSource>
{

    /**
     * ReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html
     * 
     */
    @JsonProperty("ReferenceSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html")
    private Property<ReferenceSchema> referenceSchema;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-tablename")
    private CharSequence tableName;
    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonProperty("S3ReferenceDataSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html")
    private Property<S3ReferenceDataSource> s3ReferenceDataSource;

    /**
     * ReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html
     * 
     */
    @JsonIgnore
    public Property<ReferenceSchema> getReferenceSchema() {
        return referenceSchema;
    }

    /**
     * ReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html
     * 
     */
    @JsonIgnore
    public void setReferenceSchema(Property<ReferenceSchema> referenceSchema) {
        this.referenceSchema = referenceSchema;
    }

    public ReferenceDataSource withReferenceSchema(Property<ReferenceSchema> referenceSchema) {
        this.referenceSchema = referenceSchema;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public ReferenceDataSource withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonIgnore
    public Property<S3ReferenceDataSource> getS3ReferenceDataSource() {
        return s3ReferenceDataSource;
    }

    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonIgnore
    public void setS3ReferenceDataSource(Property<S3ReferenceDataSource> s3ReferenceDataSource) {
        this.s3ReferenceDataSource = s3ReferenceDataSource;
    }

    public ReferenceDataSource withS3ReferenceDataSource(Property<S3ReferenceDataSource> s3ReferenceDataSource) {
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
        if ((other instanceof ReferenceDataSource) == false) {
            return false;
        }
        ReferenceDataSource rhs = ((ReferenceDataSource) other);
        return new EqualsBuilder().append(s3ReferenceDataSource, rhs.s3ReferenceDataSource).append(referenceSchema, rhs.referenceSchema).append(tableName, rhs.tableName).isEquals();
    }

}