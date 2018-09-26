
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PortfolioPrincipalAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PrincipalARN",
    "AcceptLanguage",
    "PortfolioId",
    "PrincipalType"
})
public class PortfolioPrincipalAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn
     * 
     */
    @JsonProperty("PrincipalARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn")
    private CharSequence principalARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid
     * 
     */
    @JsonProperty("PortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid")
    private CharSequence portfolioId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype
     * 
     */
    @JsonProperty("PrincipalType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype")
    private CharSequence principalType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn
     * 
     */
    public CharSequence getPrincipalARN() {
        return principalARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn
     * 
     */
    public void setPrincipalARN(CharSequence principalARN) {
        this.principalARN = principalARN;
    }

    public PortfolioPrincipalAssociation withPrincipalARN(CharSequence principalARN) {
        this.principalARN = principalARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public PortfolioPrincipalAssociation withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid
     * 
     */
    public CharSequence getPortfolioId() {
        return portfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid
     * 
     */
    public void setPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
    }

    public PortfolioPrincipalAssociation withPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype
     * 
     */
    public CharSequence getPrincipalType() {
        return principalType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype
     * 
     */
    public void setPrincipalType(CharSequence principalType) {
        this.principalType = principalType;
    }

    public PortfolioPrincipalAssociation withPrincipalType(CharSequence principalType) {
        this.principalType = principalType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("principalARN", principalARN).append("acceptLanguage", acceptLanguage).append("portfolioId", portfolioId).append("principalType", principalType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceptLanguage).append(portfolioId).append(principalARN).append(principalType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortfolioPrincipalAssociation) == false) {
            return false;
        }
        PortfolioPrincipalAssociation rhs = ((PortfolioPrincipalAssociation) other);
        return new EqualsBuilder().append(acceptLanguage, rhs.acceptLanguage).append(portfolioId, rhs.portfolioId).append(principalARN, rhs.principalARN).append(principalType, rhs.principalType).isEquals();
    }

}
