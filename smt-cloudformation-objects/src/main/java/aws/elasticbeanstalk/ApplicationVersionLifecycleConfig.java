
package aws.elasticbeanstalk;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationVersionLifecycleConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxAgeRule",
    "MaxCountRule"
})
public class ApplicationVersionLifecycleConfig implements Property<ApplicationVersionLifecycleConfig>
{

    /**
     * MaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    @JsonProperty("MaxAgeRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html")
    private Property<MaxAgeRule> maxAgeRule;
    /**
     * MaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    @JsonProperty("MaxCountRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html")
    private Property<MaxCountRule> maxCountRule;

    /**
     * MaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    @JsonIgnore
    public Property<MaxAgeRule> getMaxAgeRule() {
        return maxAgeRule;
    }

    /**
     * MaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    @JsonIgnore
    public void setMaxAgeRule(Property<MaxAgeRule> maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
    }

    public ApplicationVersionLifecycleConfig withMaxAgeRule(Property<MaxAgeRule> maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
        return this;
    }

    /**
     * MaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    @JsonIgnore
    public Property<MaxCountRule> getMaxCountRule() {
        return maxCountRule;
    }

    /**
     * MaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    @JsonIgnore
    public void setMaxCountRule(Property<MaxCountRule> maxCountRule) {
        this.maxCountRule = maxCountRule;
    }

    public ApplicationVersionLifecycleConfig withMaxCountRule(Property<MaxCountRule> maxCountRule) {
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
        if ((other instanceof ApplicationVersionLifecycleConfig) == false) {
            return false;
        }
        ApplicationVersionLifecycleConfig rhs = ((ApplicationVersionLifecycleConfig) other);
        return new EqualsBuilder().append(maxCountRule, rhs.maxCountRule).append(maxAgeRule, rhs.maxAgeRule).isEquals();
    }

}
