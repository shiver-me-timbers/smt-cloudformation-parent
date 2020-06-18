
package shiver.me.timbers.aws.msk;

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
 * ClusterNodeExporter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EnabledInBroker"
})
public class ClusterNodeExporter implements Property<ClusterNodeExporter>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html#cfn-msk-cluster-nodeexporter-enabledinbroker
     * 
     */
    @JsonProperty("EnabledInBroker")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html#cfn-msk-cluster-nodeexporter-enabledinbroker")
    private CharSequence enabledInBroker;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html#cfn-msk-cluster-nodeexporter-enabledinbroker
     * 
     */
    @JsonIgnore
    public CharSequence getEnabledInBroker() {
        return enabledInBroker;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html#cfn-msk-cluster-nodeexporter-enabledinbroker
     * 
     */
    @JsonIgnore
    public void setEnabledInBroker(CharSequence enabledInBroker) {
        this.enabledInBroker = enabledInBroker;
    }

    public ClusterNodeExporter withEnabledInBroker(CharSequence enabledInBroker) {
        this.enabledInBroker = enabledInBroker;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabledInBroker", enabledInBroker).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enabledInBroker).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterNodeExporter) == false) {
            return false;
        }
        ClusterNodeExporter rhs = ((ClusterNodeExporter) other);
        return new EqualsBuilder().append(enabledInBroker, rhs.enabledInBroker).isEquals();
    }

}
