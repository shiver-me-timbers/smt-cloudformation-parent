
package aws.iam;

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


/**
 * Resource
 * <p>
 * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Version",
    "Id",
    "Statement"
})
public class PolicyDocument {

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html")
    private String version = "2012-10-17";
    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_id.html
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_id.html")
    private String id;
    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_statement.html
     * 
     */
    @JsonProperty("Statement")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_statement.html")
    private List<Statement> statement = new ArrayList<Statement>();

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html
     * 
     */
    @JsonIgnore
    public String getVersion() {
        return version;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html
     * 
     */
    @JsonIgnore
    public void setVersion(String version) {
        this.version = version;
    }

    public PolicyDocument withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_id.html
     * 
     */
    @JsonIgnore
    public String getId() {
        return id;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_id.html
     * 
     */
    @JsonIgnore
    public void setId(String id) {
        this.id = id;
    }

    public PolicyDocument withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_statement.html
     * 
     */
    @JsonIgnore
    public List<Statement> getStatement() {
        return statement;
    }

    /**
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_statement.html
     * 
     */
    @JsonIgnore
    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }

    public PolicyDocument withStatement(List<Statement> statement) {
        this.statement = statement;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("version", version).append("id", id).append("statement", statement).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statement).append(id).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolicyDocument) == false) {
            return false;
        }
        PolicyDocument rhs = ((PolicyDocument) other);
        return new EqualsBuilder().append(statement, rhs.statement).append(id, rhs.id).append(version, rhs.version).isEquals();
    }

}
