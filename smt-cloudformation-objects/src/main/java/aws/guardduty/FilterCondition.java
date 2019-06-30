
package aws.guardduty;

import java.util.ArrayList;
import java.util.List;
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
 * FilterCondition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Lt",
    "Gte",
    "Neq",
    "Eq",
    "Lte"
})
public class FilterCondition implements Property<FilterCondition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt
     * 
     */
    @JsonProperty("Lt")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt")
    private Number lt;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte
     * 
     */
    @JsonProperty("Gte")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte")
    private Number gte;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq
     * 
     */
    @JsonProperty("Neq")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq")
    private List<CharSequence> neq = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq
     * 
     */
    @JsonProperty("Eq")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq")
    private List<CharSequence> eq = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte
     * 
     */
    @JsonProperty("Lte")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte")
    private Number lte;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt
     * 
     */
    @JsonIgnore
    public Number getLt() {
        return lt;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt
     * 
     */
    @JsonIgnore
    public void setLt(Number lt) {
        this.lt = lt;
    }

    public FilterCondition withLt(Number lt) {
        this.lt = lt;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte
     * 
     */
    @JsonIgnore
    public Number getGte() {
        return gte;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte
     * 
     */
    @JsonIgnore
    public void setGte(Number gte) {
        this.gte = gte;
    }

    public FilterCondition withGte(Number gte) {
        this.gte = gte;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq
     * 
     */
    @JsonIgnore
    public List<CharSequence> getNeq() {
        return neq;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq
     * 
     */
    @JsonIgnore
    public void setNeq(List<CharSequence> neq) {
        this.neq = neq;
    }

    public FilterCondition withNeq(List<CharSequence> neq) {
        this.neq = neq;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq
     * 
     */
    @JsonIgnore
    public List<CharSequence> getEq() {
        return eq;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq
     * 
     */
    @JsonIgnore
    public void setEq(List<CharSequence> eq) {
        this.eq = eq;
    }

    public FilterCondition withEq(List<CharSequence> eq) {
        this.eq = eq;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte
     * 
     */
    @JsonIgnore
    public Number getLte() {
        return lte;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte
     * 
     */
    @JsonIgnore
    public void setLte(Number lte) {
        this.lte = lte;
    }

    public FilterCondition withLte(Number lte) {
        this.lte = lte;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lt", lt).append("gte", gte).append("neq", neq).append("eq", eq).append("lte", lte).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lt).append(gte).append(neq).append(eq).append(lte).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilterCondition) == false) {
            return false;
        }
        FilterCondition rhs = ((FilterCondition) other);
        return new EqualsBuilder().append(lt, rhs.lt).append(gte, rhs.gte).append(neq, rhs.neq).append(eq, rhs.eq).append(lte, rhs.lte).isEquals();
    }

}
