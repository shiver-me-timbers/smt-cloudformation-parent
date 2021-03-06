
package shiver.me.timbers.aws.glue;

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
 * ClassifierXMLClassifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RowTag",
    "Classification",
    "Name"
})
public class ClassifierXMLClassifier implements Property<ClassifierXMLClassifier>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag
     * 
     */
    @JsonProperty("RowTag")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag")
    private CharSequence rowTag;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification
     * 
     */
    @JsonProperty("Classification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification")
    private CharSequence classification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag
     * 
     */
    @JsonIgnore
    public CharSequence getRowTag() {
        return rowTag;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag
     * 
     */
    @JsonIgnore
    public void setRowTag(CharSequence rowTag) {
        this.rowTag = rowTag;
    }

    public ClassifierXMLClassifier withRowTag(CharSequence rowTag) {
        this.rowTag = rowTag;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification
     * 
     */
    @JsonIgnore
    public CharSequence getClassification() {
        return classification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification
     * 
     */
    @JsonIgnore
    public void setClassification(CharSequence classification) {
        this.classification = classification;
    }

    public ClassifierXMLClassifier withClassification(CharSequence classification) {
        this.classification = classification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ClassifierXMLClassifier withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rowTag", rowTag).append("classification", classification).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(rowTag).append(classification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassifierXMLClassifier) == false) {
            return false;
        }
        ClassifierXMLClassifier rhs = ((ClassifierXMLClassifier) other);
        return new EqualsBuilder().append(name, rhs.name).append(rowTag, rhs.rowTag).append(classification, rhs.classification).isEquals();
    }

}
