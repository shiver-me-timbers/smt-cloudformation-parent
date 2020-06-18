
package shiver.me.timbers.aws.networkmanager;

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
 * LinkBandwidth
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DownloadSpeed",
    "UploadSpeed"
})
public class LinkBandwidth implements Property<LinkBandwidth>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-downloadspeed
     * 
     */
    @JsonProperty("DownloadSpeed")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-downloadspeed")
    private Number downloadSpeed;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-uploadspeed
     * 
     */
    @JsonProperty("UploadSpeed")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-uploadspeed")
    private Number uploadSpeed;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-downloadspeed
     * 
     */
    @JsonIgnore
    public Number getDownloadSpeed() {
        return downloadSpeed;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-downloadspeed
     * 
     */
    @JsonIgnore
    public void setDownloadSpeed(Number downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public LinkBandwidth withDownloadSpeed(Number downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-uploadspeed
     * 
     */
    @JsonIgnore
    public Number getUploadSpeed() {
        return uploadSpeed;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-uploadspeed
     * 
     */
    @JsonIgnore
    public void setUploadSpeed(Number uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    public LinkBandwidth withUploadSpeed(Number uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("downloadSpeed", downloadSpeed).append("uploadSpeed", uploadSpeed).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(downloadSpeed).append(uploadSpeed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LinkBandwidth) == false) {
            return false;
        }
        LinkBandwidth rhs = ((LinkBandwidth) other);
        return new EqualsBuilder().append(downloadSpeed, rhs.downloadSpeed).append(uploadSpeed, rhs.uploadSpeed).isEquals();
    }

}
