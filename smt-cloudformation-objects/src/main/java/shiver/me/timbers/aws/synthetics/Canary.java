
package shiver.me.timbers.aws.synthetics;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Canary
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Name",
    "Code",
    "ArtifactS3Location",
    "Schedule",
    "ExecutionRoleArn",
    "RuntimeVersion",
    "SuccessRetentionPeriod",
    "FailureRetentionPeriod",
    "Tags",
    "VPCConfig",
    "RunConfig",
    "StartCanaryAfterCreation"
})
public class Canary {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-name")
    private CharSequence name;
    /**
     * CanaryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html")
    private Property<CanaryCode> code;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location
     * 
     */
    @JsonProperty("ArtifactS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location")
    private CharSequence artifactS3Location;
    /**
     * CanarySchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html")
    private Property<CanarySchedule> schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn
     * 
     */
    @JsonProperty("ExecutionRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn")
    private CharSequence executionRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runtimeversion
     * 
     */
    @JsonProperty("RuntimeVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runtimeversion")
    private CharSequence runtimeVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod
     * 
     */
    @JsonProperty("SuccessRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod")
    private Number successRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod
     * 
     */
    @JsonProperty("FailureRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod")
    private Number failureRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * CanaryVPCConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html
     * 
     */
    @JsonProperty("VPCConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html")
    private Property<CanaryVPCConfig> vPCConfig;
    /**
     * CanaryRunConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html
     * 
     */
    @JsonProperty("RunConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html")
    private Property<CanaryRunConfig> runConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation
     * 
     */
    @JsonProperty("StartCanaryAfterCreation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation")
    private CharSequence startCanaryAfterCreation;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Canary withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * CanaryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html
     * 
     */
    @JsonIgnore
    public Property<CanaryCode> getCode() {
        return code;
    }

    /**
     * CanaryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html
     * 
     */
    @JsonIgnore
    public void setCode(Property<CanaryCode> code) {
        this.code = code;
    }

    public Canary withCode(Property<CanaryCode> code) {
        this.code = code;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location
     * 
     */
    @JsonIgnore
    public CharSequence getArtifactS3Location() {
        return artifactS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location
     * 
     */
    @JsonIgnore
    public void setArtifactS3Location(CharSequence artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
    }

    public Canary withArtifactS3Location(CharSequence artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
        return this;
    }

    /**
     * CanarySchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html
     * 
     */
    @JsonIgnore
    public Property<CanarySchedule> getSchedule() {
        return schedule;
    }

    /**
     * CanarySchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html
     * 
     */
    @JsonIgnore
    public void setSchedule(Property<CanarySchedule> schedule) {
        this.schedule = schedule;
    }

    public Canary withSchedule(Property<CanarySchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn
     * 
     */
    @JsonIgnore
    public void setExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    public Canary withExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runtimeversion
     * 
     */
    @JsonIgnore
    public CharSequence getRuntimeVersion() {
        return runtimeVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runtimeversion
     * 
     */
    @JsonIgnore
    public void setRuntimeVersion(CharSequence runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    public Canary withRuntimeVersion(CharSequence runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod
     * 
     */
    @JsonIgnore
    public Number getSuccessRetentionPeriod() {
        return successRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod
     * 
     */
    @JsonIgnore
    public void setSuccessRetentionPeriod(Number successRetentionPeriod) {
        this.successRetentionPeriod = successRetentionPeriod;
    }

    public Canary withSuccessRetentionPeriod(Number successRetentionPeriod) {
        this.successRetentionPeriod = successRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod
     * 
     */
    @JsonIgnore
    public Number getFailureRetentionPeriod() {
        return failureRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod
     * 
     */
    @JsonIgnore
    public void setFailureRetentionPeriod(Number failureRetentionPeriod) {
        this.failureRetentionPeriod = failureRetentionPeriod;
    }

    public Canary withFailureRetentionPeriod(Number failureRetentionPeriod) {
        this.failureRetentionPeriod = failureRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Canary withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * CanaryVPCConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html
     * 
     */
    @JsonIgnore
    public Property<CanaryVPCConfig> getVPCConfig() {
        return vPCConfig;
    }

    /**
     * CanaryVPCConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html
     * 
     */
    @JsonIgnore
    public void setVPCConfig(Property<CanaryVPCConfig> vPCConfig) {
        this.vPCConfig = vPCConfig;
    }

    public Canary withVPCConfig(Property<CanaryVPCConfig> vPCConfig) {
        this.vPCConfig = vPCConfig;
        return this;
    }

    /**
     * CanaryRunConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html
     * 
     */
    @JsonIgnore
    public Property<CanaryRunConfig> getRunConfig() {
        return runConfig;
    }

    /**
     * CanaryRunConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html
     * 
     */
    @JsonIgnore
    public void setRunConfig(Property<CanaryRunConfig> runConfig) {
        this.runConfig = runConfig;
    }

    public Canary withRunConfig(Property<CanaryRunConfig> runConfig) {
        this.runConfig = runConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation
     * 
     */
    @JsonIgnore
    public CharSequence getStartCanaryAfterCreation() {
        return startCanaryAfterCreation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation
     * 
     */
    @JsonIgnore
    public void setStartCanaryAfterCreation(CharSequence startCanaryAfterCreation) {
        this.startCanaryAfterCreation = startCanaryAfterCreation;
    }

    public Canary withStartCanaryAfterCreation(CharSequence startCanaryAfterCreation) {
        this.startCanaryAfterCreation = startCanaryAfterCreation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("code", code).append("artifactS3Location", artifactS3Location).append("schedule", schedule).append("executionRoleArn", executionRoleArn).append("runtimeVersion", runtimeVersion).append("successRetentionPeriod", successRetentionPeriod).append("failureRetentionPeriod", failureRetentionPeriod).append("tags", tags).append("vPCConfig", vPCConfig).append("runConfig", runConfig).append("startCanaryAfterCreation", startCanaryAfterCreation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(runtimeVersion).append(code).append(vPCConfig).append(failureRetentionPeriod).append(tags).append(successRetentionPeriod).append(startCanaryAfterCreation).append(artifactS3Location).append(schedule).append(executionRoleArn).append(name).append(runConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Canary) == false) {
            return false;
        }
        Canary rhs = ((Canary) other);
        return new EqualsBuilder().append(runtimeVersion, rhs.runtimeVersion).append(code, rhs.code).append(vPCConfig, rhs.vPCConfig).append(failureRetentionPeriod, rhs.failureRetentionPeriod).append(tags, rhs.tags).append(successRetentionPeriod, rhs.successRetentionPeriod).append(startCanaryAfterCreation, rhs.startCanaryAfterCreation).append(artifactS3Location, rhs.artifactS3Location).append(schedule, rhs.schedule).append(executionRoleArn, rhs.executionRoleArn).append(name, rhs.name).append(runConfig, rhs.runConfig).isEquals();
    }

}
