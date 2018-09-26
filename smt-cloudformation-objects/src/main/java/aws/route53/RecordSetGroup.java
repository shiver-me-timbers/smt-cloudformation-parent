
package aws.route53;

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
 * RecordSetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Comment",
    "HostedZoneId",
    "HostedZoneName",
    "RecordSets"
})
public class RecordSetGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment")
    private CharSequence comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid")
    private CharSequence hostedZoneId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename")
    private CharSequence hostedZoneName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets
     * 
     */
    @JsonProperty("RecordSets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets")
    private Set<RecordSet> recordSets = new LinkedHashSet<RecordSet>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment
     * 
     */
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment
     * 
     */
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public RecordSetGroup withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid
     * 
     */
    public CharSequence getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid
     * 
     */
    public void setHostedZoneId(CharSequence hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    public RecordSetGroup withHostedZoneId(CharSequence hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename
     * 
     */
    public CharSequence getHostedZoneName() {
        return hostedZoneName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename
     * 
     */
    public void setHostedZoneName(CharSequence hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
    }

    public RecordSetGroup withHostedZoneName(CharSequence hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets
     * 
     */
    public Set<RecordSet> getRecordSets() {
        return recordSets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets
     * 
     */
    public void setRecordSets(Set<RecordSet> recordSets) {
        this.recordSets = recordSets;
    }

    public RecordSetGroup withRecordSets(Set<RecordSet> recordSets) {
        this.recordSets = recordSets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("comment", comment).append("hostedZoneId", hostedZoneId).append("hostedZoneName", hostedZoneName).append("recordSets", recordSets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hostedZoneId).append(comment).append(hostedZoneName).append(recordSets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordSetGroup) == false) {
            return false;
        }
        RecordSetGroup rhs = ((RecordSetGroup) other);
        return new EqualsBuilder().append(hostedZoneId, rhs.hostedZoneId).append(comment, rhs.comment).append(hostedZoneName, rhs.hostedZoneName).append(recordSets, rhs.recordSets).isEquals();
    }

}
