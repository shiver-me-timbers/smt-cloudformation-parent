
package aws.appsync;

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
 * ResolverPipelineConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Functions"
})
public class ResolverPipelineConfig implements Property<ResolverPipelineConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html#cfn-appsync-resolver-pipelineconfig-functions
     * 
     */
    @JsonProperty("Functions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html#cfn-appsync-resolver-pipelineconfig-functions")
    private List<CharSequence> functions = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html#cfn-appsync-resolver-pipelineconfig-functions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getFunctions() {
        return functions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html#cfn-appsync-resolver-pipelineconfig-functions
     * 
     */
    @JsonIgnore
    public void setFunctions(List<CharSequence> functions) {
        this.functions = functions;
    }

    public ResolverPipelineConfig withFunctions(List<CharSequence> functions) {
        this.functions = functions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("functions", functions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(functions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResolverPipelineConfig) == false) {
            return false;
        }
        ResolverPipelineConfig rhs = ((ResolverPipelineConfig) other);
        return new EqualsBuilder().append(functions, rhs.functions).isEquals();
    }

}
