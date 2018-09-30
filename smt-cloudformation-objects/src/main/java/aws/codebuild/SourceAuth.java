
package aws.codebuild;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SourceAuth
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Resource"
})
public class SourceAuth {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource
     * 
     */
    @JsonProperty("Resource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource")
    private CharSequence resource;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public SourceAuth withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource
     * 
     */
    public CharSequence getResource() {
        return resource;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource
     * 
     */
    public void setResource(CharSequence resource) {
        this.resource = resource;
    }

    public SourceAuth withResource(CharSequence resource) {
        this.resource = resource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("resource", resource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(resource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceAuth) == false) {
            return false;
        }
        SourceAuth rhs = ((SourceAuth) other);
        return new EqualsBuilder().append(type, rhs.type).append(resource, rhs.resource).isEquals();
    }

}
