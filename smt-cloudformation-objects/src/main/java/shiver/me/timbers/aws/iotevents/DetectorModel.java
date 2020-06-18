
package shiver.me.timbers.aws.iotevents;

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
import shiver.me.timbers.aws.Tag;


/**
 * DetectorModel
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DetectorModelDefinition",
    "EvaluationMethod",
    "DetectorModelName",
    "DetectorModelDescription",
    "Key",
    "RoleArn",
    "Tags"
})
public class DetectorModel {

    /**
     * DetectorModelDetectorModelDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html
     * 
     */
    @JsonProperty("DetectorModelDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html")
    private Property<DetectorModelDetectorModelDefinition> detectorModelDefinition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod
     * 
     */
    @JsonProperty("EvaluationMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod")
    private CharSequence evaluationMethod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname
     * 
     */
    @JsonProperty("DetectorModelName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname")
    private CharSequence detectorModelName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription
     * 
     */
    @JsonProperty("DetectorModelDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription")
    private CharSequence detectorModelDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key")
    private CharSequence key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * DetectorModelDetectorModelDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelDetectorModelDefinition> getDetectorModelDefinition() {
        return detectorModelDefinition;
    }

    /**
     * DetectorModelDetectorModelDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html
     * 
     */
    @JsonIgnore
    public void setDetectorModelDefinition(Property<DetectorModelDetectorModelDefinition> detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
    }

    public DetectorModel withDetectorModelDefinition(Property<DetectorModelDetectorModelDefinition> detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod
     * 
     */
    @JsonIgnore
    public CharSequence getEvaluationMethod() {
        return evaluationMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod
     * 
     */
    @JsonIgnore
    public void setEvaluationMethod(CharSequence evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public DetectorModel withEvaluationMethod(CharSequence evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname
     * 
     */
    @JsonIgnore
    public CharSequence getDetectorModelName() {
        return detectorModelName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname
     * 
     */
    @JsonIgnore
    public void setDetectorModelName(CharSequence detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    public DetectorModel withDetectorModelName(CharSequence detectorModelName) {
        this.detectorModelName = detectorModelName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription
     * 
     */
    @JsonIgnore
    public CharSequence getDetectorModelDescription() {
        return detectorModelDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription
     * 
     */
    @JsonIgnore
    public void setDetectorModelDescription(CharSequence detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
    }

    public DetectorModel withDetectorModelDescription(CharSequence detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key
     * 
     */
    @JsonIgnore
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key
     * 
     */
    @JsonIgnore
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public DetectorModel withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public DetectorModel withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public DetectorModel withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("detectorModelDefinition", detectorModelDefinition).append("evaluationMethod", evaluationMethod).append("detectorModelName", detectorModelName).append("detectorModelDescription", detectorModelDescription).append("key", key).append("roleArn", roleArn).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(evaluationMethod).append(roleArn).append(detectorModelDefinition).append(detectorModelName).append(key).append(detectorModelDescription).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModel) == false) {
            return false;
        }
        DetectorModel rhs = ((DetectorModel) other);
        return new EqualsBuilder().append(evaluationMethod, rhs.evaluationMethod).append(roleArn, rhs.roleArn).append(detectorModelDefinition, rhs.detectorModelDefinition).append(detectorModelName, rhs.detectorModelName).append(key, rhs.key).append(detectorModelDescription, rhs.detectorModelDescription).append(tags, rhs.tags).isEquals();
    }

}
