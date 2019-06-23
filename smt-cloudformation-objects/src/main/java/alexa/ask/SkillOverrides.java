
package alexa.ask;

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
 * SkillOverrides
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Manifest"
})
public class SkillOverrides implements Property<SkillOverrides>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html#cfn-ask-skill-overrides-manifest
     * 
     */
    @JsonProperty("Manifest")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html#cfn-ask-skill-overrides-manifest")
    private Object manifest;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html#cfn-ask-skill-overrides-manifest
     * 
     */
    @JsonIgnore
    public Object getManifest() {
        return manifest;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html#cfn-ask-skill-overrides-manifest
     * 
     */
    @JsonIgnore
    public void setManifest(Object manifest) {
        this.manifest = manifest;
    }

    public SkillOverrides withManifest(Object manifest) {
        this.manifest = manifest;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("manifest", manifest).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(manifest).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SkillOverrides) == false) {
            return false;
        }
        SkillOverrides rhs = ((SkillOverrides) other);
        return new EqualsBuilder().append(manifest, rhs.manifest).isEquals();
    }

}
