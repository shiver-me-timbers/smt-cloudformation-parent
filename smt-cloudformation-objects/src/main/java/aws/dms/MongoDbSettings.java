
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
    private CharSequence authSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism
     * 
     */
    @JsonProperty("AuthMechanism")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism")
    private CharSequence authMechanism;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username")
    private CharSequence username;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate
     * 
     */
    @JsonProperty("DocsToInvestigate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate")
    private CharSequence docsToInvestigate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername
     * 
     */
    @JsonProperty("ServerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername")
    private CharSequence serverName;
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
    private CharSequence extractDocId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename")
    private CharSequence databaseName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype
     * 
     */
    @JsonProperty("AuthType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype")
    private CharSequence authType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password")
    private CharSequence password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel
     * 
     */
    @JsonProperty("NestingLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel")
    private CharSequence nestingLevel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource
     * 
     */
    public CharSequence getAuthSource() {
        return authSource;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource
     * 
     */
    public void setAuthSource(CharSequence authSource) {
        this.authSource = authSource;
    }

    public MongoDbSettings withAuthSource(CharSequence authSource) {
        this.authSource = authSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism
     * 
     */
    public CharSequence getAuthMechanism() {
        return authMechanism;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism
     * 
     */
    public void setAuthMechanism(CharSequence authMechanism) {
        this.authMechanism = authMechanism;
    }

    public MongoDbSettings withAuthMechanism(CharSequence authMechanism) {
        this.authMechanism = authMechanism;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username
     * 
     */
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username
     * 
     */
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public MongoDbSettings withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate
     * 
     */
    public CharSequence getDocsToInvestigate() {
        return docsToInvestigate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate
     * 
     */
    public void setDocsToInvestigate(CharSequence docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
    }

    public MongoDbSettings withDocsToInvestigate(CharSequence docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername
     * 
     */
    public CharSequence getServerName() {
        return serverName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername
     * 
     */
    public void setServerName(CharSequence serverName) {
        this.serverName = serverName;
    }

    public MongoDbSettings withServerName(CharSequence serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port
     * 
     */
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
    public CharSequence getExtractDocId() {
        return extractDocId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid
     * 
     */
    public void setExtractDocId(CharSequence extractDocId) {
        this.extractDocId = extractDocId;
    }

    public MongoDbSettings withExtractDocId(CharSequence extractDocId) {
        this.extractDocId = extractDocId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename
     * 
     */
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename
     * 
     */
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public MongoDbSettings withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype
     * 
     */
    public CharSequence getAuthType() {
        return authType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype
     * 
     */
    public void setAuthType(CharSequence authType) {
        this.authType = authType;
    }

    public MongoDbSettings withAuthType(CharSequence authType) {
        this.authType = authType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password
     * 
     */
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password
     * 
     */
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public MongoDbSettings withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel
     * 
     */
    public CharSequence getNestingLevel() {
        return nestingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel
     * 
     */
    public void setNestingLevel(CharSequence nestingLevel) {
        this.nestingLevel = nestingLevel;
    }

    public MongoDbSettings withNestingLevel(CharSequence nestingLevel) {
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
