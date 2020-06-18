
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
 * VirtualService
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MeshName",
    "MeshOwner",
    "VirtualServiceName",
    "Spec",
    "Tags"
})
public class VirtualService {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname
     * 
     */
    @JsonProperty("MeshName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname")
    private CharSequence meshName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner
     * 
     */
    @JsonProperty("MeshOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner")
    private CharSequence meshOwner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename
     * 
     */
    @JsonProperty("VirtualServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename")
    private CharSequence virtualServiceName;
    /**
     * VirtualServiceVirtualServiceSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html
     * 
     */
    @JsonProperty("Spec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html")
    private Property<VirtualServiceVirtualServiceSpec> spec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname
     * 
     */
    @JsonIgnore
    public CharSequence getMeshName() {
        return meshName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname
     * 
     */
    @JsonIgnore
    public void setMeshName(CharSequence meshName) {
        this.meshName = meshName;
    }

    public VirtualService withMeshName(CharSequence meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner
     * 
     */
    @JsonIgnore
    public CharSequence getMeshOwner() {
        return meshOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner
     * 
     */
    @JsonIgnore
    public void setMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
    }

    public VirtualService withMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualServiceName() {
        return virtualServiceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename
     * 
     */
    @JsonIgnore
    public void setVirtualServiceName(CharSequence virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    public VirtualService withVirtualServiceName(CharSequence virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
        return this;
    }

    /**
     * VirtualServiceVirtualServiceSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html
     * 
     */
    @JsonIgnore
    public Property<VirtualServiceVirtualServiceSpec> getSpec() {
        return spec;
    }

    /**
     * VirtualServiceVirtualServiceSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html
     * 
     */
    @JsonIgnore
    public void setSpec(Property<VirtualServiceVirtualServiceSpec> spec) {
        this.spec = spec;
    }

    public VirtualService withSpec(Property<VirtualServiceVirtualServiceSpec> spec) {
        this.spec = spec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public VirtualService withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("meshName", meshName).append("meshOwner", meshOwner).append("virtualServiceName", virtualServiceName).append("spec", spec).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualServiceName).append(meshName).append(meshOwner).append(spec).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualService) == false) {
            return false;
        }
        VirtualService rhs = ((VirtualService) other);
        return new EqualsBuilder().append(virtualServiceName, rhs.virtualServiceName).append(meshName, rhs.meshName).append(meshOwner, rhs.meshOwner).append(spec, rhs.spec).append(tags, rhs.tags).isEquals();
    }

}
