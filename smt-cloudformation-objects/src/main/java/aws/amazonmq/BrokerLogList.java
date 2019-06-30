
package aws.amazonmq;

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
 * BrokerLogList
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Audit",
    "General"
})
public class BrokerLogList implements Property<BrokerLogList>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit
     * 
     */
    @JsonProperty("Audit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit")
    private CharSequence audit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general
     * 
     */
    @JsonProperty("General")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general")
    private CharSequence general;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit
     * 
     */
    @JsonIgnore
    public CharSequence getAudit() {
        return audit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit
     * 
     */
    @JsonIgnore
    public void setAudit(CharSequence audit) {
        this.audit = audit;
    }

    public BrokerLogList withAudit(CharSequence audit) {
        this.audit = audit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general
     * 
     */
    @JsonIgnore
    public CharSequence getGeneral() {
        return general;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general
     * 
     */
    @JsonIgnore
    public void setGeneral(CharSequence general) {
        this.general = general;
    }

    public BrokerLogList withGeneral(CharSequence general) {
        this.general = general;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("audit", audit).append("general", general).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(general).append(audit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BrokerLogList) == false) {
            return false;
        }
        BrokerLogList rhs = ((BrokerLogList) other);
        return new EqualsBuilder().append(general, rhs.general).append(audit, rhs.audit).isEquals();
    }

}
