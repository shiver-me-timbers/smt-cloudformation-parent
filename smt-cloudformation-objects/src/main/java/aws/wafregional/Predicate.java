
package aws.wafregional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Predicate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "DataId",
    "Negated"
})
public class Predicate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid
     * 
     */
    @JsonProperty("DataId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid")
    private CharSequence dataId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated
     * 
     */
    @JsonProperty("Negated")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated")
    private Boolean negated;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Predicate withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid
     * 
     */
    public CharSequence getDataId() {
        return dataId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid
     * 
     */
    public void setDataId(CharSequence dataId) {
        this.dataId = dataId;
    }

    public Predicate withDataId(CharSequence dataId) {
        this.dataId = dataId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated
     * 
     */
    public Boolean getNegated() {
        return negated;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated
     * 
     */
    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    public Predicate withNegated(Boolean negated) {
        this.negated = negated;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("dataId", dataId).append("negated", negated).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(negated).append(type).append(dataId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Predicate) == false) {
            return false;
        }
        Predicate rhs = ((Predicate) other);
        return new EqualsBuilder().append(negated, rhs.negated).append(type, rhs.type).append(dataId, rhs.dataId).isEquals();
    }

}
