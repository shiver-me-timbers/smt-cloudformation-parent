
package aws.gamelift;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Build
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "StorageLocation",
    "Version"
})
public class Build {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name")
    private CharSequence name;
    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html
     * 
     */
    @JsonProperty("StorageLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html")
    private S3Location storageLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version")
    private CharSequence version;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Build withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html
     * 
     */
    public S3Location getStorageLocation() {
        return storageLocation;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html
     * 
     */
    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Build withStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version
     * 
     */
    public CharSequence getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version
     * 
     */
    public void setVersion(CharSequence version) {
        this.version = version;
    }

    public Build withVersion(CharSequence version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("storageLocation", storageLocation).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(storageLocation).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Build) == false) {
            return false;
        }
        Build rhs = ((Build) other);
        return new EqualsBuilder().append(name, rhs.name).append(storageLocation, rhs.storageLocation).append(version, rhs.version).isEquals();
    }

}
