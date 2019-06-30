
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
 * FunctionDefinitionVersionRunAs
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Uid",
    "Gid"
})
public class FunctionDefinitionVersionRunAs implements Property<FunctionDefinitionVersionRunAs>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-uid
     * 
     */
    @JsonProperty("Uid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-uid")
    private Number uid;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-gid
     * 
     */
    @JsonProperty("Gid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-gid")
    private Number gid;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-uid
     * 
     */
    @JsonIgnore
    public Number getUid() {
        return uid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-uid
     * 
     */
    @JsonIgnore
    public void setUid(Number uid) {
        this.uid = uid;
    }

    public FunctionDefinitionVersionRunAs withUid(Number uid) {
        this.uid = uid;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-gid
     * 
     */
    @JsonIgnore
    public Number getGid() {
        return gid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-gid
     * 
     */
    @JsonIgnore
    public void setGid(Number gid) {
        this.gid = gid;
    }

    public FunctionDefinitionVersionRunAs withGid(Number gid) {
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
        if ((other instanceof FunctionDefinitionVersionRunAs) == false) {
            return false;
        }
        FunctionDefinitionVersionRunAs rhs = ((FunctionDefinitionVersionRunAs) other);
        return new EqualsBuilder().append(uid, rhs.uid).append(gid, rhs.gid).isEquals();
    }

}
