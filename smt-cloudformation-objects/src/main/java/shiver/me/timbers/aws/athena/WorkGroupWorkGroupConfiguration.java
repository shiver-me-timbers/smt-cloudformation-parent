
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
 * WorkGroupWorkGroupConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BytesScannedCutoffPerQuery",
    "EnforceWorkGroupConfiguration",
    "PublishCloudWatchMetricsEnabled",
    "RequesterPaysEnabled",
    "ResultConfiguration"
})
public class WorkGroupWorkGroupConfiguration implements Property<WorkGroupWorkGroupConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-bytesscannedcutoffperquery
     * 
     */
    @JsonProperty("BytesScannedCutoffPerQuery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-bytesscannedcutoffperquery")
    private Number bytesScannedCutoffPerQuery;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-enforceworkgroupconfiguration
     * 
     */
    @JsonProperty("EnforceWorkGroupConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-enforceworkgroupconfiguration")
    private CharSequence enforceWorkGroupConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-publishcloudwatchmetricsenabled
     * 
     */
    @JsonProperty("PublishCloudWatchMetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-publishcloudwatchmetricsenabled")
    private CharSequence publishCloudWatchMetricsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-requesterpaysenabled
     * 
     */
    @JsonProperty("RequesterPaysEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-requesterpaysenabled")
    private CharSequence requesterPaysEnabled;
    /**
     * WorkGroupResultConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html
     * 
     */
    @JsonProperty("ResultConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html")
    private Property<WorkGroupResultConfiguration> resultConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-bytesscannedcutoffperquery
     * 
     */
    @JsonIgnore
    public Number getBytesScannedCutoffPerQuery() {
        return bytesScannedCutoffPerQuery;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-bytesscannedcutoffperquery
     * 
     */
    @JsonIgnore
    public void setBytesScannedCutoffPerQuery(Number bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
    }

    public WorkGroupWorkGroupConfiguration withBytesScannedCutoffPerQuery(Number bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-enforceworkgroupconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getEnforceWorkGroupConfiguration() {
        return enforceWorkGroupConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-enforceworkgroupconfiguration
     * 
     */
    @JsonIgnore
    public void setEnforceWorkGroupConfiguration(CharSequence enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
    }

    public WorkGroupWorkGroupConfiguration withEnforceWorkGroupConfiguration(CharSequence enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-publishcloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getPublishCloudWatchMetricsEnabled() {
        return publishCloudWatchMetricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-publishcloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public void setPublishCloudWatchMetricsEnabled(CharSequence publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
    }

    public WorkGroupWorkGroupConfiguration withPublishCloudWatchMetricsEnabled(CharSequence publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-requesterpaysenabled
     * 
     */
    @JsonIgnore
    public CharSequence getRequesterPaysEnabled() {
        return requesterPaysEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-requesterpaysenabled
     * 
     */
    @JsonIgnore
    public void setRequesterPaysEnabled(CharSequence requesterPaysEnabled) {
        this.requesterPaysEnabled = requesterPaysEnabled;
    }

    public WorkGroupWorkGroupConfiguration withRequesterPaysEnabled(CharSequence requesterPaysEnabled) {
        this.requesterPaysEnabled = requesterPaysEnabled;
        return this;
    }

    /**
     * WorkGroupResultConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<WorkGroupResultConfiguration> getResultConfiguration() {
        return resultConfiguration;
    }

    /**
     * WorkGroupResultConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html
     * 
     */
    @JsonIgnore
    public void setResultConfiguration(Property<WorkGroupResultConfiguration> resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    public WorkGroupWorkGroupConfiguration withResultConfiguration(Property<WorkGroupResultConfiguration> resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bytesScannedCutoffPerQuery", bytesScannedCutoffPerQuery).append("enforceWorkGroupConfiguration", enforceWorkGroupConfiguration).append("publishCloudWatchMetricsEnabled", publishCloudWatchMetricsEnabled).append("requesterPaysEnabled", requesterPaysEnabled).append("resultConfiguration", resultConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resultConfiguration).append(bytesScannedCutoffPerQuery).append(publishCloudWatchMetricsEnabled).append(requesterPaysEnabled).append(enforceWorkGroupConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkGroupWorkGroupConfiguration) == false) {
            return false;
        }
        WorkGroupWorkGroupConfiguration rhs = ((WorkGroupWorkGroupConfiguration) other);
        return new EqualsBuilder().append(resultConfiguration, rhs.resultConfiguration).append(bytesScannedCutoffPerQuery, rhs.bytesScannedCutoffPerQuery).append(publishCloudWatchMetricsEnabled, rhs.publishCloudWatchMetricsEnabled).append(requesterPaysEnabled, rhs.requesterPaysEnabled).append(enforceWorkGroupConfiguration, rhs.enforceWorkGroupConfiguration).isEquals();
    }

}
