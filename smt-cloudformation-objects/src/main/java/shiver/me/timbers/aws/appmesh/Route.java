
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
 * Route
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MeshName",
    "VirtualRouterName",
    "MeshOwner",
    "RouteName",
    "Spec",
    "Tags"
})
public class Route {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname
     * 
     */
    @JsonProperty("MeshName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname")
    private CharSequence meshName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername
     * 
     */
    @JsonProperty("VirtualRouterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername")
    private CharSequence virtualRouterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner
     * 
     */
    @JsonProperty("MeshOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner")
    private CharSequence meshOwner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename
     * 
     */
    @JsonProperty("RouteName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename")
    private CharSequence routeName;
    /**
     * RouteRouteSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html
     * 
     */
    @JsonProperty("Spec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html")
    private Property<RouteRouteSpec> spec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname
     * 
     */
    @JsonIgnore
    public CharSequence getMeshName() {
        return meshName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname
     * 
     */
    @JsonIgnore
    public void setMeshName(CharSequence meshName) {
        this.meshName = meshName;
    }

    public Route withMeshName(CharSequence meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualRouterName() {
        return virtualRouterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername
     * 
     */
    @JsonIgnore
    public void setVirtualRouterName(CharSequence virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    public Route withVirtualRouterName(CharSequence virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner
     * 
     */
    @JsonIgnore
    public CharSequence getMeshOwner() {
        return meshOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner
     * 
     */
    @JsonIgnore
    public void setMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
    }

    public Route withMeshOwner(CharSequence meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename
     * 
     */
    @JsonIgnore
    public CharSequence getRouteName() {
        return routeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename
     * 
     */
    @JsonIgnore
    public void setRouteName(CharSequence routeName) {
        this.routeName = routeName;
    }

    public Route withRouteName(CharSequence routeName) {
        this.routeName = routeName;
        return this;
    }

    /**
     * RouteRouteSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html
     * 
     */
    @JsonIgnore
    public Property<RouteRouteSpec> getSpec() {
        return spec;
    }

    /**
     * RouteRouteSpec
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html
     * 
     */
    @JsonIgnore
    public void setSpec(Property<RouteRouteSpec> spec) {
        this.spec = spec;
    }

    public Route withSpec(Property<RouteRouteSpec> spec) {
        this.spec = spec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Route withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("meshName", meshName).append("virtualRouterName", virtualRouterName).append("meshOwner", meshOwner).append("routeName", routeName).append("spec", spec).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meshName).append(meshOwner).append(virtualRouterName).append(spec).append(routeName).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Route) == false) {
            return false;
        }
        Route rhs = ((Route) other);
        return new EqualsBuilder().append(meshName, rhs.meshName).append(meshOwner, rhs.meshOwner).append(virtualRouterName, rhs.virtualRouterName).append(spec, rhs.spec).append(routeName, rhs.routeName).append(tags, rhs.tags).isEquals();
    }

}
