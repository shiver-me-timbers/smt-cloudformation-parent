
package shiver.me.timbers.aws.appmesh;

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
 * VirtualNodeTlsValidationContext
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Trust"
})
public class VirtualNodeTlsValidationContext implements Property<VirtualNodeTlsValidationContext>
{

    /**
     * VirtualNodeTlsValidationContextTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html
     * 
     */
    @JsonProperty("Trust")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html")
    private Property<VirtualNodeTlsValidationContextTrust> trust;

    /**
     * VirtualNodeTlsValidationContextTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeTlsValidationContextTrust> getTrust() {
        return trust;
    }

    /**
     * VirtualNodeTlsValidationContextTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html
     * 
     */
    @JsonIgnore
    public void setTrust(Property<VirtualNodeTlsValidationContextTrust> trust) {
        this.trust = trust;
    }

    public VirtualNodeTlsValidationContext withTrust(Property<VirtualNodeTlsValidationContextTrust> trust) {
        this.trust = trust;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("trust", trust).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trust).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeTlsValidationContext) == false) {
            return false;
        }
        VirtualNodeTlsValidationContext rhs = ((VirtualNodeTlsValidationContext) other);
        return new EqualsBuilder().append(trust, rhs.trust).isEquals();
    }

}
