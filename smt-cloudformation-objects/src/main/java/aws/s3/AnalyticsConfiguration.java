
package aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AnalyticsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Prefix",
    "StorageClassAnalysis",
    "TagFilters"
})
public class AnalyticsConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix")
    private CharSequence prefix;
    /**
     * StorageClassAnalysis
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html
     * 
     */
    @JsonProperty("StorageClassAnalysis")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html")
    private StorageClassAnalysis storageClassAnalysis;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters
     * 
     */
    @JsonProperty("TagFilters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters")
    private Set<TagFilter> tagFilters = new LinkedHashSet<TagFilter>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public AnalyticsConfiguration withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix
     * 
     */
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix
     * 
     */
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public AnalyticsConfiguration withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * StorageClassAnalysis
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html
     * 
     */
    public StorageClassAnalysis getStorageClassAnalysis() {
        return storageClassAnalysis;
    }

    /**
     * StorageClassAnalysis
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html
     * 
     */
    public void setStorageClassAnalysis(StorageClassAnalysis storageClassAnalysis) {
        this.storageClassAnalysis = storageClassAnalysis;
    }

    public AnalyticsConfiguration withStorageClassAnalysis(StorageClassAnalysis storageClassAnalysis) {
        this.storageClassAnalysis = storageClassAnalysis;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters
     * 
     */
    public Set<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters
     * 
     */
    public void setTagFilters(Set<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
    }

    public AnalyticsConfiguration withTagFilters(Set<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("prefix", prefix).append("storageClassAnalysis", storageClassAnalysis).append("tagFilters", tagFilters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(storageClassAnalysis).append(prefix).append(tagFilters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnalyticsConfiguration) == false) {
            return false;
        }
        AnalyticsConfiguration rhs = ((AnalyticsConfiguration) other);
        return new EqualsBuilder().append(id, rhs.id).append(storageClassAnalysis, rhs.storageClassAnalysis).append(prefix, rhs.prefix).append(tagFilters, rhs.tagFilters).isEquals();
    }

}
