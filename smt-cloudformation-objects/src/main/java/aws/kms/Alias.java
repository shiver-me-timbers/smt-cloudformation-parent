
package aws.kms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Alias
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AliasName",
    "TargetKeyId"
})
public class Alias {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname
     * 
     */
    @JsonProperty("AliasName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname")
    private CharSequence aliasName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid
     * 
     */
    @JsonProperty("TargetKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid")
    private CharSequence targetKeyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname
     * 
     */
    public CharSequence getAliasName() {
        return aliasName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname
     * 
     */
    public void setAliasName(CharSequence aliasName) {
        this.aliasName = aliasName;
    }

    public Alias withAliasName(CharSequence aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid
     * 
     */
    public CharSequence getTargetKeyId() {
        return targetKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid
     * 
     */
    public void setTargetKeyId(CharSequence targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    public Alias withTargetKeyId(CharSequence targetKeyId) {
        this.targetKeyId = targetKeyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aliasName", aliasName).append("targetKeyId", targetKeyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aliasName).append(targetKeyId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alias) == false) {
            return false;
        }
        Alias rhs = ((Alias) other);
        return new EqualsBuilder().append(aliasName, rhs.aliasName).append(targetKeyId, rhs.targetKeyId).isEquals();
    }

}
