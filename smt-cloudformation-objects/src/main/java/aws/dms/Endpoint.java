
package aws.dms;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Endpoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "KmsKeyId",
    "Port",
    "DatabaseName",
    "S3Settings",
    "EngineName",
    "DynamoDbSettings",
    "Username",
    "SslMode",
    "ServerName",
    "ExtraConnectionAttributes",
    "EndpointType",
    "Tags",
    "EndpointIdentifier",
    "Password",
    "CertificateArn",
    "MongoDbSettings"
})
public class Endpoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename")
    private CharSequence databaseName;
    /**
     * S3Settings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html
     * 
     */
    @JsonProperty("S3Settings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html")
    private S3Settings s3Settings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename
     * 
     */
    @JsonProperty("EngineName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename")
    private CharSequence engineName;
    /**
     * DynamoDbSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html
     * 
     */
    @JsonProperty("DynamoDbSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html")
    private DynamoDbSettings dynamoDbSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username")
    private CharSequence username;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode
     * 
     */
    @JsonProperty("SslMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode")
    private CharSequence sslMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername
     * 
     */
    @JsonProperty("ServerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername")
    private CharSequence serverName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes
     * 
     */
    @JsonProperty("ExtraConnectionAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes")
    private CharSequence extraConnectionAttributes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype
     * 
     */
    @JsonProperty("EndpointType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype")
    private CharSequence endpointType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier
     * 
     */
    @JsonProperty("EndpointIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier")
    private CharSequence endpointIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password")
    private CharSequence password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn
     * 
     */
    @JsonProperty("CertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn")
    private CharSequence certificateArn;
    /**
     * MongoDbSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html
     * 
     */
    @JsonProperty("MongoDbSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html")
    private MongoDbSettings mongoDbSettings;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid
     * 
     */
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid
     * 
     */
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Endpoint withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public Endpoint withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename
     * 
     */
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename
     * 
     */
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public Endpoint withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * S3Settings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html
     * 
     */
    public S3Settings getS3Settings() {
        return s3Settings;
    }

    /**
     * S3Settings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html
     * 
     */
    public void setS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
    }

    public Endpoint withS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename
     * 
     */
    public CharSequence getEngineName() {
        return engineName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename
     * 
     */
    public void setEngineName(CharSequence engineName) {
        this.engineName = engineName;
    }

    public Endpoint withEngineName(CharSequence engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * DynamoDbSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html
     * 
     */
    public DynamoDbSettings getDynamoDbSettings() {
        return dynamoDbSettings;
    }

    /**
     * DynamoDbSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html
     * 
     */
    public void setDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
    }

    public Endpoint withDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username
     * 
     */
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username
     * 
     */
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public Endpoint withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode
     * 
     */
    public CharSequence getSslMode() {
        return sslMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode
     * 
     */
    public void setSslMode(CharSequence sslMode) {
        this.sslMode = sslMode;
    }

    public Endpoint withSslMode(CharSequence sslMode) {
        this.sslMode = sslMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername
     * 
     */
    public CharSequence getServerName() {
        return serverName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername
     * 
     */
    public void setServerName(CharSequence serverName) {
        this.serverName = serverName;
    }

    public Endpoint withServerName(CharSequence serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes
     * 
     */
    public CharSequence getExtraConnectionAttributes() {
        return extraConnectionAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes
     * 
     */
    public void setExtraConnectionAttributes(CharSequence extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    public Endpoint withExtraConnectionAttributes(CharSequence extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype
     * 
     */
    public CharSequence getEndpointType() {
        return endpointType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype
     * 
     */
    public void setEndpointType(CharSequence endpointType) {
        this.endpointType = endpointType;
    }

    public Endpoint withEndpointType(CharSequence endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Endpoint withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier
     * 
     */
    public CharSequence getEndpointIdentifier() {
        return endpointIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier
     * 
     */
    public void setEndpointIdentifier(CharSequence endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    public Endpoint withEndpointIdentifier(CharSequence endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password
     * 
     */
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password
     * 
     */
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public Endpoint withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn
     * 
     */
    public CharSequence getCertificateArn() {
        return certificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn
     * 
     */
    public void setCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
    }

    public Endpoint withCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * MongoDbSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html
     * 
     */
    public MongoDbSettings getMongoDbSettings() {
        return mongoDbSettings;
    }

    /**
     * MongoDbSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html
     * 
     */
    public void setMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
    }

    public Endpoint withMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kmsKeyId", kmsKeyId).append("port", port).append("databaseName", databaseName).append("s3Settings", s3Settings).append("engineName", engineName).append("dynamoDbSettings", dynamoDbSettings).append("username", username).append("sslMode", sslMode).append("serverName", serverName).append("extraConnectionAttributes", extraConnectionAttributes).append("endpointType", endpointType).append("tags", tags).append("endpointIdentifier", endpointIdentifier).append("password", password).append("certificateArn", certificateArn).append("mongoDbSettings", mongoDbSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpointType).append(endpointIdentifier).append(databaseName).append(serverName).append(dynamoDbSettings).append(mongoDbSettings).append(sslMode).append(tags).append(password).append(certificateArn).append(port).append(kmsKeyId).append(engineName).append(s3Settings).append(extraConnectionAttributes).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endpoint) == false) {
            return false;
        }
        Endpoint rhs = ((Endpoint) other);
        return new EqualsBuilder().append(endpointType, rhs.endpointType).append(endpointIdentifier, rhs.endpointIdentifier).append(databaseName, rhs.databaseName).append(serverName, rhs.serverName).append(dynamoDbSettings, rhs.dynamoDbSettings).append(mongoDbSettings, rhs.mongoDbSettings).append(sslMode, rhs.sslMode).append(tags, rhs.tags).append(password, rhs.password).append(certificateArn, rhs.certificateArn).append(port, rhs.port).append(kmsKeyId, rhs.kmsKeyId).append(engineName, rhs.engineName).append(s3Settings, rhs.s3Settings).append(extraConnectionAttributes, rhs.extraConnectionAttributes).append(username, rhs.username).isEquals();
    }

}
