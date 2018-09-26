
package aws.dynamodb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StreamSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StreamViewType"
})
public class StreamSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype
     * 
     */
    @JsonProperty("StreamViewType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype")
    private CharSequence streamViewType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype
     * 
     */
    public CharSequence getStreamViewType() {
        return streamViewType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype
     * 
     */
    public void setStreamViewType(CharSequence streamViewType) {
        this.streamViewType = streamViewType;
    }

    public StreamSpecification withStreamViewType(CharSequence streamViewType) {
        this.streamViewType = streamViewType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("streamViewType", streamViewType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(streamViewType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamSpecification) == false) {
            return false;
        }
        StreamSpecification rhs = ((StreamSpecification) other);
        return new EqualsBuilder().append(streamViewType, rhs.streamViewType).isEquals();
    }

}
