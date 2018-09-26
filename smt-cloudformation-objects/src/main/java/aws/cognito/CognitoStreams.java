
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CognitoStreams
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StreamingStatus",
    "StreamName",
    "RoleArn"
})
public class CognitoStreams {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus
     * 
     */
    @JsonProperty("StreamingStatus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus")
    private CharSequence streamingStatus;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname
     * 
     */
    @JsonProperty("StreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname")
    private CharSequence streamName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus
     * 
     */
    public CharSequence getStreamingStatus() {
        return streamingStatus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus
     * 
     */
    public void setStreamingStatus(CharSequence streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    public CognitoStreams withStreamingStatus(CharSequence streamingStatus) {
        this.streamingStatus = streamingStatus;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname
     * 
     */
    public CharSequence getStreamName() {
        return streamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname
     * 
     */
    public void setStreamName(CharSequence streamName) {
        this.streamName = streamName;
    }

    public CognitoStreams withStreamName(CharSequence streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public CognitoStreams withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("streamingStatus", streamingStatus).append("streamName", streamName).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(streamName).append(roleArn).append(streamingStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CognitoStreams) == false) {
            return false;
        }
        CognitoStreams rhs = ((CognitoStreams) other);
        return new EqualsBuilder().append(streamName, rhs.streamName).append(roleArn, rhs.roleArn).append(streamingStatus, rhs.streamingStatus).isEquals();
    }

}
