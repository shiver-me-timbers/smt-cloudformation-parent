
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RepositoryCredentials
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CredentialsParameter"
})
public class RepositoryCredentials {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter
     * 
     */
    @JsonProperty("CredentialsParameter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter")
    private CharSequence credentialsParameter;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter
     * 
     */
    public CharSequence getCredentialsParameter() {
        return credentialsParameter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter
     * 
     */
    public void setCredentialsParameter(CharSequence credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
    }

    public RepositoryCredentials withCredentialsParameter(CharSequence credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("credentialsParameter", credentialsParameter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(credentialsParameter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepositoryCredentials) == false) {
            return false;
        }
        RepositoryCredentials rhs = ((RepositoryCredentials) other);
        return new EqualsBuilder().append(credentialsParameter, rhs.credentialsParameter).isEquals();
    }

}
