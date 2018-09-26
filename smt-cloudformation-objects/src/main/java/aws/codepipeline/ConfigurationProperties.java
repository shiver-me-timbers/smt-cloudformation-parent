
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Key",
    "Name",
    "Queryable",
    "Required",
    "Secret",
    "Type"
})
public class ConfigurationProperties {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key")
    private Boolean key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable
     * 
     */
    @JsonProperty("Queryable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable")
    private Boolean queryable;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required
     * 
     */
    @JsonProperty("Required")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required")
    private Boolean required;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret
     * 
     */
    @JsonProperty("Secret")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret")
    private Boolean secret;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ConfigurationProperties withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key
     * 
     */
    public Boolean getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key
     * 
     */
    public void setKey(Boolean key) {
        this.key = key;
    }

    public ConfigurationProperties withKey(Boolean key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ConfigurationProperties withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable
     * 
     */
    public Boolean getQueryable() {
        return queryable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable
     * 
     */
    public void setQueryable(Boolean queryable) {
        this.queryable = queryable;
    }

    public ConfigurationProperties withQueryable(Boolean queryable) {
        this.queryable = queryable;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required
     * 
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required
     * 
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    public ConfigurationProperties withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret
     * 
     */
    public Boolean getSecret() {
        return secret;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret
     * 
     */
    public void setSecret(Boolean secret) {
        this.secret = secret;
    }

    public ConfigurationProperties withSecret(Boolean secret) {
        this.secret = secret;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ConfigurationProperties withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("key", key).append("name", name).append("queryable", queryable).append("required", required).append("secret", secret).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(queryable).append(name).append(description).append(secret).append(type).append(key).append(required).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationProperties) == false) {
            return false;
        }
        ConfigurationProperties rhs = ((ConfigurationProperties) other);
        return new EqualsBuilder().append(queryable, rhs.queryable).append(name, rhs.name).append(description, rhs.description).append(secret, rhs.secret).append(type, rhs.type).append(key, rhs.key).append(required, rhs.required).isEquals();
    }

}
