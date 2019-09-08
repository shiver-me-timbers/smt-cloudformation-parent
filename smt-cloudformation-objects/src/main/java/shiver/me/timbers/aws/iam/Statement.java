
package shiver.me.timbers.aws.iam;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Sid",
    "Effect",
    "Principal",
    "NotPrincipal",
    "Action",
    "NotAction",
    "Resource",
    "NotResource",
    "Condition"
})
public class Statement implements Property<Statement> , HasActions<Statement> , HasNotActions<Statement> , HasNotResources<Statement> , HasPrincipals<Statement> , HasResources<Statement>
{

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html
     * 
     */
    @JsonProperty("Sid")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html")
    private java.lang.CharSequence sid;
    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_effect.html
     * 
     */
    @JsonProperty("Effect")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_effect.html")
    private Property<Effect> effect;
    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html
     * 
     */
    @JsonProperty("Principal")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html")
    private Property<Principal> principal;
    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html
     * 
     */
    @JsonProperty("NotPrincipal")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html")
    private Property<Principal> notPrincipal;
    /**
     * Simple array of strings.
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("Simple array of strings.")
    private List<CharSequence> action = new ArrayList<CharSequence>();
    /**
     * Simple array of strings.
     * 
     */
    @JsonProperty("NotAction")
    @JsonPropertyDescription("Simple array of strings.")
    private List<CharSequence> notAction = new ArrayList<CharSequence>();
    /**
     * Simple array of strings.
     * 
     */
    @JsonProperty("Resource")
    @JsonPropertyDescription("Simple array of strings.")
    private List<CharSequence> resource = new ArrayList<CharSequence>();
    /**
     * Simple array of strings.
     * 
     */
    @JsonProperty("NotResource")
    @JsonPropertyDescription("Simple array of strings.")
    private List<CharSequence> notResource = new ArrayList<CharSequence>();
    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html")
    private Property<Condition> condition;

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html
     * 
     */
    @JsonIgnore
    public java.lang.CharSequence getSid() {
        return sid;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html
     * 
     */
    @JsonIgnore
    public void setSid(java.lang.CharSequence sid) {
        this.sid = sid;
    }

    public Statement withSid(java.lang.CharSequence sid) {
        this.sid = sid;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_effect.html
     * 
     */
    @JsonIgnore
    public Property<Effect> getEffect() {
        return effect;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_effect.html
     * 
     */
    @JsonIgnore
    public void setEffect(Property<Effect> effect) {
        this.effect = effect;
    }

    public Statement withEffect(Property<Effect> effect) {
        this.effect = effect;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html
     * 
     */
    @JsonIgnore
    public Property<Principal> getPrincipal() {
        return principal;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html
     * 
     */
    @JsonIgnore
    public void setPrincipal(Property<Principal> principal) {
        this.principal = principal;
    }

    public Statement withPrincipal(Property<Principal> principal) {
        this.principal = principal;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html
     * 
     */
    @JsonIgnore
    public Property<Principal> getNotPrincipal() {
        return notPrincipal;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html
     * 
     */
    @JsonIgnore
    public void setNotPrincipal(Property<Principal> notPrincipal) {
        this.notPrincipal = notPrincipal;
    }

    public Statement withNotPrincipal(Property<Principal> notPrincipal) {
        this.notPrincipal = notPrincipal;
        return this;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAction() {
        return action;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public void setAction(List<CharSequence> action) {
        this.action = action;
    }

    public Statement withAction(List<CharSequence> action) {
        this.action = action;
        return this;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public List<CharSequence> getNotAction() {
        return notAction;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public void setNotAction(List<CharSequence> notAction) {
        this.notAction = notAction;
    }

    public Statement withNotAction(List<CharSequence> notAction) {
        this.notAction = notAction;
        return this;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResource() {
        return resource;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public void setResource(List<CharSequence> resource) {
        this.resource = resource;
    }

    public Statement withResource(List<CharSequence> resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public List<CharSequence> getNotResource() {
        return notResource;
    }

    /**
     * Simple array of strings.
     * 
     */
    @JsonIgnore
    public void setNotResource(List<CharSequence> notResource) {
        this.notResource = notResource;
    }

    public Statement withNotResource(List<CharSequence> notResource) {
        this.notResource = notResource;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html
     * 
     */
    @JsonIgnore
    public Property<Condition> getCondition() {
        return condition;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html
     * 
     */
    @JsonIgnore
    public void setCondition(Property<Condition> condition) {
        this.condition = condition;
    }

    public Statement withCondition(Property<Condition> condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sid", sid).append("effect", effect).append("principal", principal).append("notPrincipal", notPrincipal).append("action", action).append("notAction", notAction).append("resource", resource).append("notResource", notResource).append("condition", condition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(principal).append(condition).append(notResource).append(resource).append(effect).append(notAction).append(action).append(notPrincipal).append(sid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statement) == false) {
            return false;
        }
        Statement rhs = ((Statement) other);
        return new EqualsBuilder().append(principal, rhs.principal).append(condition, rhs.condition).append(notResource, rhs.notResource).append(resource, rhs.resource).append(effect, rhs.effect).append(notAction, rhs.notAction).append(action, rhs.action).append(notPrincipal, rhs.notPrincipal).append(sid, rhs.sid).isEquals();
    }

}
