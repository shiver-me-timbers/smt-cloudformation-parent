
package shiver.me.timbers.aws.appmesh;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * VirtualNode
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MeshName",
    "MeshOwner",
    "Spec",
    "VirtualNodeName",
    "Tags"
})
public class VirtualNode {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname
     * 
     */
    @JsonProperty("MeshName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname")
    private CharSequence meshName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner
     * 
     */
    @JsonProperty("MeshOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner")
    private CharSequence meshOwner;
    /**
     * VirtualNodeVirtualNodeSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html
     * 
     */
    @JsonProperty("Spec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html")
    private Property<VirtualNodeVirtualNodeSpec> spec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename
     * 
     */
    @JsonProperty("VirtualNodeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename")
    private CharSequence virtualNodeName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname
     * 
     */
    @JsonIgnore
    public CharSequence getMeshName() {
        return meshName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname
     * 
     */
    @JsonIgnore
    public void setMeshName(CharSequence meshName) {
        this.meshName = meshName;
    }

    public VirtualNode withMeshName(CharSequence meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner
     * 
     */
    @JsonIgnore
    public CharSequence getMeshOwner() {
        return meshOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner
     * 
     */
    @JsonIgnore
    public void setMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
    }

    public VirtualNode withMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * VirtualNodeVirtualNodeSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeVirtualNodeSpec> getSpec() {
        return spec;
    }

    /**
     * VirtualNodeVirtualNodeSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html
     * 
     */
    @JsonIgnore
    public void setSpec(Property<VirtualNodeVirtualNodeSpec> spec) {
        this.spec = spec;
    }

    public VirtualNode withSpec(Property<VirtualNodeVirtualNodeSpec> spec) {
        this.spec = spec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualNodeName() {
        return virtualNodeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename
     * 
     */
    @JsonIgnore
    public void setVirtualNodeName(CharSequence virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    public VirtualNode withVirtualNodeName(CharSequence virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public VirtualNode withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("meshName", meshName).append("meshOwner", meshOwner).append("spec", spec).append("virtualNodeName", virtualNodeName).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meshName).append(meshOwner).append(virtualNodeName).append(spec).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNode) == false) {
            return false;
        }
        VirtualNode rhs = ((VirtualNode) other);
        return new EqualsBuilder().append(meshName, rhs.meshName).append(meshOwner, rhs.meshOwner).append(virtualNodeName, rhs.virtualNodeName).append(spec, rhs.spec).append(tags, rhs.tags).isEquals();
    }

}
