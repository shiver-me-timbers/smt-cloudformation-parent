
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LaunchTemplateConstraint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "AcceptLanguage",
    "PortfolioId",
    "ProductId",
    "Rules"
})
public class LaunchTemplateConstraint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-portfolioid
     * 
     */
    @JsonProperty("PortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-portfolioid")
    private CharSequence portfolioId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-productid
     * 
     */
    @JsonProperty("ProductId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-productid")
    private CharSequence productId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-rules")
    private CharSequence rules;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public LaunchTemplateConstraint withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public LaunchTemplateConstraint withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-portfolioid
     * 
     */
    public CharSequence getPortfolioId() {
        return portfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-portfolioid
     * 
     */
    public void setPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
    }

    public LaunchTemplateConstraint withPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-productid
     * 
     */
    public CharSequence getProductId() {
        return productId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-productid
     * 
     */
    public void setProductId(CharSequence productId) {
        this.productId = productId;
    }

    public LaunchTemplateConstraint withProductId(CharSequence productId) {
        this.productId = productId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-rules
     * 
     */
    public CharSequence getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-rules
     * 
     */
    public void setRules(CharSequence rules) {
        this.rules = rules;
    }

    public LaunchTemplateConstraint withRules(CharSequence rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("acceptLanguage", acceptLanguage).append("portfolioId", portfolioId).append("productId", productId).append("rules", rules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(rules).append(acceptLanguage).append(portfolioId).append(productId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateConstraint) == false) {
            return false;
        }
        LaunchTemplateConstraint rhs = ((LaunchTemplateConstraint) other);
        return new EqualsBuilder().append(description, rhs.description).append(rules, rhs.rules).append(acceptLanguage, rhs.acceptLanguage).append(portfolioId, rhs.portfolioId).append(productId, rhs.productId).isEquals();
    }

}
