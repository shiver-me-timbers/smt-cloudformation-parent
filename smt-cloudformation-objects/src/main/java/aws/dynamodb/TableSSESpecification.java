
package aws.dynamodb;

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
 * TableSSESpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KMSMasterKeyId",
    "SSEEnabled",
    "SSEType"
})
public class TableSSESpecification implements Property<TableSSESpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-kmsmasterkeyid
     * 
     */
    @JsonProperty("KMSMasterKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-kmsmasterkeyid")
    private CharSequence kMSMasterKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    @JsonProperty("SSEEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled")
    private CharSequence sSEEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-ssetype
     * 
     */
    @JsonProperty("SSEType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-ssetype")
    private CharSequence sSEType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKMSMasterKeyId() {
        return kMSMasterKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public void setKMSMasterKeyId(CharSequence kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    public TableSSESpecification withKMSMasterKeyId(CharSequence kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    @JsonIgnore
    public CharSequence getSSEEnabled() {
        return sSEEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled
     * 
     */
    @JsonIgnore
    public void setSSEEnabled(CharSequence sSEEnabled) {
        this.sSEEnabled = sSEEnabled;
    }

    public TableSSESpecification withSSEEnabled(CharSequence sSEEnabled) {
        this.sSEEnabled = sSEEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-ssetype
     * 
     */
    @JsonIgnore
    public CharSequence getSSEType() {
        return sSEType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-ssetype
     * 
     */
    @JsonIgnore
    public void setSSEType(CharSequence sSEType) {
        this.sSEType = sSEType;
    }

    public TableSSESpecification withSSEType(CharSequence sSEType) {
        this.sSEType = sSEType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kMSMasterKeyId", kMSMasterKeyId).append("sSEEnabled", sSEEnabled).append("sSEType", sSEType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kMSMasterKeyId).append(sSEEnabled).append(sSEType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableSSESpecification) == false) {
            return false;
        }
        TableSSESpecification rhs = ((TableSSESpecification) other);
        return new EqualsBuilder().append(kMSMasterKeyId, rhs.kMSMasterKeyId).append(sSEEnabled, rhs.sSEEnabled).append(sSEType, rhs.sSEType).isEquals();
    }

}
