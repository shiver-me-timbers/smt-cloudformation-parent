
package aws.appmesh;

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
 * MeshMeshSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EgressFilter"
})
public class MeshMeshSpec implements Property<MeshMeshSpec>
{

    /**
     * MeshEgressFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html
     * 
     */
    @JsonProperty("EgressFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html")
    private Property<MeshEgressFilter> egressFilter;

    /**
     * MeshEgressFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html
     * 
     */
    @JsonIgnore
    public Property<MeshEgressFilter> getEgressFilter() {
        return egressFilter;
    }

    /**
     * MeshEgressFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html
     * 
     */
    @JsonIgnore
    public void setEgressFilter(Property<MeshEgressFilter> egressFilter) {
        this.egressFilter = egressFilter;
    }

    public MeshMeshSpec withEgressFilter(Property<MeshEgressFilter> egressFilter) {
        this.egressFilter = egressFilter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("egressFilter", egressFilter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(egressFilter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeshMeshSpec) == false) {
            return false;
        }
        MeshMeshSpec rhs = ((MeshMeshSpec) other);
        return new EqualsBuilder().append(egressFilter, rhs.egressFilter).isEquals();
    }

}
