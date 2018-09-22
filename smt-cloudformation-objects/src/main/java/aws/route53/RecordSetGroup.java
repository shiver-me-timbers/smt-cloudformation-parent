
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
    private String comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid")
    private String hostedZoneId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename")
    private String hostedZoneName;
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
    @JsonProperty("Comment")
    public String getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment
     * 
     */
    @JsonProperty("Comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public RecordSetGroup withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid
     * 
     */
    @JsonProperty("HostedZoneId")
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    public RecordSetGroup withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    public String getHostedZoneName() {
        return hostedZoneName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename
     * 
     */
    @JsonProperty("HostedZoneName")
    public void setHostedZoneName(String hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
    }

    public RecordSetGroup withHostedZoneName(String hostedZoneName) {
        this.hostedZoneName = hostedZoneName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets
     * 
     */
    @JsonProperty("RecordSets")
    public Set<RecordSet> getRecordSets() {
        return recordSets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets
     * 
     */
    @JsonProperty("RecordSets")
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
