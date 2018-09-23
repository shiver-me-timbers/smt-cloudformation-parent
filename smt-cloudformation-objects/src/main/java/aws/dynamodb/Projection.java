
package aws.dynamodb;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Projection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NonKeyAttributes",
    "ProjectionType"
})
public class Projection {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt
     * 
     */
    @JsonProperty("NonKeyAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt")
    private List<String> nonKeyAttributes = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype
     * 
     */
    @JsonProperty("ProjectionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype")
    private String projectionType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt
     * 
     */
    @JsonProperty("NonKeyAttributes")
    public List<String> getNonKeyAttributes() {
        return nonKeyAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt
     * 
     */
    @JsonProperty("NonKeyAttributes")
    public void setNonKeyAttributes(List<String> nonKeyAttributes) {
        this.nonKeyAttributes = nonKeyAttributes;
    }

    public Projection withNonKeyAttributes(List<String> nonKeyAttributes) {
        this.nonKeyAttributes = nonKeyAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype
     * 
     */
    @JsonProperty("ProjectionType")
    public String getProjectionType() {
        return projectionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype
     * 
     */
    @JsonProperty("ProjectionType")
    public void setProjectionType(String projectionType) {
        this.projectionType = projectionType;
    }

    public Projection withProjectionType(String projectionType) {
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
        if ((other instanceof Projection) == false) {
            return false;
        }
        Projection rhs = ((Projection) other);
        return new EqualsBuilder().append(projectionType, rhs.projectionType).append(nonKeyAttributes, rhs.nonKeyAttributes).isEquals();
    }

}