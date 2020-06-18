
package shiver.me.timbers.aws.athena;

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
 * WorkGroupWorkGroupConfigurationUpdates
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BytesScannedCutoffPerQuery",
    "EnforceWorkGroupConfiguration",
    "PublishCloudWatchMetricsEnabled",
    "RequesterPaysEnabled",
    "ResultConfigurationUpdates",
    "RemoveBytesScannedCutoffPerQuery"
})
public class WorkGroupWorkGroupConfigurationUpdates implements Property<WorkGroupWorkGroupConfigurationUpdates>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-bytesscannedcutoffperquery
     * 
     */
    @JsonProperty("BytesScannedCutoffPerQuery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-bytesscannedcutoffperquery")
    private Number bytesScannedCutoffPerQuery;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-enforceworkgroupconfiguration
     * 
     */
    @JsonProperty("EnforceWorkGroupConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-enforceworkgroupconfiguration")
    private CharSequence enforceWorkGroupConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-publishcloudwatchmetricsenabled
     * 
     */
    @JsonProperty("PublishCloudWatchMetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-publishcloudwatchmetricsenabled")
    private CharSequence publishCloudWatchMetricsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-requesterpaysenabled
     * 
     */
    @JsonProperty("RequesterPaysEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-requesterpaysenabled")
    private CharSequence requesterPaysEnabled;
    /**
     * WorkGroupResultConfigurationUpdates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html
     * 
     */
    @JsonProperty("ResultConfigurationUpdates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html")
    private Property<WorkGroupResultConfigurationUpdates> resultConfigurationUpdates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removebytesscannedcutoffperquery
     * 
     */
    @JsonProperty("RemoveBytesScannedCutoffPerQuery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removebytesscannedcutoffperquery")
    private CharSequence removeBytesScannedCutoffPerQuery;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-bytesscannedcutoffperquery
     * 
     */
    @JsonIgnore
    public Number getBytesScannedCutoffPerQuery() {
        return bytesScannedCutoffPerQuery;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-bytesscannedcutoffperquery
     * 
     */
    @JsonIgnore
    public void setBytesScannedCutoffPerQuery(Number bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
    }

    public WorkGroupWorkGroupConfigurationUpdates withBytesScannedCutoffPerQuery(Number bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-enforceworkgroupconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getEnforceWorkGroupConfiguration() {
        return enforceWorkGroupConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-enforceworkgroupconfiguration
     * 
     */
    @JsonIgnore
    public void setEnforceWorkGroupConfiguration(CharSequence enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
    }

    public WorkGroupWorkGroupConfigurationUpdates withEnforceWorkGroupConfiguration(CharSequence enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-publishcloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getPublishCloudWatchMetricsEnabled() {
        return publishCloudWatchMetricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-publishcloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public void setPublishCloudWatchMetricsEnabled(CharSequence publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
    }

    public WorkGroupWorkGroupConfigurationUpdates withPublishCloudWatchMetricsEnabled(CharSequence publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-requesterpaysenabled
     * 
     */
    @JsonIgnore
    public CharSequence getRequesterPaysEnabled() {
        return requesterPaysEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-requesterpaysenabled
     * 
     */
    @JsonIgnore
    public void setRequesterPaysEnabled(CharSequence requesterPaysEnabled) {
        this.requesterPaysEnabled = requesterPaysEnabled;
    }

    public WorkGroupWorkGroupConfigurationUpdates withRequesterPaysEnabled(CharSequence requesterPaysEnabled) {
        this.requesterPaysEnabled = requesterPaysEnabled;
        return this;
    }

    /**
     * WorkGroupResultConfigurationUpdates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html
     * 
     */
    @JsonIgnore
    public Property<WorkGroupResultConfigurationUpdates> getResultConfigurationUpdates() {
        return resultConfigurationUpdates;
    }

    /**
     * WorkGroupResultConfigurationUpdates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html
     * 
     */
    @JsonIgnore
    public void setResultConfigurationUpdates(Property<WorkGroupResultConfigurationUpdates> resultConfigurationUpdates) {
        this.resultConfigurationUpdates = resultConfigurationUpdates;
    }

    public WorkGroupWorkGroupConfigurationUpdates withResultConfigurationUpdates(Property<WorkGroupResultConfigurationUpdates> resultConfigurationUpdates) {
        this.resultConfigurationUpdates = resultConfigurationUpdates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removebytesscannedcutoffperquery
     * 
     */
    @JsonIgnore
    public CharSequence getRemoveBytesScannedCutoffPerQuery() {
        return removeBytesScannedCutoffPerQuery;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removebytesscannedcutoffperquery
     * 
     */
    @JsonIgnore
    public void setRemoveBytesScannedCutoffPerQuery(CharSequence removeBytesScannedCutoffPerQuery) {
        this.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
    }

    public WorkGroupWorkGroupConfigurationUpdates withRemoveBytesScannedCutoffPerQuery(CharSequence removeBytesScannedCutoffPerQuery) {
        this.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bytesScannedCutoffPerQuery", bytesScannedCutoffPerQuery).append("enforceWorkGroupConfiguration", enforceWorkGroupConfiguration).append("publishCloudWatchMetricsEnabled", publishCloudWatchMetricsEnabled).append("requesterPaysEnabled", requesterPaysEnabled).append("resultConfigurationUpdates", resultConfigurationUpdates).append("removeBytesScannedCutoffPerQuery", removeBytesScannedCutoffPerQuery).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bytesScannedCutoffPerQuery).append(requesterPaysEnabled).append(resultConfigurationUpdates).append(removeBytesScannedCutoffPerQuery).append(publishCloudWatchMetricsEnabled).append(enforceWorkGroupConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkGroupWorkGroupConfigurationUpdates) == false) {
            return false;
        }
        WorkGroupWorkGroupConfigurationUpdates rhs = ((WorkGroupWorkGroupConfigurationUpdates) other);
        return new EqualsBuilder().append(bytesScannedCutoffPerQuery, rhs.bytesScannedCutoffPerQuery).append(requesterPaysEnabled, rhs.requesterPaysEnabled).append(resultConfigurationUpdates, rhs.resultConfigurationUpdates).append(removeBytesScannedCutoffPerQuery, rhs.removeBytesScannedCutoffPerQuery).append(publishCloudWatchMetricsEnabled, rhs.publishCloudWatchMetricsEnabled).append(enforceWorkGroupConfiguration, rhs.enforceWorkGroupConfiguration).isEquals();
    }

}
