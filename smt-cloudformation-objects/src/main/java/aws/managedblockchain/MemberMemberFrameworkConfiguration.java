
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
 * MemberMemberFrameworkConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberframeworkconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MemberFabricConfiguration"
})
public class MemberMemberFrameworkConfiguration implements Property<MemberMemberFrameworkConfiguration>
{

    /**
     * MemberMemberFabricConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html
     * 
     */
    @JsonProperty("MemberFabricConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html")
    private Property<MemberMemberFabricConfiguration> memberFabricConfiguration;

    /**
     * MemberMemberFabricConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<MemberMemberFabricConfiguration> getMemberFabricConfiguration() {
        return memberFabricConfiguration;
    }

    /**
     * MemberMemberFabricConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html
     * 
     */
    @JsonIgnore
    public void setMemberFabricConfiguration(Property<MemberMemberFabricConfiguration> memberFabricConfiguration) {
        this.memberFabricConfiguration = memberFabricConfiguration;
    }

    public MemberMemberFrameworkConfiguration withMemberFabricConfiguration(Property<MemberMemberFabricConfiguration> memberFabricConfiguration) {
        this.memberFabricConfiguration = memberFabricConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("memberFabricConfiguration", memberFabricConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(memberFabricConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberMemberFrameworkConfiguration) == false) {
            return false;
        }
        MemberMemberFrameworkConfiguration rhs = ((MemberMemberFrameworkConfiguration) other);
        return new EqualsBuilder().append(memberFabricConfiguration, rhs.memberFabricConfiguration).isEquals();
    }

}
