
package aws.appmesh;

import java.util.ArrayList;
import java.util.List;
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
 * VirtualNode
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MeshName",
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
     * VirtualNodeSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html
     * 
     */
    @JsonProperty("Spec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html")
    private Property<VirtualNodeSpec> spec;
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
    private List<Property<TagRef>> tags = new ArrayList<Property<TagRef>>();

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
     * VirtualNodeSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeSpec> getSpec() {
        return spec;
    }

    /**
     * VirtualNodeSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html
     * 
     */
    @JsonIgnore
    public void setSpec(Property<VirtualNodeSpec> spec) {
        this.spec = spec;
    }

    public VirtualNode withSpec(Property<VirtualNodeSpec> spec) {
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
    public List<Property<TagRef>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<TagRef>> tags) {
        this.tags = tags;
    }

    public VirtualNode withTags(List<Property<TagRef>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("meshName", meshName).append("spec", spec).append("virtualNodeName", virtualNodeName).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meshName).append(virtualNodeName).append(spec).append(tags).toHashCode();
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
        return new EqualsBuilder().append(meshName, rhs.meshName).append(virtualNodeName, rhs.virtualNodeName).append(spec, rhs.spec).append(tags, rhs.tags).isEquals();
    }

}
