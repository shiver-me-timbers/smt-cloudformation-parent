
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EnvironmentVariable
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Key",
    "Secure",
    "Value"
})
public class EnvironmentVariable {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key")
    private CharSequence key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure
     * 
     */
    @JsonProperty("Secure")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure")
    private Boolean secure;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value")
    private CharSequence value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key
     * 
     */
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key
     * 
     */
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public EnvironmentVariable withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure
     * 
     */
    public Boolean getSecure() {
        return secure;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure
     * 
     */
    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public EnvironmentVariable withSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public EnvironmentVariable withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("secure", secure).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secure).append(value).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvironmentVariable) == false) {
            return false;
        }
        EnvironmentVariable rhs = ((EnvironmentVariable) other);
        return new EqualsBuilder().append(secure, rhs.secure).append(value, rhs.value).append(key, rhs.key).isEquals();
    }

}
