
package aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MaxCountRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeleteSourceFromS3",
    "Enabled",
    "MaxCount"
})
public class MaxCountRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3
     * 
     */
    @JsonProperty("DeleteSourceFromS3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3")
    private Boolean deleteSourceFromS3;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount
     * 
     */
    @JsonProperty("MaxCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount")
    private Integer maxCount;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3
     * 
     */
    public Boolean getDeleteSourceFromS3() {
        return deleteSourceFromS3;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3
     * 
     */
    public void setDeleteSourceFromS3(Boolean deleteSourceFromS3) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
    }

    public MaxCountRule withDeleteSourceFromS3(Boolean deleteSourceFromS3) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public MaxCountRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount
     * 
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount
     * 
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public MaxCountRule withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteSourceFromS3", deleteSourceFromS3).append("enabled", enabled).append("maxCount", maxCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deleteSourceFromS3).append(maxCount).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaxCountRule) == false) {
            return false;
        }
        MaxCountRule rhs = ((MaxCountRule) other);
        return new EqualsBuilder().append(deleteSourceFromS3, rhs.deleteSourceFromS3).append(maxCount, rhs.maxCount).append(enabled, rhs.enabled).isEquals();
    }

}
