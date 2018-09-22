
package aws.dms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MongoDbSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AuthSource",
    "AuthMechanism",
    "Username",
    "DocsToInvestigate",
    "ServerName",
    "Port",
    "ExtractDocId",
    "DatabaseName",
    "AuthType",
    "Password",
    "NestingLevel"
})
public class MongoDbSettings {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource
     * 
     */
    @JsonProperty("AuthSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource")
    private String authSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism
     * 
     */
    @JsonProperty("AuthMechanism")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism")
    private String authMechanism;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username")
    private String username;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate
     * 
     */
    @JsonProperty("DocsToInvestigate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate")
    private String docsToInvestigate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername
     * 
     */
    @JsonProperty("ServerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername")
    private String serverName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid
     * 
     */
    @JsonProperty("ExtractDocId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid")
    private String extractDocId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename")
    private String databaseName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype
     * 
     */
    @JsonProperty("AuthType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype")
    private String authType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password")
    private String password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel
     * 
     */
    @JsonProperty("NestingLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel")
    private String nestingLevel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource
     * 
     */
    @JsonProperty("AuthSource")
    public String getAuthSource() {
        return authSource;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource
     * 
     */
    @JsonProperty("AuthSource")
    public void setAuthSource(String authSource) {
        this.authSource = authSource;
    }

    public MongoDbSettings withAuthSource(String authSource) {
        this.authSource = authSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism
     * 
     */
    @JsonProperty("AuthMechanism")
    public String getAuthMechanism() {
        return authMechanism;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism
     * 
     */
    @JsonProperty("AuthMechanism")
    public void setAuthMechanism(String authMechanism) {
        this.authMechanism = authMechanism;
    }

    public MongoDbSettings withAuthMechanism(String authMechanism) {
        this.authMechanism = authMechanism;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username
     * 
     */
    @JsonProperty("Username")
    public String getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username
     * 
     */
    @JsonProperty("Username")
    public void setUsername(String username) {
        this.username = username;
    }

    public MongoDbSettings withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate
     * 
     */
    @JsonProperty("DocsToInvestigate")
    public String getDocsToInvestigate() {
        return docsToInvestigate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate
     * 
     */
    @JsonProperty("DocsToInvestigate")
    public void setDocsToInvestigate(String docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
    }

    public MongoDbSettings withDocsToInvestigate(String docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername
     * 
     */
    @JsonProperty("ServerName")
    public String getServerName() {
        return serverName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername
     * 
     */
    @JsonProperty("ServerName")
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public MongoDbSettings withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port
     * 
     */
    @JsonProperty("Port")
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port
     * 
     */
    @JsonProperty("Port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public MongoDbSettings withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid
     * 
     */
    @JsonProperty("ExtractDocId")
    public String getExtractDocId() {
        return extractDocId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid
     * 
     */
    @JsonProperty("ExtractDocId")
    public void setExtractDocId(String extractDocId) {
        this.extractDocId = extractDocId;
    }

    public MongoDbSettings withExtractDocId(String extractDocId) {
        this.extractDocId = extractDocId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public MongoDbSettings withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype
     * 
     */
    @JsonProperty("AuthType")
    public String getAuthType() {
        return authType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype
     * 
     */
    @JsonProperty("AuthType")
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public MongoDbSettings withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password
     * 
     */
    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password
     * 
     */
    @JsonProperty("Password")
    public void setPassword(String password) {
        this.password = password;
    }

    public MongoDbSettings withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel
     * 
     */
    @JsonProperty("NestingLevel")
    public String getNestingLevel() {
        return nestingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel
     * 
     */
    @JsonProperty("NestingLevel")
    public void setNestingLevel(String nestingLevel) {
        this.nestingLevel = nestingLevel;
    }

    public MongoDbSettings withNestingLevel(String nestingLevel) {
        this.nestingLevel = nestingLevel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("authSource", authSource).append("authMechanism", authMechanism).append("username", username).append("docsToInvestigate", docsToInvestigate).append("serverName", serverName).append("port", port).append("extractDocId", extractDocId).append("databaseName", databaseName).append("authType", authType).append("password", password).append("nestingLevel", nestingLevel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nestingLevel).append(docsToInvestigate).append(password).append(authSource).append(databaseName).append(authMechanism).append(port).append(serverName).append(extractDocId).append(authType).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MongoDbSettings) == false) {
            return false;
        }
        MongoDbSettings rhs = ((MongoDbSettings) other);
        return new EqualsBuilder().append(nestingLevel, rhs.nestingLevel).append(docsToInvestigate, rhs.docsToInvestigate).append(password, rhs.password).append(authSource, rhs.authSource).append(databaseName, rhs.databaseName).append(authMechanism, rhs.authMechanism).append(port, rhs.port).append(serverName, rhs.serverName).append(extractDocId, rhs.extractDocId).append(authType, rhs.authType).append(username, rhs.username).isEquals();
    }

}
