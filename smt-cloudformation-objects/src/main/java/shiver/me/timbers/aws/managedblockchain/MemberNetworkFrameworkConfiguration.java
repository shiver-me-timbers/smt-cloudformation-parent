
package shiver.me.timbers.aws.managedblockchain;

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
 * MemberNetworkFrameworkConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NetworkFabricConfiguration"
})
public class MemberNetworkFrameworkConfiguration implements Property<MemberNetworkFrameworkConfiguration>
{

    /**
     * MemberNetworkFabricConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html
     * 
     */
    @JsonProperty("NetworkFabricConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html")
    private Property<MemberNetworkFabricConfiguration> networkFabricConfiguration;

    /**
     * MemberNetworkFabricConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<MemberNetworkFabricConfiguration> getNetworkFabricConfiguration() {
        return networkFabricConfiguration;
    }

    /**
     * MemberNetworkFabricConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNetworkFabricConfiguration(Property<MemberNetworkFabricConfiguration> networkFabricConfiguration) {
        this.networkFabricConfiguration = networkFabricConfiguration;
    }

    public MemberNetworkFrameworkConfiguration withNetworkFabricConfiguration(Property<MemberNetworkFabricConfiguration> networkFabricConfiguration) {
        this.networkFabricConfiguration = networkFabricConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("networkFabricConfiguration", networkFabricConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkFabricConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberNetworkFrameworkConfiguration) == false) {
            return false;
        }
        MemberNetworkFrameworkConfiguration rhs = ((MemberNetworkFrameworkConfiguration) other);
        return new EqualsBuilder().append(networkFabricConfiguration, rhs.networkFabricConfiguration).isEquals();
    }

}
