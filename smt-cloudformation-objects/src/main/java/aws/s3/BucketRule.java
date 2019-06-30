
package aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BucketRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AbortIncompleteMultipartUpload",
    "ExpirationDate",
    "ExpirationInDays",
    "Id",
    "NoncurrentVersionExpirationInDays",
    "NoncurrentVersionTransition",
    "NoncurrentVersionTransitions",
    "Prefix",
    "Status",
    "TagFilters",
    "Transition",
    "Transitions"
})
public class BucketRule implements Property<BucketRule>
{

    /**
     * BucketAbortIncompleteMultipartUpload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
     * 
     */
    @JsonProperty("AbortIncompleteMultipartUpload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html")
    private Property<BucketAbortIncompleteMultipartUpload> abortIncompleteMultipartUpload;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate
     * 
     */
    @JsonProperty("ExpirationDate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate")
    private CharSequence expirationDate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays
     * 
     */
    @JsonProperty("ExpirationInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays")
    private Number expirationInDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays
     * 
     */
    @JsonProperty("NoncurrentVersionExpirationInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays")
    private Number noncurrentVersionExpirationInDays;
    /**
     * BucketNoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    @JsonProperty("NoncurrentVersionTransition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html")
    private Property<aws.s3.BucketNoncurrentVersionTransition> noncurrentVersionTransition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions
     * 
     */
    @JsonProperty("NoncurrentVersionTransitions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions")
    private Set<Property<aws.s3.BucketNoncurrentVersionTransition>> noncurrentVersionTransitions = new LinkedHashSet<Property<aws.s3.BucketNoncurrentVersionTransition>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix")
    private CharSequence prefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status")
    private CharSequence status;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters
     * 
     */
    @JsonProperty("TagFilters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters")
    private Set<Property<BucketTagFilter>> tagFilters = new LinkedHashSet<Property<BucketTagFilter>>();
    /**
     * BucketNoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    @JsonProperty("Transition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html")
    private Property<aws.s3.BucketTransition> transition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions
     * 
     */
    @JsonProperty("Transitions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions")
    private Set<Property<aws.s3.BucketTransition>> transitions = new LinkedHashSet<Property<aws.s3.BucketTransition>>();

    /**
     * BucketAbortIncompleteMultipartUpload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
     * 
     */
    @JsonIgnore
    public Property<BucketAbortIncompleteMultipartUpload> getAbortIncompleteMultipartUpload() {
        return abortIncompleteMultipartUpload;
    }

    /**
     * BucketAbortIncompleteMultipartUpload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
     * 
     */
    @JsonIgnore
    public void setAbortIncompleteMultipartUpload(Property<BucketAbortIncompleteMultipartUpload> abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
    }

