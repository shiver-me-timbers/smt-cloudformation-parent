
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
 * VirtualNodeAwsCloudMapServiceDiscovery
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NamespaceName",
    "ServiceName",
    "Attributes"
})
public class VirtualNodeAwsCloudMapServiceDiscovery implements Property<VirtualNodeAwsCloudMapServiceDiscovery>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-namespacename
     * 
     */
    @JsonProperty("NamespaceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-namespacename")
    private CharSequence namespaceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-servicename
     * 
     */
    @JsonProperty("ServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-servicename")
    private CharSequence serviceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-attributes")
    private List<Property<VirtualNodeAwsCloudMapInstanceAttribute>> attributes = new ArrayList<Property<VirtualNodeAwsCloudMapInstanceAttribute>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-namespacename
     * 
     */
    @JsonIgnore
    public CharSequence getNamespaceName() {
        return namespaceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-namespacename
     * 
     */
    @JsonIgnore
    public void setNamespaceName(CharSequence namespaceName) {
        this.namespaceName = namespaceName;
    }

    public VirtualNodeAwsCloudMapServiceDiscovery withNamespaceName(CharSequence namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-servicename
     * 
     */
    @JsonIgnore
    public CharSequence getServiceName() {
        return serviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-servicename
     * 
     */
    @JsonIgnore
    public void setServiceName(CharSequence serviceName) {
        this.serviceName = serviceName;
    }

    public VirtualNodeAwsCloudMapServiceDiscovery withServiceName(CharSequence serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-attributes
     * 
     */
    @JsonIgnore
    public List<Property<VirtualNodeAwsCloudMapInstanceAttribute>> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-attributes
     * 
     */
    @JsonIgnore
    public void setAttributes(List<Property<VirtualNodeAwsCloudMapInstanceAttribute>> attributes) {
        this.attributes = attributes;
    }

    public VirtualNodeAwsCloudMapServiceDiscovery withAttributes(List<Property<VirtualNodeAwsCloudMapInstanceAttribute>> attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("namespaceName", namespaceName).append("serviceName", serviceName).append("attributes", attributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).append(serviceName).append(namespaceName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeAwsCloudMapServiceDiscovery) == false) {
            return false;
        }
        VirtualNodeAwsCloudMapServiceDiscovery rhs = ((VirtualNodeAwsCloudMapServiceDiscovery) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(serviceName, rhs.serviceName).append(namespaceName, rhs.namespaceName).isEquals();
    }

}
