
package aws.iotanalytics;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Filter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeltaTime"
})
public class Filter {

    /**
     * DeltaTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html
     * 
     */
    @JsonProperty("DeltaTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html")
    private DeltaTime deltaTime;

    /**
     * DeltaTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html
     * 
     */
    @JsonIgnore
    public DeltaTime getDeltaTime() {
        return deltaTime;
    }

    /**
     * DeltaTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html
     * 
     */
    @JsonIgnore
    public void setDeltaTime(DeltaTime deltaTime) {
        this.deltaTime = deltaTime;
    }

    public Filter withDeltaTime(DeltaTime deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deltaTime", deltaTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deltaTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Filter) == false) {
            return false;
        }
        Filter rhs = ((Filter) other);
        return new EqualsBuilder().append(deltaTime, rhs.deltaTime).isEquals();
    }

}
