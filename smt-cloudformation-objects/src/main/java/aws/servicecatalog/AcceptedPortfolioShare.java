
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AcceptedPortfolioShare
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AcceptLanguage",
    "PortfolioId"
})
public class AcceptedPortfolioShare {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid
     * 
     */
    @JsonProperty("PortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid")
    private CharSequence portfolioId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public AcceptedPortfolioShare withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid
     * 
     */
    public CharSequence getPortfolioId() {
        return portfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid
     * 
     */
    public void setPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
    }

    public AcceptedPortfolioShare withPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("acceptLanguage", acceptLanguage).append("portfolioId", portfolioId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceptLanguage).append(portfolioId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcceptedPortfolioShare) == false) {
            return false;
        }
        AcceptedPortfolioShare rhs = ((AcceptedPortfolioShare) other);
        return new EqualsBuilder().append(acceptLanguage, rhs.acceptLanguage).append(portfolioId, rhs.portfolioId).isEquals();
    }

}
