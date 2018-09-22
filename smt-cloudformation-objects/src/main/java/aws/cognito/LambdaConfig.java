
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
    private String createAuthChallenge;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    @JsonProperty("PreAuthentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication")
    private String preAuthentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    @JsonProperty("DefineAuthChallenge")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge")
    private String defineAuthChallenge;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    @JsonProperty("PreSignUp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup")
    private String preSignUp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    @JsonProperty("PostAuthentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication")
    private String postAuthentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    @JsonProperty("PostConfirmation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation")
    private String postConfirmation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    @JsonProperty("CustomMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage")
    private String customMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    @JsonProperty("VerifyAuthChallengeResponse")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse")
    private String verifyAuthChallengeResponse;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge
     * 
     */
    @JsonProperty("CreateAuthChallenge")
    public String getCreateAuthChallenge() {
        return createAuthChallenge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge
     * 
     */
    @JsonProperty("CreateAuthChallenge")
    public void setCreateAuthChallenge(String createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
    }

    public LambdaConfig withCreateAuthChallenge(String createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    @JsonProperty("PreAuthentication")
    public String getPreAuthentication() {
        return preAuthentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication
     * 
     */
    @JsonProperty("PreAuthentication")
    public void setPreAuthentication(String preAuthentication) {
        this.preAuthentication = preAuthentication;
    }

    public LambdaConfig withPreAuthentication(String preAuthentication) {
        this.preAuthentication = preAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    @JsonProperty("DefineAuthChallenge")
    public String getDefineAuthChallenge() {
        return defineAuthChallenge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge
     * 
     */
    @JsonProperty("DefineAuthChallenge")
    public void setDefineAuthChallenge(String defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
    }

    public LambdaConfig withDefineAuthChallenge(String defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    @JsonProperty("PreSignUp")
    public String getPreSignUp() {
        return preSignUp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup
     * 
     */
    @JsonProperty("PreSignUp")
    public void setPreSignUp(String preSignUp) {
        this.preSignUp = preSignUp;
    }

    public LambdaConfig withPreSignUp(String preSignUp) {
        this.preSignUp = preSignUp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    @JsonProperty("PostAuthentication")
    public String getPostAuthentication() {
        return postAuthentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication
     * 
     */
    @JsonProperty("PostAuthentication")
    public void setPostAuthentication(String postAuthentication) {
        this.postAuthentication = postAuthentication;
    }

    public LambdaConfig withPostAuthentication(String postAuthentication) {
        this.postAuthentication = postAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    @JsonProperty("PostConfirmation")
    public String getPostConfirmation() {
        return postConfirmation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation
     * 
     */
    @JsonProperty("PostConfirmation")
    public void setPostConfirmation(String postConfirmation) {
        this.postConfirmation = postConfirmation;
    }

    public LambdaConfig withPostConfirmation(String postConfirmation) {
        this.postConfirmation = postConfirmation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    @JsonProperty("CustomMessage")
    public String getCustomMessage() {
        return customMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage
     * 
     */
    @JsonProperty("CustomMessage")
    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public LambdaConfig withCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    @JsonProperty("VerifyAuthChallengeResponse")
    public String getVerifyAuthChallengeResponse() {
        return verifyAuthChallengeResponse;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse
     * 
     */
    @JsonProperty("VerifyAuthChallengeResponse")
    public void setVerifyAuthChallengeResponse(String verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    public LambdaConfig withVerifyAuthChallengeResponse(String verifyAuthChallengeResponse) {
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
