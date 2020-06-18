
package shiver.me.timbers.aws.efs;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * AccessPoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientToken",
    "AccessPointTags",
    "FileSystemId",
    "PosixUser",
    "RootDirectory"
})
public class AccessPoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken
     * 
     */
    @JsonProperty("ClientToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken")
    private CharSequence clientToken;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags
     * 
     */
    @JsonProperty("AccessPointTags")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags")
    private Set<Property<AccessPointAccessPointTag>> accessPointTags = new LinkedHashSet<Property<AccessPointAccessPointTag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid
     * 
     */
    @JsonProperty("FileSystemId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid")
    private CharSequence fileSystemId;
    /**
     * AccessPointPosixUser
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html
     * 
     */
    @JsonProperty("PosixUser")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html")
    private Property<AccessPointPosixUser> posixUser;
    /**
     * AccessPointRootDirectory
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html
     * 
     */
    @JsonProperty("RootDirectory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html")
    private Property<AccessPointRootDirectory> rootDirectory;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken
     * 
     */
    @JsonIgnore
    public CharSequence getClientToken() {
        return clientToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken
     * 
     */
    @JsonIgnore
    public void setClientToken(CharSequence clientToken) {
        this.clientToken = clientToken;
    }

    public AccessPoint withClientToken(CharSequence clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags
     * 
     */
    @JsonIgnore
    public Set<Property<AccessPointAccessPointTag>> getAccessPointTags() {
        return accessPointTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags
     * 
     */
    @JsonIgnore
    public void setAccessPointTags(Set<Property<AccessPointAccessPointTag>> accessPointTags) {
        this.accessPointTags = accessPointTags;
    }

    public AccessPoint withAccessPointTags(Set<Property<AccessPointAccessPointTag>> accessPointTags) {
        this.accessPointTags = accessPointTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid
     * 
     */
    @JsonIgnore
    public CharSequence getFileSystemId() {
        return fileSystemId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid
     * 
     */
    @JsonIgnore
    public void setFileSystemId(CharSequence fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    public AccessPoint withFileSystemId(CharSequence fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * AccessPointPosixUser
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html
     * 
     */
    @JsonIgnore
    public Property<AccessPointPosixUser> getPosixUser() {
        return posixUser;
    }

    /**
     * AccessPointPosixUser
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html
     * 
     */
    @JsonIgnore
    public void setPosixUser(Property<AccessPointPosixUser> posixUser) {
        this.posixUser = posixUser;
    }

    public AccessPoint withPosixUser(Property<AccessPointPosixUser> posixUser) {
        this.posixUser = posixUser;
        return this;
    }

    /**
     * AccessPointRootDirectory
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html
     * 
     */
    @JsonIgnore
    public Property<AccessPointRootDirectory> getRootDirectory() {
        return rootDirectory;
    }

    /**
     * AccessPointRootDirectory
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html
     * 
     */
    @JsonIgnore
    public void setRootDirectory(Property<AccessPointRootDirectory> rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    public AccessPoint withRootDirectory(Property<AccessPointRootDirectory> rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientToken", clientToken).append("accessPointTags", accessPointTags).append("fileSystemId", fileSystemId).append("posixUser", posixUser).append("rootDirectory", rootDirectory).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(posixUser).append(rootDirectory).append(accessPointTags).append(fileSystemId).append(clientToken).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessPoint) == false) {
            return false;
        }
        AccessPoint rhs = ((AccessPoint) other);
        return new EqualsBuilder().append(posixUser, rhs.posixUser).append(rootDirectory, rhs.rootDirectory).append(accessPointTags, rhs.accessPointTags).append(fileSystemId, rhs.fileSystemId).append(clientToken, rhs.clientToken).isEquals();
    }

}
