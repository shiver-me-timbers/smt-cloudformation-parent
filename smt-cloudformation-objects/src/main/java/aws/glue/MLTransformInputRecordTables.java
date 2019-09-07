
package aws.glue;

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
 * MLTransformInputRecordTables
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GlueTables"
})
public class MLTransformInputRecordTables implements Property<MLTransformInputRecordTables>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html#cfn-glue-mltransform-inputrecordtables-gluetables
     * 
     */
    @JsonProperty("GlueTables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html#cfn-glue-mltransform-inputrecordtables-gluetables")
    private List<Property<MLTransformGlueTables>> glueTables = new ArrayList<Property<MLTransformGlueTables>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html#cfn-glue-mltransform-inputrecordtables-gluetables
     * 
     */
    @JsonIgnore
    public List<Property<MLTransformGlueTables>> getGlueTables() {
        return glueTables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html#cfn-glue-mltransform-inputrecordtables-gluetables
     * 
     */
    @JsonIgnore
    public void setGlueTables(List<Property<MLTransformGlueTables>> glueTables) {
        this.glueTables = glueTables;
    }

    public MLTransformInputRecordTables withGlueTables(List<Property<MLTransformGlueTables>> glueTables) {
        this.glueTables = glueTables;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("glueTables", glueTables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(glueTables).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MLTransformInputRecordTables) == false) {
            return false;
        }
        MLTransformInputRecordTables rhs = ((MLTransformInputRecordTables) other);
        return new EqualsBuilder().append(glueTables, rhs.glueTables).isEquals();
    }

}
