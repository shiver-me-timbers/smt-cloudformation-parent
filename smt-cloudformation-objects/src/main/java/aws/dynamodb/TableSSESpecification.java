
package aws.dynamodb;

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
 * TableSSESpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SSEEnabled"
})
public class TableSSESpecification implements Property<TableSSESpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    @JsonProperty("SSEEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled")
    private CharSequence sSEEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    @JsonIgnore
    public CharSequence getSSEEnabled() {
        return sSEEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    @JsonIgnore
    public void setSSEEnabled(CharSequence sSEEnabled) {
        this.sSEEnabled = sSEEnabled;
    }

    public TableSSESpecification withSSEEnabled(CharSequence sSEEnabled) {
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
        if ((other instanceof TableSSESpecification) == false) {
            return false;
        }
        TableSSESpecification rhs = ((TableSSESpecification) other);
        return new EqualsBuilder().append(sSEEnabled, rhs.sSEEnabled).isEquals();
    }

}
