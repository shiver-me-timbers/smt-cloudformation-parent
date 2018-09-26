
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * JobCommand
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ScriptLocation",
    "Name"
})
public class JobCommand {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-scriptlocation
     * 
     */
    @JsonProperty("ScriptLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-scriptlocation")
    private CharSequence scriptLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-scriptlocation
     * 
     */
    public CharSequence getScriptLocation() {
        return scriptLocation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-scriptlocation
     * 
     */
    public void setScriptLocation(CharSequence scriptLocation) {
        this.scriptLocation = scriptLocation;
    }

    public JobCommand withScriptLocation(CharSequence scriptLocation) {
        this.scriptLocation = scriptLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public JobCommand withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scriptLocation", scriptLocation).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(scriptLocation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobCommand) == false) {
            return false;
        }
        JobCommand rhs = ((JobCommand) other);
        return new EqualsBuilder().append(name, rhs.name).append(scriptLocation, rhs.scriptLocation).isEquals();
    }

}
