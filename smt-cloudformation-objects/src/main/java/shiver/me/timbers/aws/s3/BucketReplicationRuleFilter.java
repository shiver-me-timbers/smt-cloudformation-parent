
package shiver.me.timbers.aws.s3;

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
 * BucketReplicationRuleFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "And",
    "Prefix",
    "TagFilter"
})
public class BucketReplicationRuleFilter implements Property<BucketReplicationRuleFilter>
{

    /**
     * BucketReplicationRuleAndOperator
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html
     * 
     */
    @JsonProperty("And")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html")
    private Property<BucketReplicationRuleAndOperator> and;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-prefix")
    private CharSequence prefix;
    /**
     * BucketTagFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html
     * 
     */
    @JsonProperty("TagFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html")
    private Property<BucketTagFilter> tagFilter;

    /**
     * BucketReplicationRuleAndOperator
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html
     * 
     */
    @JsonIgnore
    public Property<BucketReplicationRuleAndOperator> getAnd() {
        return and;
    }

    /**
     * BucketReplicationRuleAndOperator
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html
     * 
     */
    @JsonIgnore
    public void setAnd(Property<BucketReplicationRuleAndOperator> and) {
        this.and = and;
    }

    public BucketReplicationRuleFilter withAnd(Property<BucketReplicationRuleAndOperator> and) {
        this.and = and;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-prefix
     * 
     */
    @JsonIgnore
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-prefix
     * 
     */
    @JsonIgnore
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public BucketReplicationRuleFilter withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * BucketTagFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html
     * 
     */
    @JsonIgnore
    public Property<BucketTagFilter> getTagFilter() {
        return tagFilter;
    }

    /**
     * BucketTagFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html
     * 
     */
    @JsonIgnore
    public void setTagFilter(Property<BucketTagFilter> tagFilter) {
        this.tagFilter = tagFilter;
    }

    public BucketReplicationRuleFilter withTagFilter(Property<BucketTagFilter> tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("and", and).append("prefix", prefix).append("tagFilter", tagFilter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagFilter).append(and).append(prefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketReplicationRuleFilter) == false) {
            return false;
        }
        BucketReplicationRuleFilter rhs = ((BucketReplicationRuleFilter) other);
        return new EqualsBuilder().append(tagFilter, rhs.tagFilter).append(and, rhs.and).append(prefix, rhs.prefix).isEquals();
    }

}
