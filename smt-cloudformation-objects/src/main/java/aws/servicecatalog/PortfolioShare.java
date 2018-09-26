
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PortfolioShare
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AccountId",
    "AcceptLanguage",
    "PortfolioId"
})
public class PortfolioShare {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid
     * 
     */
    @JsonProperty("AccountId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid")
    private CharSequence accountId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid
     * 
     */
    @JsonProperty("PortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid")
    private CharSequence portfolioId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid
     * 
     */
    public CharSequence getAccountId() {
        return accountId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid
     * 
     */
    public void setAccountId(CharSequence accountId) {
        this.accountId = accountId;
    }

    public PortfolioShare withAccountId(CharSequence accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public PortfolioShare withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid
     * 
     */
    public CharSequence getPortfolioId() {
        return portfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid
     * 
     */
    public void setPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
    }

    public PortfolioShare withPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accountId", accountId).append("acceptLanguage", acceptLanguage).append("portfolioId", portfolioId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(acceptLanguage).append(portfolioId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortfolioShare) == false) {
            return false;
        }
        PortfolioShare rhs = ((PortfolioShare) other);
        return new EqualsBuilder().append(accountId, rhs.accountId).append(acceptLanguage, rhs.acceptLanguage).append(portfolioId, rhs.portfolioId).isEquals();
    }

}
