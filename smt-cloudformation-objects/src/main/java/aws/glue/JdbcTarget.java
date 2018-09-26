
package aws.glue;

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
 * JdbcTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ConnectionName",
    "Path",
    "Exclusions"
})
public class JdbcTarget {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname
     * 
     */
    @JsonProperty("ConnectionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname")
    private CharSequence connectionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path")
    private CharSequence path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions
     * 
     */
    @JsonProperty("Exclusions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions")
    private List<CharSequence> exclusions = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname
     * 
     */
    public CharSequence getConnectionName() {
        return connectionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname
     * 
     */
    public void setConnectionName(CharSequence connectionName) {
        this.connectionName = connectionName;
    }

    public JdbcTarget withConnectionName(CharSequence connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path
     * 
     */
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path
     * 
     */
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public JdbcTarget withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions
     * 
     */
    public List<CharSequence> getExclusions() {
        return exclusions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions
     * 
     */
    public void setExclusions(List<CharSequence> exclusions) {
        this.exclusions = exclusions;
    }

    public JdbcTarget withExclusions(List<CharSequence> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connectionName", connectionName).append("path", path).append("exclusions", exclusions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(exclusions).append(connectionName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JdbcTarget) == false) {
            return false;
        }
        JdbcTarget rhs = ((JdbcTarget) other);
        return new EqualsBuilder().append(path, rhs.path).append(exclusions, rhs.exclusions).append(connectionName, rhs.connectionName).isEquals();
    }

}
