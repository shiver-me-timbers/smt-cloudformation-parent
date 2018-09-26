
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Column
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Comment",
    "Type",
    "Name"
})
public class Column {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment")
    private CharSequence comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment
     * 
     */
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment
     * 
     */
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public Column withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Column withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Column withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("comment", comment).append("type", type).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(comment).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Column) == false) {
            return false;
        }
        Column rhs = ((Column) other);
        return new EqualsBuilder().append(name, rhs.name).append(comment, rhs.comment).append(type, rhs.type).isEquals();
    }

}
