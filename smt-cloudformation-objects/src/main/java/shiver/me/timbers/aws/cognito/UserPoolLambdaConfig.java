
package shiver.me.timbers.aws.cognito;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * UserPoolLambdaConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CreateAuthChallenge",
    "PreAuthentication",
    "DefineAuthChallenge",
    "PreSignUp",
    "PreTokenGeneration",
    "UserMigration",
    "PostAuthentication",
    "PostConfirmation",
    "CustomMessage",
    "VerifyAuthChallengeResponse"
})
public class UserPoolLambdaConfig implements Property<UserPoolLambdaConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge
     * 
     */
    @JsonProperty("CreateAuthChallenge")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge")
    private CharSequence createAuthChallenge;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    @JsonProperty("PreAuthentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication")
    private CharSequence preAuthentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    @JsonProperty("DefineAuthChallenge")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge")
    private CharSequence defineAuthChallenge;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    @JsonProperty("PreSignUp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup")
    private CharSequence preSignUp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration
     * 
     */
    @JsonProperty("PreTokenGeneration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration")
    private CharSequence preTokenGeneration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration
     * 
     */
    @JsonProperty("UserMigration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration")
    private CharSequence userMigration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    @JsonProperty("PostAuthentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication")
    private CharSequence postAuthentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    @JsonProperty("PostConfirmation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation")
    private CharSequence postConfirmation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    @JsonProperty("CustomMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage")
    private CharSequence customMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    @JsonProperty("VerifyAuthChallengeResponse")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse")
    private CharSequence verifyAuthChallengeResponse;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge
     * 
     */
    @JsonIgnore
    public CharSequence getCreateAuthChallenge() {
        return createAuthChallenge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge
     * 
     */
    @JsonIgnore
    public void setCreateAuthChallenge(CharSequence createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
    }

    public UserPoolLambdaConfig withCreateAuthChallenge(CharSequence createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    @JsonIgnore
    public CharSequence getPreAuthentication() {
        return preAuthentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    @JsonIgnore
    public void setPreAuthentication(CharSequence preAuthentication) {
        this.preAuthentication = preAuthentication;
    }

    public UserPoolLambdaConfig withPreAuthentication(CharSequence preAuthentication) {
        this.preAuthentication = preAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    @JsonIgnore
    public CharSequence getDefineAuthChallenge() {
        return defineAuthChallenge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    @JsonIgnore
    public void setDefineAuthChallenge(CharSequence defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
    }

    public UserPoolLambdaConfig withDefineAuthChallenge(CharSequence defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    @JsonIgnore
    public CharSequence getPreSignUp() {
        return preSignUp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    @JsonIgnore
    public void setPreSignUp(CharSequence preSignUp) {
        this.preSignUp = preSignUp;
    }

    public UserPoolLambdaConfig withPreSignUp(CharSequence preSignUp) {
        this.preSignUp = preSignUp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration
     * 
     */
    @JsonIgnore
    public CharSequence getPreTokenGeneration() {
        return preTokenGeneration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration
     * 
     */
    @JsonIgnore
    public void setPreTokenGeneration(CharSequence preTokenGeneration) {
        this.preTokenGeneration = preTokenGeneration;
    }

    public UserPoolLambdaConfig withPreTokenGeneration(CharSequence preTokenGeneration) {
        this.preTokenGeneration = preTokenGeneration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration
     * 
     */
    @JsonIgnore
    public CharSequence getUserMigration() {
        return userMigration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration
     * 
     */
    @JsonIgnore
    public void setUserMigration(CharSequence userMigration) {
        this.userMigration = userMigration;
    }

    public UserPoolLambdaConfig withUserMigration(CharSequence userMigration) {
        this.userMigration = userMigration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    @JsonIgnore
    public CharSequence getPostAuthentication() {
        return postAuthentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    @JsonIgnore
    public void setPostAuthentication(CharSequence postAuthentication) {
        this.postAuthentication = postAuthentication;
    }

    public UserPoolLambdaConfig withPostAuthentication(CharSequence postAuthentication) {
        this.postAuthentication = postAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    @JsonIgnore
    public CharSequence getPostConfirmation() {
        return postConfirmation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    @JsonIgnore
    public void setPostConfirmation(CharSequence postConfirmation) {
        this.postConfirmation = postConfirmation;
    }

    public UserPoolLambdaConfig withPostConfirmation(CharSequence postConfirmation) {
        this.postConfirmation = postConfirmation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    @JsonIgnore
    public CharSequence getCustomMessage() {
        return customMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    @JsonIgnore
    public void setCustomMessage(CharSequence customMessage) {
        this.customMessage = customMessage;
    }

    public UserPoolLambdaConfig withCustomMessage(CharSequence customMessage) {
        this.customMessage = customMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    @JsonIgnore
    public CharSequence getVerifyAuthChallengeResponse() {
        return verifyAuthChallengeResponse;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    @JsonIgnore
    public void setVerifyAuthChallengeResponse(CharSequence verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    public UserPoolLambdaConfig withVerifyAuthChallengeResponse(CharSequence verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("createAuthChallenge", createAuthChallenge).append("preAuthentication", preAuthentication).append("defineAuthChallenge", defineAuthChallenge).append("preSignUp", preSignUp).append("preTokenGeneration", preTokenGeneration).append("userMigration", userMigration).append("postAuthentication", postAuthentication).append("postConfirmation", postConfirmation).append("customMessage", customMessage).append("verifyAuthChallengeResponse", verifyAuthChallengeResponse).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(postAuthentication).append(userMigration).append(createAuthChallenge).append(preTokenGeneration).append(customMessage).append(verifyAuthChallengeResponse).append(postConfirmation).append(preSignUp).append(preAuthentication).append(defineAuthChallenge).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolLambdaConfig) == false) {
            return false;
        }
        UserPoolLambdaConfig rhs = ((UserPoolLambdaConfig) other);
        return new EqualsBuilder().append(postAuthentication, rhs.postAuthentication).append(userMigration, rhs.userMigration).append(createAuthChallenge, rhs.createAuthChallenge).append(preTokenGeneration, rhs.preTokenGeneration).append(customMessage, rhs.customMessage).append(verifyAuthChallengeResponse, rhs.verifyAuthChallengeResponse).append(postConfirmation, rhs.postConfirmation).append(preSignUp, rhs.preSignUp).append(preAuthentication, rhs.preAuthentication).append(defineAuthChallenge, rhs.defineAuthChallenge).isEquals();
    }

}
