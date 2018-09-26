
package aws.lambda;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AliasRoutingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AdditionalVersionWeights"
})
public class AliasRoutingConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights
     * 
     */
    @JsonProperty("AdditionalVersionWeights")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights")
    private Set<VersionWeight> additionalVersionWeights = new LinkedHashSet<VersionWeight>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights
     * 
     */
    public Set<VersionWeight> getAdditionalVersionWeights() {
        return additionalVersionWeights;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights
     * 
     */
    public void setAdditionalVersionWeights(Set<VersionWeight> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
    }

    public AliasRoutingConfiguration withAdditionalVersionWeights(Set<VersionWeight> additionalVersionWeights) {
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
        if ((other instanceof AliasRoutingConfiguration) == false) {
            return false;
        }
        AliasRoutingConfiguration rhs = ((AliasRoutingConfiguration) other);
        return new EqualsBuilder().append(additionalVersionWeights, rhs.additionalVersionWeights).isEquals();
    }

}
