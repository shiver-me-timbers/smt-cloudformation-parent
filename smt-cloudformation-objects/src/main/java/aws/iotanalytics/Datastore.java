
package aws.iotanalytics;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Datastore
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DatastoreStorage",
    "DatastoreName",
    "RetentionPeriod",
    "Tags"
})
public class Datastore {

    /**
     * DatastoreDatastoreStorage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html
     * 
     */
    @JsonProperty("DatastoreStorage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html")
    private Property<DatastoreDatastoreStorage> datastoreStorage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename
     * 
     */
    @JsonProperty("DatastoreName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename")
    private CharSequence datastoreName;
    /**
     * DatastoreRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html
     * 
     */
    @JsonProperty("RetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html")
    private Property<DatastoreRetentionPeriod> retentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * DatastoreDatastoreStorage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html
     * 
     */
    @JsonIgnore
    public Property<DatastoreDatastoreStorage> getDatastoreStorage() {
        return datastoreStorage;
    }

    /**
     * DatastoreDatastoreStorage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html
     * 
     */
    @JsonIgnore
    public void setDatastoreStorage(Property<DatastoreDatastoreStorage> datastoreStorage) {
        this.datastoreStorage = datastoreStorage;
    }

    public Datastore withDatastoreStorage(Property<DatastoreDatastoreStorage> datastoreStorage) {
        this.datastoreStorage = datastoreStorage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename
     * 
     */
    @JsonIgnore
    public CharSequence getDatastoreName() {
        return datastoreName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename
     * 
     */
    @JsonIgnore
    public void setDatastoreName(CharSequence datastoreName) {
        this.datastoreName = datastoreName;
    }

    public Datastore withDatastoreName(CharSequence datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * DatastoreRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html
     * 
     */
    @JsonIgnore
    public Property<DatastoreRetentionPeriod> getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * DatastoreRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html
     * 
     */
    @JsonIgnore
    public void setRetentionPeriod(Property<DatastoreRetentionPeriod> retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public Datastore withRetentionPeriod(Property<DatastoreRetentionPeriod> retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Datastore withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("datastoreStorage", datastoreStorage).append("datastoreName", datastoreName).append("retentionPeriod", retentionPeriod).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(datastoreName).append(datastoreStorage).append(retentionPeriod).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datastore) == false) {
            return false;
        }
        Datastore rhs = ((Datastore) other);
        return new EqualsBuilder().append(datastoreName, rhs.datastoreName).append(datastoreStorage, rhs.datastoreStorage).append(retentionPeriod, rhs.retentionPeriod).append(tags, rhs.tags).isEquals();
    }

}
