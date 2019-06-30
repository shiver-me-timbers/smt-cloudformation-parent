
package aws.fsx;

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
 * FileSystemLustreConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ImportPath",
    "WeeklyMaintenanceStartTime",
    "ImportedFileChunkSize",
    "ExportPath"
})
public class FileSystemLustreConfiguration implements Property<FileSystemLustreConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importpath
     * 
     */
    @JsonProperty("ImportPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importpath")
    private CharSequence importPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-weeklymaintenancestarttime
     * 
     */
    @JsonProperty("WeeklyMaintenanceStartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-weeklymaintenancestarttime")
    private CharSequence weeklyMaintenanceStartTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importedfilechunksize
     * 
     */
    @JsonProperty("ImportedFileChunkSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importedfilechunksize")
    private Number importedFileChunkSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath
     * 
     */
    @JsonProperty("ExportPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath")
    private CharSequence exportPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importpath
     * 
     */
    @JsonIgnore
    public CharSequence getImportPath() {
        return importPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importpath
     * 
     */
    @JsonIgnore
    public void setImportPath(CharSequence importPath) {
        this.importPath = importPath;
    }

    public FileSystemLustreConfiguration withImportPath(CharSequence importPath) {
        this.importPath = importPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-weeklymaintenancestarttime
     * 
     */
    @JsonIgnore
    public CharSequence getWeeklyMaintenanceStartTime() {
        return weeklyMaintenanceStartTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-weeklymaintenancestarttime
     * 
     */
    @JsonIgnore
    public void setWeeklyMaintenanceStartTime(CharSequence weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    public FileSystemLustreConfiguration withWeeklyMaintenanceStartTime(CharSequence weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importedfilechunksize
     * 
     */
    @JsonIgnore
    public Number getImportedFileChunkSize() {
        return importedFileChunkSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importedfilechunksize
     * 
     */
    @JsonIgnore
    public void setImportedFileChunkSize(Number importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
    }

    public FileSystemLustreConfiguration withImportedFileChunkSize(Number importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath
     * 
     */
    @JsonIgnore
    public CharSequence getExportPath() {
        return exportPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath
     * 
     */
    @JsonIgnore
    public void setExportPath(CharSequence exportPath) {
        this.exportPath = exportPath;
    }

    public FileSystemLustreConfiguration withExportPath(CharSequence exportPath) {
        this.exportPath = exportPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("importPath", importPath).append("weeklyMaintenanceStartTime", weeklyMaintenanceStartTime).append("importedFileChunkSize", importedFileChunkSize).append("exportPath", exportPath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(importPath).append(weeklyMaintenanceStartTime).append(importedFileChunkSize).append(exportPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileSystemLustreConfiguration) == false) {
            return false;
        }
        FileSystemLustreConfiguration rhs = ((FileSystemLustreConfiguration) other);
        return new EqualsBuilder().append(importPath, rhs.importPath).append(weeklyMaintenanceStartTime, rhs.weeklyMaintenanceStartTime).append(importedFileChunkSize, rhs.importedFileChunkSize).append(exportPath, rhs.exportPath).isEquals();
    }

}
