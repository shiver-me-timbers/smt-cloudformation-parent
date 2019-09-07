
package aws.glue;

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
 * MLTransformTransformParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TransformType",
    "FindMatchesParameters"
})
public class MLTransformTransformParameters implements Property<MLTransformTransformParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-transformtype
     * 
     */
    @JsonProperty("TransformType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-transformtype")
    private CharSequence transformType;
    /**
     * MLTransformFindMatchesParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html
     * 
     */
    @JsonProperty("FindMatchesParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html")
    private Property<MLTransformFindMatchesParameters> findMatchesParameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-transformtype
     * 
     */
    @JsonIgnore
    public CharSequence getTransformType() {
        return transformType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-transformtype
     * 
     */
    @JsonIgnore
    public void setTransformType(CharSequence transformType) {
        this.transformType = transformType;
    }

    public MLTransformTransformParameters withTransformType(CharSequence transformType) {
        this.transformType = transformType;
        return this;
    }

    /**
     * MLTransformFindMatchesParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html
     * 
     */
    @JsonIgnore
    public Property<MLTransformFindMatchesParameters> getFindMatchesParameters() {
        return findMatchesParameters;
    }

    /**
     * MLTransformFindMatchesParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html
     * 
     */
    @JsonIgnore
    public void setFindMatchesParameters(Property<MLTransformFindMatchesParameters> findMatchesParameters) {
        this.findMatchesParameters = findMatchesParameters;
    }

    public MLTransformTransformParameters withFindMatchesParameters(Property<MLTransformFindMatchesParameters> findMatchesParameters) {
        this.findMatchesParameters = findMatchesParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transformType", transformType).append("findMatchesParameters", findMatchesParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transformType).append(findMatchesParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MLTransformTransformParameters) == false) {
            return false;
        }
        MLTransformTransformParameters rhs = ((MLTransformTransformParameters) other);
        return new EqualsBuilder().append(transformType, rhs.transformType).append(findMatchesParameters, rhs.findMatchesParameters).isEquals();
    }

}
