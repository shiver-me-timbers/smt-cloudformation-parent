
package aws.amazonmq;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Broker",
    "Configuration"
})
public class ConfigurationAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker
     * 
     */
    @JsonProperty("Broker")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker")
    private CharSequence broker;
    /**
     * ConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    @JsonProperty("Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html")
    private ConfigurationId configuration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker
     * 
     */
    @JsonIgnore
    public CharSequence getBroker() {
        return broker;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker
     * 
     */
    @JsonIgnore
    public void setBroker(CharSequence broker) {
        this.broker = broker;
    }

    public ConfigurationAssociation withBroker(CharSequence broker) {
        this.broker = broker;
        return this;
    }

    /**
     * ConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    @JsonIgnore
    public ConfigurationId getConfiguration() {
        return configuration;
    }

    /**
     * ConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    @JsonIgnore
    public void setConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
    }

    public ConfigurationAssociation withConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("broker", broker).append("configuration", configuration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(broker).append(configuration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationAssociation) == false) {
            return false;
        }
        ConfigurationAssociation rhs = ((ConfigurationAssociation) other);
        return new EqualsBuilder().append(broker, rhs.broker).append(configuration, rhs.configuration).isEquals();
    }

}
