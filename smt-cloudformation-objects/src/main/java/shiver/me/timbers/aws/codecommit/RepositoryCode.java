
package shiver.me.timbers.aws.codecommit;

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
 * RepositoryCode
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3"
})
public class RepositoryCode implements Property<RepositoryCode>
{

    /**
     * RepositoryS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html
     * 
     */
    @JsonProperty("S3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html")
    private Property<RepositoryS3> s3;

    /**
     * RepositoryS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html
     * 
     */
    @JsonIgnore
    public Property<RepositoryS3> getS3() {
        return s3;
    }

    /**
     * RepositoryS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-s3.html
     * 
     */
    @JsonIgnore
    public void setS3(Property<RepositoryS3> s3) {
        this.s3 = s3;
    }

    public RepositoryCode withS3(Property<RepositoryS3> s3) {
        this.s3 = s3;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3", s3).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepositoryCode) == false) {
            return false;
        }
        RepositoryCode rhs = ((RepositoryCode) other);
        return new EqualsBuilder().append(s3, rhs.s3).isEquals();
    }

}
