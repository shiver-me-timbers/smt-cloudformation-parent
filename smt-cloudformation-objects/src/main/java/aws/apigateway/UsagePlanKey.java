
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * UsagePlanKey
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "KeyId",
    "KeyType",
    "UsagePlanId"
})
public class UsagePlanKey {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid
     * 
     */
    @JsonProperty("KeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid")
    private String keyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype
     * 
     */
    @JsonProperty("KeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype")
    private String keyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid
     * 
     */
    @JsonProperty("UsagePlanId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid")
    private String usagePlanId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid
     * 
     */
    @JsonProperty("KeyId")
    public String getKeyId() {
        return keyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid
     * 
     */
    @JsonProperty("KeyId")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public UsagePlanKey withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype
     * 
     */
    @JsonProperty("KeyType")
    public String getKeyType() {
        return keyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype
     * 
     */
    @JsonProperty("KeyType")
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public UsagePlanKey withKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid
     * 
     */
    @JsonProperty("UsagePlanId")
    public String getUsagePlanId() {
        return usagePlanId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid
     * 
     */
    @JsonProperty("UsagePlanId")
    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    public UsagePlanKey withUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("keyId", keyId).append("keyType", keyType).append("usagePlanId", usagePlanId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyId).append(keyType).append(usagePlanId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsagePlanKey) == false) {
            return false;
        }
        UsagePlanKey rhs = ((UsagePlanKey) other);
        return new EqualsBuilder().append(keyId, rhs.keyId).append(keyType, rhs.keyType).append(usagePlanId, rhs.usagePlanId).isEquals();
    }

}