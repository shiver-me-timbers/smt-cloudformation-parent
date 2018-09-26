
package aws.iam;

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
 * InstanceProfile
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InstanceProfileName",
    "Path",
    "Roles"
})
public class InstanceProfile {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename
     * 
     */
    @JsonProperty("InstanceProfileName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename")
    private CharSequence instanceProfileName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path")
    private CharSequence path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles
     * 
     */
    @JsonProperty("Roles")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles")
    private List<CharSequence> roles = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename
     * 
     */
    public CharSequence getInstanceProfileName() {
        return instanceProfileName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename
     * 
     */
    public void setInstanceProfileName(CharSequence instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    public InstanceProfile withInstanceProfileName(CharSequence instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path
     * 
     */
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path
     * 
     */
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public InstanceProfile withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles
     * 
     */
    public List<CharSequence> getRoles() {
        return roles;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles
     * 
     */
    public void setRoles(List<CharSequence> roles) {
        this.roles = roles;
    }

    public InstanceProfile withRoles(List<CharSequence> roles) {
        this.roles = roles;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instanceProfileName", instanceProfileName).append("path", path).append("roles", roles).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(instanceProfileName).append(roles).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceProfile) == false) {
            return false;
        }
        InstanceProfile rhs = ((InstanceProfile) other);
        return new EqualsBuilder().append(path, rhs.path).append(instanceProfileName, rhs.instanceProfileName).append(roles, rhs.roles).isEquals();
    }

}
