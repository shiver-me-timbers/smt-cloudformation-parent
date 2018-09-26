
package aws.logs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LogGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LogGroupName",
    "RetentionInDays"
})
public class LogGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-loggroupname")
    private CharSequence logGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-retentionindays
     * 
     */
    @JsonProperty("RetentionInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-retentionindays")
    private Integer retentionInDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-loggroupname
     * 
     */
    public CharSequence getLogGroupName() {
        return logGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-loggroupname
     * 
     */
    public void setLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
    }

    public LogGroup withLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-retentionindays
     * 
     */
    public Integer getRetentionInDays() {
        return retentionInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-retentionindays
     * 
     */
    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

    public LogGroup withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logGroupName", logGroupName).append("retentionInDays", retentionInDays).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logGroupName).append(retentionInDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogGroup) == false) {
            return false;
        }
        LogGroup rhs = ((LogGroup) other);
        return new EqualsBuilder().append(logGroupName, rhs.logGroupName).append(retentionInDays, rhs.retentionInDays).isEquals();
    }

}
