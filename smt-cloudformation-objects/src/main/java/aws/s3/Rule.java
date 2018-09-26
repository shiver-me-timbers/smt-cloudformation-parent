
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
 * Rule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
public class Rule {

    /**
     * AbortIncompleteMultipartUpload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
     * 
     */
    @JsonProperty("AbortIncompleteMultipartUpload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html")
    private AbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate
     * 
     */
    @JsonProperty("ExpirationDate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate")
    private String expirationDate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays
     * 
     */
    @JsonProperty("ExpirationInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays")
    private Integer expirationInDays;
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
    private Integer noncurrentVersionExpirationInDays;
    /**
     * NoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    @JsonProperty("NoncurrentVersionTransition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html")
    private NoncurrentVersionTransition noncurrentVersionTransition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions
     * 
     */
    @JsonProperty("NoncurrentVersionTransitions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions")
    private Set<NoncurrentVersionTransition> noncurrentVersionTransitions = new LinkedHashSet<NoncurrentVersionTransition>();
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
    private Set<TagFilter> tagFilters = new LinkedHashSet<TagFilter>();
    /**
     * Transition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html
     * 
     */
    @JsonProperty("Transition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html")
    private Transition transition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions
     * 
     */
    @JsonProperty("Transitions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions")
    private Set<Transition> transitions = new LinkedHashSet<Transition>();

    /**
     * AbortIncompleteMultipartUpload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
     * 
     */
    public AbortIncompleteMultipartUpload getAbortIncompleteMultipartUpload() {
        return abortIncompleteMultipartUpload;
    }

    /**
     * AbortIncompleteMultipartUpload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
     * 
     */
    public void setAbortIncompleteMultipartUpload(AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
    }

    public Rule withAbortIncompleteMultipartUpload(AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate
     * 
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate
     * 
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Rule withExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays
     * 
     */
    public Integer getExpirationInDays() {
        return expirationInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays
     * 
     */
    public void setExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    public Rule withExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public Rule withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays
     * 
     */
    public Integer getNoncurrentVersionExpirationInDays() {
        return noncurrentVersionExpirationInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays
     * 
     */
    public void setNoncurrentVersionExpirationInDays(Integer noncurrentVersionExpirationInDays) {
        this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
    }

    public Rule withNoncurrentVersionExpirationInDays(Integer noncurrentVersionExpirationInDays) {
        this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
        return this;
    }

    /**
     * NoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    public NoncurrentVersionTransition getNoncurrentVersionTransition() {
        return noncurrentVersionTransition;
    }

    /**
     * NoncurrentVersionTransition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
     * 
     */
    public void setNoncurrentVersionTransition(NoncurrentVersionTransition noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
    }

    public Rule withNoncurrentVersionTransition(NoncurrentVersionTransition noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions
     * 
     */
    public Set<NoncurrentVersionTransition> getNoncurrentVersionTransitions() {
        return noncurrentVersionTransitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions
     * 
     */
    public void setNoncurrentVersionTransitions(Set<NoncurrentVersionTransition> noncurrentVersionTransitions) {
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
    }

    public Rule withNoncurrentVersionTransitions(Set<NoncurrentVersionTransition> noncurrentVersionTransitions) {
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix
     * 
     */
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix
     * 
     */
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public Rule withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public Rule withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters
     * 
     */
    public Set<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters
     * 
     */
    public void setTagFilters(Set<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
    }

    public Rule withTagFilters(Set<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    /**
     * Transition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html
     * 
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * Transition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html
     * 
     */
    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public Rule withTransition(Transition transition) {
        this.transition = transition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions
     * 
     */
    public Set<Transition> getTransitions() {
        return transitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions
     * 
     */
    public void setTransitions(Set<Transition> transitions) {
        this.transitions = transitions;
    }

    public Rule withTransitions(Set<Transition> transitions) {
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
        if ((other instanceof Rule) == false) {
            return false;
        }
        Rule rhs = ((Rule) other);
        return new EqualsBuilder().append(prefix, rhs.prefix).append(abortIncompleteMultipartUpload, rhs.abortIncompleteMultipartUpload).append(transitions, rhs.transitions).append(noncurrentVersionTransitions, rhs.noncurrentVersionTransitions).append(transition, rhs.transition).append(expirationInDays, rhs.expirationInDays).append(noncurrentVersionTransition, rhs.noncurrentVersionTransition).append(tagFilters, rhs.tagFilters).append(id, rhs.id).append(noncurrentVersionExpirationInDays, rhs.noncurrentVersionExpirationInDays).append(expirationDate, rhs.expirationDate).append(status, rhs.status).isEquals();
    }

}
