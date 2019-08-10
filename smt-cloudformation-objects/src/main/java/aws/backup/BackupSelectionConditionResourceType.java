
package aws.backup;

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
 * BackupSelectionConditionResourceType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConditionValue",
    "ConditionKey",
    "ConditionType"
})
public class BackupSelectionConditionResourceType implements Property<BackupSelectionConditionResourceType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionvalue
     * 
     */
    @JsonProperty("ConditionValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionvalue")
    private CharSequence conditionValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionkey
     * 
     */
    @JsonProperty("ConditionKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionkey")
    private CharSequence conditionKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditiontype
     * 
     */
    @JsonProperty("ConditionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditiontype")
    private CharSequence conditionType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionvalue
     * 
     */
    @JsonIgnore
    public CharSequence getConditionValue() {
        return conditionValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionvalue
     * 
     */
    @JsonIgnore
    public void setConditionValue(CharSequence conditionValue) {
        this.conditionValue = conditionValue;
    }

    public BackupSelectionConditionResourceType withConditionValue(CharSequence conditionValue) {
        this.conditionValue = conditionValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionkey
     * 
     */
    @JsonIgnore
    public CharSequence getConditionKey() {
        return conditionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionkey
     * 
     */
    @JsonIgnore
    public void setConditionKey(CharSequence conditionKey) {
        this.conditionKey = conditionKey;
    }

    public BackupSelectionConditionResourceType withConditionKey(CharSequence conditionKey) {
        this.conditionKey = conditionKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditiontype
     * 
     */
    @JsonIgnore
    public CharSequence getConditionType() {
        return conditionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditiontype
     * 
     */
    @JsonIgnore
    public void setConditionType(CharSequence conditionType) {
        this.conditionType = conditionType;
    }

    public BackupSelectionConditionResourceType withConditionType(CharSequence conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("conditionValue", conditionValue).append("conditionKey", conditionKey).append("conditionType", conditionType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(conditionValue).append(conditionType).append(conditionKey).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupSelectionConditionResourceType) == false) {
            return false;
        }
        BackupSelectionConditionResourceType rhs = ((BackupSelectionConditionResourceType) other);
        return new EqualsBuilder().append(conditionValue, rhs.conditionValue).append(conditionType, rhs.conditionType).append(conditionKey, rhs.conditionKey).isEquals();
    }

}
