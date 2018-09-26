
package aws.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AggregationAuthorization
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AuthorizedAccountId",
    "AuthorizedAwsRegion"
})
public class AggregationAuthorization {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid
     * 
     */
    @JsonProperty("AuthorizedAccountId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid")
    private CharSequence authorizedAccountId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion
     * 
     */
    @JsonProperty("AuthorizedAwsRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion")
    private CharSequence authorizedAwsRegion;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid
     * 
     */
    public CharSequence getAuthorizedAccountId() {
        return authorizedAccountId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid
     * 
     */
    public void setAuthorizedAccountId(CharSequence authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
    }

    public AggregationAuthorization withAuthorizedAccountId(CharSequence authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion
     * 
     */
    public CharSequence getAuthorizedAwsRegion() {
        return authorizedAwsRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion
     * 
     */
    public void setAuthorizedAwsRegion(CharSequence authorizedAwsRegion) {
        this.authorizedAwsRegion = authorizedAwsRegion;
    }

    public AggregationAuthorization withAuthorizedAwsRegion(CharSequence authorizedAwsRegion) {
        this.authorizedAwsRegion = authorizedAwsRegion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("authorizedAccountId", authorizedAccountId).append("authorizedAwsRegion", authorizedAwsRegion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authorizedAwsRegion).append(authorizedAccountId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AggregationAuthorization) == false) {
            return false;
        }
        AggregationAuthorization rhs = ((AggregationAuthorization) other);
        return new EqualsBuilder().append(authorizedAwsRegion, rhs.authorizedAwsRegion).append(authorizedAccountId, rhs.authorizedAccountId).isEquals();
    }

}
