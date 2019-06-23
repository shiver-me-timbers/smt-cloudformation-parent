
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
 * Classifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "XMLClassifier",
    "JsonClassifier",
    "GrokClassifier"
})
public class Classifier {

    /**
     * ClassifierXMLClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
     * 
     */
    @JsonProperty("XMLClassifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html")
    private Property<ClassifierXMLClassifier> xMLClassifier;
    /**
     * ClassifierJsonClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html
     * 
     */
    @JsonProperty("JsonClassifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html")
    private Property<ClassifierJsonClassifier> jsonClassifier;
    /**
     * ClassifierGrokClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
     * 
     */
    @JsonProperty("GrokClassifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html")
    private Property<ClassifierGrokClassifier> grokClassifier;

    /**
     * ClassifierXMLClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
     * 
     */
    @JsonIgnore
    public Property<ClassifierXMLClassifier> getXMLClassifier() {
        return xMLClassifier;
    }

    /**
     * ClassifierXMLClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
     * 
     */
    @JsonIgnore
    public void setXMLClassifier(Property<ClassifierXMLClassifier> xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
    }

    public Classifier withXMLClassifier(Property<ClassifierXMLClassifier> xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
        return this;
    }

    /**
     * ClassifierJsonClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html
     * 
     */
    @JsonIgnore
    public Property<ClassifierJsonClassifier> getJsonClassifier() {
        return jsonClassifier;
    }

    /**
     * ClassifierJsonClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html
     * 
     */
    @JsonIgnore
    public void setJsonClassifier(Property<ClassifierJsonClassifier> jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
    }

    public Classifier withJsonClassifier(Property<ClassifierJsonClassifier> jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
        return this;
    }

    /**
     * ClassifierGrokClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
     * 
     */
    @JsonIgnore
    public Property<ClassifierGrokClassifier> getGrokClassifier() {
        return grokClassifier;
    }

    /**
     * ClassifierGrokClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
     * 
     */
    @JsonIgnore
    public void setGrokClassifier(Property<ClassifierGrokClassifier> grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    public Classifier withGrokClassifier(Property<ClassifierGrokClassifier> grokClassifier) {
        this.grokClassifier = grokClassifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("xMLClassifier", xMLClassifier).append("jsonClassifier", jsonClassifier).append("grokClassifier", grokClassifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xMLClassifier).append(grokClassifier).append(jsonClassifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Classifier) == false) {
            return false;
        }
        Classifier rhs = ((Classifier) other);
        return new EqualsBuilder().append(xMLClassifier, rhs.xMLClassifier).append(grokClassifier, rhs.grokClassifier).append(jsonClassifier, rhs.jsonClassifier).isEquals();
    }

}
