
package aws.elasticbeanstalk;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MaxAgeRule",
    "MaxCountRule"
})
public class ApplicationVersionLifecycleConfig {

    /**
     * MaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    @JsonProperty("MaxAgeRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html")
    private MaxAgeRule maxAgeRule;
    /**
     * MaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    @JsonProperty("MaxCountRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html")
    private MaxCountRule maxCountRule;

    /**
     * MaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    public MaxAgeRule getMaxAgeRule() {
        return maxAgeRule;
    }

    /**
     * MaxAgeRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
     * 
     */
    public void setMaxAgeRule(MaxAgeRule maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
    }

    public ApplicationVersionLifecycleConfig withMaxAgeRule(MaxAgeRule maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
        return this;
    }

    /**
     * MaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    public MaxCountRule getMaxCountRule() {
        return maxCountRule;
    }

    /**
     * MaxCountRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
     * 
     */
    public void setMaxCountRule(MaxCountRule maxCountRule) {
        this.maxCountRule = maxCountRule;
    }

    public ApplicationVersionLifecycleConfig withMaxCountRule(MaxCountRule maxCountRule) {
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
