
package aws.guardduty;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Condition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Lt",
    "Gte",
    "Neq",
    "Eq",
    "Lte"
})
public class Condition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt
     * 
     */
    @JsonProperty("Lt")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt")
    private Integer lt;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte
     * 
     */
    @JsonProperty("Gte")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte")
    private Integer gte;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq
     * 
     */
    @JsonProperty("Neq")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq")
    private List<String> neq = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq
     * 
     */
    @JsonProperty("Eq")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq")
    private List<String> eq = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte
     * 
     */
    @JsonProperty("Lte")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte")
    private Integer lte;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt
     * 
     */
    @JsonProperty("Lt")
    public Integer getLt() {
        return lt;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt
     * 
     */
    @JsonProperty("Lt")
    public void setLt(Integer lt) {
        this.lt = lt;
    }

    public Condition withLt(Integer lt) {
        this.lt = lt;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte
     * 
     */
    @JsonProperty("Gte")
    public Integer getGte() {
        return gte;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte
     * 
     */
    @JsonProperty("Gte")
    public void setGte(Integer gte) {
        this.gte = gte;
    }

    public Condition withGte(Integer gte) {
        this.gte = gte;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq
     * 
     */
    @JsonProperty("Neq")
    public List<String> getNeq() {
        return neq;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq
     * 
     */
    @JsonProperty("Neq")
    public void setNeq(List<String> neq) {
        this.neq = neq;
    }

    public Condition withNeq(List<String> neq) {
        this.neq = neq;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq
     * 
     */
    @JsonProperty("Eq")
    public List<String> getEq() {
        return eq;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq
     * 
     */
    @JsonProperty("Eq")
    public void setEq(List<String> eq) {
        this.eq = eq;
    }

    public Condition withEq(List<String> eq) {
        this.eq = eq;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte
     * 
     */
    @JsonProperty("Lte")
    public Integer getLte() {
        return lte;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte
     * 
     */
    @JsonProperty("Lte")
    public void setLte(Integer lte) {
        this.lte = lte;
    }

    public Condition withLte(Integer lte) {
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
        if ((other instanceof Condition) == false) {
            return false;
        }
        Condition rhs = ((Condition) other);
        return new EqualsBuilder().append(lt, rhs.lt).append(gte, rhs.gte).append(neq, rhs.neq).append(eq, rhs.eq).append(lte, rhs.lte).isEquals();
    }

}