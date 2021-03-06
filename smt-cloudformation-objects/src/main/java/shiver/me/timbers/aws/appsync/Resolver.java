
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
 * Resolver
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResponseMappingTemplateS3Location",
    "TypeName",
    "PipelineConfig",
    "DataSourceName",
    "RequestMappingTemplate",
    "ResponseMappingTemplate",
    "Kind",
    "CachingConfig",
    "SyncConfig",
    "RequestMappingTemplateS3Location",
    "ApiId",
    "FieldName"
})
public class Resolver {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location
     * 
     */
    @JsonProperty("ResponseMappingTemplateS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location")
    private CharSequence responseMappingTemplateS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename
     * 
     */
    @JsonProperty("TypeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename")
    private CharSequence typeName;
    /**
     * ResolverPipelineConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html
     * 
     */
    @JsonProperty("PipelineConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html")
    private Property<ResolverPipelineConfig> pipelineConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename
     * 
     */
    @JsonProperty("DataSourceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename")
    private CharSequence dataSourceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate
     * 
     */
    @JsonProperty("RequestMappingTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate")
    private CharSequence requestMappingTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate
     * 
     */
    @JsonProperty("ResponseMappingTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate")
    private CharSequence responseMappingTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-kind
     * 
     */
    @JsonProperty("Kind")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-kind")
    private CharSequence kind;
    /**
     * ResolverCachingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html
     * 
     */
    @JsonProperty("CachingConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html")
    private Property<ResolverCachingConfig> cachingConfig;
    /**
     * ResolverSyncConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html
     * 
     */
    @JsonProperty("SyncConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html")
    private Property<ResolverSyncConfig> syncConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location
     * 
     */
    @JsonProperty("RequestMappingTemplateS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location")
    private CharSequence requestMappingTemplateS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid")
    private CharSequence apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname
     * 
     */
    @JsonProperty("FieldName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname")
    private CharSequence fieldName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location
     * 
     */
    @JsonIgnore
    public CharSequence getResponseMappingTemplateS3Location() {
        return responseMappingTemplateS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location
     * 
     */
    @JsonIgnore
    public void setResponseMappingTemplateS3Location(CharSequence responseMappingTemplateS3Location) {
        this.responseMappingTemplateS3Location = responseMappingTemplateS3Location;
    }

    public Resolver withResponseMappingTemplateS3Location(CharSequence responseMappingTemplateS3Location) {
        this.responseMappingTemplateS3Location = responseMappingTemplateS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename
     * 
     */
    @JsonIgnore
    public CharSequence getTypeName() {
        return typeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename
     * 
     */
    @JsonIgnore
    public void setTypeName(CharSequence typeName) {
        this.typeName = typeName;
    }

    public Resolver withTypeName(CharSequence typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * ResolverPipelineConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html
     * 
     */
    @JsonIgnore
    public Property<ResolverPipelineConfig> getPipelineConfig() {
        return pipelineConfig;
    }

    /**
     * ResolverPipelineConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html
     * 
     */
    @JsonIgnore
    public void setPipelineConfig(Property<ResolverPipelineConfig> pipelineConfig) {
        this.pipelineConfig = pipelineConfig;
    }

    public Resolver withPipelineConfig(Property<ResolverPipelineConfig> pipelineConfig) {
        this.pipelineConfig = pipelineConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename
     * 
     */
    @JsonIgnore
    public CharSequence getDataSourceName() {
        return dataSourceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename
     * 
     */
    @JsonIgnore
    public void setDataSourceName(CharSequence dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public Resolver withDataSourceName(CharSequence dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate
     * 
     */
    @JsonIgnore
    public CharSequence getRequestMappingTemplate() {
        return requestMappingTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate
     * 
     */
    @JsonIgnore
    public void setRequestMappingTemplate(CharSequence requestMappingTemplate) {
        this.requestMappingTemplate = requestMappingTemplate;
    }

    public Resolver withRequestMappingTemplate(CharSequence requestMappingTemplate) {
        this.requestMappingTemplate = requestMappingTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate
     * 
     */
    @JsonIgnore
    public CharSequence getResponseMappingTemplate() {
        return responseMappingTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate
     * 
     */
    @JsonIgnore
    public void setResponseMappingTemplate(CharSequence responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
    }

    public Resolver withResponseMappingTemplate(CharSequence responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-kind
     * 
     */
    @JsonIgnore
    public CharSequence getKind() {
        return kind;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-kind
     * 
     */
    @JsonIgnore
    public void setKind(CharSequence kind) {
        this.kind = kind;
    }

    public Resolver withKind(CharSequence kind) {
        this.kind = kind;
        return this;
    }

    /**
     * ResolverCachingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html
     * 
     */
    @JsonIgnore
    public Property<ResolverCachingConfig> getCachingConfig() {
        return cachingConfig;
    }

    /**
     * ResolverCachingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html
     * 
     */
    @JsonIgnore
    public void setCachingConfig(Property<ResolverCachingConfig> cachingConfig) {
        this.cachingConfig = cachingConfig;
    }

    public Resolver withCachingConfig(Property<ResolverCachingConfig> cachingConfig) {
        this.cachingConfig = cachingConfig;
        return this;
    }

    /**
     * ResolverSyncConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html
     * 
     */
    @JsonIgnore
    public Property<ResolverSyncConfig> getSyncConfig() {
        return syncConfig;
    }

    /**
     * ResolverSyncConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html
     * 
     */
    @JsonIgnore
    public void setSyncConfig(Property<ResolverSyncConfig> syncConfig) {
        this.syncConfig = syncConfig;
    }

    public Resolver withSyncConfig(Property<ResolverSyncConfig> syncConfig) {
        this.syncConfig = syncConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location
     * 
     */
    @JsonIgnore
    public CharSequence getRequestMappingTemplateS3Location() {
        return requestMappingTemplateS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location
     * 
     */
    @JsonIgnore
    public void setRequestMappingTemplateS3Location(CharSequence requestMappingTemplateS3Location) {
        this.requestMappingTemplateS3Location = requestMappingTemplateS3Location;
    }

    public Resolver withRequestMappingTemplateS3Location(CharSequence requestMappingTemplateS3Location) {
        this.requestMappingTemplateS3Location = requestMappingTemplateS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid
     * 
     */
    @JsonIgnore
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid
     * 
     */
    @JsonIgnore
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public Resolver withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname
     * 
     */
    @JsonIgnore
    public CharSequence getFieldName() {
        return fieldName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname
     * 
     */
    @JsonIgnore
    public void setFieldName(CharSequence fieldName) {
        this.fieldName = fieldName;
    }

    public Resolver withFieldName(CharSequence fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("responseMappingTemplateS3Location", responseMappingTemplateS3Location).append("typeName", typeName).append("pipelineConfig", pipelineConfig).append("dataSourceName", dataSourceName).append("requestMappingTemplate", requestMappingTemplate).append("responseMappingTemplate", responseMappingTemplate).append("kind", kind).append("cachingConfig", cachingConfig).append("syncConfig", syncConfig).append("requestMappingTemplateS3Location", requestMappingTemplateS3Location).append("apiId", apiId).append("fieldName", fieldName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fieldName).append(pipelineConfig).append(kind).append(typeName).append(dataSourceName).append(requestMappingTemplate).append(responseMappingTemplate).append(requestMappingTemplateS3Location).append(responseMappingTemplateS3Location).append(syncConfig).append(cachingConfig).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resolver) == false) {
            return false;
        }
        Resolver rhs = ((Resolver) other);
        return new EqualsBuilder().append(fieldName, rhs.fieldName).append(pipelineConfig, rhs.pipelineConfig).append(kind, rhs.kind).append(typeName, rhs.typeName).append(dataSourceName, rhs.dataSourceName).append(requestMappingTemplate, rhs.requestMappingTemplate).append(responseMappingTemplate, rhs.responseMappingTemplate).append(requestMappingTemplateS3Location, rhs.requestMappingTemplateS3Location).append(responseMappingTemplateS3Location, rhs.responseMappingTemplateS3Location).append(syncConfig, rhs.syncConfig).append(cachingConfig, rhs.cachingConfig).append(apiId, rhs.apiId).isEquals();
    }

}
