
package shiver.me.timbers.aws.lambda;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * AliasAliasRoutingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AdditionalVersionWeights"
})
public class AliasAliasRoutingConfiguration implements Property<AliasAliasRoutingConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights
     * 
     */
    @JsonProperty("AdditionalVersionWeights")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights")
    private Set<Property<AliasVersionWeight>> additionalVersionWeights = new LinkedHashSet<Property<AliasVersionWeight>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights
     * 
     */
    @JsonIgnore
    public Set<Property<AliasVersionWeight>> getAdditionalVersionWeights() {
        return additionalVersionWeights;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights
     * 
     */
    @JsonIgnore
    public void setAdditionalVersionWeights(Set<Property<AliasVersionWeight>> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
    }

    public AliasAliasRoutingConfiguration withAdditionalVersionWeights(Set<Property<AliasVersionWeight>> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalVersionWeights", additionalVersionWeights).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalVersionWeights).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AliasAliasRoutingConfiguration) == false) {
            return false;
        }
        AliasAliasRoutingConfiguration rhs = ((AliasAliasRoutingConfiguration) other);
        return new EqualsBuilder().append(additionalVersionWeights, rhs.additionalVersionWeights).isEquals();
    }

}
