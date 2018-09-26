
package aws.ssm;

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
 * PatchSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Products",
    "Configuration",
    "Name"
})
public class PatchSource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products
     * 
     */
    @JsonProperty("Products")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products")
    private List<CharSequence> products = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration
     * 
     */
    @JsonProperty("Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration")
    private CharSequence configuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products
     * 
     */
    public List<CharSequence> getProducts() {
        return products;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products
     * 
     */
    public void setProducts(List<CharSequence> products) {
        this.products = products;
    }

    public PatchSource withProducts(List<CharSequence> products) {
        this.products = products;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration
     * 
     */
    public CharSequence getConfiguration() {
        return configuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration
     * 
     */
    public void setConfiguration(CharSequence configuration) {
        this.configuration = configuration;
    }

    public PatchSource withConfiguration(CharSequence configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public PatchSource withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("products", products).append("configuration", configuration).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(configuration).append(products).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatchSource) == false) {
            return false;
        }
        PatchSource rhs = ((PatchSource) other);
        return new EqualsBuilder().append(name, rhs.name).append(configuration, rhs.configuration).append(products, rhs.products).isEquals();
    }

}
