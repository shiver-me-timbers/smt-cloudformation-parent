
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SsmAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssociationParameters",
    "DocumentName"
})
public class SsmAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters
     * 
     */
    @JsonProperty("AssociationParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters")
    private List<AssociationParameter> associationParameters = new ArrayList<AssociationParameter>();
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
    public List<AssociationParameter> getAssociationParameters() {
        return associationParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters
     * 
     */
    public void setAssociationParameters(List<AssociationParameter> associationParameters) {
        this.associationParameters = associationParameters;
    }

    public SsmAssociation withAssociationParameters(List<AssociationParameter> associationParameters) {
        this.associationParameters = associationParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname
     * 
     */
    public CharSequence getDocumentName() {
        return documentName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname
     * 
     */
    public void setDocumentName(CharSequence documentName) {
        this.documentName = documentName;
    }

    public SsmAssociation withDocumentName(CharSequence documentName) {
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
        if ((other instanceof SsmAssociation) == false) {
            return false;
        }
        SsmAssociation rhs = ((SsmAssociation) other);
        return new EqualsBuilder().append(associationParameters, rhs.associationParameters).append(documentName, rhs.documentName).isEquals();
    }

}
