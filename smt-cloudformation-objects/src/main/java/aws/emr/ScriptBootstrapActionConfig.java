
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScriptBootstrapActionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Args",
    "Path"
})
public class ScriptBootstrapActionConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args
     * 
     */
    @JsonProperty("Args")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args")
    private Set<CharSequence> args = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path")
    private CharSequence path;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args
     * 
     */
    public Set<CharSequence> getArgs() {
        return args;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args
     * 
     */
    public void setArgs(Set<CharSequence> args) {
        this.args = args;
    }

    public ScriptBootstrapActionConfig withArgs(Set<CharSequence> args) {
        this.args = args;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path
     * 
     */
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path
     * 
     */
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public ScriptBootstrapActionConfig withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("args", args).append("path", path).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(args).append(path).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScriptBootstrapActionConfig) == false) {
            return false;
        }
        ScriptBootstrapActionConfig rhs = ((ScriptBootstrapActionConfig) other);
        return new EqualsBuilder().append(args, rhs.args).append(path, rhs.path).isEquals();
    }

}
