
package shiver.me.timbers.aws.dynamodb;

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
 * TablePointInTimeRecoverySpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PointInTimeRecoveryEnabled"
})
public class TablePointInTimeRecoverySpecification implements Property<TablePointInTimeRecoverySpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled
     * 
     */
    @JsonProperty("PointInTimeRecoveryEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled")
    private CharSequence pointInTimeRecoveryEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled
     * 
     */
    @JsonIgnore
    public CharSequence getPointInTimeRecoveryEnabled() {
        return pointInTimeRecoveryEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled
     * 
     */
    @JsonIgnore
    public void setPointInTimeRecoveryEnabled(CharSequence pointInTimeRecoveryEnabled) {
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
    }

    public TablePointInTimeRecoverySpecification withPointInTimeRecoveryEnabled(CharSequence pointInTimeRecoveryEnabled) {
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pointInTimeRecoveryEnabled", pointInTimeRecoveryEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pointInTimeRecoveryEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TablePointInTimeRecoverySpecification) == false) {
            return false;
        }
        TablePointInTimeRecoverySpecification rhs = ((TablePointInTimeRecoverySpecification) other);
        return new EqualsBuilder().append(pointInTimeRecoveryEnabled, rhs.pointInTimeRecoveryEnabled).isEquals();
    }

}
