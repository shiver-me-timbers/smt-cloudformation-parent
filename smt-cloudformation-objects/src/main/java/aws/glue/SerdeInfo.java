
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SerdeInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Parameters",
    "SerializationLibrary",
    "Name"
})
public class SerdeInfo {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters")
    private Parameters___ parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary
     * 
     */
    @JsonProperty("SerializationLibrary")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary")
    private String serializationLibrary;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name")
    private String name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters
     * 
     */
    @JsonProperty("Parameters")
    public Parameters___ getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters
     * 
     */
    @JsonProperty("Parameters")
    public void setParameters(Parameters___ parameters) {
        this.parameters = parameters;
    }

    public SerdeInfo withParameters(Parameters___ parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary
     * 
     */
    @JsonProperty("SerializationLibrary")
    public String getSerializationLibrary() {
        return serializationLibrary;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary
     * 
     */
    @JsonProperty("SerializationLibrary")
    public void setSerializationLibrary(String serializationLibrary) {
        this.serializationLibrary = serializationLibrary;
    }

    public SerdeInfo withSerializationLibrary(String serializationLibrary) {
        this.serializationLibrary = serializationLibrary;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public SerdeInfo withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("parameters", parameters).append("serializationLibrary", serializationLibrary).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serializationLibrary).append(name).append(parameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SerdeInfo) == false) {
            return false;
        }
        SerdeInfo rhs = ((SerdeInfo) other);
        return new EqualsBuilder().append(serializationLibrary, rhs.serializationLibrary).append(name, rhs.name).append(parameters, rhs.parameters).isEquals();
    }

}
