
package shiver.me.timbers.aws.appsync;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FunctionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResponseMappingTemplateS3Location",
    "Description",
    "DataSourceName",
    "RequestMappingTemplate",
    "ResponseMappingTemplate",
    "FunctionVersion",
    "RequestMappingTemplateS3Location",
    "ApiId",
    "Name"
})
public class FunctionConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location
     * 
     */
    @JsonProperty("ResponseMappingTemplateS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location")
    private CharSequence responseMappingTemplateS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename
     * 
     */
    @JsonProperty("DataSourceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename")
    private CharSequence dataSourceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate
     * 
     */
    @JsonProperty("RequestMappingTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate")
    private CharSequence requestMappingTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate
     * 
     */
    @JsonProperty("ResponseMappingTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate")
    private CharSequence responseMappingTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion
     * 
     */
    @JsonProperty("FunctionVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion")
    private CharSequence functionVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location
     * 
     */
    @JsonProperty("RequestMappingTemplateS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location")
    private CharSequence requestMappingTemplateS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid")
    private CharSequence apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location
     * 
     */
    @JsonIgnore
    public CharSequence getResponseMappingTemplateS3Location() {
        return responseMappingTemplateS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location
     * 
     */
    @JsonIgnore
    public void setResponseMappingTemplateS3Location(CharSequence responseMappingTemplateS3Location) {
        this.responseMappingTemplateS3Location = responseMappingTemplateS3Location;
    }

    public FunctionConfiguration withResponseMappingTemplateS3Location(CharSequence responseMappingTemplateS3Location) {
        this.responseMappingTemplateS3Location = responseMappingTemplateS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public FunctionConfiguration withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename
     * 
     */
    @JsonIgnore
    public CharSequence getDataSourceName() {
        return dataSourceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename
     * 
     */
    @JsonIgnore
    public void setDataSourceName(CharSequence dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public FunctionConfiguration withDataSourceName(CharSequence dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate
     * 
     */
    @JsonIgnore
    public CharSequence getRequestMappingTemplate() {
        return requestMappingTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate
     * 
     */
    @JsonIgnore
    public void setRequestMappingTemplate(CharSequence requestMappingTemplate) {
        this.requestMappingTemplate = requestMappingTemplate;
    }

    public FunctionConfiguration withRequestMappingTemplate(CharSequence requestMappingTemplate) {
        this.requestMappingTemplate = requestMappingTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate
     * 
     */
    @JsonIgnore
    public CharSequence getResponseMappingTemplate() {
        return responseMappingTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate
     * 
     */
    @JsonIgnore
    public void setResponseMappingTemplate(CharSequence responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
    }

    public FunctionConfiguration withResponseMappingTemplate(CharSequence responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionVersion() {
        return functionVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion
     * 
     */
    @JsonIgnore
    public void setFunctionVersion(CharSequence functionVersion) {
        this.functionVersion = functionVersion;
    }

    public FunctionConfiguration withFunctionVersion(CharSequence functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location
     * 
     */
    @JsonIgnore
    public CharSequence getRequestMappingTemplateS3Location() {
        return requestMappingTemplateS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location
     * 
     */
    @JsonIgnore
    public void setRequestMappingTemplateS3Location(CharSequence requestMappingTemplateS3Location) {
        this.requestMappingTemplateS3Location = requestMappingTemplateS3Location;
    }

    public FunctionConfiguration withRequestMappingTemplateS3Location(CharSequence requestMappingTemplateS3Location) {
        this.requestMappingTemplateS3Location = requestMappingTemplateS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid
     * 
     */
    @JsonIgnore
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid
     * 
     */
    @JsonIgnore
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public FunctionConfiguration withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public FunctionConfiguration withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("responseMappingTemplateS3Location", responseMappingTemplateS3Location).append("description", description).append("dataSourceName", dataSourceName).append("requestMappingTemplate", requestMappingTemplate).append("responseMappingTemplate", responseMappingTemplate).append("functionVersion", functionVersion).append("requestMappingTemplateS3Location", requestMappingTemplateS3Location).append("apiId", apiId).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseMappingTemplate).append(functionVersion).append(requestMappingTemplateS3Location).append(name).append(responseMappingTemplateS3Location).append(description).append(dataSourceName).append(requestMappingTemplate).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionConfiguration) == false) {
            return false;
        }
        FunctionConfiguration rhs = ((FunctionConfiguration) other);
        return new EqualsBuilder().append(responseMappingTemplate, rhs.responseMappingTemplate).append(functionVersion, rhs.functionVersion).append(requestMappingTemplateS3Location, rhs.requestMappingTemplateS3Location).append(name, rhs.name).append(responseMappingTemplateS3Location, rhs.responseMappingTemplateS3Location).append(description, rhs.description).append(dataSourceName, rhs.dataSourceName).append(requestMappingTemplate, rhs.requestMappingTemplate).append(apiId, rhs.apiId).isEquals();
    }

}
