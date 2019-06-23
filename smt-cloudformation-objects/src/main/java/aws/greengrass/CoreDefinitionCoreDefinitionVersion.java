
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
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
 * CoreDefinitionCoreDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Cores"
})
public class CoreDefinitionCoreDefinitionVersion implements Property<CoreDefinitionCoreDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html#cfn-greengrass-coredefinition-coredefinitionversion-cores
     * 
     */
    @JsonProperty("Cores")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html#cfn-greengrass-coredefinition-coredefinitionversion-cores")
    private List<Property<CoreDefinitionCore>> cores = new ArrayList<Property<CoreDefinitionCore>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html#cfn-greengrass-coredefinition-coredefinitionversion-cores
     * 
     */
    @JsonIgnore
    public List<Property<CoreDefinitionCore>> getCores() {
        return cores;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html#cfn-greengrass-coredefinition-coredefinitionversion-cores
     * 
     */
    @JsonIgnore
    public void setCores(List<Property<CoreDefinitionCore>> cores) {
        this.cores = cores;
    }

    public CoreDefinitionCoreDefinitionVersion withCores(List<Property<CoreDefinitionCore>> cores) {
        this.cores = cores;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cores", cores).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cores).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoreDefinitionCoreDefinitionVersion) == false) {
            return false;
        }
        CoreDefinitionCoreDefinitionVersion rhs = ((CoreDefinitionCoreDefinitionVersion) other);
        return new EqualsBuilder().append(cores, rhs.cores).isEquals();
    }

}
