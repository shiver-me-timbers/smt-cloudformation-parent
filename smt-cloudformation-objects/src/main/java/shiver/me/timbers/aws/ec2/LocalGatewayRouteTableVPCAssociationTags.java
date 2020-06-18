
package shiver.me.timbers.aws.ec2;

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
import shiver.me.timbers.aws.Tag;


/**
 * LocalGatewayRouteTableVPCAssociationTags
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Tags"
})
public class LocalGatewayRouteTableVPCAssociationTags implements Property<LocalGatewayRouteTableVPCAssociationTags>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html#cfn-ec2-localgatewayroutetablevpcassociation-tags-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html#cfn-ec2-localgatewayroutetablevpcassociation-tags-tags")
    private Set<Property<Tag>> tags = new LinkedHashSet<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html#cfn-ec2-localgatewayroutetablevpcassociation-tags-tags
     * 
     */
    @JsonIgnore
    public Set<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html#cfn-ec2-localgatewayroutetablevpcassociation-tags-tags
     * 
     */
    @JsonIgnore
    public void setTags(Set<Property<Tag>> tags) {
        this.tags = tags;
    }

    public LocalGatewayRouteTableVPCAssociationTags withTags(Set<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalGatewayRouteTableVPCAssociationTags) == false) {
            return false;
        }
        LocalGatewayRouteTableVPCAssociationTags rhs = ((LocalGatewayRouteTableVPCAssociationTags) other);
        return new EqualsBuilder().append(tags, rhs.tags).isEquals();
    }

}