    public BucketRule withAbortIncompleteMultipartUpload(Property<BucketAbortIncompleteMultipartUpload> abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate
     * 
     */
    @JsonIgnore
    public CharSequence getExpirationDate() {
        return expirationDate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate
     * 
     */
    @JsonIgnore
    public void setExpirationDate(CharSequence expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BucketRule withExpirationDate(CharSequence expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays
     * 
     */
    @JsonIgnore
    public Number getExpirationInDays() {
        return expirationInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays
     * 
     */
    @JsonIgnore
    public void setExpirationInDays(Number expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    public BucketRule withExpirationInDays(Number expirationInDays) {
        this.expirationInDays = expirationInDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public BucketRule withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays
     * 
     */
    @JsonIgnore
    public Number getNoncurrentVersionExpirationInDays() {
        return noncurrentVersionExpirationInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays
     * 
     */
    @JsonIgnore
    public void setNoncurrentVersionExpirationInDays(Number noncurrentVersionExpirationInDays) {
        this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
    }

    public BucketRule withNoncurrentVersionExpirationInDays(Number noncurrentVersionExpirationInDays) {
        this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
        return this;
    }

    /**
     * BucketNoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    @JsonIgnore
    public Property<aws.s3.BucketNoncurrentVersionTransition> getNoncurrentVersionTransition() {
        return noncurrentVersionTransition;
    }

    /**
     * BucketNoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    @JsonIgnore
    public void setNoncurrentVersionTransition(Property<aws.s3.BucketNoncurrentVersionTransition> noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
    }

    public BucketRule withNoncurrentVersionTransition(Property<aws.s3.BucketNoncurrentVersionTransition> noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions
     * 
     */
    @JsonIgnore
    public Set<Property<aws.s3.BucketNoncurrentVersionTransition>> getNoncurrentVersionTransitions() {
        return noncurrentVersionTransitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions
     * 
     */
    @JsonIgnore
    public void setNoncurrentVersionTransitions(Set<Property<aws.s3.BucketNoncurrentVersionTransition>> noncurrentVersionTransitions) {
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
    }

    public BucketRule withNoncurrentVersionTransitions(Set<Property<aws.s3.BucketNoncurrentVersionTransition>> noncurrentVersionTransitions) {
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix
     * 
     */
    @JsonIgnore
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix
     * 
     */
    @JsonIgnore
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public BucketRule withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status
     * 
     */
    @JsonIgnore
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status
     * 
     */
    @JsonIgnore
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public BucketRule withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters
     * 
     */
    @JsonIgnore
    public Set<Property<BucketTagFilter>> getTagFilters() {
        return tagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters
     * 
     */
    @JsonIgnore
    public void setTagFilters(Set<Property<BucketTagFilter>> tagFilters) {
        this.tagFilters = tagFilters;
    }

    public BucketRule withTagFilters(Set<Property<BucketTagFilter>> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    /**
     * BucketNoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    @JsonIgnore
    public Property<aws.s3.BucketTransition> getTransition() {
        return transition;
    }

    /**
     * BucketNoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    @JsonIgnore
    public void setTransition(Property<aws.s3.BucketTransition> transition) {
        this.transition = transition;
    }

    public BucketRule withTransition(Property<aws.s3.BucketTransition> transition) {
        this.transition = transition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions
     * 
     */
    @JsonIgnore
    public Set<Property<aws.s3.BucketTransition>> getTransitions() {
        return transitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions
     * 
     */
    @JsonIgnore
    public void setTransitions(Set<Property<aws.s3.BucketTransition>> transitions) {
        this.transitions = transitions;
    }

    public BucketRule withTransitions(Set<Property<aws.s3.BucketTransition>> transitions) {
        this.transitions = transitions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("abortIncompleteMultipartUpload", abortIncompleteMultipartUpload).append("expirationDate", expirationDate).append("expirationInDays", expirationInDays).append("id", id).append("noncurrentVersionExpirationInDays", noncurrentVersionExpirationInDays).append("noncurrentVersionTransition", noncurrentVersionTransition).append("noncurrentVersionTransitions", noncurrentVersionTransitions).append("prefix", prefix).append("status", status).append("tagFilters", tagFilters).append("transition", transition).append("transitions", transitions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(prefix).append(abortIncompleteMultipartUpload).append(transitions).append(noncurrentVersionTransitions).append(transition).append(expirationInDays).append(noncurrentVersionTransition).append(tagFilters).append(id).append(noncurrentVersionExpirationInDays).append(expirationDate).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketRule) == false) {
            return false;
        }
        BucketRule rhs = ((BucketRule) other);
        return new EqualsBuilder().append(prefix, rhs.prefix).append(abortIncompleteMultipartUpload, rhs.abortIncompleteMultipartUpload).append(transitions, rhs.transitions).append(noncurrentVersionTransitions, rhs.noncurrentVersionTransitions).append(transition, rhs.transition).append(expirationInDays, rhs.expirationInDays).append(noncurrentVersionTransition, rhs.noncurrentVersionTransition).append(tagFilters, rhs.tagFilters).append(id, rhs.id).append(noncurrentVersionExpirationInDays, rhs.noncurrentVersionExpirationInDays).append(expirationDate, rhs.expirationDate).append(status, rhs.status).isEquals();
    }

}
