
package aws.amazonmq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationId
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Revision",
    "Id"
})
public class ConfigurationId {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-revision
     * 
     */
    @JsonProperty("Revision")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-revision")
    private Integer revision;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-id")
    private CharSequence id;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-revision
     * 
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-revision
     * 
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public ConfigurationId withRevision(Integer revision) {
        this.revision = revision;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public ConfigurationId withId(CharSequence id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("revision", revision).append("id", id).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(revision).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationId) == false) {
            return false;
        }
        ConfigurationId rhs = ((ConfigurationId) other);
        return new EqualsBuilder().append(revision, rhs.revision).append(id, rhs.id).isEquals();
    }

}
