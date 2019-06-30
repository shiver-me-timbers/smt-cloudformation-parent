
package aws.dms;

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
 * EndpointElasticsearchSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EndpointUri",
    "FullLoadErrorPercentage",
    "ErrorRetryDuration",
    "ServiceAccessRoleArn"
})
public class EndpointElasticsearchSettings implements Property<EndpointElasticsearchSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-endpointuri
     * 
     */
    @JsonProperty("EndpointUri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-endpointuri")
    private CharSequence endpointUri;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-fullloaderrorpercentage
     * 
     */
    @JsonProperty("FullLoadErrorPercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-fullloaderrorpercentage")
    private Number fullLoadErrorPercentage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-errorretryduration
     * 
     */
    @JsonProperty("ErrorRetryDuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-errorretryduration")
    private Number errorRetryDuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-serviceaccessrolearn
     * 
     */
    @JsonProperty("ServiceAccessRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-serviceaccessrolearn")
    private CharSequence serviceAccessRoleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-endpointuri
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointUri() {
        return endpointUri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-endpointuri
     * 
     */
    @JsonIgnore
    public void setEndpointUri(CharSequence endpointUri) {
        this.endpointUri = endpointUri;
    }

    public EndpointElasticsearchSettings withEndpointUri(CharSequence endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-fullloaderrorpercentage
     * 
     */
    @JsonIgnore
    public Number getFullLoadErrorPercentage() {
        return fullLoadErrorPercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-fullloaderrorpercentage
     * 
     */
    @JsonIgnore
    public void setFullLoadErrorPercentage(Number fullLoadErrorPercentage) {
        this.fullLoadErrorPercentage = fullLoadErrorPercentage;
    }

    public EndpointElasticsearchSettings withFullLoadErrorPercentage(Number fullLoadErrorPercentage) {
        this.fullLoadErrorPercentage = fullLoadErrorPercentage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-errorretryduration
     * 
     */
    @JsonIgnore
    public Number getErrorRetryDuration() {
        return errorRetryDuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-errorretryduration
     * 
     */
    @JsonIgnore
    public void setErrorRetryDuration(Number errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
    }

    public EndpointElasticsearchSettings withErrorRetryDuration(Number errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-serviceaccessrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-serviceaccessrolearn
     * 
     */
    @JsonIgnore
    public void setServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    public EndpointElasticsearchSettings withServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endpointUri", endpointUri).append("fullLoadErrorPercentage", fullLoadErrorPercentage).append("errorRetryDuration", errorRetryDuration).append("serviceAccessRoleArn", serviceAccessRoleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceAccessRoleArn).append(endpointUri).append(errorRetryDuration).append(fullLoadErrorPercentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointElasticsearchSettings) == false) {
            return false;
        }
        EndpointElasticsearchSettings rhs = ((EndpointElasticsearchSettings) other);
        return new EqualsBuilder().append(serviceAccessRoleArn, rhs.serviceAccessRoleArn).append(endpointUri, rhs.endpointUri).append(errorRetryDuration, rhs.errorRetryDuration).append(fullLoadErrorPercentage, rhs.fullLoadErrorPercentage).isEquals();
    }

}
