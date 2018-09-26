
package aws.batch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Ulimit
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SoftLimit",
    "HardLimit",
    "Name"
})
public class Ulimit {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit
     * 
     */
    @JsonProperty("SoftLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit")
    private Integer softLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit
     * 
     */
    @JsonProperty("HardLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit")
    private Integer hardLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit
     * 
     */
    public Integer getSoftLimit() {
        return softLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit
     * 
     */
    public void setSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
    }

    public Ulimit withSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit
     * 
     */
    public Integer getHardLimit() {
        return hardLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit
     * 
     */
    public void setHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
    }

    public Ulimit withHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Ulimit withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("softLimit", softLimit).append("hardLimit", hardLimit).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(hardLimit).append(softLimit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ulimit) == false) {
            return false;
        }
        Ulimit rhs = ((Ulimit) other);
        return new EqualsBuilder().append(name, rhs.name).append(hardLimit, rhs.hardLimit).append(softLimit, rhs.softLimit).isEquals();
    }

}
