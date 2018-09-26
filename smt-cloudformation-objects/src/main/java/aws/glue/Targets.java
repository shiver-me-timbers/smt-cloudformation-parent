
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
 * Targets
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "S3Targets",
    "JdbcTargets"
})
public class Targets {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets
     * 
     */
    @JsonProperty("S3Targets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets")
    private List<S3Target> s3Targets = new ArrayList<S3Target>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets
     * 
     */
    @JsonProperty("JdbcTargets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets")
    private List<JdbcTarget> jdbcTargets = new ArrayList<JdbcTarget>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets
     * 
     */
    public List<S3Target> getS3Targets() {
        return s3Targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets
     * 
     */
    public void setS3Targets(List<S3Target> s3Targets) {
        this.s3Targets = s3Targets;
    }

    public Targets withS3Targets(List<S3Target> s3Targets) {
        this.s3Targets = s3Targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets
     * 
     */
    public List<JdbcTarget> getJdbcTargets() {
        return jdbcTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets
     * 
     */
    public void setJdbcTargets(List<JdbcTarget> jdbcTargets) {
        this.jdbcTargets = jdbcTargets;
    }

    public Targets withJdbcTargets(List<JdbcTarget> jdbcTargets) {
        this.jdbcTargets = jdbcTargets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Targets", s3Targets).append("jdbcTargets", jdbcTargets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Targets).append(jdbcTargets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Targets) == false) {
            return false;
        }
        Targets rhs = ((Targets) other);
        return new EqualsBuilder().append(s3Targets, rhs.s3Targets).append(jdbcTargets, rhs.jdbcTargets).isEquals();
    }

}
