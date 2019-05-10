
package aws.iotanalytics;

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
public class Activity {

    /**
     * SelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonProperty("SelectAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html")
    private SelectAttributes selectAttributes;
    /**
     * Datastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonProperty("Datastore")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html")
    private Datastore datastore;
    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html")
    private Filter filter;
    /**
     * AddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonProperty("AddAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html")
    private AddAttributes addAttributes;
    /**
     * Channel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonProperty("Channel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html")
    private Channel channel;
    /**
     * DeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonProperty("DeviceShadowEnrich")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html")
    private DeviceShadowEnrich deviceShadowEnrich;
    /**
     * Math
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonProperty("Math")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html")
    private Math math;
    /**
     * Lambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonProperty("Lambda")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html")
    private Lambda lambda;
    /**
     * DeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonProperty("DeviceRegistryEnrich")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html")
    private DeviceRegistryEnrich deviceRegistryEnrich;
    /**
     * RemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonProperty("RemoveAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html")
    private RemoveAttributes removeAttributes;

    /**
     * SelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonIgnore
    public SelectAttributes getSelectAttributes() {
        return selectAttributes;
    }

    /**
     * SelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonIgnore
    public void setSelectAttributes(SelectAttributes selectAttributes) {
        this.selectAttributes = selectAttributes;
    }

    public Activity withSelectAttributes(SelectAttributes selectAttributes) {
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
    public Datastore getDatastore() {
        return datastore;
    }

    /**
     * Datastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonIgnore
    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public Activity withDatastore(Datastore datastore) {
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
    public Filter getFilter() {
        return filter;
    }

    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html
     * 
     */
    @JsonIgnore
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Activity withFilter(Filter filter) {
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
    public AddAttributes getAddAttributes() {
        return addAttributes;
    }

    /**
     * AddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonIgnore
    public void setAddAttributes(AddAttributes addAttributes) {
        this.addAttributes = addAttributes;
    }

    public Activity withAddAttributes(AddAttributes addAttributes) {
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
    public Channel getChannel() {
        return channel;
    }

    /**
     * Channel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonIgnore
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Activity withChannel(Channel channel) {
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
    public DeviceShadowEnrich getDeviceShadowEnrich() {
        return deviceShadowEnrich;
    }

    /**
     * DeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonIgnore
    public void setDeviceShadowEnrich(DeviceShadowEnrich deviceShadowEnrich) {
        this.deviceShadowEnrich = deviceShadowEnrich;
    }

    public Activity withDeviceShadowEnrich(DeviceShadowEnrich deviceShadowEnrich) {
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
    public Math getMath() {
        return math;
    }

    /**
     * Math
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonIgnore
    public void setMath(Math math) {
        this.math = math;
    }

    public Activity withMath(Math math) {
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
    public Lambda getLambda() {
        return lambda;
    }

    /**
     * Lambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonIgnore
    public void setLambda(Lambda lambda) {
        this.lambda = lambda;
    }

    public Activity withLambda(Lambda lambda) {
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
    public DeviceRegistryEnrich getDeviceRegistryEnrich() {
        return deviceRegistryEnrich;
    }

    /**
     * DeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonIgnore
    public void setDeviceRegistryEnrich(DeviceRegistryEnrich deviceRegistryEnrich) {
        this.deviceRegistryEnrich = deviceRegistryEnrich;
    }

    public Activity withDeviceRegistryEnrich(DeviceRegistryEnrich deviceRegistryEnrich) {
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
    public RemoveAttributes getRemoveAttributes() {
        return removeAttributes;
    }

    /**
     * RemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonIgnore
    public void setRemoveAttributes(RemoveAttributes removeAttributes) {
        this.removeAttributes = removeAttributes;
    }

    public Activity withRemoveAttributes(RemoveAttributes removeAttributes) {
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
