
package aws.managedblockchain;

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
 * MemberNetworkFabricConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Edition"
})
public class MemberNetworkFabricConfiguration implements Property<MemberNetworkFabricConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html#cfn-managedblockchain-member-networkfabricconfiguration-edition
     * 
     */
    @JsonProperty("Edition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html#cfn-managedblockchain-member-networkfabricconfiguration-edition")
    private CharSequence edition;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html#cfn-managedblockchain-member-networkfabricconfiguration-edition
     * 
     */
    @JsonIgnore
    public CharSequence getEdition() {
        return edition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html#cfn-managedblockchain-member-networkfabricconfiguration-edition
     * 
     */
    @JsonIgnore
    public void setEdition(CharSequence edition) {
        this.edition = edition;
    }

    public MemberNetworkFabricConfiguration withEdition(CharSequence edition) {
        this.edition = edition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("edition", edition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(edition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberNetworkFabricConfiguration) == false) {
            return false;
        }
        MemberNetworkFabricConfiguration rhs = ((MemberNetworkFabricConfiguration) other);
        return new EqualsBuilder().append(edition, rhs.edition).isEquals();
    }

}
