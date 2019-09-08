
package shiver.me.timbers.aws.route53;

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
 * RecordSetGroupAliasTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DNSName",
    "EvaluateTargetHealth",
    "HostedZoneId"
})
public class RecordSetGroupAliasTarget implements Property<RecordSetGroupAliasTarget>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname
     * 
     */
    @JsonProperty("DNSName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname")
    private CharSequence dNSName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth
     * 
     */
    @JsonProperty("EvaluateTargetHealth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth")
    private CharSequence evaluateTargetHealth;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid")
    private CharSequence hostedZoneId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname
     * 
     */
    @JsonIgnore
    public CharSequence getDNSName() {
        return dNSName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname
     * 
     */
    @JsonIgnore
    public void setDNSName(CharSequence dNSName) {
        this.dNSName = dNSName;
    }

    public RecordSetGroupAliasTarget withDNSName(CharSequence dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth
     * 
     */
    @JsonIgnore
    public CharSequence getEvaluateTargetHealth() {
        return evaluateTargetHealth;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth
     * 
     */
    @JsonIgnore
    public void setEvaluateTargetHealth(CharSequence evaluateTargetHealth) {
        this.evaluateTargetHealth = evaluateTargetHealth;
    }

    public RecordSetGroupAliasTarget withEvaluateTargetHealth(CharSequence evaluateTargetHealth) {
        this.evaluateTargetHealth = evaluateTargetHealth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid
     * 
     */
    @JsonIgnore
    public CharSequence getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid
     * 
     */
    @JsonIgnore
    public void setHostedZoneId(CharSequence hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    public RecordSetGroupAliasTarget withHostedZoneId(CharSequence hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dNSName", dNSName).append("evaluateTargetHealth", evaluateTargetHealth).append("hostedZoneId", hostedZoneId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hostedZoneId).append(evaluateTargetHealth).append(dNSName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordSetGroupAliasTarget) == false) {
            return false;
        }
        RecordSetGroupAliasTarget rhs = ((RecordSetGroupAliasTarget) other);
        return new EqualsBuilder().append(hostedZoneId, rhs.hostedZoneId).append(evaluateTargetHealth, rhs.evaluateTargetHealth).append(dNSName, rhs.dNSName).isEquals();
    }

}
