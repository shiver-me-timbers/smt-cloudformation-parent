
package shiver.me.timbers.aws.iotanalytics;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Dataset
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Actions",
    "DatasetName",
    "ContentDeliveryRules",
    "Triggers",
    "VersioningConfiguration",
    "RetentionPeriod",
    "Tags"
})
public class Dataset {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions")
    private List<Property<DatasetAction>> actions = new ArrayList<Property<DatasetAction>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname
     * 
     */
    @JsonProperty("DatasetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname")
    private CharSequence datasetName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules
     * 
     */
    @JsonProperty("ContentDeliveryRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules")
    private List<Property<DatasetDatasetContentDeliveryRule>> contentDeliveryRules = new ArrayList<Property<DatasetDatasetContentDeliveryRule>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers
     * 
     */
    @JsonProperty("Triggers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers")
    private List<Property<DatasetTrigger>> triggers = new ArrayList<Property<DatasetTrigger>>();
    /**
     * DatasetVersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html
     * 
     */
    @JsonProperty("VersioningConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html")
    private Property<DatasetVersioningConfiguration> versioningConfiguration;
    /**
     * DatasetRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html
     * 
     */
    @JsonProperty("RetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html")
    private Property<DatasetRetentionPeriod> retentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions
     * 
     */
    @JsonIgnore
    public List<Property<DatasetAction>> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions
     * 
     */
    @JsonIgnore
    public void setActions(List<Property<DatasetAction>> actions) {
        this.actions = actions;
    }

    public Dataset withActions(List<Property<DatasetAction>> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname
     * 
     */
    @JsonIgnore
    public CharSequence getDatasetName() {
        return datasetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname
     * 
     */
    @JsonIgnore
    public void setDatasetName(CharSequence datasetName) {
        this.datasetName = datasetName;
    }

    public Dataset withDatasetName(CharSequence datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules
     * 
     */
    @JsonIgnore
    public List<Property<DatasetDatasetContentDeliveryRule>> getContentDeliveryRules() {
        return contentDeliveryRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules
     * 
     */
    @JsonIgnore
    public void setContentDeliveryRules(List<Property<DatasetDatasetContentDeliveryRule>> contentDeliveryRules) {
        this.contentDeliveryRules = contentDeliveryRules;
    }

    public Dataset withContentDeliveryRules(List<Property<DatasetDatasetContentDeliveryRule>> contentDeliveryRules) {
        this.contentDeliveryRules = contentDeliveryRules;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers
     * 
     */
    @JsonIgnore
    public List<Property<DatasetTrigger>> getTriggers() {
        return triggers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers
     * 
     */
    @JsonIgnore
    public void setTriggers(List<Property<DatasetTrigger>> triggers) {
        this.triggers = triggers;
    }

    public Dataset withTriggers(List<Property<DatasetTrigger>> triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * DatasetVersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DatasetVersioningConfiguration> getVersioningConfiguration() {
        return versioningConfiguration;
    }

    /**
     * DatasetVersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html
     * 
     */
    @JsonIgnore
    public void setVersioningConfiguration(Property<DatasetVersioningConfiguration> versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    public Dataset withVersioningConfiguration(Property<DatasetVersioningConfiguration> versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
        return this;
    }

    /**
     * DatasetRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html
     * 
     */
    @JsonIgnore
    public Property<DatasetRetentionPeriod> getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * DatasetRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html
     * 
     */
    @JsonIgnore
    public void setRetentionPeriod(Property<DatasetRetentionPeriod> retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public Dataset withRetentionPeriod(Property<DatasetRetentionPeriod> retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Dataset withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actions", actions).append("datasetName", datasetName).append("contentDeliveryRules", contentDeliveryRules).append("triggers", triggers).append("versioningConfiguration", versioningConfiguration).append("retentionPeriod", retentionPeriod).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(versioningConfiguration).append(contentDeliveryRules).append(datasetName).append(triggers).append(actions).append(retentionPeriod).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dataset) == false) {
            return false;
        }
        Dataset rhs = ((Dataset) other);
        return new EqualsBuilder().append(versioningConfiguration, rhs.versioningConfiguration).append(contentDeliveryRules, rhs.contentDeliveryRules).append(datasetName, rhs.datasetName).append(triggers, rhs.triggers).append(actions, rhs.actions).append(retentionPeriod, rhs.retentionPeriod).append(tags, rhs.tags).isEquals();
    }

}
