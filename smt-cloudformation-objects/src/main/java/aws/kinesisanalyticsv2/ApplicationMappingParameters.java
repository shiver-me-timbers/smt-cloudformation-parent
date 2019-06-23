
package aws.kinesisanalyticsv2;

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
 * ApplicationMappingParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "JSONMappingParameters",
    "CSVMappingParameters"
})
public class ApplicationMappingParameters implements Property<ApplicationMappingParameters>
{

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonProperty("JSONMappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html")
    private Property<ApplicationJSONMappingParameters> jSONMappingParameters;
    /**
     * ApplicationCSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html
     * 
     */
    @JsonProperty("CSVMappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html")
    private Property<ApplicationCSVMappingParameters> cSVMappingParameters;

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationJSONMappingParameters> getJSONMappingParameters() {
        return jSONMappingParameters;
    }

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setJSONMappingParameters(Property<ApplicationJSONMappingParameters> jSONMappingParameters) {
        this.jSONMappingParameters = jSONMappingParameters;
    }

    public ApplicationMappingParameters withJSONMappingParameters(Property<ApplicationJSONMappingParameters> jSONMappingParameters) {
        this.jSONMappingParameters = jSONMappingParameters;
        return this;
    }

    /**
     * ApplicationCSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationCSVMappingParameters> getCSVMappingParameters() {
        return cSVMappingParameters;
    }

    /**
     * ApplicationCSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setCSVMappingParameters(Property<ApplicationCSVMappingParameters> cSVMappingParameters) {
        this.cSVMappingParameters = cSVMappingParameters;
    }

    public ApplicationMappingParameters withCSVMappingParameters(Property<ApplicationCSVMappingParameters> cSVMappingParameters) {
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
        if ((other instanceof ApplicationMappingParameters) == false) {
            return false;
        }
        ApplicationMappingParameters rhs = ((ApplicationMappingParameters) other);
        return new EqualsBuilder().append(jSONMappingParameters, rhs.jSONMappingParameters).append(cSVMappingParameters, rhs.cSVMappingParameters).isEquals();
    }

}
