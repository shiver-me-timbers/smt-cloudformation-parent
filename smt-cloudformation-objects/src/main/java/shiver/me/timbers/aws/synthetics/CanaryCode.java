
package shiver.me.timbers.aws.synthetics;

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
 * CanaryCode
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Bucket",
    "S3Key",
    "S3ObjectVersion",
    "Script",
    "Handler"
})
public class CanaryCode implements Property<CanaryCode>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3bucket
     * 
     */
    @JsonProperty("S3Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3bucket")
    private CharSequence s3Bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3key
     * 
     */
    @JsonProperty("S3Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3key")
    private CharSequence s3Key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3objectversion
     * 
     */
    @JsonProperty("S3ObjectVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3objectversion")
    private CharSequence s3ObjectVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-script
     * 
     */
    @JsonProperty("Script")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-script")
    private CharSequence script;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-handler
     * 
     */
    @JsonProperty("Handler")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-handler")
    private CharSequence handler;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3bucket
     * 
     */
    @JsonIgnore
    public CharSequence getS3Bucket() {
        return s3Bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3bucket
     * 
     */
    @JsonIgnore
    public void setS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public CanaryCode withS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3key
     * 
     */
    @JsonIgnore
    public CharSequence getS3Key() {
        return s3Key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3key
     * 
     */
    @JsonIgnore
    public void setS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
    }

    public CanaryCode withS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3objectversion
     * 
     */
    @JsonIgnore
    public CharSequence getS3ObjectVersion() {
        return s3ObjectVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3objectversion
     * 
     */
    @JsonIgnore
    public void setS3ObjectVersion(CharSequence s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    public CanaryCode withS3ObjectVersion(CharSequence s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-script
     * 
     */
    @JsonIgnore
    public CharSequence getScript() {
        return script;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-script
     * 
     */
    @JsonIgnore
    public void setScript(CharSequence script) {
        this.script = script;
    }

    public CanaryCode withScript(CharSequence script) {
        this.script = script;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-handler
     * 
     */
    @JsonIgnore
    public CharSequence getHandler() {
        return handler;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-handler
     * 
     */
    @JsonIgnore
    public void setHandler(CharSequence handler) {
        this.handler = handler;
    }

    public CanaryCode withHandler(CharSequence handler) {
        this.handler = handler;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Bucket", s3Bucket).append("s3Key", s3Key).append("s3ObjectVersion", s3ObjectVersion).append("script", script).append("handler", handler).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3ObjectVersion).append(handler).append(s3Key).append(s3Bucket).append(script).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CanaryCode) == false) {
            return false;
        }
        CanaryCode rhs = ((CanaryCode) other);
        return new EqualsBuilder().append(s3ObjectVersion, rhs.s3ObjectVersion).append(handler, rhs.handler).append(s3Key, rhs.s3Key).append(s3Bucket, rhs.s3Bucket).append(script, rhs.script).isEquals();
    }

}
