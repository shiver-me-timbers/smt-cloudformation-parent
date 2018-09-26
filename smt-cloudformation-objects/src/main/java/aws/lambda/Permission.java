
package aws.lambda;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Permission
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Action",
    "EventSourceToken",
    "FunctionName",
    "Principal",
    "SourceAccount",
    "SourceArn"
})
public class Permission {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action")
    private CharSequence action;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken
     * 
     */
    @JsonProperty("EventSourceToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken")
    private CharSequence eventSourceToken;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname
     * 
     */
    @JsonProperty("FunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname")
    private CharSequence functionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal
     * 
     */
    @JsonProperty("Principal")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal")
    private CharSequence principal;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount
     * 
     */
    @JsonProperty("SourceAccount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount")
    private CharSequence sourceAccount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn
     * 
     */
    @JsonProperty("SourceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn")
    private CharSequence sourceArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action
     * 
     */
    public CharSequence getAction() {
        return action;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action
     * 
     */
    public void setAction(CharSequence action) {
        this.action = action;
    }

    public Permission withAction(CharSequence action) {
        this.action = action;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken
     * 
     */
    public CharSequence getEventSourceToken() {
        return eventSourceToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken
     * 
     */
    public void setEventSourceToken(CharSequence eventSourceToken) {
        this.eventSourceToken = eventSourceToken;
    }

    public Permission withEventSourceToken(CharSequence eventSourceToken) {
        this.eventSourceToken = eventSourceToken;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname
     * 
     */
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname
     * 
     */
    public void setFunctionName(CharSequence functionName) {
        this.functionName = functionName;
    }

    public Permission withFunctionName(CharSequence functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal
     * 
     */
    public CharSequence getPrincipal() {
        return principal;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal
     * 
     */
    public void setPrincipal(CharSequence principal) {
        this.principal = principal;
    }

    public Permission withPrincipal(CharSequence principal) {
        this.principal = principal;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount
     * 
     */
    public CharSequence getSourceAccount() {
        return sourceAccount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount
     * 
     */
    public void setSourceAccount(CharSequence sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Permission withSourceAccount(CharSequence sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn
     * 
     */
    public CharSequence getSourceArn() {
        return sourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn
     * 
     */
    public void setSourceArn(CharSequence sourceArn) {
        this.sourceArn = sourceArn;
    }

    public Permission withSourceArn(CharSequence sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).append("eventSourceToken", eventSourceToken).append("functionName", functionName).append("principal", principal).append("sourceAccount", sourceAccount).append("sourceArn", sourceArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(principal).append(sourceArn).append(sourceAccount).append(functionName).append(eventSourceToken).append(action).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permission) == false) {
            return false;
        }
        Permission rhs = ((Permission) other);
        return new EqualsBuilder().append(principal, rhs.principal).append(sourceArn, rhs.sourceArn).append(sourceAccount, rhs.sourceAccount).append(functionName, rhs.functionName).append(eventSourceToken, rhs.eventSourceToken).append(action, rhs.action).isEquals();
    }

}
