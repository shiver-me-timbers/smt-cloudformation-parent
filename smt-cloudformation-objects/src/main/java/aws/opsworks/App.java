
package aws.opsworks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * App
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AppSource",
    "Attributes",
    "DataSources",
    "Description",
    "Domains",
    "EnableSsl",
    "Environment",
    "Name",
    "Shortname",
    "SslConfiguration",
    "StackId",
    "Type"
})
public class App {

    /**
     * DataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
     * 
     */
    @JsonProperty("AppSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html")
    private DataSource appSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes")
    private Map<String, String> attributes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources
     * 
     */
    @JsonProperty("DataSources")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources")
    private Set<DataSource> dataSources = new LinkedHashSet<DataSource>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description")
    private java.lang.String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains
     * 
     */
    @JsonProperty("Domains")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains")
    private List<java.lang.String> domains = new ArrayList<java.lang.String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl
     * 
     */
    @JsonProperty("EnableSsl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl")
    private Boolean enableSsl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment")
    private List<EnvironmentVariable> environment = new ArrayList<EnvironmentVariable>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name")
    private java.lang.String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname
     * 
     */
    @JsonProperty("Shortname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname")
    private java.lang.String shortname;
    /**
     * SslConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html
     * 
     */
    @JsonProperty("SslConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html")
    private SslConfiguration sslConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid
     * 
     */
    @JsonProperty("StackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid")
    private java.lang.String stackId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type")
    private java.lang.String type;

    /**
     * DataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
     * 
     */
    @JsonProperty("AppSource")
    public DataSource getAppSource() {
        return appSource;
    }

    /**
     * DataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
     * 
     */
    @JsonProperty("AppSource")
    public void setAppSource(DataSource appSource) {
        this.appSource = appSource;
    }

    public App withAppSource(DataSource appSource) {
        this.appSource = appSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes
     * 
     */
    @JsonProperty("Attributes")
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes
     * 
     */
    @JsonProperty("Attributes")
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public App withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources
     * 
     */
    @JsonProperty("DataSources")
    public Set<DataSource> getDataSources() {
        return dataSources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources
     * 
     */
    @JsonProperty("DataSources")
    public void setDataSources(Set<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public App withDataSources(Set<DataSource> dataSources) {
        this.dataSources = dataSources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description
     * 
     */
    @JsonProperty("Description")
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public App withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains
     * 
     */
    @JsonProperty("Domains")
    public List<java.lang.String> getDomains() {
        return domains;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains
     * 
     */
    @JsonProperty("Domains")
    public void setDomains(List<java.lang.String> domains) {
        this.domains = domains;
    }

    public App withDomains(List<java.lang.String> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl
     * 
     */
    @JsonProperty("EnableSsl")
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl
     * 
     */
    @JsonProperty("EnableSsl")
    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public App withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment
     * 
     */
    @JsonProperty("Environment")
    public List<EnvironmentVariable> getEnvironment() {
        return environment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment
     * 
     */
    @JsonProperty("Environment")
    public void setEnvironment(List<EnvironmentVariable> environment) {
        this.environment = environment;
    }

    public App withEnvironment(List<EnvironmentVariable> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name
     * 
     */
    @JsonProperty("Name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name
     * 
     */
    @JsonProperty("Name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public App withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname
     * 
     */
    @JsonProperty("Shortname")
    public java.lang.String getShortname() {
        return shortname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname
     * 
     */
    @JsonProperty("Shortname")
    public void setShortname(java.lang.String shortname) {
        this.shortname = shortname;
    }

    public App withShortname(java.lang.String shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * SslConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html
     * 
     */
    @JsonProperty("SslConfiguration")
    public SslConfiguration getSslConfiguration() {
        return sslConfiguration;
    }

    /**
     * SslConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html
     * 
     */
    @JsonProperty("SslConfiguration")
    public void setSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
    }

    public App withSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid
     * 
     */
    @JsonProperty("StackId")
    public java.lang.String getStackId() {
        return stackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid
     * 
     */
    @JsonProperty("StackId")
    public void setStackId(java.lang.String stackId) {
        this.stackId = stackId;
    }

    public App withStackId(java.lang.String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type
     * 
     */
    @JsonProperty("Type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type
     * 
     */
    @JsonProperty("Type")
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public App withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("appSource", appSource).append("attributes", attributes).append("dataSources", dataSources).append("description", description).append("domains", domains).append("enableSsl", enableSsl).append("environment", environment).append("name", name).append("shortname", shortname).append("sslConfiguration", sslConfiguration).append("stackId", stackId).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stackId).append(description).append(domains).append(type).append(shortname).append(enableSsl).append(sslConfiguration).append(environment).append(name).append(attributes).append(appSource).append(dataSources).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof App) == false) {
            return false;
        }
        App rhs = ((App) other);
        return new EqualsBuilder().append(stackId, rhs.stackId).append(description, rhs.description).append(domains, rhs.domains).append(type, rhs.type).append(shortname, rhs.shortname).append(enableSsl, rhs.enableSsl).append(sslConfiguration, rhs.sslConfiguration).append(environment, rhs.environment).append(name, rhs.name).append(attributes, rhs.attributes).append(appSource, rhs.appSource).append(dataSources, rhs.dataSources).isEquals();
    }

}
