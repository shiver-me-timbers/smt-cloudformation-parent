
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
 * Backend
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backend.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VirtualService"
})
public class Backend implements Property<Backend>
{

    /**
     * VirtualServiceBackend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html
     * 
     */
    @JsonProperty("VirtualService")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html")
    private Property<VirtualServiceBackend> virtualService;

    /**
     * VirtualServiceBackend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html
     * 
     */
    @JsonIgnore
    public Property<VirtualServiceBackend> getVirtualService() {
        return virtualService;
    }

    /**
     * VirtualServiceBackend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html
     * 
     */
    @JsonIgnore
    public void setVirtualService(Property<VirtualServiceBackend> virtualService) {
        this.virtualService = virtualService;
    }

    public Backend withVirtualService(Property<VirtualServiceBackend> virtualService) {
        this.virtualService = virtualService;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("virtualService", virtualService).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualService).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Backend) == false) {
            return false;
        }
        Backend rhs = ((Backend) other);
        return new EqualsBuilder().append(virtualService, rhs.virtualService).isEquals();
    }

}
