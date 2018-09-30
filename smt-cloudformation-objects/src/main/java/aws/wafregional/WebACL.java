
package aws.wafregional;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * WebACL
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MetricName",
    "DefaultAction",
    "Rules",
    "Name"
})
public class WebACL {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname")
    private CharSequence metricName;
    /**
     * Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html
     * 
     */
    @JsonProperty("DefaultAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html")
    private Action defaultAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules")
    private List<Rule> rules = new ArrayList<Rule>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname
     * 
     */
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname
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
     * Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html
     * 
     */
    public Action getDefaultAction() {
        return defaultAction;
    }

    /**
     * Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html
     * 
     */
    public void setDefaultAction(Action defaultAction) {
        this.defaultAction = defaultAction;
    }

    public WebACL withDefaultAction(Action defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules
     * 
     */
    public List<Rule> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules
     * 
     */
    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public WebACL withRules(List<Rule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public WebACL withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metricName", metricName).append("defaultAction", defaultAction).append("rules", rules).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(rules).append(metricName).append(defaultAction).toHashCode();
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
        return new EqualsBuilder().append(name, rhs.name).append(rules, rhs.rules).append(metricName, rhs.metricName).append(defaultAction, rhs.defaultAction).isEquals();
    }

}
