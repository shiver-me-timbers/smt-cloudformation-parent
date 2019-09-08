
package shiver.me.timbers.aws.robomaker;

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
 * RobotApplication
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CurrentRevisionId",
    "RobotSoftwareSuite",
    "Sources",
    "Tags",
    "Name"
})
public class RobotApplication {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid
     * 
     */
    @JsonProperty("CurrentRevisionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid")
    private CharSequence currentRevisionId;
    /**
     * RobotApplicationRobotSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html
     * 
     */
    @JsonProperty("RobotSoftwareSuite")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html")
    private Property<RobotApplicationRobotSoftwareSuite> robotSoftwareSuite;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources
     * 
     */
    @JsonProperty("Sources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources")
    private List<Property<RobotApplicationSourceConfig>> sources = new ArrayList<Property<RobotApplicationSourceConfig>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid
     * 
     */
    @JsonIgnore
    public CharSequence getCurrentRevisionId() {
        return currentRevisionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid
     * 
     */
    @JsonIgnore
    public void setCurrentRevisionId(CharSequence currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
    }

    public RobotApplication withCurrentRevisionId(CharSequence currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
        return this;
    }

    /**
     * RobotApplicationRobotSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html
     * 
     */
    @JsonIgnore
    public Property<RobotApplicationRobotSoftwareSuite> getRobotSoftwareSuite() {
        return robotSoftwareSuite;
    }

    /**
     * RobotApplicationRobotSoftwareSuite
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html
     * 
     */
    @JsonIgnore
    public void setRobotSoftwareSuite(Property<RobotApplicationRobotSoftwareSuite> robotSoftwareSuite) {
        this.robotSoftwareSuite = robotSoftwareSuite;
    }

    public RobotApplication withRobotSoftwareSuite(Property<RobotApplicationRobotSoftwareSuite> robotSoftwareSuite) {
        this.robotSoftwareSuite = robotSoftwareSuite;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources
     * 
     */
    @JsonIgnore
    public List<Property<RobotApplicationSourceConfig>> getSources() {
        return sources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources
     * 
     */
    @JsonIgnore
    public void setSources(List<Property<RobotApplicationSourceConfig>> sources) {
        this.sources = sources;
    }

    public RobotApplication withSources(List<Property<RobotApplicationSourceConfig>> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public RobotApplication withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RobotApplication withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currentRevisionId", currentRevisionId).append("robotSoftwareSuite", robotSoftwareSuite).append("sources", sources).append("tags", tags).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(currentRevisionId).append(sources).append(robotSoftwareSuite).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RobotApplication) == false) {
            return false;
        }
        RobotApplication rhs = ((RobotApplication) other);
        return new EqualsBuilder().append(name, rhs.name).append(currentRevisionId, rhs.currentRevisionId).append(sources, rhs.sources).append(robotSoftwareSuite, rhs.robotSoftwareSuite).append(tags, rhs.tags).isEquals();
    }

}
