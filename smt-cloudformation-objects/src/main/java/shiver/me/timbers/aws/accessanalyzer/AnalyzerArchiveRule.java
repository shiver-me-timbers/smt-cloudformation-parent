
package shiver.me.timbers.aws.accessanalyzer;

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
 * AnalyzerArchiveRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Filter",
    "RuleName"
})
public class AnalyzerArchiveRule implements Property<AnalyzerArchiveRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-filter
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-filter")
    private List<Property<AnalyzerFilter>> filter = new ArrayList<Property<AnalyzerFilter>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-rulename
     * 
     */
    @JsonProperty("RuleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-rulename")
    private CharSequence ruleName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-filter
     * 
     */
    @JsonIgnore
    public List<Property<AnalyzerFilter>> getFilter() {
        return filter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-filter
     * 
     */
    @JsonIgnore
    public void setFilter(List<Property<AnalyzerFilter>> filter) {
        this.filter = filter;
    }

    public AnalyzerArchiveRule withFilter(List<Property<AnalyzerFilter>> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-rulename
     * 
     */
    @JsonIgnore
    public CharSequence getRuleName() {
        return ruleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-rulename
     * 
     */
    @JsonIgnore
    public void setRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
    }

    public AnalyzerArchiveRule withRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("filter", filter).append("ruleName", ruleName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter).append(ruleName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnalyzerArchiveRule) == false) {
            return false;
        }
        AnalyzerArchiveRule rhs = ((AnalyzerArchiveRule) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(ruleName, rhs.ruleName).isEquals();
    }

}
