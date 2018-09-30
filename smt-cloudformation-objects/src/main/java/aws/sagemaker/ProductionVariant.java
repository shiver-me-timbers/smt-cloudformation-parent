
package aws.sagemaker;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ProductionVariant
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ModelName",
    "VariantName",
    "InitialInstanceCount",
    "InstanceType",
    "InitialVariantWeight"
})
public class ProductionVariant {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname
     * 
     */
    @JsonProperty("ModelName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname")
    private CharSequence modelName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname
     * 
     */
    @JsonProperty("VariantName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname")
    private CharSequence variantName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount
     * 
     */
    @JsonProperty("InitialInstanceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount")
    private Integer initialInstanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight
     * 
     */
    @JsonProperty("InitialVariantWeight")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight")
    private Double initialVariantWeight;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname
     * 
     */
    public CharSequence getModelName() {
        return modelName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname
     * 
     */
    public void setModelName(CharSequence modelName) {
        this.modelName = modelName;
    }

    public ProductionVariant withModelName(CharSequence modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname
     * 
     */
    public CharSequence getVariantName() {
        return variantName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname
     * 
     */
    public void setVariantName(CharSequence variantName) {
        this.variantName = variantName;
    }

    public ProductionVariant withVariantName(CharSequence variantName) {
        this.variantName = variantName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount
     * 
     */
    public Integer getInitialInstanceCount() {
        return initialInstanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount
     * 
     */
    public void setInitialInstanceCount(Integer initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
    }

    public ProductionVariant withInitialInstanceCount(Integer initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype
     * 
     */
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype
     * 
     */
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public ProductionVariant withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight
     * 
     */
    public Double getInitialVariantWeight() {
        return initialVariantWeight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight
     * 
     */
    public void setInitialVariantWeight(Double initialVariantWeight) {
        this.initialVariantWeight = initialVariantWeight;
    }

    public ProductionVariant withInitialVariantWeight(Double initialVariantWeight) {
        this.initialVariantWeight = initialVariantWeight;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("modelName", modelName).append("variantName", variantName).append("initialInstanceCount", initialInstanceCount).append("instanceType", instanceType).append("initialVariantWeight", initialVariantWeight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(modelName).append(initialVariantWeight).append(variantName).append(initialInstanceCount).append(instanceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductionVariant) == false) {
            return false;
        }
        ProductionVariant rhs = ((ProductionVariant) other);
        return new EqualsBuilder().append(modelName, rhs.modelName).append(initialVariantWeight, rhs.initialVariantWeight).append(variantName, rhs.variantName).append(initialInstanceCount, rhs.initialInstanceCount).append(instanceType, rhs.instanceType).isEquals();
    }

}
