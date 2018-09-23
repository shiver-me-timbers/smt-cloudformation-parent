
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticsearchConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AwsRegion",
    "Endpoint"
})
public class ElasticsearchConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion
     * 
     */
    @JsonProperty("AwsRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion")
    private String awsRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint")
    private String endpoint;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion
     * 
     */
    @JsonProperty("AwsRegion")
    public String getAwsRegion() {
        return awsRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion
     * 
     */
    @JsonProperty("AwsRegion")
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    public ElasticsearchConfig withAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ElasticsearchConfig withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("awsRegion", awsRegion).append("endpoint", endpoint).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsRegion).append(endpoint).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticsearchConfig) == false) {
            return false;
        }
        ElasticsearchConfig rhs = ((ElasticsearchConfig) other);
        return new EqualsBuilder().append(awsRegion, rhs.awsRegion).append(endpoint, rhs.endpoint).isEquals();
    }

}