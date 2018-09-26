
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LambdaConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CreateAuthChallenge",
    "PreAuthentication",
    "DefineAuthChallenge",
    "PreSignUp",
    "PostAuthentication",
    "PostConfirmation",
    "CustomMessage",
    "VerifyAuthChallengeResponse"
})
public class LambdaConfig {

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
    public CharSequence getCreateAuthChallenge() {
        return createAuthChallenge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge
     * 
     */
    public void setCreateAuthChallenge(CharSequence createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
    }

    public LambdaConfig withCreateAuthChallenge(CharSequence createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    public CharSequence getPreAuthentication() {
        return preAuthentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    public void setPreAuthentication(CharSequence preAuthentication) {
        this.preAuthentication = preAuthentication;
    }

    public LambdaConfig withPreAuthentication(CharSequence preAuthentication) {
        this.preAuthentication = preAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    public CharSequence getDefineAuthChallenge() {
        return defineAuthChallenge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    public void setDefineAuthChallenge(CharSequence defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
    }

    public LambdaConfig withDefineAuthChallenge(CharSequence defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    public CharSequence getPreSignUp() {
        return preSignUp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    public void setPreSignUp(CharSequence preSignUp) {
        this.preSignUp = preSignUp;
    }

    public LambdaConfig withPreSignUp(CharSequence preSignUp) {
        this.preSignUp = preSignUp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    public CharSequence getPostAuthentication() {
        return postAuthentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    public void setPostAuthentication(CharSequence postAuthentication) {
        this.postAuthentication = postAuthentication;
    }

    public LambdaConfig withPostAuthentication(CharSequence postAuthentication) {
        this.postAuthentication = postAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    public CharSequence getPostConfirmation() {
        return postConfirmation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    public void setPostConfirmation(CharSequence postConfirmation) {
        this.postConfirmation = postConfirmation;
    }

    public LambdaConfig withPostConfirmation(CharSequence postConfirmation) {
        this.postConfirmation = postConfirmation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    public CharSequence getCustomMessage() {
        return customMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    public void setCustomMessage(CharSequence customMessage) {
        this.customMessage = customMessage;
    }

    public LambdaConfig withCustomMessage(CharSequence customMessage) {
        this.customMessage = customMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    public CharSequence getVerifyAuthChallengeResponse() {
        return verifyAuthChallengeResponse;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    public void setVerifyAuthChallengeResponse(CharSequence verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    public LambdaConfig withVerifyAuthChallengeResponse(CharSequence verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("createAuthChallenge", createAuthChallenge).append("preAuthentication", preAuthentication).append("defineAuthChallenge", defineAuthChallenge).append("preSignUp", preSignUp).append("postAuthentication", postAuthentication).append("postConfirmation", postConfirmation).append("customMessage", customMessage).append("verifyAuthChallengeResponse", verifyAuthChallengeResponse).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(postAuthentication).append(createAuthChallenge).append(customMessage).append(verifyAuthChallengeResponse).append(postConfirmation).append(preSignUp).append(preAuthentication).append(defineAuthChallenge).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LambdaConfig) == false) {
            return false;
        }
        LambdaConfig rhs = ((LambdaConfig) other);
        return new EqualsBuilder().append(postAuthentication, rhs.postAuthentication).append(createAuthChallenge, rhs.createAuthChallenge).append(customMessage, rhs.customMessage).append(verifyAuthChallengeResponse, rhs.verifyAuthChallengeResponse).append(postConfirmation, rhs.postConfirmation).append(preSignUp, rhs.preSignUp).append(preAuthentication, rhs.preAuthentication).append(defineAuthChallenge, rhs.defineAuthChallenge).isEquals();
    }

}
