
package aws.elasticsearch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EBSOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EBSEnabled",
    "Iops",
    "VolumeSize",
    "VolumeType"
})
public class EBSOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled
     * 
     */
    @JsonProperty("EBSEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled")
    private Boolean eBSEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops
     * 
     */
    @JsonProperty("Iops")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops")
    private Integer iops;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize
     * 
     */
    @JsonProperty("VolumeSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize")
    private Integer volumeSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype
     * 
     */
    @JsonProperty("VolumeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype")
    private CharSequence volumeType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled
     * 
     */
    public Boolean getEBSEnabled() {
        return eBSEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled
     * 
     */
    public void setEBSEnabled(Boolean eBSEnabled) {
        this.eBSEnabled = eBSEnabled;
    }

    public EBSOptions withEBSEnabled(Boolean eBSEnabled) {
        this.eBSEnabled = eBSEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops
     * 
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops
     * 
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public EBSOptions withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize
     * 
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize
     * 
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public EBSOptions withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype
     * 
     */
    public CharSequence getVolumeType() {
        return volumeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype
     * 
     */
    public void setVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
    }

    public EBSOptions withVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eBSEnabled", eBSEnabled).append("iops", iops).append("volumeSize", volumeSize).append("volumeType", volumeType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iops).append(volumeType).append(eBSEnabled).append(volumeSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EBSOptions) == false) {
            return false;
        }
        EBSOptions rhs = ((EBSOptions) other);
        return new EqualsBuilder().append(iops, rhs.iops).append(volumeType, rhs.volumeType).append(eBSEnabled, rhs.eBSEnabled).append(volumeSize, rhs.volumeSize).isEquals();
    }

}
