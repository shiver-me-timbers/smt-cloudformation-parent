
package shiver.me.timbers.aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * StepHadoopJarStepConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Args",
    "Jar",
    "MainClass",
    "StepProperties"
})
public class StepHadoopJarStepConfig implements Property<StepHadoopJarStepConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args
     * 
     */
    @JsonProperty("Args")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args")
    private Set<CharSequence> args = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar
     * 
     */
    @JsonProperty("Jar")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar")
    private CharSequence jar;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass
     * 
     */
    @JsonProperty("MainClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass")
    private CharSequence mainClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties
     * 
     */
    @JsonProperty("StepProperties")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties")
    private Set<Property<StepKeyValue>> stepProperties = new LinkedHashSet<Property<StepKeyValue>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getArgs() {
        return args;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args
     * 
     */
    @JsonIgnore
    public void setArgs(Set<CharSequence> args) {
        this.args = args;
    }

    public StepHadoopJarStepConfig withArgs(Set<CharSequence> args) {
        this.args = args;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar
     * 
     */
    @JsonIgnore
    public CharSequence getJar() {
        return jar;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar
     * 
     */
    @JsonIgnore
    public void setJar(CharSequence jar) {
        this.jar = jar;
    }

    public StepHadoopJarStepConfig withJar(CharSequence jar) {
        this.jar = jar;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass
     * 
     */
    @JsonIgnore
    public CharSequence getMainClass() {
        return mainClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass
     * 
     */
    @JsonIgnore
    public void setMainClass(CharSequence mainClass) {
        this.mainClass = mainClass;
    }

    public StepHadoopJarStepConfig withMainClass(CharSequence mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties
     * 
     */
    @JsonIgnore
    public Set<Property<StepKeyValue>> getStepProperties() {
        return stepProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties
     * 
     */
    @JsonIgnore
    public void setStepProperties(Set<Property<StepKeyValue>> stepProperties) {
        this.stepProperties = stepProperties;
    }

    public StepHadoopJarStepConfig withStepProperties(Set<Property<StepKeyValue>> stepProperties) {
        this.stepProperties = stepProperties;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("args", args).append("jar", jar).append("mainClass", mainClass).append("stepProperties", stepProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(args).append(jar).append(stepProperties).append(mainClass).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepHadoopJarStepConfig) == false) {
            return false;
        }
        StepHadoopJarStepConfig rhs = ((StepHadoopJarStepConfig) other);
        return new EqualsBuilder().append(args, rhs.args).append(jar, rhs.jar).append(stepProperties, rhs.stepProperties).append(mainClass, rhs.mainClass).isEquals();
    }

}
