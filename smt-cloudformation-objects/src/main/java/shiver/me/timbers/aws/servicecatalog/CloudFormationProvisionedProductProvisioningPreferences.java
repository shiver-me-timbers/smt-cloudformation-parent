
package shiver.me.timbers.aws.servicecatalog;

import java.util.ArrayList;
import java.util.List;
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
 * CloudFormationProvisionedProductProvisioningPreferences
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "StackSetAccounts",
    "StackSetFailureToleranceCount",
    "StackSetMaxConcurrencyPercentage",
    "StackSetMaxConcurrencyCount",
    "StackSetRegions",
    "StackSetOperationType",
    "StackSetFailureTolerancePercentage"
})
public class CloudFormationProvisionedProductProvisioningPreferences implements Property<CloudFormationProvisionedProductProvisioningPreferences>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetaccounts
     * 
     */
    @JsonProperty("StackSetAccounts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetaccounts")
    private List<CharSequence> stackSetAccounts = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancecount
     * 
     */
    @JsonProperty("StackSetFailureToleranceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancecount")
    private Number stackSetFailureToleranceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencypercentage
     * 
     */
    @JsonProperty("StackSetMaxConcurrencyPercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencypercentage")
    private Number stackSetMaxConcurrencyPercentage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencycount
     * 
     */
    @JsonProperty("StackSetMaxConcurrencyCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencycount")
    private Number stackSetMaxConcurrencyCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetregions
     * 
     */
    @JsonProperty("StackSetRegions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetregions")
    private List<CharSequence> stackSetRegions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetoperationtype
     * 
     */
    @JsonProperty("StackSetOperationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetoperationtype")
    private CharSequence stackSetOperationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancepercentage
     * 
     */
    @JsonProperty("StackSetFailureTolerancePercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancepercentage")
    private Number stackSetFailureTolerancePercentage;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetaccounts
     * 
     */
    @JsonIgnore
    public List<CharSequence> getStackSetAccounts() {
        return stackSetAccounts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetaccounts
     * 
     */
    @JsonIgnore
    public void setStackSetAccounts(List<CharSequence> stackSetAccounts) {
        this.stackSetAccounts = stackSetAccounts;
    }

    public CloudFormationProvisionedProductProvisioningPreferences withStackSetAccounts(List<CharSequence> stackSetAccounts) {
        this.stackSetAccounts = stackSetAccounts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancecount
     * 
     */
    @JsonIgnore
    public Number getStackSetFailureToleranceCount() {
        return stackSetFailureToleranceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancecount
     * 
     */
    @JsonIgnore
    public void setStackSetFailureToleranceCount(Number stackSetFailureToleranceCount) {
        this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
    }

    public CloudFormationProvisionedProductProvisioningPreferences withStackSetFailureToleranceCount(Number stackSetFailureToleranceCount) {
        this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencypercentage
     * 
     */
    @JsonIgnore
    public Number getStackSetMaxConcurrencyPercentage() {
        return stackSetMaxConcurrencyPercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencypercentage
     * 
     */
    @JsonIgnore
    public void setStackSetMaxConcurrencyPercentage(Number stackSetMaxConcurrencyPercentage) {
        this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
    }

    public CloudFormationProvisionedProductProvisioningPreferences withStackSetMaxConcurrencyPercentage(Number stackSetMaxConcurrencyPercentage) {
        this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencycount
     * 
     */
    @JsonIgnore
    public Number getStackSetMaxConcurrencyCount() {
        return stackSetMaxConcurrencyCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencycount
     * 
     */
    @JsonIgnore
    public void setStackSetMaxConcurrencyCount(Number stackSetMaxConcurrencyCount) {
        this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
    }

    public CloudFormationProvisionedProductProvisioningPreferences withStackSetMaxConcurrencyCount(Number stackSetMaxConcurrencyCount) {
        this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetregions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getStackSetRegions() {
        return stackSetRegions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetregions
     * 
     */
    @JsonIgnore
    public void setStackSetRegions(List<CharSequence> stackSetRegions) {
        this.stackSetRegions = stackSetRegions;
    }

    public CloudFormationProvisionedProductProvisioningPreferences withStackSetRegions(List<CharSequence> stackSetRegions) {
        this.stackSetRegions = stackSetRegions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetoperationtype
     * 
     */
    @JsonIgnore
    public CharSequence getStackSetOperationType() {
        return stackSetOperationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetoperationtype
     * 
     */
    @JsonIgnore
    public void setStackSetOperationType(CharSequence stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType;
    }

    public CloudFormationProvisionedProductProvisioningPreferences withStackSetOperationType(CharSequence stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancepercentage
     * 
     */
    @JsonIgnore
    public Number getStackSetFailureTolerancePercentage() {
        return stackSetFailureTolerancePercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancepercentage
     * 
     */
    @JsonIgnore
    public void setStackSetFailureTolerancePercentage(Number stackSetFailureTolerancePercentage) {
        this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
    }

    public CloudFormationProvisionedProductProvisioningPreferences withStackSetFailureTolerancePercentage(Number stackSetFailureTolerancePercentage) {
        this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stackSetAccounts", stackSetAccounts).append("stackSetFailureToleranceCount", stackSetFailureToleranceCount).append("stackSetMaxConcurrencyPercentage", stackSetMaxConcurrencyPercentage).append("stackSetMaxConcurrencyCount", stackSetMaxConcurrencyCount).append("stackSetRegions", stackSetRegions).append("stackSetOperationType", stackSetOperationType).append("stackSetFailureTolerancePercentage", stackSetFailureTolerancePercentage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stackSetAccounts).append(stackSetFailureToleranceCount).append(stackSetMaxConcurrencyCount).append(stackSetFailureTolerancePercentage).append(stackSetRegions).append(stackSetOperationType).append(stackSetMaxConcurrencyPercentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudFormationProvisionedProductProvisioningPreferences) == false) {
            return false;
        }
        CloudFormationProvisionedProductProvisioningPreferences rhs = ((CloudFormationProvisionedProductProvisioningPreferences) other);
        return new EqualsBuilder().append(stackSetAccounts, rhs.stackSetAccounts).append(stackSetFailureToleranceCount, rhs.stackSetFailureToleranceCount).append(stackSetMaxConcurrencyCount, rhs.stackSetMaxConcurrencyCount).append(stackSetFailureTolerancePercentage, rhs.stackSetFailureTolerancePercentage).append(stackSetRegions, rhs.stackSetRegions).append(stackSetOperationType, rhs.stackSetOperationType).append(stackSetMaxConcurrencyPercentage, rhs.stackSetMaxConcurrencyPercentage).isEquals();
    }

}
