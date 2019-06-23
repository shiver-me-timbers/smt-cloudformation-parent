
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
 * PipelineActivity
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
public class PipelineActivity implements Property<PipelineActivity>
{

    /**
     * PipelineSelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonProperty("SelectAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html")
    private Property<PipelineSelectAttributes> selectAttributes;
    /**
     * PipelineDatastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonProperty("Datastore")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html")
    private Property<PipelineDatastore> datastore;
    /**
     * PipelineFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html")
    private Property<PipelineFilter> filter;
    /**
     * PipelineAddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonProperty("AddAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html")
    private Property<PipelineAddAttributes> addAttributes;
    /**
     * PipelineChannel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonProperty("Channel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html")
    private Property<PipelineChannel> channel;
    /**
     * PipelineDeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonProperty("DeviceShadowEnrich")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html")
    private Property<PipelineDeviceShadowEnrich> deviceShadowEnrich;
    /**
     * PipelineMath
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonProperty("Math")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html")
    private Property<PipelineMath> math;
    /**
     * PipelineLambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonProperty("Lambda")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html")
    private Property<PipelineLambda> lambda;
    /**
     * PipelineDeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonProperty("DeviceRegistryEnrich")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html")
    private Property<PipelineDeviceRegistryEnrich> deviceRegistryEnrich;
    /**
     * PipelineRemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonProperty("RemoveAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html")
    private Property<PipelineRemoveAttributes> removeAttributes;

    /**
     * PipelineSelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonIgnore
    public Property<PipelineSelectAttributes> getSelectAttributes() {
        return selectAttributes;
    }

    /**
     * PipelineSelectAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html
     * 
     */
    @JsonIgnore
    public void setSelectAttributes(Property<PipelineSelectAttributes> selectAttributes) {
        this.selectAttributes = selectAttributes;
    }

    public PipelineActivity withSelectAttributes(Property<PipelineSelectAttributes> selectAttributes) {
        this.selectAttributes = selectAttributes;
        return this;
    }

    /**
     * PipelineDatastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonIgnore
    public Property<PipelineDatastore> getDatastore() {
        return datastore;
    }

    /**
     * PipelineDatastore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html
     * 
     */
    @JsonIgnore
    public void setDatastore(Property<PipelineDatastore> datastore) {
        this.datastore = datastore;
    }

    public PipelineActivity withDatastore(Property<PipelineDatastore> datastore) {
        this.datastore = datastore;
        return this;
    }

    /**
     * PipelineFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html
     * 
     */
    @JsonIgnore
    public Property<PipelineFilter> getFilter() {
        return filter;
    }

    /**
     * PipelineFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html
     * 
     */
    @JsonIgnore
    public void setFilter(Property<PipelineFilter> filter) {
        this.filter = filter;
    }

    public PipelineActivity withFilter(Property<PipelineFilter> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * PipelineAddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonIgnore
    public Property<PipelineAddAttributes> getAddAttributes() {
        return addAttributes;
    }

    /**
     * PipelineAddAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html
     * 
     */
    @JsonIgnore
    public void setAddAttributes(Property<PipelineAddAttributes> addAttributes) {
        this.addAttributes = addAttributes;
    }

    public PipelineActivity withAddAttributes(Property<PipelineAddAttributes> addAttributes) {
        this.addAttributes = addAttributes;
        return this;
    }

    /**
     * PipelineChannel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonIgnore
    public Property<PipelineChannel> getChannel() {
        return channel;
    }

    /**
     * PipelineChannel
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html
     * 
     */
    @JsonIgnore
    public void setChannel(Property<PipelineChannel> channel) {
        this.channel = channel;
    }

    public PipelineActivity withChannel(Property<PipelineChannel> channel) {
        this.channel = channel;
        return this;
    }

    /**
     * PipelineDeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonIgnore
    public Property<PipelineDeviceShadowEnrich> getDeviceShadowEnrich() {
        return deviceShadowEnrich;
    }

    /**
     * PipelineDeviceShadowEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html
     * 
     */
    @JsonIgnore
    public void setDeviceShadowEnrich(Property<PipelineDeviceShadowEnrich> deviceShadowEnrich) {
        this.deviceShadowEnrich = deviceShadowEnrich;
    }

    public PipelineActivity withDeviceShadowEnrich(Property<PipelineDeviceShadowEnrich> deviceShadowEnrich) {
        this.deviceShadowEnrich = deviceShadowEnrich;
        return this;
    }

    /**
     * PipelineMath
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonIgnore
    public Property<PipelineMath> getMath() {
        return math;
    }

    /**
     * PipelineMath
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html
     * 
     */
    @JsonIgnore
    public void setMath(Property<PipelineMath> math) {
        this.math = math;
    }

    public PipelineActivity withMath(Property<PipelineMath> math) {
        this.math = math;
        return this;
    }

    /**
     * PipelineLambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonIgnore
    public Property<PipelineLambda> getLambda() {
        return lambda;
    }

    /**
     * PipelineLambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html
     * 
     */
    @JsonIgnore
    public void setLambda(Property<PipelineLambda> lambda) {
        this.lambda = lambda;
    }

    public PipelineActivity withLambda(Property<PipelineLambda> lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * PipelineDeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonIgnore
    public Property<PipelineDeviceRegistryEnrich> getDeviceRegistryEnrich() {
        return deviceRegistryEnrich;
    }

    /**
     * PipelineDeviceRegistryEnrich
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html
     * 
     */
    @JsonIgnore
    public void setDeviceRegistryEnrich(Property<PipelineDeviceRegistryEnrich> deviceRegistryEnrich) {
        this.deviceRegistryEnrich = deviceRegistryEnrich;
    }

    public PipelineActivity withDeviceRegistryEnrich(Property<PipelineDeviceRegistryEnrich> deviceRegistryEnrich) {
        this.deviceRegistryEnrich = deviceRegistryEnrich;
        return this;
    }

    /**
     * PipelineRemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonIgnore
    public Property<PipelineRemoveAttributes> getRemoveAttributes() {
        return removeAttributes;
    }

    /**
     * PipelineRemoveAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html
     * 
     */
    @JsonIgnore
    public void setRemoveAttributes(Property<PipelineRemoveAttributes> removeAttributes) {
        this.removeAttributes = removeAttributes;
    }

    public PipelineActivity withRemoveAttributes(Property<PipelineRemoveAttributes> removeAttributes) {
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
        if ((other instanceof PipelineActivity) == false) {
            return false;
        }
        PipelineActivity rhs = ((PipelineActivity) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(lambda, rhs.lambda).append(datastore, rhs.datastore).append(addAttributes, rhs.addAttributes).append(deviceShadowEnrich, rhs.deviceShadowEnrich).append(channel, rhs.channel).append(deviceRegistryEnrich, rhs.deviceRegistryEnrich).append(math, rhs.math).append(removeAttributes, rhs.removeAttributes).append(selectAttributes, rhs.selectAttributes).isEquals();
    }

}
