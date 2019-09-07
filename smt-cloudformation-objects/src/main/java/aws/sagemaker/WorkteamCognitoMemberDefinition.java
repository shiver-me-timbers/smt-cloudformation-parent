
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
 * WorkteamCognitoMemberDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CognitoUserPool",
    "CognitoClientId",
    "CognitoUserGroup"
})
public class WorkteamCognitoMemberDefinition implements Property<WorkteamCognitoMemberDefinition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitouserpool
     * 
     */
    @JsonProperty("CognitoUserPool")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitouserpool")
    private CharSequence cognitoUserPool;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitoclientid
     * 
     */
    @JsonProperty("CognitoClientId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitoclientid")
    private CharSequence cognitoClientId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitousergroup
     * 
     */
    @JsonProperty("CognitoUserGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitousergroup")
    private CharSequence cognitoUserGroup;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitouserpool
     * 
     */
    @JsonIgnore
    public CharSequence getCognitoUserPool() {
        return cognitoUserPool;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitouserpool
     * 
     */
    @JsonIgnore
    public void setCognitoUserPool(CharSequence cognitoUserPool) {
        this.cognitoUserPool = cognitoUserPool;
    }

    public WorkteamCognitoMemberDefinition withCognitoUserPool(CharSequence cognitoUserPool) {
        this.cognitoUserPool = cognitoUserPool;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitoclientid
     * 
     */
    @JsonIgnore
    public CharSequence getCognitoClientId() {
        return cognitoClientId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitoclientid
     * 
     */
    @JsonIgnore
    public void setCognitoClientId(CharSequence cognitoClientId) {
        this.cognitoClientId = cognitoClientId;
    }

    public WorkteamCognitoMemberDefinition withCognitoClientId(CharSequence cognitoClientId) {
        this.cognitoClientId = cognitoClientId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitousergroup
     * 
     */
    @JsonIgnore
    public CharSequence getCognitoUserGroup() {
        return cognitoUserGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitousergroup
     * 
     */
    @JsonIgnore
    public void setCognitoUserGroup(CharSequence cognitoUserGroup) {
        this.cognitoUserGroup = cognitoUserGroup;
    }

    public WorkteamCognitoMemberDefinition withCognitoUserGroup(CharSequence cognitoUserGroup) {
        this.cognitoUserGroup = cognitoUserGroup;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cognitoUserPool", cognitoUserPool).append("cognitoClientId", cognitoClientId).append("cognitoUserGroup", cognitoUserGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cognitoUserPool).append(cognitoUserGroup).append(cognitoClientId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkteamCognitoMemberDefinition) == false) {
            return false;
        }
        WorkteamCognitoMemberDefinition rhs = ((WorkteamCognitoMemberDefinition) other);
        return new EqualsBuilder().append(cognitoUserPool, rhs.cognitoUserPool).append(cognitoUserGroup, rhs.cognitoUserGroup).append(cognitoClientId, rhs.cognitoClientId).isEquals();
    }

}
