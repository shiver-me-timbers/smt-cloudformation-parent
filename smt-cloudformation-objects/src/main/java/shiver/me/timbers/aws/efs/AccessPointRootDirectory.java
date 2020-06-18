
package shiver.me.timbers.aws.efs;

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
 * AccessPointRootDirectory
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Path",
    "CreationInfo"
})
public class AccessPointRootDirectory implements Property<AccessPointRootDirectory>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-path")
    private CharSequence path;
    /**
     * AccessPointCreationInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html
     * 
     */
    @JsonProperty("CreationInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html")
    private Property<AccessPointCreationInfo> creationInfo;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-path
     * 
     */
    @JsonIgnore
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-path
     * 
     */
    @JsonIgnore
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public AccessPointRootDirectory withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    /**
     * AccessPointCreationInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html
     * 
     */
    @JsonIgnore
    public Property<AccessPointCreationInfo> getCreationInfo() {
        return creationInfo;
    }

    /**
     * AccessPointCreationInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html
     * 
     */
    @JsonIgnore
    public void setCreationInfo(Property<AccessPointCreationInfo> creationInfo) {
        this.creationInfo = creationInfo;
    }

    public AccessPointRootDirectory withCreationInfo(Property<AccessPointCreationInfo> creationInfo) {
        this.creationInfo = creationInfo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("path", path).append("creationInfo", creationInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(creationInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessPointRootDirectory) == false) {
            return false;
        }
        AccessPointRootDirectory rhs = ((AccessPointRootDirectory) other);
        return new EqualsBuilder().append(path, rhs.path).append(creationInfo, rhs.creationInfo).isEquals();
    }

}
