
package aws;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Parameter
 * <p>
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllowedPattern",
    "AllowedValues",
    "ConstraintDescription",
    "Default",
    "Description",
    "MaxLength",
    "MaxValue",
    "MinLength",
    "MinValue",
    "NoEcho",
    "Type"
})
public class Parameter
    extends Named
    implements HasReference
{

    @JsonProperty("AllowedPattern")
    private String allowedPattern;
    @JsonProperty("AllowedValues")
    private List<String> allowedValues = new ArrayList<String>();
    @JsonProperty("ConstraintDescription")
    private String constraintDescription;
    @JsonProperty("Default")
    private String _default;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("MaxLength")
    private Integer maxLength;
    @JsonProperty("MaxValue")
    private Integer maxValue;
    @JsonProperty("MinLength")
    private Integer minLength;
    @JsonProperty("MinValue")
    private Integer minValue;
    @JsonProperty("NoEcho")
    private Boolean noEcho;
    @JsonProperty("Type")
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parameter() {
    }

    /**
     * 
     * @param name
     */
    public Parameter(String name) {
        super(name);
    }

    public String getAllowedPattern() {
        return allowedPattern;
    }

    public void setAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    public Parameter withAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
        return this;
    }

    public List<String> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<String> allowedValues) {
        this.allowedValues = allowedValues;
    }

    public Parameter withAllowedValues(List<String> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    public String getConstraintDescription() {
        return constraintDescription;
    }

    public void setConstraintDescription(String constraintDescription) {
        this.constraintDescription = constraintDescription;
    }

    public Parameter withConstraintDescription(String constraintDescription) {
        this.constraintDescription = constraintDescription;
        return this;
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public Parameter withDefault(String _default) {
        this._default = _default;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Parameter withDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Parameter withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public Parameter withMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Parameter withMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public Parameter withMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    public Boolean getNoEcho() {
        return noEcho;
    }

    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }

    public Parameter withNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Parameter withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public Parameter withName(String name) {
        super.withName(name);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("allowedPattern", allowedPattern).append("allowedValues", allowedValues).append("constraintDescription", constraintDescription).append("_default", _default).append("description", description).append("maxLength", maxLength).append("maxValue", maxValue).append("minLength", minLength).append("minValue", minValue).append("noEcho", noEcho).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(allowedValues).append(_default).append(minValue).append(noEcho).append(maxValue).append(minLength).append(description).append(constraintDescription).append(type).append(allowedPattern).append(maxLength).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameter) == false) {
            return false;
        }
        Parameter rhs = ((Parameter) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(allowedValues, rhs.allowedValues).append(_default, rhs._default).append(minValue, rhs.minValue).append(noEcho, rhs.noEcho).append(maxValue, rhs.maxValue).append(minLength, rhs.minLength).append(description, rhs.description).append(constraintDescription, rhs.constraintDescription).append(type, rhs.type).append(allowedPattern, rhs.allowedPattern).append(maxLength, rhs.maxLength).isEquals();
    }

}
