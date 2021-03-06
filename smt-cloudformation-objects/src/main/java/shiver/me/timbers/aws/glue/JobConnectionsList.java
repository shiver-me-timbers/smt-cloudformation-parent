
package shiver.me.timbers.aws.glue;

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
 * JobConnectionsList
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Connections"
})
public class JobConnectionsList implements Property<JobConnectionsList>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html#cfn-glue-job-connectionslist-connections
     * 
     */
    @JsonProperty("Connections")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html#cfn-glue-job-connectionslist-connections")
    private List<CharSequence> connections = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html#cfn-glue-job-connectionslist-connections
     * 
     */
    @JsonIgnore
    public List<CharSequence> getConnections() {
        return connections;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html#cfn-glue-job-connectionslist-connections
     * 
     */
    @JsonIgnore
    public void setConnections(List<CharSequence> connections) {
        this.connections = connections;
    }

    public JobConnectionsList withConnections(List<CharSequence> connections) {
        this.connections = connections;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connections", connections).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connections).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobConnectionsList) == false) {
            return false;
        }
        JobConnectionsList rhs = ((JobConnectionsList) other);
        return new EqualsBuilder().append(connections, rhs.connections).isEquals();
    }

}
