
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
 * AccessLog
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-accesslog.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "File"
})
public class AccessLog implements Property<AccessLog>
{

    /**
     * FileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonProperty("File")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html")
    private Property<FileAccessLog> file;

    /**
     * FileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public Property<FileAccessLog> getFile() {
        return file;
    }

    /**
     * FileAccessLog
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html
     * 
     */
    @JsonIgnore
    public void setFile(Property<FileAccessLog> file) {
        this.file = file;
    }

    public AccessLog withFile(Property<FileAccessLog> file) {
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
        if ((other instanceof AccessLog) == false) {
            return false;
        }
        AccessLog rhs = ((AccessLog) other);
        return new EqualsBuilder().append(file, rhs.file).isEquals();
    }

}
