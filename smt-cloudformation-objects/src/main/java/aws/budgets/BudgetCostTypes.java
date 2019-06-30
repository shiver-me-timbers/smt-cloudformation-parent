
package aws.budgets;

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
 * BudgetCostTypes
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IncludeSupport",
    "IncludeOtherSubscription",
    "IncludeTax",
    "IncludeSubscription",
    "UseBlended",
    "IncludeUpfront",
    "IncludeDiscount",
    "IncludeCredit",
    "IncludeRecurring",
    "UseAmortized",
    "IncludeRefund"
})
public class BudgetCostTypes implements Property<BudgetCostTypes>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport
     * 
     */
    @JsonProperty("IncludeSupport")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport")
    private CharSequence includeSupport;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription
     * 
     */
    @JsonProperty("IncludeOtherSubscription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription")
    private CharSequence includeOtherSubscription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax
     * 
     */
    @JsonProperty("IncludeTax")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax")
    private CharSequence includeTax;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription
     * 
     */
    @JsonProperty("IncludeSubscription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription")
    private CharSequence includeSubscription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended
     * 
     */
    @JsonProperty("UseBlended")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended")
    private CharSequence useBlended;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront
     * 
     */
    @JsonProperty("IncludeUpfront")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront")
    private CharSequence includeUpfront;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount
     * 
     */
    @JsonProperty("IncludeDiscount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount")
    private CharSequence includeDiscount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit
     * 
     */
    @JsonProperty("IncludeCredit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit")
    private CharSequence includeCredit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring
     * 
     */
    @JsonProperty("IncludeRecurring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring")
    private CharSequence includeRecurring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized
     * 
     */
    @JsonProperty("UseAmortized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized")
    private CharSequence useAmortized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund
     * 
     */
    @JsonProperty("IncludeRefund")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund")
    private CharSequence includeRefund;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeSupport() {
        return includeSupport;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport
     * 
     */
    @JsonIgnore
    public void setIncludeSupport(CharSequence includeSupport) {
        this.includeSupport = includeSupport;
    }

    public BudgetCostTypes withIncludeSupport(CharSequence includeSupport) {
        this.includeSupport = includeSupport;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeOtherSubscription() {
        return includeOtherSubscription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription
     * 
     */
    @JsonIgnore
    public void setIncludeOtherSubscription(CharSequence includeOtherSubscription) {
        this.includeOtherSubscription = includeOtherSubscription;
    }

    public BudgetCostTypes withIncludeOtherSubscription(CharSequence includeOtherSubscription) {
        this.includeOtherSubscription = includeOtherSubscription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeTax() {
        return includeTax;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax
     * 
     */
    @JsonIgnore
    public void setIncludeTax(CharSequence includeTax) {
        this.includeTax = includeTax;
    }

    public BudgetCostTypes withIncludeTax(CharSequence includeTax) {
        this.includeTax = includeTax;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeSubscription() {
        return includeSubscription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription
     * 
     */
    @JsonIgnore
    public void setIncludeSubscription(CharSequence includeSubscription) {
        this.includeSubscription = includeSubscription;
    }

    public BudgetCostTypes withIncludeSubscription(CharSequence includeSubscription) {
        this.includeSubscription = includeSubscription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended
     * 
     */
    @JsonIgnore
    public CharSequence getUseBlended() {
        return useBlended;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended
     * 
     */
    @JsonIgnore
    public void setUseBlended(CharSequence useBlended) {
        this.useBlended = useBlended;
    }

    public BudgetCostTypes withUseBlended(CharSequence useBlended) {
        this.useBlended = useBlended;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeUpfront() {
        return includeUpfront;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront
     * 
     */
    @JsonIgnore
    public void setIncludeUpfront(CharSequence includeUpfront) {
        this.includeUpfront = includeUpfront;
    }

    public BudgetCostTypes withIncludeUpfront(CharSequence includeUpfront) {
        this.includeUpfront = includeUpfront;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeDiscount() {
        return includeDiscount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount
     * 
     */
    @JsonIgnore
    public void setIncludeDiscount(CharSequence includeDiscount) {
        this.includeDiscount = includeDiscount;
    }

    public BudgetCostTypes withIncludeDiscount(CharSequence includeDiscount) {
        this.includeDiscount = includeDiscount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeCredit() {
        return includeCredit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit
     * 
     */
    @JsonIgnore
    public void setIncludeCredit(CharSequence includeCredit) {
        this.includeCredit = includeCredit;
    }

    public BudgetCostTypes withIncludeCredit(CharSequence includeCredit) {
        this.includeCredit = includeCredit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeRecurring() {
        return includeRecurring;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring
     * 
     */
    @JsonIgnore
    public void setIncludeRecurring(CharSequence includeRecurring) {
        this.includeRecurring = includeRecurring;
    }

    public BudgetCostTypes withIncludeRecurring(CharSequence includeRecurring) {
        this.includeRecurring = includeRecurring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized
     * 
     */
    @JsonIgnore
    public CharSequence getUseAmortized() {
        return useAmortized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized
     * 
     */
    @JsonIgnore
    public void setUseAmortized(CharSequence useAmortized) {
        this.useAmortized = useAmortized;
    }

    public BudgetCostTypes withUseAmortized(CharSequence useAmortized) {
        this.useAmortized = useAmortized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeRefund() {
        return includeRefund;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund
     * 
     */
    @JsonIgnore
    public void setIncludeRefund(CharSequence includeRefund) {
        this.includeRefund = includeRefund;
    }

    public BudgetCostTypes withIncludeRefund(CharSequence includeRefund) {
        this.includeRefund = includeRefund;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("includeSupport", includeSupport).append("includeOtherSubscription", includeOtherSubscription).append("includeTax", includeTax).append("includeSubscription", includeSubscription).append("useBlended", useBlended).append("includeUpfront", includeUpfront).append("includeDiscount", includeDiscount).append("includeCredit", includeCredit).append("includeRecurring", includeRecurring).append("useAmortized", useAmortized).append("includeRefund", includeRefund).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(includeTax).append(includeRecurring).append(includeOtherSubscription).append(includeSupport).append(useBlended).append(includeDiscount).append(useAmortized).append(includeCredit).append(includeSubscription).append(includeUpfront).append(includeRefund).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetCostTypes) == false) {
            return false;
        }
        BudgetCostTypes rhs = ((BudgetCostTypes) other);
        return new EqualsBuilder().append(includeTax, rhs.includeTax).append(includeRecurring, rhs.includeRecurring).append(includeOtherSubscription, rhs.includeOtherSubscription).append(includeSupport, rhs.includeSupport).append(useBlended, rhs.useBlended).append(includeDiscount, rhs.includeDiscount).append(useAmortized, rhs.useAmortized).append(includeCredit, rhs.includeCredit).append(includeSubscription, rhs.includeSubscription).append(includeUpfront, rhs.includeUpfront).append(includeRefund, rhs.includeRefund).isEquals();
    }

}
