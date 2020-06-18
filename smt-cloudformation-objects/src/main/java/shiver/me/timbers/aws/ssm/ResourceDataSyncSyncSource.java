
package shiver.me.timbers.aws.ssm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ResourceDataSyncSyncSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourceType",
    "AwsOrganizationsSource",
    "IncludeFutureRegions",
    "SourceRegions"
})
public class ResourceDataSyncSyncSource implements Property<ResourceDataSyncSyncSource>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourcetype
     * 
     */
    @JsonProperty("SourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourcetype")
    private CharSequence sourceType;
    /**
     * ResourceDataSyncAwsOrganizationsSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html
     * 
     */
    @JsonProperty("AwsOrganizationsSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html")
    private Property<ResourceDataSyncAwsOrganizationsSource> awsOrganizationsSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-includefutureregions
     * 
     */
    @JsonProperty("IncludeFutureRegions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-includefutureregions")
    private CharSequence includeFutureRegions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourceregions
     * 
     */
    @JsonProperty("SourceRegions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourceregions")
    private List<CharSequence> sourceRegions = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourcetype
     * 
     */
    @JsonIgnore
    public CharSequence getSourceType() {
        return sourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourcetype
     * 
     */
    @JsonIgnore
    public void setSourceType(CharSequence sourceType) {
        this.sourceType = sourceType;
    }

    public ResourceDataSyncSyncSource withSourceType(CharSequence sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * ResourceDataSyncAwsOrganizationsSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDataSyncAwsOrganizationsSource> getAwsOrganizationsSource() {
        return awsOrganizationsSource;
    }

    /**
     * ResourceDataSyncAwsOrganizationsSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html
     * 
     */
    @JsonIgnore
    public void setAwsOrganizationsSource(Property<ResourceDataSyncAwsOrganizationsSource> awsOrganizationsSource) {
        this.awsOrganizationsSource = awsOrganizationsSource;
    }

    public ResourceDataSyncSyncSource withAwsOrganizationsSource(Property<ResourceDataSyncAwsOrganizationsSource> awsOrganizationsSource) {
        this.awsOrganizationsSource = awsOrganizationsSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-includefutureregions
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeFutureRegions() {
        return includeFutureRegions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-includefutureregions
     * 
     */
    @JsonIgnore
    public void setIncludeFutureRegions(CharSequence includeFutureRegions) {
        this.includeFutureRegions = includeFutureRegions;
    }

    public ResourceDataSyncSyncSource withIncludeFutureRegions(CharSequence includeFutureRegions) {
        this.includeFutureRegions = includeFutureRegions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourceregions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSourceRegions() {
        return sourceRegions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html#cfn-ssm-resourcedatasync-syncsource-sourceregions
     * 
     */
    @JsonIgnore
    public void setSourceRegions(List<CharSequence> sourceRegions) {
        this.sourceRegions = sourceRegions;
    }

    public ResourceDataSyncSyncSource withSourceRegions(List<CharSequence> sourceRegions) {
        this.sourceRegions = sourceRegions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourceType", sourceType).append("awsOrganizationsSource", awsOrganizationsSource).append("includeFutureRegions", includeFutureRegions).append("sourceRegions", sourceRegions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(includeFutureRegions).append(sourceRegions).append(sourceType).append(awsOrganizationsSource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDataSyncSyncSource) == false) {
            return false;
        }
        ResourceDataSyncSyncSource rhs = ((ResourceDataSyncSyncSource) other);
        return new EqualsBuilder().append(includeFutureRegions, rhs.includeFutureRegions).append(sourceRegions, rhs.sourceRegions).append(sourceType, rhs.sourceType).append(awsOrganizationsSource, rhs.awsOrganizationsSource).isEquals();
    }

}
