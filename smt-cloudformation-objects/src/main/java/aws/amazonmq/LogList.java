
package aws.amazonmq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LogList
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Audit",
    "General"
})
public class LogList {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit
     * 
     */
    @JsonProperty("Audit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit")
    private Boolean audit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general
     * 
     */
    @JsonProperty("General")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general")
    private Boolean general;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit
     * 
     */
    public Boolean getAudit() {
        return audit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit
     * 
     */
    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    public LogList withAudit(Boolean audit) {
        this.audit = audit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general
     * 
     */
    public Boolean getGeneral() {
        return general;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general
     * 
     */
    public void setGeneral(Boolean general) {
        this.general = general;
    }

    public LogList withGeneral(Boolean general) {
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
        if ((other instanceof LogList) == false) {
            return false;
        }
        LogList rhs = ((LogList) other);
        return new EqualsBuilder().append(general, rhs.general).append(audit, rhs.audit).isEquals();
    }

}
