
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
 * CoreDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Cores",
    "CoreDefinitionId"
})
public class CoreDefinitionVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores
     * 
     */
    @JsonProperty("Cores")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores")
    private List<Property<CoreDefinitionVersionCore>> cores = new ArrayList<Property<CoreDefinitionVersionCore>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid
     * 
     */
    @JsonProperty("CoreDefinitionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid")
    private CharSequence coreDefinitionId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores
     * 
     */
    @JsonIgnore
    public List<Property<CoreDefinitionVersionCore>> getCores() {
        return cores;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores
     * 
     */
    @JsonIgnore
    public void setCores(List<Property<CoreDefinitionVersionCore>> cores) {
        this.cores = cores;
    }

    public CoreDefinitionVersion withCores(List<Property<CoreDefinitionVersionCore>> cores) {
        this.cores = cores;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid
     * 
     */
    @JsonIgnore
    public CharSequence getCoreDefinitionId() {
        return coreDefinitionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid
     * 
     */
    @JsonIgnore
    public void setCoreDefinitionId(CharSequence coreDefinitionId) {
        this.coreDefinitionId = coreDefinitionId;
    }

    public CoreDefinitionVersion withCoreDefinitionId(CharSequence coreDefinitionId) {
        this.coreDefinitionId = coreDefinitionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cores", cores).append("coreDefinitionId", coreDefinitionId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(coreDefinitionId).append(cores).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoreDefinitionVersion) == false) {
            return false;
        }
        CoreDefinitionVersion rhs = ((CoreDefinitionVersion) other);
        return new EqualsBuilder().append(coreDefinitionId, rhs.coreDefinitionId).append(cores, rhs.cores).isEquals();
    }

}
