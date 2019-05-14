
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
 * CostTypes
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
public class CostTypes implements Property<CostTypes>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport
     * 
     */
    @JsonProperty("IncludeSupport")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport")
    private Boolean includeSupport;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription
     * 
     */
    @JsonProperty("IncludeOtherSubscription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription")
    private Boolean includeOtherSubscription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax
     * 
     */
    @JsonProperty("IncludeTax")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax")
    private Boolean includeTax;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription
     * 
     */
    @JsonProperty("IncludeSubscription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription")
    private Boolean includeSubscription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended
     * 
     */
    @JsonProperty("UseBlended")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended")
    private Boolean useBlended;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront
     * 
     */
    @JsonProperty("IncludeUpfront")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront")
    private Boolean includeUpfront;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount
     * 
     */
    @JsonProperty("IncludeDiscount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount")
    private Boolean includeDiscount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit
     * 
     */
    @JsonProperty("IncludeCredit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit")
    private Boolean includeCredit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring
     * 
     */
    @JsonProperty("IncludeRecurring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring")
    private Boolean includeRecurring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized
     * 
     */
    @JsonProperty("UseAmortized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized")
    private Boolean useAmortized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund
     * 
     */
    @JsonProperty("IncludeRefund")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund")
    private Boolean includeRefund;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport
     * 
     */
    @JsonIgnore
    public Boolean getIncludeSupport() {
        return includeSupport;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport
     * 
     */
    @JsonIgnore
    public void setIncludeSupport(Boolean includeSupport) {
        this.includeSupport = includeSupport;
    }

    public CostTypes withIncludeSupport(Boolean includeSupport) {
        this.includeSupport = includeSupport;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription
     * 
     */
    @JsonIgnore
    public Boolean getIncludeOtherSubscription() {
        return includeOtherSubscription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription
     * 
     */
    @JsonIgnore
    public void setIncludeOtherSubscription(Boolean includeOtherSubscription) {
        this.includeOtherSubscription = includeOtherSubscription;
    }

    public CostTypes withIncludeOtherSubscription(Boolean includeOtherSubscription) {
        this.includeOtherSubscription = includeOtherSubscription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax
     * 
     */
    @JsonIgnore
    public Boolean getIncludeTax() {
        return includeTax;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax
     * 
     */
    @JsonIgnore
    public void setIncludeTax(Boolean includeTax) {
        this.includeTax = includeTax;
    }

    public CostTypes withIncludeTax(Boolean includeTax) {
        this.includeTax = includeTax;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription
     * 
     */
    @JsonIgnore
    public Boolean getIncludeSubscription() {
        return includeSubscription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription
     * 
     */
    @JsonIgnore
    public void setIncludeSubscription(Boolean includeSubscription) {
        this.includeSubscription = includeSubscription;
    }

    public CostTypes withIncludeSubscription(Boolean includeSubscription) {
        this.includeSubscription = includeSubscription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended
     * 
     */
    @JsonIgnore
    public Boolean getUseBlended() {
        return useBlended;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended
     * 
     */
    @JsonIgnore
    public void setUseBlended(Boolean useBlended) {
        this.useBlended = useBlended;
    }

    public CostTypes withUseBlended(Boolean useBlended) {
        this.useBlended = useBlended;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront
     * 
     */
    @JsonIgnore
    public Boolean getIncludeUpfront() {
        return includeUpfront;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront
     * 
     */
    @JsonIgnore
    public void setIncludeUpfront(Boolean includeUpfront) {
        this.includeUpfront = includeUpfront;
    }

    public CostTypes withIncludeUpfront(Boolean includeUpfront) {
        this.includeUpfront = includeUpfront;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount
     * 
     */
    @JsonIgnore
    public Boolean getIncludeDiscount() {
        return includeDiscount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount
     * 
     */
    @JsonIgnore
    public void setIncludeDiscount(Boolean includeDiscount) {
        this.includeDiscount = includeDiscount;
    }

    public CostTypes withIncludeDiscount(Boolean includeDiscount) {
        this.includeDiscount = includeDiscount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit
     * 
     */
    @JsonIgnore
    public Boolean getIncludeCredit() {
        return includeCredit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit
     * 
     */
    @JsonIgnore
    public void setIncludeCredit(Boolean includeCredit) {
        this.includeCredit = includeCredit;
    }

    public CostTypes withIncludeCredit(Boolean includeCredit) {
        this.includeCredit = includeCredit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring
     * 
     */
    @JsonIgnore
    public Boolean getIncludeRecurring() {
        return includeRecurring;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring
     * 
     */
    @JsonIgnore
    public void setIncludeRecurring(Boolean includeRecurring) {
        this.includeRecurring = includeRecurring;
    }

    public CostTypes withIncludeRecurring(Boolean includeRecurring) {
        this.includeRecurring = includeRecurring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized
     * 
     */
    @JsonIgnore
    public Boolean getUseAmortized() {
        return useAmortized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized
     * 
     */
    @JsonIgnore
    public void setUseAmortized(Boolean useAmortized) {
        this.useAmortized = useAmortized;
    }

    public CostTypes withUseAmortized(Boolean useAmortized) {
        this.useAmortized = useAmortized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund
     * 
     */
    @JsonIgnore
    public Boolean getIncludeRefund() {
        return includeRefund;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund
     * 
     */
    @JsonIgnore
    public void setIncludeRefund(Boolean includeRefund) {
        this.includeRefund = includeRefund;
    }

    public CostTypes withIncludeRefund(Boolean includeRefund) {
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
        if ((other instanceof CostTypes) == false) {
            return false;
        }
        CostTypes rhs = ((CostTypes) other);
        return new EqualsBuilder().append(includeTax, rhs.includeTax).append(includeRecurring, rhs.includeRecurring).append(includeOtherSubscription, rhs.includeOtherSubscription).append(includeSupport, rhs.includeSupport).append(useBlended, rhs.useBlended).append(includeDiscount, rhs.includeDiscount).append(useAmortized, rhs.useAmortized).append(includeCredit, rhs.includeCredit).append(includeSubscription, rhs.includeSubscription).append(includeUpfront, rhs.includeUpfront).append(includeRefund, rhs.includeRefund).isEquals();
    }

}
