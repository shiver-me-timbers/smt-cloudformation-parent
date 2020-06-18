
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
 * VirtualNodeClientPolicyTls
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Validation",
    "Enforce",
    "Ports"
})
public class VirtualNodeClientPolicyTls implements Property<VirtualNodeClientPolicyTls>
{

    /**
     * VirtualNodeTlsValidationContext
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html
     * 
     */
    @JsonProperty("Validation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html")
    private Property<VirtualNodeTlsValidationContext> validation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-enforce
     * 
     */
    @JsonProperty("Enforce")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-enforce")
    private CharSequence enforce;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-ports
     * 
     */
    @JsonProperty("Ports")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-ports")
    private List<Number> ports = new ArrayList<Number>();

    /**
     * VirtualNodeTlsValidationContext
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeTlsValidationContext> getValidation() {
        return validation;
    }

    /**
     * VirtualNodeTlsValidationContext
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html
     * 
     */
    @JsonIgnore
    public void setValidation(Property<VirtualNodeTlsValidationContext> validation) {
        this.validation = validation;
    }

    public VirtualNodeClientPolicyTls withValidation(Property<VirtualNodeTlsValidationContext> validation) {
        this.validation = validation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-enforce
     * 
     */
    @JsonIgnore
    public CharSequence getEnforce() {
        return enforce;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-enforce
     * 
     */
    @JsonIgnore
    public void setEnforce(CharSequence enforce) {
        this.enforce = enforce;
    }

    public VirtualNodeClientPolicyTls withEnforce(CharSequence enforce) {
        this.enforce = enforce;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-ports
     * 
     */
    @JsonIgnore
    public List<Number> getPorts() {
        return ports;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-ports
     * 
     */
    @JsonIgnore
    public void setPorts(List<Number> ports) {
        this.ports = ports;
    }

    public VirtualNodeClientPolicyTls withPorts(List<Number> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("validation", validation).append("enforce", enforce).append("ports", ports).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enforce).append(ports).append(validation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeClientPolicyTls) == false) {
            return false;
        }
        VirtualNodeClientPolicyTls rhs = ((VirtualNodeClientPolicyTls) other);
        return new EqualsBuilder().append(enforce, rhs.enforce).append(ports, rhs.ports).append(validation, rhs.validation).isEquals();
    }

}
