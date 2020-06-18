
package shiver.me.timbers.aws.ec2;

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
 * LaunchTemplateMetadataOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HttpPutResponseHopLimit",
    "HttpTokens",
    "HttpEndpoint"
})
public class LaunchTemplateMetadataOptions implements Property<LaunchTemplateMetadataOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit
     * 
     */
    @JsonProperty("HttpPutResponseHopLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit")
    private Number httpPutResponseHopLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens
     * 
     */
    @JsonProperty("HttpTokens")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens")
    private CharSequence httpTokens;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint
     * 
     */
    @JsonProperty("HttpEndpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint")
    private CharSequence httpEndpoint;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit
     * 
     */
    @JsonIgnore
    public Number getHttpPutResponseHopLimit() {
        return httpPutResponseHopLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit
     * 
     */
    @JsonIgnore
    public void setHttpPutResponseHopLimit(Number httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    public LaunchTemplateMetadataOptions withHttpPutResponseHopLimit(Number httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens
     * 
     */
    @JsonIgnore
    public CharSequence getHttpTokens() {
        return httpTokens;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens
     * 
     */
    @JsonIgnore
    public void setHttpTokens(CharSequence httpTokens) {
        this.httpTokens = httpTokens;
    }

    public LaunchTemplateMetadataOptions withHttpTokens(CharSequence httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint
     * 
     */
    @JsonIgnore
    public CharSequence getHttpEndpoint() {
        return httpEndpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint
     * 
     */
    @JsonIgnore
    public void setHttpEndpoint(CharSequence httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    public LaunchTemplateMetadataOptions withHttpEndpoint(CharSequence httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("httpPutResponseHopLimit", httpPutResponseHopLimit).append("httpTokens", httpTokens).append("httpEndpoint", httpEndpoint).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(httpEndpoint).append(httpPutResponseHopLimit).append(httpTokens).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateMetadataOptions) == false) {
            return false;
        }
        LaunchTemplateMetadataOptions rhs = ((LaunchTemplateMetadataOptions) other);
        return new EqualsBuilder().append(httpEndpoint, rhs.httpEndpoint).append(httpPutResponseHopLimit, rhs.httpPutResponseHopLimit).append(httpTokens, rhs.httpTokens).isEquals();
    }

}
