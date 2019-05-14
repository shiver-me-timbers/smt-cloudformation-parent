
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
 * Logging
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccessLog"
})
public class Logging implements Property<Logging>
{

    /**
     * FileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonProperty("AccessLog")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html")
    private Property<AccessLog> accessLog;

    /**
     * FileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public Property<AccessLog> getAccessLog() {
        return accessLog;
    }

    /**
     * FileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public void setAccessLog(Property<AccessLog> accessLog) {
        this.accessLog = accessLog;
    }

    public Logging withAccessLog(Property<AccessLog> accessLog) {
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
        if ((other instanceof Logging) == false) {
            return false;
        }
        Logging rhs = ((Logging) other);
        return new EqualsBuilder().append(accessLog, rhs.accessLog).isEquals();
    }

}
