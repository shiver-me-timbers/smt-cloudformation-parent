
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
 * MLTransformFindMatchesParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PrecisionRecallTradeoff",
    "EnforceProvidedLabels",
    "PrimaryKeyColumnName",
    "AccuracyCostTradeoff"
})
public class MLTransformFindMatchesParameters implements Property<MLTransformFindMatchesParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-precisionrecalltradeoff
     * 
     */
    @JsonProperty("PrecisionRecallTradeoff")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-precisionrecalltradeoff")
    private Number precisionRecallTradeoff;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-enforceprovidedlabels
     * 
     */
    @JsonProperty("EnforceProvidedLabels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-enforceprovidedlabels")
    private CharSequence enforceProvidedLabels;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-primarykeycolumnname
     * 
     */
    @JsonProperty("PrimaryKeyColumnName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-primarykeycolumnname")
    private CharSequence primaryKeyColumnName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-accuracycosttradeoff
     * 
     */
    @JsonProperty("AccuracyCostTradeoff")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-accuracycosttradeoff")
    private Number accuracyCostTradeoff;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-precisionrecalltradeoff
     * 
     */
    @JsonIgnore
    public Number getPrecisionRecallTradeoff() {
        return precisionRecallTradeoff;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-precisionrecalltradeoff
     * 
     */
    @JsonIgnore
    public void setPrecisionRecallTradeoff(Number precisionRecallTradeoff) {
        this.precisionRecallTradeoff = precisionRecallTradeoff;
    }

    public MLTransformFindMatchesParameters withPrecisionRecallTradeoff(Number precisionRecallTradeoff) {
        this.precisionRecallTradeoff = precisionRecallTradeoff;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-enforceprovidedlabels
     * 
     */
    @JsonIgnore
    public CharSequence getEnforceProvidedLabels() {
        return enforceProvidedLabels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-enforceprovidedlabels
     * 
     */
    @JsonIgnore
    public void setEnforceProvidedLabels(CharSequence enforceProvidedLabels) {
        this.enforceProvidedLabels = enforceProvidedLabels;
    }

    public MLTransformFindMatchesParameters withEnforceProvidedLabels(CharSequence enforceProvidedLabels) {
        this.enforceProvidedLabels = enforceProvidedLabels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-primarykeycolumnname
     * 
     */
    @JsonIgnore
    public CharSequence getPrimaryKeyColumnName() {
        return primaryKeyColumnName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-primarykeycolumnname
     * 
     */
    @JsonIgnore
    public void setPrimaryKeyColumnName(CharSequence primaryKeyColumnName) {
        this.primaryKeyColumnName = primaryKeyColumnName;
    }

    public MLTransformFindMatchesParameters withPrimaryKeyColumnName(CharSequence primaryKeyColumnName) {
        this.primaryKeyColumnName = primaryKeyColumnName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-accuracycosttradeoff
     * 
     */
    @JsonIgnore
    public Number getAccuracyCostTradeoff() {
        return accuracyCostTradeoff;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters-findmatchesparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters-accuracycosttradeoff
     * 
     */
    @JsonIgnore
    public void setAccuracyCostTradeoff(Number accuracyCostTradeoff) {
        this.accuracyCostTradeoff = accuracyCostTradeoff;
    }

    public MLTransformFindMatchesParameters withAccuracyCostTradeoff(Number accuracyCostTradeoff) {
        this.accuracyCostTradeoff = accuracyCostTradeoff;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("precisionRecallTradeoff", precisionRecallTradeoff).append("enforceProvidedLabels", enforceProvidedLabels).append("primaryKeyColumnName", primaryKeyColumnName).append("accuracyCostTradeoff", accuracyCostTradeoff).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enforceProvidedLabels).append(primaryKeyColumnName).append(accuracyCostTradeoff).append(precisionRecallTradeoff).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MLTransformFindMatchesParameters) == false) {
            return false;
        }
        MLTransformFindMatchesParameters rhs = ((MLTransformFindMatchesParameters) other);
        return new EqualsBuilder().append(enforceProvidedLabels, rhs.enforceProvidedLabels).append(primaryKeyColumnName, rhs.primaryKeyColumnName).append(accuracyCostTradeoff, rhs.accuracyCostTradeoff).append(precisionRecallTradeoff, rhs.precisionRecallTradeoff).isEquals();
    }

}
