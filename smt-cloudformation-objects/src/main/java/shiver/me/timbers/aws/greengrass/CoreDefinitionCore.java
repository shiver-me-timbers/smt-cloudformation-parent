
package shiver.me.timbers.aws.greengrass;

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
 * CoreDefinitionCore
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SyncShadow",
    "ThingArn",
    "Id",
    "CertificateArn"
})
public class CoreDefinitionCore implements Property<CoreDefinitionCore>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-syncshadow
     * 
     */
    @JsonProperty("SyncShadow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-syncshadow")
    private CharSequence syncShadow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-thingarn
     * 
     */
    @JsonProperty("ThingArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-thingarn")
    private CharSequence thingArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-certificatearn
     * 
     */
    @JsonProperty("CertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-certificatearn")
    private CharSequence certificateArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-syncshadow
     * 
     */
    @JsonIgnore
    public CharSequence getSyncShadow() {
        return syncShadow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-syncshadow
     * 
     */
    @JsonIgnore
    public void setSyncShadow(CharSequence syncShadow) {
        this.syncShadow = syncShadow;
    }

    public CoreDefinitionCore withSyncShadow(CharSequence syncShadow) {
        this.syncShadow = syncShadow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-thingarn
     * 
     */
    @JsonIgnore
    public CharSequence getThingArn() {
        return thingArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-thingarn
     * 
     */
    @JsonIgnore
    public void setThingArn(CharSequence thingArn) {
        this.thingArn = thingArn;
    }

    public CoreDefinitionCore withThingArn(CharSequence thingArn) {
        this.thingArn = thingArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public CoreDefinitionCore withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-certificatearn
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateArn() {
        return certificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-certificatearn
     * 
     */
    @JsonIgnore
    public void setCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
    }

    public CoreDefinitionCore withCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("syncShadow", syncShadow).append("thingArn", thingArn).append("id", id).append("certificateArn", certificateArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(syncShadow).append(id).append(thingArn).append(certificateArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoreDefinitionCore) == false) {
            return false;
        }
        CoreDefinitionCore rhs = ((CoreDefinitionCore) other);
        return new EqualsBuilder().append(syncShadow, rhs.syncShadow).append(id, rhs.id).append(thingArn, rhs.thingArn).append(certificateArn, rhs.certificateArn).isEquals();
    }

}
