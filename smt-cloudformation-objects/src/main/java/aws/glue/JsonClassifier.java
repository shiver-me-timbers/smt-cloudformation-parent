
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * JsonClassifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "JsonPath",
    "Name"
})
public class JsonClassifier {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath
     * 
     */
    @JsonProperty("JsonPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath")
    private CharSequence jsonPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath
     * 
     */
    public CharSequence getJsonPath() {
        return jsonPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath
     * 
     */
    public void setJsonPath(CharSequence jsonPath) {
        this.jsonPath = jsonPath;
    }

    public JsonClassifier withJsonPath(CharSequence jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public JsonClassifier withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jsonPath", jsonPath).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(jsonPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JsonClassifier) == false) {
            return false;
        }
        JsonClassifier rhs = ((JsonClassifier) other);
        return new EqualsBuilder().append(name, rhs.name).append(jsonPath, rhs.jsonPath).isEquals();
    }

}
