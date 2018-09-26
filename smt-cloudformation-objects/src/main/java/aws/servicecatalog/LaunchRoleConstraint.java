
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LaunchRoleConstraint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "AcceptLanguage",
    "PortfolioId",
    "ProductId",
    "RoleArn"
})
public class LaunchRoleConstraint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid
     * 
     */
    @JsonProperty("PortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid")
    private CharSequence portfolioId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid
     * 
     */
    @JsonProperty("ProductId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid")
    private CharSequence productId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public LaunchRoleConstraint withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public LaunchRoleConstraint withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid
     * 
     */
    public CharSequence getPortfolioId() {
        return portfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid
     * 
     */
    public void setPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
    }

    public LaunchRoleConstraint withPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid
     * 
     */
    public CharSequence getProductId() {
        return productId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid
     * 
     */
    public void setProductId(CharSequence productId) {
        this.productId = productId;
    }

    public LaunchRoleConstraint withProductId(CharSequence productId) {
        this.productId = productId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public LaunchRoleConstraint withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("acceptLanguage", acceptLanguage).append("portfolioId", portfolioId).append("productId", productId).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(acceptLanguage).append(portfolioId).append(productId).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchRoleConstraint) == false) {
            return false;
        }
        LaunchRoleConstraint rhs = ((LaunchRoleConstraint) other);
        return new EqualsBuilder().append(description, rhs.description).append(acceptLanguage, rhs.acceptLanguage).append(portfolioId, rhs.portfolioId).append(productId, rhs.productId).append(roleArn, rhs.roleArn).isEquals();
    }

}
