
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
 * VirtualRouter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MeshName",
    "VirtualRouterName",
    "MeshOwner",
    "Spec",
    "Tags"
})
public class VirtualRouter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshname
     * 
     */
    @JsonProperty("MeshName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshname")
    private CharSequence meshName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-virtualroutername
     * 
     */
    @JsonProperty("VirtualRouterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-virtualroutername")
    private CharSequence virtualRouterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshowner
     * 
     */
    @JsonProperty("MeshOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshowner")
    private CharSequence meshOwner;
    /**
     * VirtualRouterVirtualRouterSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html
     * 
     */
    @JsonProperty("Spec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html")
    private Property<VirtualRouterVirtualRouterSpec> spec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshname
     * 
     */
    @JsonIgnore
    public CharSequence getMeshName() {
        return meshName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshname
     * 
     */
    @JsonIgnore
    public void setMeshName(CharSequence meshName) {
        this.meshName = meshName;
    }

    public VirtualRouter withMeshName(CharSequence meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-virtualroutername
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualRouterName() {
        return virtualRouterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-virtualroutername
     * 
     */
    @JsonIgnore
    public void setVirtualRouterName(CharSequence virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    public VirtualRouter withVirtualRouterName(CharSequence virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshowner
     * 
     */
    @JsonIgnore
    public CharSequence getMeshOwner() {
        return meshOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshowner
     * 
     */
    @JsonIgnore
    public void setMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
    }

    public VirtualRouter withMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * VirtualRouterVirtualRouterSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html
     * 
     */
    @JsonIgnore
    public Property<VirtualRouterVirtualRouterSpec> getSpec() {
        return spec;
    }

    /**
     * VirtualRouterVirtualRouterSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html
     * 
     */
    @JsonIgnore
    public void setSpec(Property<VirtualRouterVirtualRouterSpec> spec) {
        this.spec = spec;
    }

    public VirtualRouter withSpec(Property<VirtualRouterVirtualRouterSpec> spec) {
        this.spec = spec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public VirtualRouter withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("meshName", meshName).append("virtualRouterName", virtualRouterName).append("meshOwner", meshOwner).append("spec", spec).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meshName).append(meshOwner).append(virtualRouterName).append(spec).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualRouter) == false) {
            return false;
        }
        VirtualRouter rhs = ((VirtualRouter) other);
        return new EqualsBuilder().append(meshName, rhs.meshName).append(meshOwner, rhs.meshOwner).append(virtualRouterName, rhs.virtualRouterName).append(spec, rhs.spec).append(tags, rhs.tags).isEquals();
    }

}
