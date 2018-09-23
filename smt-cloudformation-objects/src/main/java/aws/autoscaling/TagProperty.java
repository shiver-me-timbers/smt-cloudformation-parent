
package aws.autoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TagProperty
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Key",
    "PropagateAtLaunch",
    "Value"
})
public class TagProperty {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key")
    private String key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch
     * 
     */
    @JsonProperty("PropagateAtLaunch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch")
    private Boolean propagateAtLaunch;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value")
    private String value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key
     * 
     */
    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key
     * 
     */
    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

    public TagProperty withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch
     * 
     */
    @JsonProperty("PropagateAtLaunch")
    public Boolean getPropagateAtLaunch() {
        return propagateAtLaunch;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch
     * 
     */
    @JsonProperty("PropagateAtLaunch")
    public void setPropagateAtLaunch(Boolean propagateAtLaunch) {
        this.propagateAtLaunch = propagateAtLaunch;
    }

    public TagProperty withPropagateAtLaunch(Boolean propagateAtLaunch) {
        this.propagateAtLaunch = propagateAtLaunch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value
     * 
     */
    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value
     * 
     */
    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    public TagProperty withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("propagateAtLaunch", propagateAtLaunch).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(propagateAtLaunch).append(value).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TagProperty) == false) {
            return false;
        }
        TagProperty rhs = ((TagProperty) other);
        return new EqualsBuilder().append(propagateAtLaunch, rhs.propagateAtLaunch).append(value, rhs.value).append(key, rhs.key).isEquals();
    }

}