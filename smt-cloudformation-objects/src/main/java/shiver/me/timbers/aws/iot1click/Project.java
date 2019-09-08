
package shiver.me.timbers.aws.iot1click;

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
 * Project
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "PlacementTemplate",
    "ProjectName"
})
public class Project {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description")
    private CharSequence description;
    /**
     * ProjectPlacementTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html
     * 
     */
    @JsonProperty("PlacementTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html")
    private Property<ProjectPlacementTemplate> placementTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname
     * 
     */
    @JsonProperty("ProjectName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname")
    private CharSequence projectName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Project withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * ProjectPlacementTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html
     * 
     */
    @JsonIgnore
    public Property<ProjectPlacementTemplate> getPlacementTemplate() {
        return placementTemplate;
    }

    /**
     * ProjectPlacementTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html
     * 
     */
    @JsonIgnore
    public void setPlacementTemplate(Property<ProjectPlacementTemplate> placementTemplate) {
        this.placementTemplate = placementTemplate;
    }

    public Project withPlacementTemplate(Property<ProjectPlacementTemplate> placementTemplate) {
        this.placementTemplate = placementTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname
     * 
     */
    @JsonIgnore
    public CharSequence getProjectName() {
        return projectName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname
     * 
     */
    @JsonIgnore
    public void setProjectName(CharSequence projectName) {
        this.projectName = projectName;
    }

    public Project withProjectName(CharSequence projectName) {
        this.projectName = projectName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("placementTemplate", placementTemplate).append("projectName", projectName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(projectName).append(placementTemplate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Project) == false) {
            return false;
        }
        Project rhs = ((Project) other);
        return new EqualsBuilder().append(description, rhs.description).append(projectName, rhs.projectName).append(placementTemplate, rhs.placementTemplate).isEquals();
    }

}
