
package aws.sagemaker;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * WorkteamMemberDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-memberdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CognitoMemberDefinition"
})
public class WorkteamMemberDefinition implements Property<WorkteamMemberDefinition>
{

    /**
     * WorkteamCognitoMemberDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html
     * 
     */
    @JsonProperty("CognitoMemberDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html")
    private Property<WorkteamCognitoMemberDefinition> cognitoMemberDefinition;

    /**
     * WorkteamCognitoMemberDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html
     * 
     */
    @JsonIgnore
    public Property<WorkteamCognitoMemberDefinition> getCognitoMemberDefinition() {
        return cognitoMemberDefinition;
    }

    /**
     * WorkteamCognitoMemberDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html
     * 
     */
    @JsonIgnore
    public void setCognitoMemberDefinition(Property<WorkteamCognitoMemberDefinition> cognitoMemberDefinition) {
        this.cognitoMemberDefinition = cognitoMemberDefinition;
    }

    public WorkteamMemberDefinition withCognitoMemberDefinition(Property<WorkteamCognitoMemberDefinition> cognitoMemberDefinition) {
        this.cognitoMemberDefinition = cognitoMemberDefinition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cognitoMemberDefinition", cognitoMemberDefinition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cognitoMemberDefinition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkteamMemberDefinition) == false) {
            return false;
        }
        WorkteamMemberDefinition rhs = ((WorkteamMemberDefinition) other);
        return new EqualsBuilder().append(cognitoMemberDefinition, rhs.cognitoMemberDefinition).isEquals();
    }

}
