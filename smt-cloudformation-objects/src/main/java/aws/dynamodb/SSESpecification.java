
package aws.dynamodb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SSESpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SSEEnabled"
})
public class SSESpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    @JsonProperty("SSEEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled")
    private Boolean sSEEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    public Boolean getSSEEnabled() {
        return sSEEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    public void setSSEEnabled(Boolean sSEEnabled) {
        this.sSEEnabled = sSEEnabled;
    }

    public SSESpecification withSSEEnabled(Boolean sSEEnabled) {
        this.sSEEnabled = sSEEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sSEEnabled", sSEEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sSEEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SSESpecification) == false) {
            return false;
        }
        SSESpecification rhs = ((SSESpecification) other);
        return new EqualsBuilder().append(sSEEnabled, rhs.sSEEnabled).isEquals();
    }

}
