
package aws.appstream;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * DirectoryConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OrganizationalUnitDistinguishedNames",
    "ServiceAccountCredentials",
    "DirectoryName"
})
public class DirectoryConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames
     * 
     */
    @JsonProperty("OrganizationalUnitDistinguishedNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames")
    private List<CharSequence> organizationalUnitDistinguishedNames = new ArrayList<CharSequence>();
    /**
     * ServiceAccountCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html
     * 
     */
    @JsonProperty("ServiceAccountCredentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html")
    private ServiceAccountCredentials serviceAccountCredentials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname
     * 
     */
    @JsonProperty("DirectoryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname")
    private CharSequence directoryName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames
     * 
     */
    @JsonIgnore
    public List<CharSequence> getOrganizationalUnitDistinguishedNames() {
        return organizationalUnitDistinguishedNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames
     * 
     */
    @JsonIgnore
    public void setOrganizationalUnitDistinguishedNames(List<CharSequence> organizationalUnitDistinguishedNames) {
        this.organizationalUnitDistinguishedNames = organizationalUnitDistinguishedNames;
    }

    public DirectoryConfig withOrganizationalUnitDistinguishedNames(List<CharSequence> organizationalUnitDistinguishedNames) {
        this.organizationalUnitDistinguishedNames = organizationalUnitDistinguishedNames;
        return this;
    }

    /**
     * ServiceAccountCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html
     * 
     */
    @JsonIgnore
    public ServiceAccountCredentials getServiceAccountCredentials() {
        return serviceAccountCredentials;
    }

    /**
     * ServiceAccountCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html
     * 
     */
    @JsonIgnore
    public void setServiceAccountCredentials(ServiceAccountCredentials serviceAccountCredentials) {
        this.serviceAccountCredentials = serviceAccountCredentials;
    }

    public DirectoryConfig withServiceAccountCredentials(ServiceAccountCredentials serviceAccountCredentials) {
        this.serviceAccountCredentials = serviceAccountCredentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname
     * 
     */
    @JsonIgnore
    public CharSequence getDirectoryName() {
        return directoryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname
     * 
     */
    @JsonIgnore
    public void setDirectoryName(CharSequence directoryName) {
        this.directoryName = directoryName;
    }

    public DirectoryConfig withDirectoryName(CharSequence directoryName) {
        this.directoryName = directoryName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("organizationalUnitDistinguishedNames", organizationalUnitDistinguishedNames).append("serviceAccountCredentials", serviceAccountCredentials).append("directoryName", directoryName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceAccountCredentials).append(organizationalUnitDistinguishedNames).append(directoryName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectoryConfig) == false) {
            return false;
        }
        DirectoryConfig rhs = ((DirectoryConfig) other);
        return new EqualsBuilder().append(serviceAccountCredentials, rhs.serviceAccountCredentials).append(organizationalUnitDistinguishedNames, rhs.organizationalUnitDistinguishedNames).append(directoryName, rhs.directoryName).isEquals();
    }

}
