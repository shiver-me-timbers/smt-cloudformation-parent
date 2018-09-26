
package aws.config;

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
 * OrganizationAggregationSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllAwsRegions",
    "AwsRegions",
    "RoleArn"
})
public class OrganizationAggregationSource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions
     * 
     */
    @JsonProperty("AllAwsRegions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions")
    private Boolean allAwsRegions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions
     * 
     */
    @JsonProperty("AwsRegions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions")
    private List<CharSequence> awsRegions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions
     * 
     */
    public Boolean getAllAwsRegions() {
        return allAwsRegions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions
     * 
     */
    public void setAllAwsRegions(Boolean allAwsRegions) {
        this.allAwsRegions = allAwsRegions;
    }

    public OrganizationAggregationSource withAllAwsRegions(Boolean allAwsRegions) {
        this.allAwsRegions = allAwsRegions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions
     * 
     */
    public List<CharSequence> getAwsRegions() {
        return awsRegions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions
     * 
     */
    public void setAwsRegions(List<CharSequence> awsRegions) {
        this.awsRegions = awsRegions;
    }

    public OrganizationAggregationSource withAwsRegions(List<CharSequence> awsRegions) {
        this.awsRegions = awsRegions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public OrganizationAggregationSource withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allAwsRegions", allAwsRegions).append("awsRegions", awsRegions).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsRegions).append(roleArn).append(allAwsRegions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationAggregationSource) == false) {
            return false;
        }
        OrganizationAggregationSource rhs = ((OrganizationAggregationSource) other);
        return new EqualsBuilder().append(awsRegions, rhs.awsRegions).append(roleArn, rhs.roleArn).append(allAwsRegions, rhs.allAwsRegions).isEquals();
    }

}
