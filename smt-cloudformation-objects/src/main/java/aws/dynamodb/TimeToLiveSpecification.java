
package aws.dynamodb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TimeToLiveSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AttributeName",
    "Enabled"
})
public class TimeToLiveSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename
     * 
     */
    @JsonProperty("AttributeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename")
    private CharSequence attributeName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled")
    private Boolean enabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename
     * 
     */
    public CharSequence getAttributeName() {
        return attributeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename
     * 
     */
    public void setAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
    }

    public TimeToLiveSpecification withAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public TimeToLiveSpecification withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributeName", attributeName).append("enabled", enabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributeName).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeToLiveSpecification) == false) {
            return false;
        }
        TimeToLiveSpecification rhs = ((TimeToLiveSpecification) other);
        return new EqualsBuilder().append(attributeName, rhs.attributeName).append(enabled, rhs.enabled).isEquals();
    }

}
