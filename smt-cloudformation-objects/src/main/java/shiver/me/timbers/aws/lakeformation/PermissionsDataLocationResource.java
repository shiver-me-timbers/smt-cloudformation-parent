
package shiver.me.timbers.aws.lakeformation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * PermissionsDataLocationResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Resource"
})
public class PermissionsDataLocationResource implements Property<PermissionsDataLocationResource>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-s3resource
     * 
     */
    @JsonProperty("S3Resource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-s3resource")
    private CharSequence s3Resource;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-s3resource
     * 
     */
    @JsonIgnore
    public CharSequence getS3Resource() {
        return s3Resource;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-s3resource
     * 
     */
    @JsonIgnore
    public void setS3Resource(CharSequence s3Resource) {
        this.s3Resource = s3Resource;
    }

    public PermissionsDataLocationResource withS3Resource(CharSequence s3Resource) {
        this.s3Resource = s3Resource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Resource", s3Resource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Resource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PermissionsDataLocationResource) == false) {
            return false;
        }
        PermissionsDataLocationResource rhs = ((PermissionsDataLocationResource) other);
        return new EqualsBuilder().append(s3Resource, rhs.s3Resource).isEquals();
    }

}
