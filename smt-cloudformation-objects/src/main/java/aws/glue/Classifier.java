
package aws.glue;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "XMLClassifier",
    "JsonClassifier",
    "GrokClassifier"
})
public class Classifier {

    /**
     * XMLClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
     * 
     */
    @JsonProperty("XMLClassifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html")
    private XMLClassifier xMLClassifier;
    /**
     * JsonClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html
     * 
     */
    @JsonProperty("JsonClassifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html")
    private JsonClassifier jsonClassifier;
    /**
     * GrokClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
     * 
     */
    @JsonProperty("GrokClassifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html")
    private GrokClassifier grokClassifier;

    /**
     * XMLClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
     * 
     */
    public XMLClassifier getXMLClassifier() {
        return xMLClassifier;
    }

    /**
     * XMLClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
     * 
     */
    public void setXMLClassifier(XMLClassifier xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
    }

    public Classifier withXMLClassifier(XMLClassifier xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
        return this;
    }

    /**
     * JsonClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html
     * 
     */
    public JsonClassifier getJsonClassifier() {
        return jsonClassifier;
    }

    /**
     * JsonClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html
     * 
     */
    public void setJsonClassifier(JsonClassifier jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
    }

    public Classifier withJsonClassifier(JsonClassifier jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
        return this;
    }

    /**
     * GrokClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
     * 
     */
    public GrokClassifier getGrokClassifier() {
        return grokClassifier;
    }

    /**
     * GrokClassifier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
     * 
     */
    public void setGrokClassifier(GrokClassifier grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    public Classifier withGrokClassifier(GrokClassifier grokClassifier) {
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
