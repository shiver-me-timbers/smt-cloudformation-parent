
package shiver.me.timbers.aws.dynamodb;

import java.util.ArrayList;
import java.util.List;
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
 * TableProjection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NonKeyAttributes",
    "ProjectionType"
})
public class TableProjection implements Property<TableProjection>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt
     * 
     */
    @JsonProperty("NonKeyAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt")
    private List<CharSequence> nonKeyAttributes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype
     * 
     */
    @JsonProperty("ProjectionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype")
    private CharSequence projectionType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt
     * 
     */
    @JsonIgnore
    public List<CharSequence> getNonKeyAttributes() {
        return nonKeyAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt
     * 
     */
    @JsonIgnore
    public void setNonKeyAttributes(List<CharSequence> nonKeyAttributes) {
        this.nonKeyAttributes = nonKeyAttributes;
    }

    public TableProjection withNonKeyAttributes(List<CharSequence> nonKeyAttributes) {
        this.nonKeyAttributes = nonKeyAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype
     * 
     */
    @JsonIgnore
    public CharSequence getProjectionType() {
        return projectionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype
     * 
     */
    @JsonIgnore
    public void setProjectionType(CharSequence projectionType) {
        this.projectionType = projectionType;
    }

    public TableProjection withProjectionType(CharSequence projectionType) {
        this.projectionType = projectionType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nonKeyAttributes", nonKeyAttributes).append("projectionType", projectionType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(projectionType).append(nonKeyAttributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableProjection) == false) {
            return false;
        }
        TableProjection rhs = ((TableProjection) other);
        return new EqualsBuilder().append(projectionType, rhs.projectionType).append(nonKeyAttributes, rhs.nonKeyAttributes).isEquals();
    }

}
