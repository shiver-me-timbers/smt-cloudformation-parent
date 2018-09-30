
package aws.servicediscovery;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PrivateDnsNamespace
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Vpc",
    "Name"
})
public class PrivateDnsNamespace {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc
     * 
     */
    @JsonProperty("Vpc")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc")
    private CharSequence vpc;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public PrivateDnsNamespace withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc
     * 
     */
    public CharSequence getVpc() {
        return vpc;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-vpc
     * 
     */
    public void setVpc(CharSequence vpc) {
        this.vpc = vpc;
    }

    public PrivateDnsNamespace withVpc(CharSequence vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html#cfn-servicediscovery-privatednsnamespace-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public PrivateDnsNamespace withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("vpc", vpc).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vpc).append(name).append(description).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrivateDnsNamespace) == false) {
            return false;
        }
        PrivateDnsNamespace rhs = ((PrivateDnsNamespace) other);
        return new EqualsBuilder().append(vpc, rhs.vpc).append(name, rhs.name).append(description, rhs.description).isEquals();
    }

}
