
package aws.waf;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MetricName",
    "Name",
    "Predicates"
})
public class Rule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname")
    private CharSequence metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates
     * 
     */
    @JsonProperty("Predicates")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates")
    private Set<Predicate> predicates = new LinkedHashSet<Predicate>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname
     * 
     */
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname
     * 
     */
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public Rule withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Rule withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates
     * 
     */
    public Set<Predicate> getPredicates() {
        return predicates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates
     * 
     */
    public void setPredicates(Set<Predicate> predicates) {
        this.predicates = predicates;
    }

    public Rule withPredicates(Set<Predicate> predicates) {
        this.predicates = predicates;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metricName", metricName).append("name", name).append("predicates", predicates).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(predicates).append(metricName).toHashCode();
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
        return new EqualsBuilder().append(name, rhs.name).append(predicates, rhs.predicates).append(metricName, rhs.metricName).isEquals();
    }

}
