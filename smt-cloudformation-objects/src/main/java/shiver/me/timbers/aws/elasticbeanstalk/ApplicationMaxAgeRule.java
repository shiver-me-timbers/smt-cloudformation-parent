
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
 * ApplicationMaxAgeRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeleteSourceFromS3",
    "Enabled",
    "MaxAgeInDays"
})
public class ApplicationMaxAgeRule implements Property<ApplicationMaxAgeRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3
     * 
     */
    @JsonProperty("DeleteSourceFromS3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3")
    private CharSequence deleteSourceFromS3;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays
     * 
     */
    @JsonProperty("MaxAgeInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays")
    private Number maxAgeInDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3
     * 
     */
    @JsonIgnore
    public CharSequence getDeleteSourceFromS3() {
        return deleteSourceFromS3;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3
     * 
     */
    @JsonIgnore
    public void setDeleteSourceFromS3(CharSequence deleteSourceFromS3) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
    }

    public ApplicationMaxAgeRule withDeleteSourceFromS3(CharSequence deleteSourceFromS3) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public ApplicationMaxAgeRule withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays
     * 
     */
    @JsonIgnore
    public Number getMaxAgeInDays() {
        return maxAgeInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays
     * 
     */
    @JsonIgnore
    public void setMaxAgeInDays(Number maxAgeInDays) {
        this.maxAgeInDays = maxAgeInDays;
    }

    public ApplicationMaxAgeRule withMaxAgeInDays(Number maxAgeInDays) {
        this.maxAgeInDays = maxAgeInDays;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteSourceFromS3", deleteSourceFromS3).append("enabled", enabled).append("maxAgeInDays", maxAgeInDays).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deleteSourceFromS3).append(maxAgeInDays).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationMaxAgeRule) == false) {
            return false;
        }
        ApplicationMaxAgeRule rhs = ((ApplicationMaxAgeRule) other);
        return new EqualsBuilder().append(deleteSourceFromS3, rhs.deleteSourceFromS3).append(maxAgeInDays, rhs.maxAgeInDays).append(enabled, rhs.enabled).isEquals();
    }

}
