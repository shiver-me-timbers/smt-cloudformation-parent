
package aws.iam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

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
public class Statement implements HasActions<Statement> , HasNotActions<Statement> , HasNotResources<Statement> , HasPrincipals<Statement> , HasResources<Statement>
{

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html
     * 
     */
    @JsonProperty("Sid")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html")
    private java.lang.String sid;
    /**
     * Effect
     * <p>
     * 
     * 
     */
    @JsonProperty("Effect")
    private Effect effect;
    @JsonProperty("Principal")
    private Map<String, List<CharSequence>> principal;
    @JsonProperty("NotPrincipal")
    private Map<String, List<CharSequence>> notPrincipal;
    @JsonProperty("Action")
    private List<CharSequence> action = new ArrayList<CharSequence>();
    @JsonProperty("NotAction")
    private List<CharSequence> notAction = new ArrayList<CharSequence>();
    @JsonProperty("Resource")
    private List<CharSequence> resource = new ArrayList<CharSequence>();
    @JsonProperty("NotResource")
    private List<CharSequence> notResource = new ArrayList<CharSequence>();
    @JsonProperty("Condition")
    private Map<String, Map<String, List<CharSequence>>> condition;

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html
     * 
     */
    @JsonIgnore
    public java.lang.String getSid() {
        return sid;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html
     * 
     */
    @JsonIgnore
    public void setSid(java.lang.String sid) {
        this.sid = sid;
    }

    public Statement withSid(java.lang.String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Effect
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public Effect getEffect() {
        return effect;
    }

    /**
     * Effect
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public Statement withEffect(Effect effect) {
        this.effect = effect;
        return this;
    }

    @JsonIgnore
    public Map<String, List<CharSequence>> getPrincipal() {
        return principal;
    }

    @JsonIgnore
    public void setPrincipal(Map<String, List<CharSequence>> principal) {
        this.principal = principal;
    }

    public Statement withPrincipal(Map<String, List<CharSequence>> principal) {
        this.principal = principal;
        return this;
    }

    @JsonIgnore
    public Map<String, List<CharSequence>> getNotPrincipal() {
        return notPrincipal;
    }

    @JsonIgnore
    public void setNotPrincipal(Map<String, List<CharSequence>> notPrincipal) {
        this.notPrincipal = notPrincipal;
    }

    public Statement withNotPrincipal(Map<String, List<CharSequence>> notPrincipal) {
        this.notPrincipal = notPrincipal;
        return this;
    }

    @JsonIgnore
    public List<CharSequence> getAction() {
        return action;
    }

    @JsonIgnore
    public void setAction(List<CharSequence> action) {
        this.action = action;
    }

    public Statement withAction(List<CharSequence> action) {
        this.action = action;
        return this;
    }

    @JsonIgnore
    public List<CharSequence> getNotAction() {
        return notAction;
    }

    @JsonIgnore
    public void setNotAction(List<CharSequence> notAction) {
        this.notAction = notAction;
    }

    public Statement withNotAction(List<CharSequence> notAction) {
        this.notAction = notAction;
        return this;
    }

    @JsonIgnore
    public List<CharSequence> getResource() {
        return resource;
    }

    @JsonIgnore
    public void setResource(List<CharSequence> resource) {
        this.resource = resource;
    }

    public Statement withResource(List<CharSequence> resource) {
        this.resource = resource;
        return this;
    }

    @JsonIgnore
    public List<CharSequence> getNotResource() {
        return notResource;
    }

    @JsonIgnore
    public void setNotResource(List<CharSequence> notResource) {
        this.notResource = notResource;
    }

    public Statement withNotResource(List<CharSequence> notResource) {
        this.notResource = notResource;
        return this;
    }

    @JsonIgnore
    public Map<String, Map<String, List<CharSequence>>> getCondition() {
        return condition;
    }

    @JsonIgnore
    public void setCondition(Map<String, Map<String, List<CharSequence>>> condition) {
        this.condition = condition;
    }

    public Statement withCondition(Map<String, Map<String, List<CharSequence>>> condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public java.lang.String toString() {
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
