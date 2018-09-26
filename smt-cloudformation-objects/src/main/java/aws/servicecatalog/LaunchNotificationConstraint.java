
package aws.servicecatalog;

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
 * LaunchNotificationConstraint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "NotificationArns",
    "AcceptLanguage",
    "PortfolioId",
    "ProductId"
})
public class LaunchNotificationConstraint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns
     * 
     */
    @JsonProperty("NotificationArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns")
    private List<CharSequence> notificationArns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid
     * 
     */
    @JsonProperty("PortfolioId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid")
    private CharSequence portfolioId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid
     * 
     */
    @JsonProperty("ProductId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid")
    private CharSequence productId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public LaunchNotificationConstraint withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns
     * 
     */
    public List<CharSequence> getNotificationArns() {
        return notificationArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns
     * 
     */
    public void setNotificationArns(List<CharSequence> notificationArns) {
        this.notificationArns = notificationArns;
    }

    public LaunchNotificationConstraint withNotificationArns(List<CharSequence> notificationArns) {
        this.notificationArns = notificationArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public LaunchNotificationConstraint withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid
     * 
     */
    public CharSequence getPortfolioId() {
        return portfolioId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid
     * 
     */
    public void setPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
    }

    public LaunchNotificationConstraint withPortfolioId(CharSequence portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid
     * 
     */
    public CharSequence getProductId() {
        return productId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid
     * 
     */
    public void setProductId(CharSequence productId) {
        this.productId = productId;
    }

    public LaunchNotificationConstraint withProductId(CharSequence productId) {
        this.productId = productId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("notificationArns", notificationArns).append("acceptLanguage", acceptLanguage).append("portfolioId", portfolioId).append("productId", productId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(acceptLanguage).append(portfolioId).append(notificationArns).append(productId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchNotificationConstraint) == false) {
            return false;
        }
        LaunchNotificationConstraint rhs = ((LaunchNotificationConstraint) other);
        return new EqualsBuilder().append(description, rhs.description).append(acceptLanguage, rhs.acceptLanguage).append(portfolioId, rhs.portfolioId).append(notificationArns, rhs.notificationArns).append(productId, rhs.productId).isEquals();
    }

}
