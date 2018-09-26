
package aws.sdb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Domain
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description"
})
public class Domain {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html#cfn-sdb-domain-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html#cfn-sdb-domain-description")
    private CharSequence description;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html#cfn-sdb-domain-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html#cfn-sdb-domain-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Domain withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return new EqualsBuilder().append(description, rhs.description).isEquals();
    }

}
