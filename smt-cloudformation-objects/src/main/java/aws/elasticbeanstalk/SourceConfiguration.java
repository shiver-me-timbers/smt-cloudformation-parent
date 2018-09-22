
package aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SourceConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationName",
    "TemplateName"
})
public class SourceConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname")
    private String applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename
     * 
     */
    @JsonProperty("TemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename")
    private String templateName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public SourceConfiguration withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename
     * 
     */
    @JsonProperty("TemplateName")
    public String getTemplateName() {
        return templateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename
     * 
     */
    @JsonProperty("TemplateName")
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public SourceConfiguration withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("templateName", templateName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(templateName).append(applicationName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceConfiguration) == false) {
            return false;
        }
        SourceConfiguration rhs = ((SourceConfiguration) other);
        return new EqualsBuilder().append(templateName, rhs.templateName).append(applicationName, rhs.applicationName).isEquals();
    }

}
