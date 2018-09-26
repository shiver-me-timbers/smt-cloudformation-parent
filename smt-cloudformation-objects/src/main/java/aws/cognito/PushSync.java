
package aws.cognito;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PushSync
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationArns",
    "RoleArn"
})
public class PushSync {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns
     * 
     */
    @JsonProperty("ApplicationArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns")
    private List<CharSequence> applicationArns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns
     * 
     */
    public List<CharSequence> getApplicationArns() {
        return applicationArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns
     * 
     */
    public void setApplicationArns(List<CharSequence> applicationArns) {
        this.applicationArns = applicationArns;
    }

    public PushSync withApplicationArns(List<CharSequence> applicationArns) {
        this.applicationArns = applicationArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public PushSync withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationArns", applicationArns).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(applicationArns).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PushSync) == false) {
            return false;
        }
        PushSync rhs = ((PushSync) other);
        return new EqualsBuilder().append(applicationArns, rhs.applicationArns).append(roleArn, rhs.roleArn).isEquals();
    }

}
