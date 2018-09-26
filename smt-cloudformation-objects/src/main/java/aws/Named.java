
package aws;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Named
 * <p>
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name"
})
public class Named implements HasName
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonIgnore
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Named() {
    }

    /**
     * 
     * @param name
     */
    public Named(String name) {
        super();
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public Named withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Named) == false) {
            return false;
        }
        Named rhs = ((Named) other);
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }

}
