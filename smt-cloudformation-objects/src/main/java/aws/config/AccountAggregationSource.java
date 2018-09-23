
package aws.config;

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
 * AccountAggregationSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllAwsRegions",
    "AwsRegions",
    "AccountIds"
})
public class AccountAggregationSource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions
     * 
     */
    @JsonProperty("AllAwsRegions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions")
    private Boolean allAwsRegions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions
     * 
     */
    @JsonProperty("AwsRegions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions")
    private List<String> awsRegions = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids
     * 
     */
    @JsonProperty("AccountIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids")
    private List<String> accountIds = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions
     * 
     */
    @JsonProperty("AllAwsRegions")
    public Boolean getAllAwsRegions() {
        return allAwsRegions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions
     * 
     */
    @JsonProperty("AllAwsRegions")
    public void setAllAwsRegions(Boolean allAwsRegions) {
        this.allAwsRegions = allAwsRegions;
    }

    public AccountAggregationSource withAllAwsRegions(Boolean allAwsRegions) {
        this.allAwsRegions = allAwsRegions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions
     * 
     */
    @JsonProperty("AwsRegions")
    public List<String> getAwsRegions() {
        return awsRegions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions
     * 
     */
    @JsonProperty("AwsRegions")
    public void setAwsRegions(List<String> awsRegions) {
        this.awsRegions = awsRegions;
    }

    public AccountAggregationSource withAwsRegions(List<String> awsRegions) {
        this.awsRegions = awsRegions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids
     * 
     */
    @JsonProperty("AccountIds")
    public List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids
     * 
     */
    @JsonProperty("AccountIds")
    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }

    public AccountAggregationSource withAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allAwsRegions", allAwsRegions).append("awsRegions", awsRegions).append("accountIds", accountIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsRegions).append(accountIds).append(allAwsRegions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountAggregationSource) == false) {
            return false;
        }
        AccountAggregationSource rhs = ((AccountAggregationSource) other);
        return new EqualsBuilder().append(awsRegions, rhs.awsRegions).append(accountIds, rhs.accountIds).append(allAwsRegions, rhs.allAwsRegions).isEquals();
    }

}