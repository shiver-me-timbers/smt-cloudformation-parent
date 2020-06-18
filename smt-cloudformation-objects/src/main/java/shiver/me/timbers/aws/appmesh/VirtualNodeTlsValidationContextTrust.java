
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
 * VirtualNodeTlsValidationContextTrust
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ACM",
    "File"
})
public class VirtualNodeTlsValidationContextTrust implements Property<VirtualNodeTlsValidationContextTrust>
{

    /**
     * VirtualNodeTlsValidationContextAcmTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html
     * 
     */
    @JsonProperty("ACM")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html")
    private Property<VirtualNodeTlsValidationContextAcmTrust> aCM;
    /**
     * VirtualNodeTlsValidationContextFileTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html
     * 
     */
    @JsonProperty("File")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html")
    private Property<VirtualNodeTlsValidationContextFileTrust> file;

    /**
     * VirtualNodeTlsValidationContextAcmTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeTlsValidationContextAcmTrust> getACM() {
        return aCM;
    }

    /**
     * VirtualNodeTlsValidationContextAcmTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html
     * 
     */
    @JsonIgnore
    public void setACM(Property<VirtualNodeTlsValidationContextAcmTrust> aCM) {
        this.aCM = aCM;
    }

    public VirtualNodeTlsValidationContextTrust withACM(Property<VirtualNodeTlsValidationContextAcmTrust> aCM) {
        this.aCM = aCM;
        return this;
    }

    /**
     * VirtualNodeTlsValidationContextFileTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeTlsValidationContextFileTrust> getFile() {
        return file;
    }

    /**
     * VirtualNodeTlsValidationContextFileTrust
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html
     * 
     */
    @JsonIgnore
    public void setFile(Property<VirtualNodeTlsValidationContextFileTrust> file) {
        this.file = file;
    }

    public VirtualNodeTlsValidationContextTrust withFile(Property<VirtualNodeTlsValidationContextFileTrust> file) {
        this.file = file;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aCM", aCM).append("file", file).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aCM).append(file).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeTlsValidationContextTrust) == false) {
            return false;
        }
        VirtualNodeTlsValidationContextTrust rhs = ((VirtualNodeTlsValidationContextTrust) other);
        return new EqualsBuilder().append(aCM, rhs.aCM).append(file, rhs.file).isEquals();
    }

}
