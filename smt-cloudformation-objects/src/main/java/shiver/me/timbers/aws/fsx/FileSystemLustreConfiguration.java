
package shiver.me.timbers.aws.fsx;

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
    "DeploymentType",
    "ExportPath",
    "PerUnitStorageThroughput"
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-deploymenttype
     * 
     */
    @JsonProperty("DeploymentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-deploymenttype")
    private CharSequence deploymentType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath
     * 
     */
    @JsonProperty("ExportPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath")
    private CharSequence exportPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-perunitstoragethroughput
     * 
     */
    @JsonProperty("PerUnitStorageThroughput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-perunitstoragethroughput")
    private Number perUnitStorageThroughput;

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-deploymenttype
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentType() {
        return deploymentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-deploymenttype
     * 
     */
    @JsonIgnore
    public void setDeploymentType(CharSequence deploymentType) {
        this.deploymentType = deploymentType;
    }

    public FileSystemLustreConfiguration withDeploymentType(CharSequence deploymentType) {
        this.deploymentType = deploymentType;
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

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-perunitstoragethroughput
     * 
     */
    @JsonIgnore
    public Number getPerUnitStorageThroughput() {
        return perUnitStorageThroughput;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-perunitstoragethroughput
     * 
     */
    @JsonIgnore
    public void setPerUnitStorageThroughput(Number perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    public FileSystemLustreConfiguration withPerUnitStorageThroughput(Number perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("importPath", importPath).append("weeklyMaintenanceStartTime", weeklyMaintenanceStartTime).append("importedFileChunkSize", importedFileChunkSize).append("deploymentType", deploymentType).append("exportPath", exportPath).append("perUnitStorageThroughput", perUnitStorageThroughput).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(importPath).append(deploymentType).append(weeklyMaintenanceStartTime).append(perUnitStorageThroughput).append(importedFileChunkSize).append(exportPath).toHashCode();
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
        return new EqualsBuilder().append(importPath, rhs.importPath).append(deploymentType, rhs.deploymentType).append(weeklyMaintenanceStartTime, rhs.weeklyMaintenanceStartTime).append(perUnitStorageThroughput, rhs.perUnitStorageThroughput).append(importedFileChunkSize, rhs.importedFileChunkSize).append(exportPath, rhs.exportPath).isEquals();
    }

}
