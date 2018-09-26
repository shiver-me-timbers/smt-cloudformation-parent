
package aws.batch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Volumes
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Host",
    "Name"
})
public class Volumes {

    /**
     * VolumesHost
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html
     * 
     */
    @JsonProperty("Host")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html")
    private VolumesHost host;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name")
    private CharSequence name;

    /**
     * VolumesHost
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html
     * 
     */
    public VolumesHost getHost() {
        return host;
    }

    /**
     * VolumesHost
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html
     * 
     */
    public void setHost(VolumesHost host) {
        this.host = host;
    }

    public Volumes withHost(VolumesHost host) {
        this.host = host;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Volumes withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("host", host).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(host).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Volumes) == false) {
            return false;
        }
        Volumes rhs = ((Volumes) other);
        return new EqualsBuilder().append(host, rhs.host).append(name, rhs.name).isEquals();
    }

}
