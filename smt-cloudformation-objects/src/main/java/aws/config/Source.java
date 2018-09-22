
package aws.config;

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
 * Source
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Owner",
    "SourceDetails",
    "SourceIdentifier"
})
public class Source {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner
     * 
     */
    @JsonProperty("Owner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner")
    private String owner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails
     * 
     */
    @JsonProperty("SourceDetails")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails")
    private Set<SourceDetail> sourceDetails = new LinkedHashSet<SourceDetail>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier
     * 
     */
    @JsonProperty("SourceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier")
    private String sourceIdentifier;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner
     * 
     */
    @JsonProperty("Owner")
    public String getOwner() {
        return owner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner
     * 
     */
    @JsonProperty("Owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Source withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails
     * 
     */
    @JsonProperty("SourceDetails")
    public Set<SourceDetail> getSourceDetails() {
        return sourceDetails;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails
     * 
     */
    @JsonProperty("SourceDetails")
    public void setSourceDetails(Set<SourceDetail> sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    public Source withSourceDetails(Set<SourceDetail> sourceDetails) {
        this.sourceDetails = sourceDetails;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier
     * 
     */
    @JsonProperty("SourceIdentifier")
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier
     * 
     */
    @JsonProperty("SourceIdentifier")
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public Source withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("owner", owner).append("sourceDetails", sourceDetails).append("sourceIdentifier", sourceIdentifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(owner).append(sourceIdentifier).append(sourceDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return new EqualsBuilder().append(owner, rhs.owner).append(sourceIdentifier, rhs.sourceIdentifier).append(sourceDetails, rhs.sourceDetails).isEquals();
    }

}
