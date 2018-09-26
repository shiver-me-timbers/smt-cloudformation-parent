
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DynamoDBConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TableName",
    "AwsRegion",
    "UseCallerCredentials"
})
public class DynamoDBConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename")
    private CharSequence tableName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion
     * 
     */
    @JsonProperty("AwsRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion")
    private CharSequence awsRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials
     * 
     */
    @JsonProperty("UseCallerCredentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials")
    private Boolean useCallerCredentials;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename
     * 
     */
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename
     * 
     */
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public DynamoDBConfig withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion
     * 
     */
    public CharSequence getAwsRegion() {
        return awsRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion
     * 
     */
    public void setAwsRegion(CharSequence awsRegion) {
        this.awsRegion = awsRegion;
    }

    public DynamoDBConfig withAwsRegion(CharSequence awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials
     * 
     */
    public Boolean getUseCallerCredentials() {
        return useCallerCredentials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials
     * 
     */
    public void setUseCallerCredentials(Boolean useCallerCredentials) {
        this.useCallerCredentials = useCallerCredentials;
    }

    public DynamoDBConfig withUseCallerCredentials(Boolean useCallerCredentials) {
        this.useCallerCredentials = useCallerCredentials;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableName", tableName).append("awsRegion", awsRegion).append("useCallerCredentials", useCallerCredentials).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(useCallerCredentials).append(awsRegion).append(tableName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynamoDBConfig) == false) {
            return false;
        }
        DynamoDBConfig rhs = ((DynamoDBConfig) other);
        return new EqualsBuilder().append(useCallerCredentials, rhs.useCallerCredentials).append(awsRegion, rhs.awsRegion).append(tableName, rhs.tableName).isEquals();
    }

}
