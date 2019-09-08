
package shiver.me.timbers.aws.elasticbeanstalk;

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
 * ApplicationApplicationVersionLifecycleConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxAgeRule",
    "MaxCountRule"
})
public class ApplicationApplicationVersionLifecycleConfig implements Property<ApplicationApplicationVersionLifecycleConfig>
{

    /**
     * ApplicationMaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    @JsonProperty("MaxAgeRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html")
    private Property<ApplicationMaxAgeRule> maxAgeRule;
    /**
     * ApplicationMaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    @JsonProperty("MaxCountRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html")
    private Property<ApplicationMaxCountRule> maxCountRule;

    /**
     * ApplicationMaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationMaxAgeRule> getMaxAgeRule() {
        return maxAgeRule;
    }

    /**
     * ApplicationMaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    @JsonIgnore
    public void setMaxAgeRule(Property<ApplicationMaxAgeRule> maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
    }

    public ApplicationApplicationVersionLifecycleConfig withMaxAgeRule(Property<ApplicationMaxAgeRule> maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
        return this;
    }

    /**
     * ApplicationMaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationMaxCountRule> getMaxCountRule() {
        return maxCountRule;
    }

    /**
     * ApplicationMaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    @JsonIgnore
    public void setMaxCountRule(Property<ApplicationMaxCountRule> maxCountRule) {
        this.maxCountRule = maxCountRule;
    }

    public ApplicationApplicationVersionLifecycleConfig withMaxCountRule(Property<ApplicationMaxCountRule> maxCountRule) {
        this.maxCountRule = maxCountRule;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxAgeRule", maxAgeRule).append("maxCountRule", maxCountRule).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxCountRule).append(maxAgeRule).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationApplicationVersionLifecycleConfig) == false) {
            return false;
        }
        ApplicationApplicationVersionLifecycleConfig rhs = ((ApplicationApplicationVersionLifecycleConfig) other);
        return new EqualsBuilder().append(maxCountRule, rhs.maxCountRule).append(maxAgeRule, rhs.maxAgeRule).isEquals();
    }

}
