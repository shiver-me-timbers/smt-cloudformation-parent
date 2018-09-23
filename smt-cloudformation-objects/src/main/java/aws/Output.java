
package aws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Output
 * <p>
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Value",
    "Export"
})
public class Output {

    @JsonProperty("Description")
    private String description;
    @JsonProperty("Value")
    private String value;
    @JsonProperty("Export")
    private Export export;

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Output withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    public Output withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("Export")
    public Export getExport() {
        return export;
    }

    @JsonProperty("Export")
    public void setExport(Export export) {
        this.export = export;
    }

    public Output withExport(Export export) {
        this.export = export;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("value", value).append("export", export).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(value).append(export).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Output) == false) {
            return false;
        }
        Output rhs = ((Output) other);
        return new EqualsBuilder().append(description, rhs.description).append(value, rhs.value).append(export, rhs.export).isEquals();
    }

}
