
package aws.kinesisfirehose;

import java.util.Map;
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
 * DeliveryStreamOpenXJsonSerDe
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CaseInsensitive",
    "ColumnToJsonKeyMappings",
    "ConvertDotsInJsonKeysToUnderscores"
})
public class DeliveryStreamOpenXJsonSerDe implements Property<DeliveryStreamOpenXJsonSerDe>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-caseinsensitive
     * 
     */
    @JsonProperty("CaseInsensitive")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-caseinsensitive")
    private CharSequence caseInsensitive;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-columntojsonkeymappings
     * 
     */
    @JsonProperty("ColumnToJsonKeyMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-columntojsonkeymappings")
    private Map<String, CharSequence> columnToJsonKeyMappings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-convertdotsinjsonkeystounderscores
     * 
     */
    @JsonProperty("ConvertDotsInJsonKeysToUnderscores")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-convertdotsinjsonkeystounderscores")
    private CharSequence convertDotsInJsonKeysToUnderscores;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-caseinsensitive
     * 
     */
    @JsonIgnore
    public CharSequence getCaseInsensitive() {
        return caseInsensitive;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-caseinsensitive
     * 
     */
    @JsonIgnore
    public void setCaseInsensitive(CharSequence caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    public DeliveryStreamOpenXJsonSerDe withCaseInsensitive(CharSequence caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-columntojsonkeymappings
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getColumnToJsonKeyMappings() {
        return columnToJsonKeyMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-columntojsonkeymappings
     * 
     */
    @JsonIgnore
    public void setColumnToJsonKeyMappings(Map<String, CharSequence> columnToJsonKeyMappings) {
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
    }

    public DeliveryStreamOpenXJsonSerDe withColumnToJsonKeyMappings(Map<String, CharSequence> columnToJsonKeyMappings) {
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-convertdotsinjsonkeystounderscores
     * 
     */
    @JsonIgnore
    public CharSequence getConvertDotsInJsonKeysToUnderscores() {
        return convertDotsInJsonKeysToUnderscores;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html#cfn-kinesisfirehose-deliverystream-openxjsonserde-convertdotsinjsonkeystounderscores
     * 
     */
    @JsonIgnore
    public void setConvertDotsInJsonKeysToUnderscores(CharSequence convertDotsInJsonKeysToUnderscores) {
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
    }

    public DeliveryStreamOpenXJsonSerDe withConvertDotsInJsonKeysToUnderscores(CharSequence convertDotsInJsonKeysToUnderscores) {
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("caseInsensitive", caseInsensitive).append("columnToJsonKeyMappings", columnToJsonKeyMappings).append("convertDotsInJsonKeysToUnderscores", convertDotsInJsonKeysToUnderscores).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(caseInsensitive).append(convertDotsInJsonKeysToUnderscores).append(columnToJsonKeyMappings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamOpenXJsonSerDe) == false) {
            return false;
        }
        DeliveryStreamOpenXJsonSerDe rhs = ((DeliveryStreamOpenXJsonSerDe) other);
        return new EqualsBuilder().append(caseInsensitive, rhs.caseInsensitive).append(convertDotsInJsonKeysToUnderscores, rhs.convertDotsInJsonKeysToUnderscores).append(columnToJsonKeyMappings, rhs.columnToJsonKeyMappings).isEquals();
    }

}
