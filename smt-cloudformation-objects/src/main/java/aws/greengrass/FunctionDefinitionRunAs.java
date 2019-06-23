
package aws.greengrass;

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
    private Integer uid;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid
     * 
     */
    @JsonProperty("Gid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid")
    private Integer gid;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid
     * 
     */
    @JsonIgnore
    public Integer getUid() {
        return uid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid
     * 
     */
    @JsonIgnore
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public FunctionDefinitionRunAs withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid
     * 
     */
    @JsonIgnore
    public Integer getGid() {
        return gid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid
     * 
     */
    @JsonIgnore
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public FunctionDefinitionRunAs withGid(Integer gid) {
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
