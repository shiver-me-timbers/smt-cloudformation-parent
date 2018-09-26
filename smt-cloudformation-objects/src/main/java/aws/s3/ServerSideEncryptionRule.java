
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ServerSideEncryptionRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ServerSideEncryptionByDefault"
})
public class ServerSideEncryptionRule {

    /**
     * ServerSideEncryptionByDefault
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
     * 
     */
    @JsonProperty("ServerSideEncryptionByDefault")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html")
    private ServerSideEncryptionByDefault serverSideEncryptionByDefault;

    /**
     * ServerSideEncryptionByDefault
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
     * 
     */
    public ServerSideEncryptionByDefault getServerSideEncryptionByDefault() {
        return serverSideEncryptionByDefault;
    }

    /**
     * ServerSideEncryptionByDefault
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
     * 
     */
    public void setServerSideEncryptionByDefault(ServerSideEncryptionByDefault serverSideEncryptionByDefault) {
        this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
    }

    public ServerSideEncryptionRule withServerSideEncryptionByDefault(ServerSideEncryptionByDefault serverSideEncryptionByDefault) {
        this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serverSideEncryptionByDefault", serverSideEncryptionByDefault).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serverSideEncryptionByDefault).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServerSideEncryptionRule) == false) {
            return false;
        }
        ServerSideEncryptionRule rhs = ((ServerSideEncryptionRule) other);
        return new EqualsBuilder().append(serverSideEncryptionByDefault, rhs.serverSideEncryptionByDefault).isEquals();
    }

}
