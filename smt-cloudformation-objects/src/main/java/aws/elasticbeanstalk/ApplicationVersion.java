
package aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationName",
    "Description",
    "SourceBundle"
})
public class ApplicationVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-applicationname")
    private CharSequence applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-description")
    private CharSequence description;
    /**
     * SourceBundle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html
     * 
     */
    @JsonProperty("SourceBundle")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html")
    private SourceBundle sourceBundle;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-applicationname
     * 
     */
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-applicationname
     * 
     */
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public ApplicationVersion withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ApplicationVersion withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * SourceBundle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html
     * 
     */
    public SourceBundle getSourceBundle() {
        return sourceBundle;
    }

    /**
     * SourceBundle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html
     * 
     */
    public void setSourceBundle(SourceBundle sourceBundle) {
        this.sourceBundle = sourceBundle;
    }

    public ApplicationVersion withSourceBundle(SourceBundle sourceBundle) {
        this.sourceBundle = sourceBundle;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("description", description).append("sourceBundle", sourceBundle).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(sourceBundle).append(applicationName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationVersion) == false) {
            return false;
        }
        ApplicationVersion rhs = ((ApplicationVersion) other);
        return new EqualsBuilder().append(description, rhs.description).append(sourceBundle, rhs.sourceBundle).append(applicationName, rhs.applicationName).isEquals();
    }

}
