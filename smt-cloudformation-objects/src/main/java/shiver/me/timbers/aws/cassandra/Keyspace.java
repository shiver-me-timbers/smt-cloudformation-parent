
package shiver.me.timbers.aws.cassandra;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Keyspace
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KeyspaceName"
})
public class Keyspace {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename
     * 
     */
    @JsonProperty("KeyspaceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename")
    private CharSequence keyspaceName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename
     * 
     */
    @JsonIgnore
    public CharSequence getKeyspaceName() {
        return keyspaceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename
     * 
     */
    @JsonIgnore
    public void setKeyspaceName(CharSequence keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    public Keyspace withKeyspaceName(CharSequence keyspaceName) {
        this.keyspaceName = keyspaceName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("keyspaceName", keyspaceName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyspaceName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Keyspace) == false) {
            return false;
        }
        Keyspace rhs = ((Keyspace) other);
        return new EqualsBuilder().append(keyspaceName, rhs.keyspaceName).isEquals();
    }

}
