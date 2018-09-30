
package aws.kinesisanalytics;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReferenceSchema",
    "TableName",
    "S3ReferenceDataSource"
})
public class ReferenceDataSource {

    /**
     * ReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
     * 
     */
    @JsonProperty("ReferenceSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html")
    private ReferenceSchema referenceSchema;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename")
    private CharSequence tableName;
    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonProperty("S3ReferenceDataSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html")
    private S3ReferenceDataSource s3ReferenceDataSource;

    /**
     * ReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
     * 
     */
    public ReferenceSchema getReferenceSchema() {
        return referenceSchema;
    }

    /**
     * ReferenceSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
     * 
     */
    public void setReferenceSchema(ReferenceSchema referenceSchema) {
        this.referenceSchema = referenceSchema;
    }

    public ReferenceDataSource withReferenceSchema(ReferenceSchema referenceSchema) {
        this.referenceSchema = referenceSchema;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename
     * 
     */
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    public S3ReferenceDataSource getS3ReferenceDataSource() {
        return s3ReferenceDataSource;
    }

    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    public void setS3ReferenceDataSource(S3ReferenceDataSource s3ReferenceDataSource) {
        this.s3ReferenceDataSource = s3ReferenceDataSource;
    }

    public ReferenceDataSource withS3ReferenceDataSource(S3ReferenceDataSource s3ReferenceDataSource) {
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
