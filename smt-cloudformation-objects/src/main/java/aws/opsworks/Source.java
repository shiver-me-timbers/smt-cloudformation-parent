
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Source
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Password",
    "Revision",
    "SshKey",
    "Type",
    "Url",
    "Username"
})
public class Source {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw")
    private CharSequence password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision
     * 
     */
    @JsonProperty("Revision")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision")
    private CharSequence revision;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey
     * 
     */
    @JsonProperty("SshKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey")
    private CharSequence sshKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url
     * 
     */
    @JsonProperty("Url")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url")
    private CharSequence url;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username")
    private CharSequence username;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw
     * 
     */
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw
     * 
     */
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public Source withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision
     * 
     */
    public CharSequence getRevision() {
        return revision;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision
     * 
     */
    public void setRevision(CharSequence revision) {
        this.revision = revision;
    }

    public Source withRevision(CharSequence revision) {
        this.revision = revision;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey
     * 
     */
    public CharSequence getSshKey() {
        return sshKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey
     * 
     */
    public void setSshKey(CharSequence sshKey) {
        this.sshKey = sshKey;
    }

    public Source withSshKey(CharSequence sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Source withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url
     * 
     */
    public CharSequence getUrl() {
        return url;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url
     * 
     */
    public void setUrl(CharSequence url) {
        this.url = url;
    }

    public Source withUrl(CharSequence url) {
        this.url = url;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username
     * 
     */
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username
     * 
     */
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public Source withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("password", password).append("revision", revision).append("sshKey", sshKey).append("type", type).append("url", url).append("username", username).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(password).append(sshKey).append(type).append(url).append(revision).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return new EqualsBuilder().append(password, rhs.password).append(sshKey, rhs.sshKey).append(type, rhs.type).append(url, rhs.url).append(revision, rhs.revision).append(username, rhs.username).isEquals();
    }

}
