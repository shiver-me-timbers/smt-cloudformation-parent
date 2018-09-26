
package aws.servicecatalog;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Portfolio
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ProviderName",
    "Description",
    "DisplayName",
    "AcceptLanguage",
    "Tags"
})
public class Portfolio {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername
     * 
     */
    @JsonProperty("ProviderName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername")
    private CharSequence providerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname
     * 
     */
    @JsonProperty("DisplayName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname")
    private CharSequence displayName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage
     * 
     */
    @JsonProperty("AcceptLanguage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage")
    private CharSequence acceptLanguage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername
     * 
     */
    public CharSequence getProviderName() {
        return providerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername
     * 
     */
    public void setProviderName(CharSequence providerName) {
        this.providerName = providerName;
    }

    public Portfolio withProviderName(CharSequence providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Portfolio withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname
     * 
     */
    public CharSequence getDisplayName() {
        return displayName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname
     * 
     */
    public void setDisplayName(CharSequence displayName) {
        this.displayName = displayName;
    }

    public Portfolio withDisplayName(CharSequence displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage
     * 
     */
    public CharSequence getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage
     * 
     */
    public void setAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public Portfolio withAcceptLanguage(CharSequence acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Portfolio withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("providerName", providerName).append("description", description).append("displayName", displayName).append("acceptLanguage", acceptLanguage).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(acceptLanguage).append(providerName).append(displayName).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Portfolio) == false) {
            return false;
        }
        Portfolio rhs = ((Portfolio) other);
        return new EqualsBuilder().append(description, rhs.description).append(acceptLanguage, rhs.acceptLanguage).append(providerName, rhs.providerName).append(displayName, rhs.displayName).append(tags, rhs.tags).isEquals();
    }

}
