
package aws.glue;

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
 * SkewedInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SkewedColumnNames",
    "SkewedColumnValues",
    "SkewedColumnValueLocationMaps"
})
public class SkewedInfo {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames
     * 
     */
    @JsonProperty("SkewedColumnNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames")
    private List<CharSequence> skewedColumnNames = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues
     * 
     */
    @JsonProperty("SkewedColumnValues")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues")
    private List<CharSequence> skewedColumnValues = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps
     * 
     */
    @JsonProperty("SkewedColumnValueLocationMaps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps")
    private Object skewedColumnValueLocationMaps;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames
     * 
     */
    public List<CharSequence> getSkewedColumnNames() {
        return skewedColumnNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames
     * 
     */
    public void setSkewedColumnNames(List<CharSequence> skewedColumnNames) {
        this.skewedColumnNames = skewedColumnNames;
    }

    public SkewedInfo withSkewedColumnNames(List<CharSequence> skewedColumnNames) {
        this.skewedColumnNames = skewedColumnNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues
     * 
     */
    public List<CharSequence> getSkewedColumnValues() {
        return skewedColumnValues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues
     * 
     */
    public void setSkewedColumnValues(List<CharSequence> skewedColumnValues) {
        this.skewedColumnValues = skewedColumnValues;
    }

    public SkewedInfo withSkewedColumnValues(List<CharSequence> skewedColumnValues) {
        this.skewedColumnValues = skewedColumnValues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps
     * 
     */
    public Object getSkewedColumnValueLocationMaps() {
        return skewedColumnValueLocationMaps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps
     * 
     */
    public void setSkewedColumnValueLocationMaps(Object skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
    }

    public SkewedInfo withSkewedColumnValueLocationMaps(Object skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("skewedColumnNames", skewedColumnNames).append("skewedColumnValues", skewedColumnValues).append("skewedColumnValueLocationMaps", skewedColumnValueLocationMaps).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(skewedColumnValues).append(skewedColumnNames).append(skewedColumnValueLocationMaps).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SkewedInfo) == false) {
            return false;
        }
        SkewedInfo rhs = ((SkewedInfo) other);
        return new EqualsBuilder().append(skewedColumnValues, rhs.skewedColumnValues).append(skewedColumnNames, rhs.skewedColumnNames).append(skewedColumnValueLocationMaps, rhs.skewedColumnValueLocationMaps).isEquals();
    }

}
