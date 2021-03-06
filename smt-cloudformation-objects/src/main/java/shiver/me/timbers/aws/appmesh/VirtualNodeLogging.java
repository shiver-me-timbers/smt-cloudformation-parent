
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
 * VirtualNodeLogging
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccessLog"
})
public class VirtualNodeLogging implements Property<VirtualNodeLogging>
{

    /**
     * VirtualNodeFileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonProperty("AccessLog")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html")
    private Property<VirtualNodeAccessLog> accessLog;

    /**
     * VirtualNodeFileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeAccessLog> getAccessLog() {
        return accessLog;
    }

    /**
     * VirtualNodeFileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public void setAccessLog(Property<VirtualNodeAccessLog> accessLog) {
        this.accessLog = accessLog;
    }

    public VirtualNodeLogging withAccessLog(Property<VirtualNodeAccessLog> accessLog) {
        this.accessLog = accessLog;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accessLog", accessLog).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accessLog).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeLogging) == false) {
            return false;
        }
        VirtualNodeLogging rhs = ((VirtualNodeLogging) other);
        return new EqualsBuilder().append(accessLog, rhs.accessLog).isEquals();
    }

}
