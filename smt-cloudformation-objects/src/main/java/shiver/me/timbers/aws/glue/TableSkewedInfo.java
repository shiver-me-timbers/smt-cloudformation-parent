
package shiver.me.timbers.aws.glue;

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
 * TableSkewedInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SkewedColumnNames",
    "SkewedColumnValues",
    "SkewedColumnValueLocationMaps"
})
public class TableSkewedInfo implements Property<TableSkewedInfo>
{

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
    @JsonIgnore
    public List<CharSequence> getSkewedColumnNames() {
        return skewedColumnNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames
     * 
     */
    @JsonIgnore
    public void setSkewedColumnNames(List<CharSequence> skewedColumnNames) {
        this.skewedColumnNames = skewedColumnNames;
    }

    public TableSkewedInfo withSkewedColumnNames(List<CharSequence> skewedColumnNames) {
        this.skewedColumnNames = skewedColumnNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSkewedColumnValues() {
        return skewedColumnValues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues
     * 
     */
    @JsonIgnore
    public void setSkewedColumnValues(List<CharSequence> skewedColumnValues) {
        this.skewedColumnValues = skewedColumnValues;
    }

    public TableSkewedInfo withSkewedColumnValues(List<CharSequence> skewedColumnValues) {
        this.skewedColumnValues = skewedColumnValues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps
     * 
     */
    @JsonIgnore
    public Object getSkewedColumnValueLocationMaps() {
        return skewedColumnValueLocationMaps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps
     * 
     */
    @JsonIgnore
    public void setSkewedColumnValueLocationMaps(Object skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
    }

    public TableSkewedInfo withSkewedColumnValueLocationMaps(Object skewedColumnValueLocationMaps) {
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
        if ((other instanceof TableSkewedInfo) == false) {
            return false;
        }
        TableSkewedInfo rhs = ((TableSkewedInfo) other);
        return new EqualsBuilder().append(skewedColumnValues, rhs.skewedColumnValues).append(skewedColumnNames, rhs.skewedColumnNames).append(skewedColumnValueLocationMaps, rhs.skewedColumnValueLocationMaps).isEquals();
    }

}
