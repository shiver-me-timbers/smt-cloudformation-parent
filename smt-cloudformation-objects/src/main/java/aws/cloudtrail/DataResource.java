
package aws.cloudtrail;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DataResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Values"
})
public class DataResource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-values
     * 
     */
    @JsonProperty("Values")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-values")
    private Set<CharSequence> values = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public DataResource withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-values
     * 
     */
    public Set<CharSequence> getValues() {
        return values;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-values
     * 
     */
    public void setValues(Set<CharSequence> values) {
        this.values = values;
    }

    public DataResource withValues(Set<CharSequence> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("values", values).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataResource) == false) {
            return false;
        }
        DataResource rhs = ((DataResource) other);
        return new EqualsBuilder().append(type, rhs.type).append(values, rhs.values).isEquals();
    }

}
