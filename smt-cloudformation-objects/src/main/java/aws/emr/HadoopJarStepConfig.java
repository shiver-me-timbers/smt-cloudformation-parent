
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HadoopJarStepConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Args",
    "Jar",
    "MainClass",
    "StepProperties"
})
public class HadoopJarStepConfig {

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
    private Set<KeyValue> stepProperties = new LinkedHashSet<KeyValue>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args
     * 
     */
    public Set<CharSequence> getArgs() {
        return args;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args
     * 
     */
    public void setArgs(Set<CharSequence> args) {
        this.args = args;
    }

    public HadoopJarStepConfig withArgs(Set<CharSequence> args) {
        this.args = args;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar
     * 
     */
    public CharSequence getJar() {
        return jar;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar
     * 
     */
    public void setJar(CharSequence jar) {
        this.jar = jar;
    }

    public HadoopJarStepConfig withJar(CharSequence jar) {
        this.jar = jar;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass
     * 
     */
    public CharSequence getMainClass() {
        return mainClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass
     * 
     */
    public void setMainClass(CharSequence mainClass) {
        this.mainClass = mainClass;
    }

    public HadoopJarStepConfig withMainClass(CharSequence mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties
     * 
     */
    public Set<KeyValue> getStepProperties() {
        return stepProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties
     * 
     */
    public void setStepProperties(Set<KeyValue> stepProperties) {
        this.stepProperties = stepProperties;
    }

    public HadoopJarStepConfig withStepProperties(Set<KeyValue> stepProperties) {
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
        if ((other instanceof HadoopJarStepConfig) == false) {
            return false;
        }
        HadoopJarStepConfig rhs = ((HadoopJarStepConfig) other);
        return new EqualsBuilder().append(args, rhs.args).append(jar, rhs.jar).append(stepProperties, rhs.stepProperties).append(mainClass, rhs.mainClass).isEquals();
    }

}
