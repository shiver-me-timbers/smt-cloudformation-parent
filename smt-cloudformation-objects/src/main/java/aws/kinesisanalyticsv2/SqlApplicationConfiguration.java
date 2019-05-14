
package aws.kinesisanalyticsv2;

import java.util.ArrayList;
import java.util.List;
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
 * SqlApplicationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Inputs"
})
public class SqlApplicationConfiguration implements Property<SqlApplicationConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs
     * 
     */
    @JsonProperty("Inputs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs")
    private List<Property<Input>> inputs = new ArrayList<Property<Input>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs
     * 
     */
    @JsonIgnore
    public List<Property<Input>> getInputs() {
        return inputs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs
     * 
     */
    @JsonIgnore
    public void setInputs(List<Property<Input>> inputs) {
        this.inputs = inputs;
    }

    public SqlApplicationConfiguration withInputs(List<Property<Input>> inputs) {
        this.inputs = inputs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("inputs", inputs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SqlApplicationConfiguration) == false) {
            return false;
        }
        SqlApplicationConfiguration rhs = ((SqlApplicationConfiguration) other);
        return new EqualsBuilder().append(inputs, rhs.inputs).isEquals();
    }

}
