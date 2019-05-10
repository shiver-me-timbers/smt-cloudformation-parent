
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AwsIamConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SigningRegion",
    "SigningServiceName"
})
public class AwsIamConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingregion
     * 
     */
    @JsonProperty("SigningRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingregion")
    private CharSequence signingRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingservicename
     * 
     */
    @JsonProperty("SigningServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingservicename")
    private CharSequence signingServiceName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingregion
     * 
     */
    @JsonIgnore
    public CharSequence getSigningRegion() {
        return signingRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingregion
     * 
     */
    @JsonIgnore
    public void setSigningRegion(CharSequence signingRegion) {
        this.signingRegion = signingRegion;
    }

    public AwsIamConfig withSigningRegion(CharSequence signingRegion) {
        this.signingRegion = signingRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingservicename
     * 
     */
    @JsonIgnore
    public CharSequence getSigningServiceName() {
        return signingServiceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingservicename
     * 
     */
    @JsonIgnore
    public void setSigningServiceName(CharSequence signingServiceName) {
        this.signingServiceName = signingServiceName;
    }

    public AwsIamConfig withSigningServiceName(CharSequence signingServiceName) {
        this.signingServiceName = signingServiceName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("signingRegion", signingRegion).append("signingServiceName", signingServiceName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(signingRegion).append(signingServiceName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwsIamConfig) == false) {
            return false;
        }
        AwsIamConfig rhs = ((AwsIamConfig) other);
        return new EqualsBuilder().append(signingRegion, rhs.signingRegion).append(signingServiceName, rhs.signingServiceName).isEquals();
    }

}
