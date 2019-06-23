
package aws.emr;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ClusterBootstrapActionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Name",
    "ScriptBootstrapAction"
})
public class ClusterBootstrapActionConfig implements Property<ClusterBootstrapActionConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name")
    private CharSequence name;
    /**
     * ClusterScriptBootstrapActionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
     * 
     */
    @JsonProperty("ScriptBootstrapAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html")
    private Property<ClusterScriptBootstrapActionConfig> scriptBootstrapAction;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ClusterBootstrapActionConfig withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * ClusterScriptBootstrapActionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
     * 
     */
    @JsonIgnore
    public Property<ClusterScriptBootstrapActionConfig> getScriptBootstrapAction() {
        return scriptBootstrapAction;
    }

    /**
     * ClusterScriptBootstrapActionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
     * 
     */
    @JsonIgnore
    public void setScriptBootstrapAction(Property<ClusterScriptBootstrapActionConfig> scriptBootstrapAction) {
        this.scriptBootstrapAction = scriptBootstrapAction;
    }

    public ClusterBootstrapActionConfig withScriptBootstrapAction(Property<ClusterScriptBootstrapActionConfig> scriptBootstrapAction) {
        this.scriptBootstrapAction = scriptBootstrapAction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("scriptBootstrapAction", scriptBootstrapAction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(scriptBootstrapAction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterBootstrapActionConfig) == false) {
            return false;
        }
        ClusterBootstrapActionConfig rhs = ((ClusterBootstrapActionConfig) other);
        return new EqualsBuilder().append(name, rhs.name).append(scriptBootstrapAction, rhs.scriptBootstrapAction).isEquals();
    }

}
