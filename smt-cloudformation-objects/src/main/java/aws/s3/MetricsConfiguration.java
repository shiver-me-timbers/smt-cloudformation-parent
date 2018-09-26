
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
 * MetricsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Prefix",
    "TagFilters"
})
public class MetricsConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix")
    private CharSequence prefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters
     * 
     */
    @JsonProperty("TagFilters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters")
    private Set<TagFilter> tagFilters = new LinkedHashSet<TagFilter>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public MetricsConfiguration withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix
     * 
     */
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix
     * 
     */
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public MetricsConfiguration withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters
     * 
     */
    public Set<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters
     * 
     */
    public void setTagFilters(Set<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
    }

    public MetricsConfiguration withTagFilters(Set<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("prefix", prefix).append("tagFilters", tagFilters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(prefix).append(tagFilters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetricsConfiguration) == false) {
            return false;
        }
        MetricsConfiguration rhs = ((MetricsConfiguration) other);
        return new EqualsBuilder().append(id, rhs.id).append(prefix, rhs.prefix).append(tagFilters, rhs.tagFilters).isEquals();
    }

}
