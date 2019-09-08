
package shiver.me.timbers.aws.ec2;

import java.util.ArrayList;
import java.util.List;
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
 * InstanceSsmAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AssociationParameters",
    "DocumentName"
})
public class InstanceSsmAssociation implements Property<InstanceSsmAssociation>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters
     * 
     */
    @JsonProperty("AssociationParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters")
    private List<Property<InstanceAssociationParameter>> associationParameters = new ArrayList<Property<InstanceAssociationParameter>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname
     * 
     */
    @JsonProperty("DocumentName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname")
    private CharSequence documentName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters
     * 
     */
    @JsonIgnore
    public List<Property<InstanceAssociationParameter>> getAssociationParameters() {
        return associationParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters
     * 
     */
    @JsonIgnore
    public void setAssociationParameters(List<Property<InstanceAssociationParameter>> associationParameters) {
        this.associationParameters = associationParameters;
    }

    public InstanceSsmAssociation withAssociationParameters(List<Property<InstanceAssociationParameter>> associationParameters) {
        this.associationParameters = associationParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname
     * 
     */
    @JsonIgnore
    public CharSequence getDocumentName() {
        return documentName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname
     * 
     */
    @JsonIgnore
    public void setDocumentName(CharSequence documentName) {
        this.documentName = documentName;
    }

    public InstanceSsmAssociation withDocumentName(CharSequence documentName) {
        this.documentName = documentName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("associationParameters", associationParameters).append("documentName", documentName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(associationParameters).append(documentName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceSsmAssociation) == false) {
            return false;
        }
        InstanceSsmAssociation rhs = ((InstanceSsmAssociation) other);
        return new EqualsBuilder().append(associationParameters, rhs.associationParameters).append(documentName, rhs.documentName).isEquals();
    }

}
