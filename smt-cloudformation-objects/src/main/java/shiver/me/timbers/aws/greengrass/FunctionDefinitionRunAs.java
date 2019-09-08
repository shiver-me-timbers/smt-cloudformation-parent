
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
 * FunctionDefinitionRunAs
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Uid",
    "Gid"
})
public class FunctionDefinitionRunAs implements Property<FunctionDefinitionRunAs>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid
     * 
     */
    @JsonProperty("Uid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid")
    private Number uid;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid
     * 
     */
    @JsonProperty("Gid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid")
    private Number gid;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid
     * 
     */
    @JsonIgnore
    public Number getUid() {
        return uid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid
     * 
     */
    @JsonIgnore
    public void setUid(Number uid) {
        this.uid = uid;
    }

    public FunctionDefinitionRunAs withUid(Number uid) {
        this.uid = uid;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid
     * 
     */
    @JsonIgnore
    public Number getGid() {
        return gid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid
     * 
     */
    @JsonIgnore
    public void setGid(Number gid) {
        this.gid = gid;
    }

    public FunctionDefinitionRunAs withGid(Number gid) {
        this.gid = gid;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uid", uid).append("gid", gid).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uid).append(gid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionDefinitionRunAs) == false) {
            return false;
        }
        FunctionDefinitionRunAs rhs = ((FunctionDefinitionRunAs) other);
        return new EqualsBuilder().append(uid, rhs.uid).append(gid, rhs.gid).isEquals();
    }

}
