
package aws.appsync;

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
 * DataSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Description",
    "ServiceRoleArn",
    "HttpConfig",
    "RelationalDatabaseConfig",
    "LambdaConfig",
    "ApiId",
    "Name",
    "DynamoDBConfig",
    "ElasticsearchConfig"
})
public class DataSource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn")
    private CharSequence serviceRoleArn;
    /**
     * DataSourceHttpConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html
     * 
     */
    @JsonProperty("HttpConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html")
    private Property<DataSourceHttpConfig> httpConfig;
    /**
     * DataSourceRelationalDatabaseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html
     * 
     */
    @JsonProperty("RelationalDatabaseConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html")
    private Property<DataSourceRelationalDatabaseConfig> relationalDatabaseConfig;
    /**
     * DataSourceLambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html
     * 
     */
    @JsonProperty("LambdaConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html")
    private Property<DataSourceLambdaConfig> lambdaConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid")
    private CharSequence apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name")
    private CharSequence name;
    /**
     * DataSourceDynamoDBConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html
     * 
     */
    @JsonProperty("DynamoDBConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html")
    private Property<DataSourceDynamoDBConfig> dynamoDBConfig;
    /**
     * DataSourceElasticsearchConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html
     * 
     */
    @JsonProperty("ElasticsearchConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html")
    private Property<DataSourceElasticsearchConfig> elasticsearchConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public DataSource withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public DataSource withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn
     * 
     */
    @JsonIgnore
    public void setServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public DataSource withServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * DataSourceHttpConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceHttpConfig> getHttpConfig() {
        return httpConfig;
    }

    /**
     * DataSourceHttpConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html
     * 
     */
    @JsonIgnore
    public void setHttpConfig(Property<DataSourceHttpConfig> httpConfig) {
        this.httpConfig = httpConfig;
    }

    public DataSource withHttpConfig(Property<DataSourceHttpConfig> httpConfig) {
        this.httpConfig = httpConfig;
        return this;
    }

    /**
     * DataSourceRelationalDatabaseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceRelationalDatabaseConfig> getRelationalDatabaseConfig() {
        return relationalDatabaseConfig;
    }

    /**
     * DataSourceRelationalDatabaseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html
     * 
     */
    @JsonIgnore
    public void setRelationalDatabaseConfig(Property<DataSourceRelationalDatabaseConfig> relationalDatabaseConfig) {
        this.relationalDatabaseConfig = relationalDatabaseConfig;
    }

    public DataSource withRelationalDatabaseConfig(Property<DataSourceRelationalDatabaseConfig> relationalDatabaseConfig) {
        this.relationalDatabaseConfig = relationalDatabaseConfig;
        return this;
    }

    /**
     * DataSourceLambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceLambdaConfig> getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * DataSourceLambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html
     * 
     */
    @JsonIgnore
    public void setLambdaConfig(Property<DataSourceLambdaConfig> lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    public DataSource withLambdaConfig(Property<DataSourceLambdaConfig> lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid
     * 
     */
    @JsonIgnore
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid
     * 
     */
    @JsonIgnore
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public DataSource withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public DataSource withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * DataSourceDynamoDBConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceDynamoDBConfig> getDynamoDBConfig() {
        return dynamoDBConfig;
    }

    /**
     * DataSourceDynamoDBConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html
     * 
     */
    @JsonIgnore
    public void setDynamoDBConfig(Property<DataSourceDynamoDBConfig> dynamoDBConfig) {
        this.dynamoDBConfig = dynamoDBConfig;
    }

    public DataSource withDynamoDBConfig(Property<DataSourceDynamoDBConfig> dynamoDBConfig) {
        this.dynamoDBConfig = dynamoDBConfig;
        return this;
    }

    /**
     * DataSourceElasticsearchConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceElasticsearchConfig> getElasticsearchConfig() {
        return elasticsearchConfig;
    }

    /**
     * DataSourceElasticsearchConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html
     * 
     */
    @JsonIgnore
    public void setElasticsearchConfig(Property<DataSourceElasticsearchConfig> elasticsearchConfig) {
        this.elasticsearchConfig = elasticsearchConfig;
    }

    public DataSource withElasticsearchConfig(Property<DataSourceElasticsearchConfig> elasticsearchConfig) {
        this.elasticsearchConfig = elasticsearchConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("description", description).append("serviceRoleArn", serviceRoleArn).append("httpConfig", httpConfig).append("relationalDatabaseConfig", relationalDatabaseConfig).append("lambdaConfig", lambdaConfig).append("apiId", apiId).append("name", name).append("dynamoDBConfig", dynamoDBConfig).append("elasticsearchConfig", elasticsearchConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(elasticsearchConfig).append(httpConfig).append(relationalDatabaseConfig).append(dynamoDBConfig).append(name).append(description).append(type).append(serviceRoleArn).append(lambdaConfig).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSource) == false) {
            return false;
        }
        DataSource rhs = ((DataSource) other);
        return new EqualsBuilder().append(elasticsearchConfig, rhs.elasticsearchConfig).append(httpConfig, rhs.httpConfig).append(relationalDatabaseConfig, rhs.relationalDatabaseConfig).append(dynamoDBConfig, rhs.dynamoDBConfig).append(name, rhs.name).append(description, rhs.description).append(type, rhs.type).append(serviceRoleArn, rhs.serviceRoleArn).append(lambdaConfig, rhs.lambdaConfig).append(apiId, rhs.apiId).isEquals();
    }

}
