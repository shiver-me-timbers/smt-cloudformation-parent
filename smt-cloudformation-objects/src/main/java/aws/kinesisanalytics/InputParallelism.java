
package aws.kinesisanalytics;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InputParallelism
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Count"
})
public class InputParallelism {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count
     * 
     */
    @JsonProperty("Count")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count")
    private Integer count;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count
     * 
     */
    public Integer getCount() {
        return count;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count
     * 
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    public InputParallelism withCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputParallelism) == false) {
            return false;
        }
        InputParallelism rhs = ((InputParallelism) other);
        return new EqualsBuilder().append(count, rhs.count).isEquals();
    }

}
