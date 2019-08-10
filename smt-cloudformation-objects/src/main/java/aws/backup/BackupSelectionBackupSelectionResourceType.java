
package aws.backup;

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
 * BackupSelectionBackupSelectionResourceType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ListOfTags",
    "SelectionName",
    "IamRoleArn",
    "Resources"
})
public class BackupSelectionBackupSelectionResourceType implements Property<BackupSelectionBackupSelectionResourceType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-listoftags
     * 
     */
    @JsonProperty("ListOfTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-listoftags")
    private List<Property<BackupSelectionConditionResourceType>> listOfTags = new ArrayList<Property<BackupSelectionConditionResourceType>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-selectionname
     * 
     */
    @JsonProperty("SelectionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-selectionname")
    private CharSequence selectionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-iamrolearn
     * 
     */
    @JsonProperty("IamRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-iamrolearn")
    private CharSequence iamRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-resources
     * 
     */
    @JsonProperty("Resources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-resources")
    private List<CharSequence> resources = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-listoftags
     * 
     */
    @JsonIgnore
    public List<Property<BackupSelectionConditionResourceType>> getListOfTags() {
        return listOfTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-listoftags
     * 
     */
    @JsonIgnore
    public void setListOfTags(List<Property<BackupSelectionConditionResourceType>> listOfTags) {
        this.listOfTags = listOfTags;
    }

    public BackupSelectionBackupSelectionResourceType withListOfTags(List<Property<BackupSelectionConditionResourceType>> listOfTags) {
        this.listOfTags = listOfTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-selectionname
     * 
     */
    @JsonIgnore
    public CharSequence getSelectionName() {
        return selectionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-selectionname
     * 
     */
    @JsonIgnore
    public void setSelectionName(CharSequence selectionName) {
        this.selectionName = selectionName;
    }

    public BackupSelectionBackupSelectionResourceType withSelectionName(CharSequence selectionName) {
        this.selectionName = selectionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-iamrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-iamrolearn
     * 
     */
    @JsonIgnore
    public void setIamRoleArn(CharSequence iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    public BackupSelectionBackupSelectionResourceType withIamRoleArn(CharSequence iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-resources
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResources() {
        return resources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-resources
     * 
     */
    @JsonIgnore
    public void setResources(List<CharSequence> resources) {
        this.resources = resources;
    }

    public BackupSelectionBackupSelectionResourceType withResources(List<CharSequence> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("listOfTags", listOfTags).append("selectionName", selectionName).append("iamRoleArn", iamRoleArn).append("resources", resources).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resources).append(listOfTags).append(iamRoleArn).append(selectionName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupSelectionBackupSelectionResourceType) == false) {
            return false;
        }
        BackupSelectionBackupSelectionResourceType rhs = ((BackupSelectionBackupSelectionResourceType) other);
        return new EqualsBuilder().append(resources, rhs.resources).append(listOfTags, rhs.listOfTags).append(iamRoleArn, rhs.iamRoleArn).append(selectionName, rhs.selectionName).isEquals();
    }

}
