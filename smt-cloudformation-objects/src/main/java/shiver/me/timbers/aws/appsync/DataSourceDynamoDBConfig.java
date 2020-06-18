
package shiver.me.timbers.aws.appsync;

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
 * DataSourceDynamoDBConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TableName",
    "AwsRegion",
    "Versioned",
    "DeltaSyncConfig",
    "UseCallerCredentials"
})
public class DataSourceDynamoDBConfig implements Property<DataSourceDynamoDBConfig>
{

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-versioned
     * 
     */
    @JsonProperty("Versioned")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-versioned")
    private CharSequence versioned;
    /**
     * DataSourceDeltaSyncConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html
     * 
     */
    @JsonProperty("DeltaSyncConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html")
    private Property<DataSourceDeltaSyncConfig> deltaSyncConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials
     * 
     */
    @JsonProperty("UseCallerCredentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials")
    private CharSequence useCallerCredentials;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public DataSourceDynamoDBConfig withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion
     * 
     */
    @JsonIgnore
    public CharSequence getAwsRegion() {
        return awsRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion
     * 
     */
    @JsonIgnore
    public void setAwsRegion(CharSequence awsRegion) {
        this.awsRegion = awsRegion;
    }

    public DataSourceDynamoDBConfig withAwsRegion(CharSequence awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-versioned
     * 
     */
    @JsonIgnore
    public CharSequence getVersioned() {
        return versioned;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-versioned
     * 
     */
    @JsonIgnore
    public void setVersioned(CharSequence versioned) {
        this.versioned = versioned;
    }

    public DataSourceDynamoDBConfig withVersioned(CharSequence versioned) {
        this.versioned = versioned;
        return this;
    }

    /**
     * DataSourceDeltaSyncConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceDeltaSyncConfig> getDeltaSyncConfig() {
        return deltaSyncConfig;
    }

    /**
     * DataSourceDeltaSyncConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html
     * 
     */
    @JsonIgnore
    public void setDeltaSyncConfig(Property<DataSourceDeltaSyncConfig> deltaSyncConfig) {
        this.deltaSyncConfig = deltaSyncConfig;
    }

    public DataSourceDynamoDBConfig withDeltaSyncConfig(Property<DataSourceDeltaSyncConfig> deltaSyncConfig) {
        this.deltaSyncConfig = deltaSyncConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials
     * 
     */
    @JsonIgnore
    public CharSequence getUseCallerCredentials() {
        return useCallerCredentials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials
     * 
     */
    @JsonIgnore
    public void setUseCallerCredentials(CharSequence useCallerCredentials) {
        this.useCallerCredentials = useCallerCredentials;
    }

    public DataSourceDynamoDBConfig withUseCallerCredentials(CharSequence useCallerCredentials) {
        this.useCallerCredentials = useCallerCredentials;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableName", tableName).append("awsRegion", awsRegion).append("versioned", versioned).append("deltaSyncConfig", deltaSyncConfig).append("useCallerCredentials", useCallerCredentials).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(useCallerCredentials).append(awsRegion).append(versioned).append(tableName).append(deltaSyncConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSourceDynamoDBConfig) == false) {
            return false;
        }
        DataSourceDynamoDBConfig rhs = ((DataSourceDynamoDBConfig) other);
        return new EqualsBuilder().append(useCallerCredentials, rhs.useCallerCredentials).append(awsRegion, rhs.awsRegion).append(versioned, rhs.versioned).append(tableName, rhs.tableName).append(deltaSyncConfig, rhs.deltaSyncConfig).isEquals();
    }

}
