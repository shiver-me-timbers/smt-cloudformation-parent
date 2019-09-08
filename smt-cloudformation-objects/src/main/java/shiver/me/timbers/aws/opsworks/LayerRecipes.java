
package shiver.me.timbers.aws.opsworks;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * LayerRecipes
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Configure",
    "Deploy",
    "Setup",
    "Shutdown",
    "Undeploy"
})
public class LayerRecipes implements Property<LayerRecipes>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure
     * 
     */
    @JsonProperty("Configure")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure")
    private Set<CharSequence> configure = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy
     * 
     */
    @JsonProperty("Deploy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy")
    private Set<CharSequence> deploy = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup
     * 
     */
    @JsonProperty("Setup")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup")
    private Set<CharSequence> setup = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown
     * 
     */
    @JsonProperty("Shutdown")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown")
    private Set<CharSequence> shutdown = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy
     * 
     */
    @JsonProperty("Undeploy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy")
    private Set<CharSequence> undeploy = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getConfigure() {
        return configure;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure
     * 
     */
    @JsonIgnore
    public void setConfigure(Set<CharSequence> configure) {
        this.configure = configure;
    }

    public LayerRecipes withConfigure(Set<CharSequence> configure) {
        this.configure = configure;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getDeploy() {
        return deploy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy
     * 
     */
    @JsonIgnore
    public void setDeploy(Set<CharSequence> deploy) {
        this.deploy = deploy;
    }

    public LayerRecipes withDeploy(Set<CharSequence> deploy) {
        this.deploy = deploy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getSetup() {
        return setup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup
     * 
     */
    @JsonIgnore
    public void setSetup(Set<CharSequence> setup) {
        this.setup = setup;
    }

    public LayerRecipes withSetup(Set<CharSequence> setup) {
        this.setup = setup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getShutdown() {
        return shutdown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown
     * 
     */
    @JsonIgnore
    public void setShutdown(Set<CharSequence> shutdown) {
        this.shutdown = shutdown;
    }

    public LayerRecipes withShutdown(Set<CharSequence> shutdown) {
        this.shutdown = shutdown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getUndeploy() {
        return undeploy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy
     * 
     */
    @JsonIgnore
    public void setUndeploy(Set<CharSequence> undeploy) {
        this.undeploy = undeploy;
    }

    public LayerRecipes withUndeploy(Set<CharSequence> undeploy) {
        this.undeploy = undeploy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configure", configure).append("deploy", deploy).append("setup", setup).append("shutdown", shutdown).append("undeploy", undeploy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(setup).append(configure).append(shutdown).append(deploy).append(undeploy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LayerRecipes) == false) {
            return false;
        }
        LayerRecipes rhs = ((LayerRecipes) other);
        return new EqualsBuilder().append(setup, rhs.setup).append(configure, rhs.configure).append(shutdown, rhs.shutdown).append(deploy, rhs.deploy).append(undeploy, rhs.undeploy).isEquals();
    }

}
