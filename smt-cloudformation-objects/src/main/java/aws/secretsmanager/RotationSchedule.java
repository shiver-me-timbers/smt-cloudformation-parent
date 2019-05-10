
package aws.secretsmanager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RotationSchedule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SecretId",
    "RotationLambdaARN",
    "RotationRules"
})
public class RotationSchedule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid
     * 
     */
    @JsonProperty("SecretId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid")
    private CharSequence secretId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationlambdaarn
     * 
     */
    @JsonProperty("RotationLambdaARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationlambdaarn")
    private CharSequence rotationLambdaARN;
    /**
     * RotationRules
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html
     * 
     */
    @JsonProperty("RotationRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html")
    private RotationRules rotationRules;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid
     * 
     */
    @JsonIgnore
    public CharSequence getSecretId() {
        return secretId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid
     * 
     */
    @JsonIgnore
    public void setSecretId(CharSequence secretId) {
        this.secretId = secretId;
    }

    public RotationSchedule withSecretId(CharSequence secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationlambdaarn
     * 
     */
    @JsonIgnore
    public CharSequence getRotationLambdaARN() {
        return rotationLambdaARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationlambdaarn
     * 
     */
    @JsonIgnore
    public void setRotationLambdaARN(CharSequence rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    public RotationSchedule withRotationLambdaARN(CharSequence rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
        return this;
    }

    /**
     * RotationRules
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html
     * 
     */
    @JsonIgnore
    public RotationRules getRotationRules() {
        return rotationRules;
    }

    /**
     * RotationRules
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html
     * 
     */
    @JsonIgnore
    public void setRotationRules(RotationRules rotationRules) {
        this.rotationRules = rotationRules;
    }

    public RotationSchedule withRotationRules(RotationRules rotationRules) {
        this.rotationRules = rotationRules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("secretId", secretId).append("rotationLambdaARN", rotationLambdaARN).append("rotationRules", rotationRules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rotationLambdaARN).append(secretId).append(rotationRules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RotationSchedule) == false) {
            return false;
        }
        RotationSchedule rhs = ((RotationSchedule) other);
        return new EqualsBuilder().append(rotationLambdaARN, rhs.rotationLambdaARN).append(secretId, rhs.secretId).append(rotationRules, rhs.rotationRules).isEquals();
    }

}
