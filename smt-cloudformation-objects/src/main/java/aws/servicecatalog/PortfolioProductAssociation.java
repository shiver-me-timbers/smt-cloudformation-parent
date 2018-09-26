
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PortfolioProductAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SourcePortfolioId",
    "AcceptLanguage",
    "PortfolioId",
    "ProductId"
})
public class PortfolioProductAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid
     * 
     */
    @JsonProperty("SourcePortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid")
    private CharSequence sourcePortfolioId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid
     * 
     */
    @JsonProperty("PortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid")
    private CharSequence portfolioId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid
     * 
     */
    @JsonProperty("ProductId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid")
    private CharSequence productId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid
     * 
     */
    public CharSequence getSourcePortfolioId() {
        return sourcePortfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid
     * 
     */
    public void setSourcePortfolioId(CharSequence sourcePortfolioId) {
        this.sourcePortfolioId = sourcePortfolioId;
    }

    public PortfolioProductAssociation withSourcePortfolioId(CharSequence sourcePortfolioId) {
        this.sourcePortfolioId = sourcePortfolioId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public PortfolioProductAssociation withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid
     * 
     */
    public CharSequence getPortfolioId() {
        return portfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid
     * 
     */
    public void setPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
    }

    public PortfolioProductAssociation withPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid
     * 
     */
    public CharSequence getProductId() {
        return productId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid
     * 
     */
    public void setProductId(CharSequence productId) {
        this.productId = productId;
    }

    public PortfolioProductAssociation withProductId(CharSequence productId) {
        this.productId = productId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourcePortfolioId", sourcePortfolioId).append("acceptLanguage", acceptLanguage).append("portfolioId", portfolioId).append("productId", productId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceptLanguage).append(portfolioId).append(productId).append(sourcePortfolioId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortfolioProductAssociation) == false) {
            return false;
        }
        PortfolioProductAssociation rhs = ((PortfolioProductAssociation) other);
        return new EqualsBuilder().append(acceptLanguage, rhs.acceptLanguage).append(portfolioId, rhs.portfolioId).append(productId, rhs.productId).append(sourcePortfolioId, rhs.sourcePortfolioId).isEquals();
    }

}
