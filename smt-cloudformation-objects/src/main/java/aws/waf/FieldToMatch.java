
package aws.waf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FieldToMatch
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Data",
    "Type"
})
public class FieldToMatch {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data
     * 
     */
    @JsonProperty("Data")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data")
    private CharSequence data;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data
     * 
     */
    public CharSequence getData() {
        return data;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data
     * 
     */
    public void setData(CharSequence data) {
        this.data = data;
    }

    public FieldToMatch withData(CharSequence data) {
        this.data = data;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public FieldToMatch withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(data).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FieldToMatch) == false) {
            return false;
        }
        FieldToMatch rhs = ((FieldToMatch) other);
        return new EqualsBuilder().append(data, rhs.data).append(type, rhs.type).isEquals();
    }

}
