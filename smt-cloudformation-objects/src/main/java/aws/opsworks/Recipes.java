
package aws.opsworks;

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
 * Recipes
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Configure",
    "Deploy",
    "Setup",
    "Shutdown",
    "Undeploy"
})
public class Recipes {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure
     * 
     */
    @JsonProperty("Configure")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure")
    private Set<String> configure = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy
     * 
     */
    @JsonProperty("Deploy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy")
    private Set<String> deploy = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup
     * 
     */
    @JsonProperty("Setup")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup")
    private Set<String> setup = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown
     * 
     */
    @JsonProperty("Shutdown")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown")
    private Set<String> shutdown = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy
     * 
     */
    @JsonProperty("Undeploy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy")
    private Set<String> undeploy = new LinkedHashSet<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure
     * 
     */
    @JsonProperty("Configure")
    public Set<String> getConfigure() {
        return configure;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure
     * 
     */
    @JsonProperty("Configure")
    public void setConfigure(Set<String> configure) {
        this.configure = configure;
    }

    public Recipes withConfigure(Set<String> configure) {
        this.configure = configure;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy
     * 
     */
    @JsonProperty("Deploy")
    public Set<String> getDeploy() {
        return deploy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy
     * 
     */
    @JsonProperty("Deploy")
    public void setDeploy(Set<String> deploy) {
        this.deploy = deploy;
    }

    public Recipes withDeploy(Set<String> deploy) {
        this.deploy = deploy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup
     * 
     */
    @JsonProperty("Setup")
    public Set<String> getSetup() {
        return setup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup
     * 
     */
    @JsonProperty("Setup")
    public void setSetup(Set<String> setup) {
        this.setup = setup;
    }

    public Recipes withSetup(Set<String> setup) {
        this.setup = setup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown
     * 
     */
    @JsonProperty("Shutdown")
    public Set<String> getShutdown() {
        return shutdown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown
     * 
     */
    @JsonProperty("Shutdown")
    public void setShutdown(Set<String> shutdown) {
        this.shutdown = shutdown;
    }

    public Recipes withShutdown(Set<String> shutdown) {
        this.shutdown = shutdown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy
     * 
     */
    @JsonProperty("Undeploy")
    public Set<String> getUndeploy() {
        return undeploy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy
     * 
     */
    @JsonProperty("Undeploy")
    public void setUndeploy(Set<String> undeploy) {
        this.undeploy = undeploy;
    }

    public Recipes withUndeploy(Set<String> undeploy) {
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
        if ((other instanceof Recipes) == false) {
            return false;
        }
        Recipes rhs = ((Recipes) other);
        return new EqualsBuilder().append(setup, rhs.setup).append(configure, rhs.configure).append(shutdown, rhs.shutdown).append(deploy, rhs.deploy).append(undeploy, rhs.undeploy).isEquals();
    }

}