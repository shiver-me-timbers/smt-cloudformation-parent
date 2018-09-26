
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ActionTypeId
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Category",
    "Owner",
    "Provider",
    "Version"
})
public class ActionTypeId {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-category
     * 
     */
    @JsonProperty("Category")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-category")
    private CharSequence category;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-owner
     * 
     */
    @JsonProperty("Owner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-owner")
    private CharSequence owner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-provider
     * 
     */
    @JsonProperty("Provider")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-provider")
    private CharSequence provider;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-version")
    private CharSequence version;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-category
     * 
     */
    public CharSequence getCategory() {
        return category;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-category
     * 
     */
    public void setCategory(CharSequence category) {
        this.category = category;
    }

    public ActionTypeId withCategory(CharSequence category) {
        this.category = category;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-owner
     * 
     */
    public CharSequence getOwner() {
        return owner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-owner
     * 
     */
    public void setOwner(CharSequence owner) {
        this.owner = owner;
    }

    public ActionTypeId withOwner(CharSequence owner) {
        this.owner = owner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-provider
     * 
     */
    public CharSequence getProvider() {
        return provider;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-provider
     * 
     */
    public void setProvider(CharSequence provider) {
        this.provider = provider;
    }

    public ActionTypeId withProvider(CharSequence provider) {
        this.provider = provider;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-version
     * 
     */
    public CharSequence getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-version
     * 
     */
    public void setVersion(CharSequence version) {
        this.version = version;
    }

    public ActionTypeId withVersion(CharSequence version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("category", category).append("owner", owner).append("provider", provider).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(owner).append(category).append(provider).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActionTypeId) == false) {
            return false;
        }
        ActionTypeId rhs = ((ActionTypeId) other);
        return new EqualsBuilder().append(owner, rhs.owner).append(category, rhs.category).append(provider, rhs.provider).append(version, rhs.version).isEquals();
    }

}
