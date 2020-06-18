
package shiver.me.timbers.aws.imagebuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ImageRecipeComponentConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ComponentArn"
})
public class ImageRecipeComponentConfiguration implements Property<ImageRecipeComponentConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-componentarn
     * 
     */
    @JsonProperty("ComponentArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-componentarn")
    private CharSequence componentArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-componentarn
     * 
     */
    @JsonIgnore
    public CharSequence getComponentArn() {
        return componentArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-componentarn
     * 
     */
    @JsonIgnore
    public void setComponentArn(CharSequence componentArn) {
        this.componentArn = componentArn;
    }

    public ImageRecipeComponentConfiguration withComponentArn(CharSequence componentArn) {
        this.componentArn = componentArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("componentArn", componentArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(componentArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageRecipeComponentConfiguration) == false) {
            return false;
        }
        ImageRecipeComponentConfiguration rhs = ((ImageRecipeComponentConfiguration) other);
        return new EqualsBuilder().append(componentArn, rhs.componentArn).isEquals();
    }

}
