
package aws.sagemaker;

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
 * EndpointConfigProductionVariant
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ModelName",
    "VariantName",
    "InitialInstanceCount",
    "InstanceType",
    "AcceleratorType",
    "InitialVariantWeight"
})
public class EndpointConfigProductionVariant implements Property<EndpointConfigProductionVariant>
{

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
    private Number initialInstanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-acceleratortype
     * 
     */
    @JsonProperty("AcceleratorType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-acceleratortype")
    private CharSequence acceleratorType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight
     * 
     */
    @JsonProperty("InitialVariantWeight")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight")
    private Number initialVariantWeight;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname
     * 
     */
    @JsonIgnore
    public CharSequence getModelName() {
        return modelName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname
     * 
     */
    @JsonIgnore
    public void setModelName(CharSequence modelName) {
        this.modelName = modelName;
    }

    public EndpointConfigProductionVariant withModelName(CharSequence modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname
     * 
     */
    @JsonIgnore
    public CharSequence getVariantName() {
        return variantName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname
     * 
     */
    @JsonIgnore
    public void setVariantName(CharSequence variantName) {
        this.variantName = variantName;
    }

    public EndpointConfigProductionVariant withVariantName(CharSequence variantName) {
        this.variantName = variantName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount
     * 
     */
    @JsonIgnore
    public Number getInitialInstanceCount() {
        return initialInstanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount
     * 
     */
    @JsonIgnore
    public void setInitialInstanceCount(Number initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
    }

    public EndpointConfigProductionVariant withInitialInstanceCount(Number initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public EndpointConfigProductionVariant withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-acceleratortype
     * 
     */
    @JsonIgnore
    public CharSequence getAcceleratorType() {
        return acceleratorType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-acceleratortype
     * 
     */
    @JsonIgnore
    public void setAcceleratorType(CharSequence acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    public EndpointConfigProductionVariant withAcceleratorType(CharSequence acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight
     * 
     */
    @JsonIgnore
    public Number getInitialVariantWeight() {
        return initialVariantWeight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight
     * 
     */
    @JsonIgnore
    public void setInitialVariantWeight(Number initialVariantWeight) {
        this.initialVariantWeight = initialVariantWeight;
    }

    public EndpointConfigProductionVariant withInitialVariantWeight(Number initialVariantWeight) {
        this.initialVariantWeight = initialVariantWeight;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("modelName", modelName).append("variantName", variantName).append("initialInstanceCount", initialInstanceCount).append("instanceType", instanceType).append("acceleratorType", acceleratorType).append("initialVariantWeight", initialVariantWeight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceleratorType).append(modelName).append(instanceType).append(initialVariantWeight).append(variantName).append(initialInstanceCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointConfigProductionVariant) == false) {
            return false;
        }
        EndpointConfigProductionVariant rhs = ((EndpointConfigProductionVariant) other);
        return new EqualsBuilder().append(acceleratorType, rhs.acceleratorType).append(modelName, rhs.modelName).append(instanceType, rhs.instanceType).append(initialVariantWeight, rhs.initialVariantWeight).append(variantName, rhs.variantName).append(initialInstanceCount, rhs.initialInstanceCount).isEquals();
    }

}
