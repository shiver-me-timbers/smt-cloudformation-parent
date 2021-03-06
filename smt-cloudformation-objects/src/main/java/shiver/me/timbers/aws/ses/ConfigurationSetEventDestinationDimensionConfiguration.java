
package shiver.me.timbers.aws.ses;

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
 * ConfigurationSetEventDestinationDimensionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DimensionValueSource",
    "DefaultDimensionValue",
    "DimensionName"
})
public class ConfigurationSetEventDestinationDimensionConfiguration implements Property<ConfigurationSetEventDestinationDimensionConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource
     * 
     */
    @JsonProperty("DimensionValueSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource")
    private CharSequence dimensionValueSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue
     * 
     */
    @JsonProperty("DefaultDimensionValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue")
    private CharSequence defaultDimensionValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname
     * 
     */
    @JsonProperty("DimensionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname")
    private CharSequence dimensionName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource
     * 
     */
    @JsonIgnore
    public CharSequence getDimensionValueSource() {
        return dimensionValueSource;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource
     * 
     */
    @JsonIgnore
    public void setDimensionValueSource(CharSequence dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource;
    }

    public ConfigurationSetEventDestinationDimensionConfiguration withDimensionValueSource(CharSequence dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultDimensionValue() {
        return defaultDimensionValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue
     * 
     */
    @JsonIgnore
    public void setDefaultDimensionValue(CharSequence defaultDimensionValue) {
        this.defaultDimensionValue = defaultDimensionValue;
    }

    public ConfigurationSetEventDestinationDimensionConfiguration withDefaultDimensionValue(CharSequence defaultDimensionValue) {
        this.defaultDimensionValue = defaultDimensionValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname
     * 
     */
    @JsonIgnore
    public CharSequence getDimensionName() {
        return dimensionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname
     * 
     */
    @JsonIgnore
    public void setDimensionName(CharSequence dimensionName) {
        this.dimensionName = dimensionName;
    }

    public ConfigurationSetEventDestinationDimensionConfiguration withDimensionName(CharSequence dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dimensionValueSource", dimensionValueSource).append("defaultDimensionValue", defaultDimensionValue).append("dimensionName", dimensionName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultDimensionValue).append(dimensionName).append(dimensionValueSource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetEventDestinationDimensionConfiguration) == false) {
            return false;
        }
        ConfigurationSetEventDestinationDimensionConfiguration rhs = ((ConfigurationSetEventDestinationDimensionConfiguration) other);
        return new EqualsBuilder().append(defaultDimensionValue, rhs.defaultDimensionValue).append(dimensionName, rhs.dimensionName).append(dimensionValueSource, rhs.dimensionValueSource).isEquals();
    }

}
