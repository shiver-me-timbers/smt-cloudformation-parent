
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SchemaChangePolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UpdateBehavior",
    "DeleteBehavior"
})
public class SchemaChangePolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior
     * 
     */
    @JsonProperty("UpdateBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior")
    private String updateBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior
     * 
     */
    @JsonProperty("DeleteBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior")
    private String deleteBehavior;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior
     * 
     */
    @JsonProperty("UpdateBehavior")
    public String getUpdateBehavior() {
        return updateBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior
     * 
     */
    @JsonProperty("UpdateBehavior")
    public void setUpdateBehavior(String updateBehavior) {
        this.updateBehavior = updateBehavior;
    }

    public SchemaChangePolicy withUpdateBehavior(String updateBehavior) {
        this.updateBehavior = updateBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior
     * 
     */
    @JsonProperty("DeleteBehavior")
    public String getDeleteBehavior() {
        return deleteBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior
     * 
     */
    @JsonProperty("DeleteBehavior")
    public void setDeleteBehavior(String deleteBehavior) {
        this.deleteBehavior = deleteBehavior;
    }

    public SchemaChangePolicy withDeleteBehavior(String deleteBehavior) {
        this.deleteBehavior = deleteBehavior;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("updateBehavior", updateBehavior).append("deleteBehavior", deleteBehavior).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deleteBehavior).append(updateBehavior).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaChangePolicy) == false) {
            return false;
        }
        SchemaChangePolicy rhs = ((SchemaChangePolicy) other);
        return new EqualsBuilder().append(deleteBehavior, rhs.deleteBehavior).append(updateBehavior, rhs.updateBehavior).isEquals();
    }

}