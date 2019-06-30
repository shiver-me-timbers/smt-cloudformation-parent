
package aws.ec2;

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
 * LaunchTemplateCpuOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ThreadsPerCore",
    "CoreCount"
})
public class LaunchTemplateCpuOptions implements Property<LaunchTemplateCpuOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-threadspercore
     * 
     */
    @JsonProperty("ThreadsPerCore")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-threadspercore")
    private Number threadsPerCore;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-corecount
     * 
     */
    @JsonProperty("CoreCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-corecount")
    private Number coreCount;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-threadspercore
     * 
     */
    @JsonIgnore
    public Number getThreadsPerCore() {
        return threadsPerCore;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-threadspercore
     * 
     */
    @JsonIgnore
    public void setThreadsPerCore(Number threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
    }

    public LaunchTemplateCpuOptions withThreadsPerCore(Number threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-corecount
     * 
     */
    @JsonIgnore
    public Number getCoreCount() {
        return coreCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions-corecount
     * 
     */
    @JsonIgnore
    public void setCoreCount(Number coreCount) {
        this.coreCount = coreCount;
    }

    public LaunchTemplateCpuOptions withCoreCount(Number coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("threadsPerCore", threadsPerCore).append("coreCount", coreCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(coreCount).append(threadsPerCore).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateCpuOptions) == false) {
            return false;
        }
        LaunchTemplateCpuOptions rhs = ((LaunchTemplateCpuOptions) other);
        return new EqualsBuilder().append(coreCount, rhs.coreCount).append(threadsPerCore, rhs.threadsPerCore).isEquals();
    }

}
