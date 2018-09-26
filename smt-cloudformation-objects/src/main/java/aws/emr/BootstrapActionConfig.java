
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BootstrapActionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "ScriptBootstrapAction"
})
public class BootstrapActionConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name")
    private CharSequence name;
    /**
     * ScriptBootstrapActionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
     * 
     */
    @JsonProperty("ScriptBootstrapAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html")
    private ScriptBootstrapActionConfig scriptBootstrapAction;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public BootstrapActionConfig withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * ScriptBootstrapActionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
     * 
     */
    public ScriptBootstrapActionConfig getScriptBootstrapAction() {
        return scriptBootstrapAction;
    }

    /**
     * ScriptBootstrapActionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html
     * 
     */
    public void setScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
        this.scriptBootstrapAction = scriptBootstrapAction;
    }

    public BootstrapActionConfig withScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
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
        if ((other instanceof BootstrapActionConfig) == false) {
            return false;
        }
        BootstrapActionConfig rhs = ((BootstrapActionConfig) other);
        return new EqualsBuilder().append(name, rhs.name).append(scriptBootstrapAction, rhs.scriptBootstrapAction).isEquals();
    }

}
