
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Resolver
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResponseMappingTemplateS3Location",
    "TypeName",
    "DataSourceName",
    "RequestMappingTemplate",
    "ResponseMappingTemplate",
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
    public CharSequence getResponseMappingTemplateS3Location() {
        return responseMappingTemplateS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location
     * 
     */
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
    public CharSequence getTypeName() {
        return typeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename
     * 
     */
    public void setTypeName(CharSequence typeName) {
        this.typeName = typeName;
    }

    public Resolver withTypeName(CharSequence typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename
     * 
     */
    public CharSequence getDataSourceName() {
        return dataSourceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename
     * 
     */
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
    public CharSequence getRequestMappingTemplate() {
        return requestMappingTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate
     * 
     */
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
    public CharSequence getResponseMappingTemplate() {
        return responseMappingTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate
     * 
     */
    public void setResponseMappingTemplate(CharSequence responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
    }

    public Resolver withResponseMappingTemplate(CharSequence responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location
     * 
     */
    public CharSequence getRequestMappingTemplateS3Location() {
        return requestMappingTemplateS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location
     * 
     */
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
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid
     * 
     */
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
    public CharSequence getFieldName() {
        return fieldName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname
     * 
     */
    public void setFieldName(CharSequence fieldName) {
        this.fieldName = fieldName;
    }

    public Resolver withFieldName(CharSequence fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("responseMappingTemplateS3Location", responseMappingTemplateS3Location).append("typeName", typeName).append("dataSourceName", dataSourceName).append("requestMappingTemplate", requestMappingTemplate).append("responseMappingTemplate", responseMappingTemplate).append("requestMappingTemplateS3Location", requestMappingTemplateS3Location).append("apiId", apiId).append("fieldName", fieldName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseMappingTemplate).append(fieldName).append(requestMappingTemplateS3Location).append(typeName).append(responseMappingTemplateS3Location).append(dataSourceName).append(requestMappingTemplate).append(apiId).toHashCode();
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
        return new EqualsBuilder().append(responseMappingTemplate, rhs.responseMappingTemplate).append(fieldName, rhs.fieldName).append(requestMappingTemplateS3Location, rhs.requestMappingTemplateS3Location).append(typeName, rhs.typeName).append(responseMappingTemplateS3Location, rhs.responseMappingTemplateS3Location).append(dataSourceName, rhs.dataSourceName).append(requestMappingTemplate, rhs.requestMappingTemplate).append(apiId, rhs.apiId).isEquals();
    }

}
