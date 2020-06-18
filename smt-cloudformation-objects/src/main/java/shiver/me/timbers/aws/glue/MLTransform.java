
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
 * MLTransform
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Role",
    "MaxRetries",
    "WorkerType",
    "Description",
    "Timeout",
    "GlueVersion",
    "TransformParameters",
    "InputRecordTables",
    "NumberOfWorkers",
    "Tags",
    "Name",
    "MaxCapacity"
})
public class MLTransform {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-role")
    private CharSequence role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries
     * 
     */
    @JsonProperty("MaxRetries")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries")
    private Number maxRetries;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-workertype
     * 
     */
    @JsonProperty("WorkerType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-workertype")
    private CharSequence workerType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout")
    private Number timeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-glueversion
     * 
     */
    @JsonProperty("GlueVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-glueversion")
    private CharSequence glueVersion;
    /**
     * MLTransformTransformParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html
     * 
     */
    @JsonProperty("TransformParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html")
    private Property<MLTransformTransformParameters> transformParameters;
    /**
     * MLTransformInputRecordTables
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html
     * 
     */
    @JsonProperty("InputRecordTables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html")
    private Property<MLTransformInputRecordTables> inputRecordTables;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers
     * 
     */
    @JsonProperty("NumberOfWorkers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers")
    private Number numberOfWorkers;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxcapacity")
    private Number maxCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-role
     * 
     */
    @JsonIgnore
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-role
     * 
     */
    @JsonIgnore
    public void setRole(CharSequence role) {
        this.role = role;
    }

    public MLTransform withRole(CharSequence role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries
     * 
     */
    @JsonIgnore
    public Number getMaxRetries() {
        return maxRetries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries
     * 
     */
    @JsonIgnore
    public void setMaxRetries(Number maxRetries) {
        this.maxRetries = maxRetries;
    }

    public MLTransform withMaxRetries(Number maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-workertype
     * 
     */
    @JsonIgnore
    public CharSequence getWorkerType() {
        return workerType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-workertype
     * 
     */
    @JsonIgnore
    public void setWorkerType(CharSequence workerType) {
        this.workerType = workerType;
    }

    public MLTransform withWorkerType(CharSequence workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public MLTransform withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout
     * 
     */
    @JsonIgnore
    public Number getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout
     * 
     */
    @JsonIgnore
    public void setTimeout(Number timeout) {
        this.timeout = timeout;
    }

    public MLTransform withTimeout(Number timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-glueversion
     * 
     */
    @JsonIgnore
    public CharSequence getGlueVersion() {
        return glueVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-glueversion
     * 
     */
    @JsonIgnore
    public void setGlueVersion(CharSequence glueVersion) {
        this.glueVersion = glueVersion;
    }

    public MLTransform withGlueVersion(CharSequence glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * MLTransformTransformParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html
     * 
     */
    @JsonIgnore
    public Property<MLTransformTransformParameters> getTransformParameters() {
        return transformParameters;
    }

    /**
     * MLTransformTransformParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html
     * 
     */
    @JsonIgnore
    public void setTransformParameters(Property<MLTransformTransformParameters> transformParameters) {
        this.transformParameters = transformParameters;
    }

    public MLTransform withTransformParameters(Property<MLTransformTransformParameters> transformParameters) {
        this.transformParameters = transformParameters;
        return this;
    }

    /**
     * MLTransformInputRecordTables
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html
     * 
     */
    @JsonIgnore
    public Property<MLTransformInputRecordTables> getInputRecordTables() {
        return inputRecordTables;
    }

    /**
     * MLTransformInputRecordTables
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html
     * 
     */
    @JsonIgnore
    public void setInputRecordTables(Property<MLTransformInputRecordTables> inputRecordTables) {
        this.inputRecordTables = inputRecordTables;
    }

    public MLTransform withInputRecordTables(Property<MLTransformInputRecordTables> inputRecordTables) {
        this.inputRecordTables = inputRecordTables;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers
     * 
     */
    @JsonIgnore
    public Number getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers
     * 
     */
    @JsonIgnore
    public void setNumberOfWorkers(Number numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public MLTransform withNumberOfWorkers(Number numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public MLTransform withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public MLTransform withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxcapacity
     * 
     */
    @JsonIgnore
    public Number getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxcapacity
     * 
     */
    @JsonIgnore
    public void setMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public MLTransform withMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("role", role).append("maxRetries", maxRetries).append("workerType", workerType).append("description", description).append("timeout", timeout).append("glueVersion", glueVersion).append("transformParameters", transformParameters).append("inputRecordTables", inputRecordTables).append("numberOfWorkers", numberOfWorkers).append("tags", tags).append("name", name).append("maxCapacity", maxCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(workerType).append(numberOfWorkers).append(role).append(description).append(glueVersion).append(maxCapacity).append(timeout).append(transformParameters).append(tags).append(maxRetries).append(name).append(inputRecordTables).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MLTransform) == false) {
            return false;
        }
        MLTransform rhs = ((MLTransform) other);
        return new EqualsBuilder().append(workerType, rhs.workerType).append(numberOfWorkers, rhs.numberOfWorkers).append(role, rhs.role).append(description, rhs.description).append(glueVersion, rhs.glueVersion).append(maxCapacity, rhs.maxCapacity).append(timeout, rhs.timeout).append(transformParameters, rhs.transformParameters).append(tags, rhs.tags).append(maxRetries, rhs.maxRetries).append(name, rhs.name).append(inputRecordTables, rhs.inputRecordTables).isEquals();
    }

}
