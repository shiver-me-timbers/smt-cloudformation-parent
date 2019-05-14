
package aws.iotanalytics;

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
 * Activity
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SelectAttributes",
    "Datastore",
    "Filter",
    "AddAttributes",
    "Channel",
    "DeviceShadowEnrich",
    "Math",
    "Lambda",
    "DeviceRegistryEnrich",
    "RemoveAttributes"
})
public class Activity implements Property<Activity>
{

    /**
     * SelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonProperty("SelectAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html")
    private Property<SelectAttributes> selectAttributes;
    /**
     * Datastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonProperty("Datastore")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html")
    private Property<Datastore> datastore;
    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html")
    private Property<Filter> filter;
    /**
     * AddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonProperty("AddAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html")
    private Property<AddAttributes> addAttributes;
    /**
     * Channel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonProperty("Channel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html")
    private Property<Channel> channel;
    /**
     * DeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonProperty("DeviceShadowEnrich")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html")
    private Property<DeviceShadowEnrich> deviceShadowEnrich;
    /**
     * Math
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonProperty("Math")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html")
    private Property<Math> math;
    /**
     * Lambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonProperty("Lambda")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html")
    private Property<Lambda> lambda;
    /**
     * DeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonProperty("DeviceRegistryEnrich")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html")
    private Property<DeviceRegistryEnrich> deviceRegistryEnrich;
    /**
     * RemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonProperty("RemoveAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html")
    private Property<RemoveAttributes> removeAttributes;

    /**
     * SelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonIgnore
    public Property<SelectAttributes> getSelectAttributes() {
        return selectAttributes;
    }

    /**
     * SelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonIgnore
    public void setSelectAttributes(Property<SelectAttributes> selectAttributes) {
        this.selectAttributes = selectAttributes;
    }

    public Activity withSelectAttributes(Property<SelectAttributes> selectAttributes) {
        this.selectAttributes = selectAttributes;
        return this;
    }

    /**
     * Datastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonIgnore
    public Property<Datastore> getDatastore() {
        return datastore;
    }

    /**
     * Datastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonIgnore
    public void setDatastore(Property<Datastore> datastore) {
        this.datastore = datastore;
    }

    public Activity withDatastore(Property<Datastore> datastore) {
        this.datastore = datastore;
        return this;
    }

    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html
     * 
     */
    @JsonIgnore
    public Property<Filter> getFilter() {
        return filter;
    }

    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html
     * 
     */
    @JsonIgnore
    public void setFilter(Property<Filter> filter) {
        this.filter = filter;
    }

    public Activity withFilter(Property<Filter> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * AddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonIgnore
    public Property<AddAttributes> getAddAttributes() {
        return addAttributes;
    }

    /**
     * AddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonIgnore
    public void setAddAttributes(Property<AddAttributes> addAttributes) {
        this.addAttributes = addAttributes;
    }

    public Activity withAddAttributes(Property<AddAttributes> addAttributes) {
        this.addAttributes = addAttributes;
        return this;
    }

    /**
     * Channel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonIgnore
    public Property<Channel> getChannel() {
        return channel;
    }

    /**
     * Channel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonIgnore
    public void setChannel(Property<Channel> channel) {
        this.channel = channel;
    }

    public Activity withChannel(Property<Channel> channel) {
        this.channel = channel;
        return this;
    }

    /**
     * DeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonIgnore
    public Property<DeviceShadowEnrich> getDeviceShadowEnrich() {
        return deviceShadowEnrich;
    }

    /**
     * DeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonIgnore
    public void setDeviceShadowEnrich(Property<DeviceShadowEnrich> deviceShadowEnrich) {
        this.deviceShadowEnrich = deviceShadowEnrich;
    }

    public Activity withDeviceShadowEnrich(Property<DeviceShadowEnrich> deviceShadowEnrich) {
        this.deviceShadowEnrich = deviceShadowEnrich;
        return this;
    }

    /**
     * Math
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonIgnore
    public Property<Math> getMath() {
        return math;
    }

    /**
     * Math
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonIgnore
    public void setMath(Property<Math> math) {
        this.math = math;
    }

    public Activity withMath(Property<Math> math) {
        this.math = math;
        return this;
    }

    /**
     * Lambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonIgnore
    public Property<Lambda> getLambda() {
        return lambda;
    }

    /**
     * Lambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonIgnore
    public void setLambda(Property<Lambda> lambda) {
        this.lambda = lambda;
    }

    public Activity withLambda(Property<Lambda> lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * DeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonIgnore
    public Property<DeviceRegistryEnrich> getDeviceRegistryEnrich() {
        return deviceRegistryEnrich;
    }

    /**
     * DeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonIgnore
    public void setDeviceRegistryEnrich(Property<DeviceRegistryEnrich> deviceRegistryEnrich) {
        this.deviceRegistryEnrich = deviceRegistryEnrich;
    }

    public Activity withDeviceRegistryEnrich(Property<DeviceRegistryEnrich> deviceRegistryEnrich) {
        this.deviceRegistryEnrich = deviceRegistryEnrich;
        return this;
    }

    /**
     * RemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonIgnore
    public Property<RemoveAttributes> getRemoveAttributes() {
        return removeAttributes;
    }

    /**
     * RemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonIgnore
    public void setRemoveAttributes(Property<RemoveAttributes> removeAttributes) {
        this.removeAttributes = removeAttributes;
    }

    public Activity withRemoveAttributes(Property<RemoveAttributes> removeAttributes) {
        this.removeAttributes = removeAttributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("selectAttributes", selectAttributes).append("datastore", datastore).append("filter", filter).append("addAttributes", addAttributes).append("channel", channel).append("deviceShadowEnrich", deviceShadowEnrich).append("math", math).append("lambda", lambda).append("deviceRegistryEnrich", deviceRegistryEnrich).append("removeAttributes", removeAttributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter).append(lambda).append(datastore).append(addAttributes).append(deviceShadowEnrich).append(channel).append(deviceRegistryEnrich).append(math).append(removeAttributes).append(selectAttributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Activity) == false) {
            return false;
        }
        Activity rhs = ((Activity) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(lambda, rhs.lambda).append(datastore, rhs.datastore).append(addAttributes, rhs.addAttributes).append(deviceShadowEnrich, rhs.deviceShadowEnrich).append(channel, rhs.channel).append(deviceRegistryEnrich, rhs.deviceRegistryEnrich).append(math, rhs.math).append(removeAttributes, rhs.removeAttributes).append(selectAttributes, rhs.selectAttributes).isEquals();
    }

}
