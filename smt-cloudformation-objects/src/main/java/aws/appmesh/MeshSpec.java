
package aws.appmesh;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MeshSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EgressFilter"
})
public class MeshSpec {

    /**
     * EgressFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html
     * 
     */
    @JsonProperty("EgressFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html")
    private EgressFilter egressFilter;

    /**
     * EgressFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html
     * 
     */
    @JsonIgnore
    public EgressFilter getEgressFilter() {
        return egressFilter;
    }

    /**
     * EgressFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html
     * 
     */
    @JsonIgnore
    public void setEgressFilter(EgressFilter egressFilter) {
        this.egressFilter = egressFilter;
    }

    public MeshSpec withEgressFilter(EgressFilter egressFilter) {
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
        if ((other instanceof MeshSpec) == false) {
            return false;
        }
        MeshSpec rhs = ((MeshSpec) other);
        return new EqualsBuilder().append(egressFilter, rhs.egressFilter).isEquals();
    }

}
