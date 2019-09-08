
package shiver.me.timbers.aws.kinesisanalyticsv2;

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
 * ApplicationReferenceDataSourceMappingParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "JSONMappingParameters",
    "CSVMappingParameters"
})
public class ApplicationReferenceDataSourceMappingParameters implements Property<ApplicationReferenceDataSourceMappingParameters>
{

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonProperty("JSONMappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html")
    private Property<ApplicationReferenceDataSourceJSONMappingParameters> jSONMappingParameters;
    /**
     * ApplicationReferenceDataSourceCSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html
     * 
     */
    @JsonProperty("CSVMappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html")
    private Property<ApplicationReferenceDataSourceCSVMappingParameters> cSVMappingParameters;

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationReferenceDataSourceJSONMappingParameters> getJSONMappingParameters() {
        return jSONMappingParameters;
    }

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setJSONMappingParameters(Property<ApplicationReferenceDataSourceJSONMappingParameters> jSONMappingParameters) {
        this.jSONMappingParameters = jSONMappingParameters;
    }

    public ApplicationReferenceDataSourceMappingParameters withJSONMappingParameters(Property<ApplicationReferenceDataSourceJSONMappingParameters> jSONMappingParameters) {
        this.jSONMappingParameters = jSONMappingParameters;
        return this;
    }

    /**
     * ApplicationReferenceDataSourceCSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationReferenceDataSourceCSVMappingParameters> getCSVMappingParameters() {
        return cSVMappingParameters;
    }

    /**
     * ApplicationReferenceDataSourceCSVMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setCSVMappingParameters(Property<ApplicationReferenceDataSourceCSVMappingParameters> cSVMappingParameters) {
        this.cSVMappingParameters = cSVMappingParameters;
    }

    public ApplicationReferenceDataSourceMappingParameters withCSVMappingParameters(Property<ApplicationReferenceDataSourceCSVMappingParameters> cSVMappingParameters) {
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
        if ((other instanceof ApplicationReferenceDataSourceMappingParameters) == false) {
            return false;
        }
        ApplicationReferenceDataSourceMappingParameters rhs = ((ApplicationReferenceDataSourceMappingParameters) other);
        return new EqualsBuilder().append(jSONMappingParameters, rhs.jSONMappingParameters).append(cSVMappingParameters, rhs.cSVMappingParameters).isEquals();
    }

}
