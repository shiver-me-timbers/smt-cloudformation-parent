
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
 * VirtualNodeAccessLog
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-accesslog.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "File"
})
public class VirtualNodeAccessLog implements Property<VirtualNodeAccessLog>
{

    /**
     * VirtualNodeFileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonProperty("File")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html")
    private Property<VirtualNodeFileAccessLog> file;

    /**
     * VirtualNodeFileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeFileAccessLog> getFile() {
        return file;
    }

    /**
     * VirtualNodeFileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public void setFile(Property<VirtualNodeFileAccessLog> file) {
        this.file = file;
    }

    public VirtualNodeAccessLog withFile(Property<VirtualNodeFileAccessLog> file) {
        this.file = file;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("file", file).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(file).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeAccessLog) == false) {
            return false;
        }
        VirtualNodeAccessLog rhs = ((VirtualNodeAccessLog) other);
        return new EqualsBuilder().append(file, rhs.file).isEquals();
    }

}
