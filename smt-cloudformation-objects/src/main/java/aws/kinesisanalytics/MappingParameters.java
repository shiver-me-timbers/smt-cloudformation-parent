
package aws.kinesisanalytics;

import aws.Property;
import aws.kinesisanalyticsv2.JSONMappingParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MappingParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "JSONMappingParameters",
    "CSVMappingParameters"
})
public class MappingParameters implements Property<MappingParameters>
{

    /**
     * JSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonProperty("JSONMappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html")
    private Property<JSONMappingParameters> jSONMappingParameters;
    /**
     * CSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html
     * 
     */
    @JsonProperty("CSVMappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html")
    private Property<CSVMappingParameters> cSVMappingParameters;

    /**
     * JSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<JSONMappingParameters> getJSONMappingParameters() {
        return jSONMappingParameters;
    }

    /**
     * JSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setJSONMappingParameters(Property<JSONMappingParameters> jSONMappingParameters) {
        this.jSONMappingParameters = jSONMappingParameters;
    }

    public MappingParameters withJSONMappingParameters(Property<JSONMappingParameters> jSONMappingParameters) {
        this.jSONMappingParameters = jSONMappingParameters;
        return this;
    }

    /**
     * CSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<CSVMappingParameters> getCSVMappingParameters() {
        return cSVMappingParameters;
    }

    /**
     * CSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setCSVMappingParameters(Property<CSVMappingParameters> cSVMappingParameters) {
        this.cSVMappingParameters = cSVMappingParameters;
    }

    public MappingParameters withCSVMappingParameters(Property<CSVMappingParameters> cSVMappingParameters) {
        this.cSVMappingParameters = cSVMappingParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jSONMappingParameters", jSONMappingParameters).append("cSVMappingParameters", cSVMappingParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jSONMappingParameters).append(cSVMappingParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MappingParameters) == false) {
            return false;
        }
        MappingParameters rhs = ((MappingParameters) other);
        return new EqualsBuilder().append(jSONMappingParameters, rhs.jSONMappingParameters).append(cSVMappingParameters, rhs.cSVMappingParameters).isEquals();
    }

}
