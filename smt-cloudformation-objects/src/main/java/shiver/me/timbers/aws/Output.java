
package shiver.me.timbers.aws;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "Value",
    "Export"
})
public class Output
    extends Named
{

    @JsonProperty("Description")
    private String description;
    @JsonProperty("Value")
    private CharSequence value;
    @JsonProperty("Export")
    private Export export;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Output() {
    }

    /**
     * 
     * @param name
     */
    public Output(String name) {
        super(name);
    }

    @JsonIgnore
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    public Output withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonIgnore
    public CharSequence getValue() {
        return value;
    }

    @JsonIgnore
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public Output withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public Export getExport() {
        return export;
    }

    @JsonIgnore
    public void setExport(Export export) {
        this.export = export;
    }

    public Output withExport(Export export) {
        this.export = export;
        return this;
    }

    @Override
    public Output withName(String name) {
        super.withName(name);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("description", description).append("value", value).append("export", export).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(description).append(value).append(export).toHashCode();
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
        return new EqualsBuilder().appendSuper(super.equals(other)).append(description, rhs.description).append(value, rhs.value).append(export, rhs.export).isEquals();
    }

}
