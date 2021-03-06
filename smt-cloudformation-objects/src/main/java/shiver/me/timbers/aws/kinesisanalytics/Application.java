
package shiver.me.timbers.aws.kinesisanalytics;

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


/**
 * Application
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApplicationName",
    "Inputs",
    "ApplicationDescription",
    "ApplicationCode"
})
public class Application {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname")
    private CharSequence applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs
     * 
     */
    @JsonProperty("Inputs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs")
    private List<Property<ApplicationInput>> inputs = new ArrayList<Property<ApplicationInput>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription
     * 
     */
    @JsonProperty("ApplicationDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription")
    private CharSequence applicationDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode
     * 
     */
    @JsonProperty("ApplicationCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode")
    private CharSequence applicationCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname
     * 
     */
    @JsonIgnore
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public Application withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs
     * 
     */
    @JsonIgnore
    public List<Property<ApplicationInput>> getInputs() {
        return inputs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs
     * 
     */
    @JsonIgnore
    public void setInputs(List<Property<ApplicationInput>> inputs) {
        this.inputs = inputs;
    }

    public Application withInputs(List<Property<ApplicationInput>> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationDescription() {
        return applicationDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription
     * 
     */
    @JsonIgnore
    public void setApplicationDescription(CharSequence applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    public Application withApplicationDescription(CharSequence applicationDescription) {
        this.applicationDescription = applicationDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationCode() {
        return applicationCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode
     * 
     */
    @JsonIgnore
    public void setApplicationCode(CharSequence applicationCode) {
        this.applicationCode = applicationCode;
    }

    public Application withApplicationCode(CharSequence applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("inputs", inputs).append("applicationDescription", applicationDescription).append("applicationCode", applicationCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(applicationDescription).append(applicationCode).append(applicationName).append(inputs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Application) == false) {
            return false;
        }
        Application rhs = ((Application) other);
        return new EqualsBuilder().append(applicationDescription, rhs.applicationDescription).append(applicationCode, rhs.applicationCode).append(applicationName, rhs.applicationName).append(inputs, rhs.inputs).isEquals();
    }

}
