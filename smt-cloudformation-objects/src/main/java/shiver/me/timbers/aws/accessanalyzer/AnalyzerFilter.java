
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
 * AnalyzerFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Contains",
    "Eq",
    "Exists",
    "Property",
    "Neq"
})
public class AnalyzerFilter implements Property<AnalyzerFilter>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-contains
     * 
     */
    @JsonProperty("Contains")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-contains")
    private List<CharSequence> contains = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-eq
     * 
     */
    @JsonProperty("Eq")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-eq")
    private List<CharSequence> eq = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-exists
     * 
     */
    @JsonProperty("Exists")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-exists")
    private CharSequence exists;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-property
     * 
     */
    @JsonProperty("Property")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-property")
    private CharSequence property;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-neq
     * 
     */
    @JsonProperty("Neq")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-neq")
    private List<CharSequence> neq = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-contains
     * 
     */
    @JsonIgnore
    public List<CharSequence> getContains() {
        return contains;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-contains
     * 
     */
    @JsonIgnore
    public void setContains(List<CharSequence> contains) {
        this.contains = contains;
    }

    public AnalyzerFilter withContains(List<CharSequence> contains) {
        this.contains = contains;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-eq
     * 
     */
    @JsonIgnore
    public List<CharSequence> getEq() {
        return eq;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-eq
     * 
     */
    @JsonIgnore
    public void setEq(List<CharSequence> eq) {
        this.eq = eq;
    }

    public AnalyzerFilter withEq(List<CharSequence> eq) {
        this.eq = eq;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-exists
     * 
     */
    @JsonIgnore
    public CharSequence getExists() {
        return exists;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-exists
     * 
     */
    @JsonIgnore
    public void setExists(CharSequence exists) {
        this.exists = exists;
    }

    public AnalyzerFilter withExists(CharSequence exists) {
        this.exists = exists;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-property
     * 
     */
    @JsonIgnore
    public CharSequence getProperty() {
        return property;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-property
     * 
     */
    @JsonIgnore
    public void setProperty(CharSequence property) {
        this.property = property;
    }

    public AnalyzerFilter withProperty(CharSequence property) {
        this.property = property;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-neq
     * 
     */
    @JsonIgnore
    public List<CharSequence> getNeq() {
        return neq;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-neq
     * 
     */
    @JsonIgnore
    public void setNeq(List<CharSequence> neq) {
        this.neq = neq;
    }

    public AnalyzerFilter withNeq(List<CharSequence> neq) {
        this.neq = neq;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contains", contains).append("eq", eq).append("exists", exists).append("property", property).append("neq", neq).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(property).append(exists).append(contains).append(neq).append(eq).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnalyzerFilter) == false) {
            return false;
        }
        AnalyzerFilter rhs = ((AnalyzerFilter) other);
        return new EqualsBuilder().append(property, rhs.property).append(exists, rhs.exists).append(contains, rhs.contains).append(neq, rhs.neq).append(eq, rhs.eq).isEquals();
    }

}
