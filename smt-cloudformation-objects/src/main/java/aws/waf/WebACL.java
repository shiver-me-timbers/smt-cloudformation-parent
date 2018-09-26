
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
 * WebACL
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DefaultAction",
    "MetricName",
    "Name",
    "Rules"
})
public class WebACL {

    /**
     * WafAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
     * 
     */
    @JsonProperty("DefaultAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html")
    private WafAction defaultAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname")
    private CharSequence metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules")
    private Set<ActivatedRule> rules = new LinkedHashSet<ActivatedRule>();

    /**
     * WafAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
     * 
     */
    public WafAction getDefaultAction() {
        return defaultAction;
    }

    /**
     * WafAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
     * 
     */
    public void setDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    public WebACL withDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname
     * 
     */
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname
     * 
     */
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public WebACL withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public WebACL withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules
     * 
     */
    public Set<ActivatedRule> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules
     * 
     */
    public void setRules(Set<ActivatedRule> rules) {
        this.rules = rules;
    }

    public WebACL withRules(Set<ActivatedRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultAction", defaultAction).append("metricName", metricName).append("name", name).append("rules", rules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(rules).append(defaultAction).append(metricName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACL) == false) {
            return false;
        }
        WebACL rhs = ((WebACL) other);
        return new EqualsBuilder().append(name, rhs.name).append(rules, rhs.rules).append(defaultAction, rhs.defaultAction).append(metricName, rhs.metricName).isEquals();
    }

}
