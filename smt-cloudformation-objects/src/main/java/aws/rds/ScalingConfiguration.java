
package aws.rds;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutoPause",
    "MaxCapacity",
    "MinCapacity",
    "SecondsBeforeAutoPause"
})
public class ScalingConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause
     * 
     */
    @JsonProperty("AutoPause")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause")
    private Boolean autoPause;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity")
    private Integer maxCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity
     * 
     */
    @JsonProperty("MinCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity")
    private Integer minCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforeautopause
     * 
     */
    @JsonProperty("SecondsBeforeAutoPause")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforeautopause")
    private Integer secondsBeforeAutoPause;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause
     * 
     */
    public Boolean getAutoPause() {
        return autoPause;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause
     * 
     */
    public void setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
    }

    public ScalingConfiguration withAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity
     * 
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity
     * 
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ScalingConfiguration withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity
     * 
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity
     * 
     */
    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    public ScalingConfiguration withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforeautopause
     * 
     */
    public Integer getSecondsBeforeAutoPause() {
        return secondsBeforeAutoPause;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforeautopause
     * 
     */
    public void setSecondsBeforeAutoPause(Integer secondsBeforeAutoPause) {
        this.secondsBeforeAutoPause = secondsBeforeAutoPause;
    }

    public ScalingConfiguration withSecondsBeforeAutoPause(Integer secondsBeforeAutoPause) {
        this.secondsBeforeAutoPause = secondsBeforeAutoPause;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoPause", autoPause).append("maxCapacity", maxCapacity).append("minCapacity", minCapacity).append("secondsBeforeAutoPause", secondsBeforeAutoPause).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxCapacity).append(minCapacity).append(secondsBeforeAutoPause).append(autoPause).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingConfiguration) == false) {
            return false;
        }
        ScalingConfiguration rhs = ((ScalingConfiguration) other);
        return new EqualsBuilder().append(maxCapacity, rhs.maxCapacity).append(minCapacity, rhs.minCapacity).append(secondsBeforeAutoPause, rhs.secondsBeforeAutoPause).append(autoPause, rhs.autoPause).isEquals();
    }

}
