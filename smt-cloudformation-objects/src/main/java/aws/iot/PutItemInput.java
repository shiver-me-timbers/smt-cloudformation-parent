
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PutItemInput
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TableName"
})
public class PutItemInput {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename")
    private CharSequence tableName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename
     * 
     */
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename
     * 
     */
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public PutItemInput withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableName", tableName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tableName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PutItemInput) == false) {
            return false;
        }
        PutItemInput rhs = ((PutItemInput) other);
        return new EqualsBuilder().append(tableName, rhs.tableName).isEquals();
    }

}
