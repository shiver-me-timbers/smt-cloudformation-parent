
package aws.apigateway;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VpcLink
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "TargetArns",
    "Name"
})
public class VpcLink {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns
     * 
     */
    @JsonProperty("TargetArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns")
    private List<CharSequence> targetArns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public VpcLink withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns
     * 
     */
    public List<CharSequence> getTargetArns() {
        return targetArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns
     * 
     */
    public void setTargetArns(List<CharSequence> targetArns) {
        this.targetArns = targetArns;
    }

    public VpcLink withTargetArns(List<CharSequence> targetArns) {
        this.targetArns = targetArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public VpcLink withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("targetArns", targetArns).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(targetArns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VpcLink) == false) {
            return false;
        }
        VpcLink rhs = ((VpcLink) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(targetArns, rhs.targetArns).isEquals();
    }

}
