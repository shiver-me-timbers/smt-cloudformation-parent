
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
 * MemberNetworkConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "FrameworkVersion",
    "VotingPolicy",
    "Framework",
    "Name",
    "NetworkFrameworkConfiguration"
})
public class MemberNetworkConfiguration implements Property<MemberNetworkConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-frameworkversion
     * 
     */
    @JsonProperty("FrameworkVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-frameworkversion")
    private CharSequence frameworkVersion;
    /**
     * MemberVotingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html
     * 
     */
    @JsonProperty("VotingPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html")
    private Property<MemberVotingPolicy> votingPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-framework
     * 
     */
    @JsonProperty("Framework")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-framework")
    private CharSequence framework;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-name")
    private CharSequence name;
    /**
     * MemberNetworkFrameworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html
     * 
     */
    @JsonProperty("NetworkFrameworkConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html")
    private Property<MemberNetworkFrameworkConfiguration> networkFrameworkConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public MemberNetworkConfiguration withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-frameworkversion
     * 
     */
    @JsonIgnore
    public CharSequence getFrameworkVersion() {
        return frameworkVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-frameworkversion
     * 
     */
    @JsonIgnore
    public void setFrameworkVersion(CharSequence frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
    }

    public MemberNetworkConfiguration withFrameworkVersion(CharSequence frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
        return this;
    }

    /**
     * MemberVotingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html
     * 
     */
    @JsonIgnore
    public Property<MemberVotingPolicy> getVotingPolicy() {
        return votingPolicy;
    }

    /**
     * MemberVotingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html
     * 
     */
    @JsonIgnore
    public void setVotingPolicy(Property<MemberVotingPolicy> votingPolicy) {
        this.votingPolicy = votingPolicy;
    }

    public MemberNetworkConfiguration withVotingPolicy(Property<MemberVotingPolicy> votingPolicy) {
        this.votingPolicy = votingPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-framework
     * 
     */
    @JsonIgnore
    public CharSequence getFramework() {
        return framework;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-framework
     * 
     */
    @JsonIgnore
    public void setFramework(CharSequence framework) {
        this.framework = framework;
    }

    public MemberNetworkConfiguration withFramework(CharSequence framework) {
        this.framework = framework;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html#cfn-managedblockchain-member-networkconfiguration-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public MemberNetworkConfiguration withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * MemberNetworkFrameworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<MemberNetworkFrameworkConfiguration> getNetworkFrameworkConfiguration() {
        return networkFrameworkConfiguration;
    }

    /**
     * MemberNetworkFrameworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNetworkFrameworkConfiguration(Property<MemberNetworkFrameworkConfiguration> networkFrameworkConfiguration) {
        this.networkFrameworkConfiguration = networkFrameworkConfiguration;
    }

    public MemberNetworkConfiguration withNetworkFrameworkConfiguration(Property<MemberNetworkFrameworkConfiguration> networkFrameworkConfiguration) {
        this.networkFrameworkConfiguration = networkFrameworkConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("frameworkVersion", frameworkVersion).append("votingPolicy", votingPolicy).append("framework", framework).append("name", name).append("networkFrameworkConfiguration", networkFrameworkConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkFrameworkConfiguration).append(frameworkVersion).append(votingPolicy).append(framework).append(name).append(description).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberNetworkConfiguration) == false) {
            return false;
        }
        MemberNetworkConfiguration rhs = ((MemberNetworkConfiguration) other);
        return new EqualsBuilder().append(networkFrameworkConfiguration, rhs.networkFrameworkConfiguration).append(frameworkVersion, rhs.frameworkVersion).append(votingPolicy, rhs.votingPolicy).append(framework, rhs.framework).append(name, rhs.name).append(description, rhs.description).isEquals();
    }

}
