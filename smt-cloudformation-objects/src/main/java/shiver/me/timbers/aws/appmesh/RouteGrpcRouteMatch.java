
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


/**
 * RouteGrpcRouteMatch
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ServiceName",
    "Metadata",
    "MethodName"
})
public class RouteGrpcRouteMatch implements Property<RouteGrpcRouteMatch>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename
     * 
     */
    @JsonProperty("ServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename")
    private CharSequence serviceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata
     * 
     */
    @JsonProperty("Metadata")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata")
    private List<Property<RouteGrpcRouteMetadata>> metadata = new ArrayList<Property<RouteGrpcRouteMetadata>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname
     * 
     */
    @JsonProperty("MethodName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname")
    private CharSequence methodName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename
     * 
     */
    @JsonIgnore
    public CharSequence getServiceName() {
        return serviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename
     * 
     */
    @JsonIgnore
    public void setServiceName(CharSequence serviceName) {
        this.serviceName = serviceName;
    }

    public RouteGrpcRouteMatch withServiceName(CharSequence serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata
     * 
     */
    @JsonIgnore
    public List<Property<RouteGrpcRouteMetadata>> getMetadata() {
        return metadata;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata
     * 
     */
    @JsonIgnore
    public void setMetadata(List<Property<RouteGrpcRouteMetadata>> metadata) {
        this.metadata = metadata;
    }

    public RouteGrpcRouteMatch withMetadata(List<Property<RouteGrpcRouteMetadata>> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname
     * 
     */
    @JsonIgnore
    public CharSequence getMethodName() {
        return methodName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname
     * 
     */
    @JsonIgnore
    public void setMethodName(CharSequence methodName) {
        this.methodName = methodName;
    }

    public RouteGrpcRouteMatch withMethodName(CharSequence methodName) {
        this.methodName = methodName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serviceName", serviceName).append("metadata", metadata).append("methodName", methodName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(methodName).append(metadata).append(serviceName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteGrpcRouteMatch) == false) {
            return false;
        }
        RouteGrpcRouteMatch rhs = ((RouteGrpcRouteMatch) other);
        return new EqualsBuilder().append(methodName, rhs.methodName).append(metadata, rhs.metadata).append(serviceName, rhs.serviceName).isEquals();
    }

}
