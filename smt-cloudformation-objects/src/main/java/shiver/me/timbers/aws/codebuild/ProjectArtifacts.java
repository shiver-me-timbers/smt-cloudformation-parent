
package shiver.me.timbers.aws.codebuild;

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
 * ProjectArtifacts
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Path",
    "Type",
    "ArtifactIdentifier",
    "OverrideArtifactName",
    "Packaging",
    "EncryptionDisabled",
    "Location",
    "Name",
    "NamespaceType"
})
public class ProjectArtifacts implements Property<ProjectArtifacts>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path")
    private CharSequence path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier
     * 
     */
    @JsonProperty("ArtifactIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier")
    private CharSequence artifactIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname
     * 
     */
    @JsonProperty("OverrideArtifactName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname")
    private CharSequence overrideArtifactName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging
     * 
     */
    @JsonProperty("Packaging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging")
    private CharSequence packaging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled
     * 
     */
    @JsonProperty("EncryptionDisabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled")
    private CharSequence encryptionDisabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location")
    private CharSequence location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype
     * 
     */
    @JsonProperty("NamespaceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype")
    private CharSequence namespaceType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path
     * 
     */
    @JsonIgnore
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path
     * 
     */
    @JsonIgnore
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public ProjectArtifacts withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ProjectArtifacts withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getArtifactIdentifier() {
        return artifactIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier
     * 
     */
    @JsonIgnore
    public void setArtifactIdentifier(CharSequence artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
    }

    public ProjectArtifacts withArtifactIdentifier(CharSequence artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname
     * 
     */
    @JsonIgnore
    public CharSequence getOverrideArtifactName() {
        return overrideArtifactName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname
     * 
     */
    @JsonIgnore
    public void setOverrideArtifactName(CharSequence overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
    }

    public ProjectArtifacts withOverrideArtifactName(CharSequence overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging
     * 
     */
    @JsonIgnore
    public CharSequence getPackaging() {
        return packaging;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging
     * 
     */
    @JsonIgnore
    public void setPackaging(CharSequence packaging) {
        this.packaging = packaging;
    }

    public ProjectArtifacts withPackaging(CharSequence packaging) {
        this.packaging = packaging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled
     * 
     */
    @JsonIgnore
    public CharSequence getEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled
     * 
     */
    @JsonIgnore
    public void setEncryptionDisabled(CharSequence encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    public ProjectArtifacts withEncryptionDisabled(CharSequence encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location
     * 
     */
    @JsonIgnore
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location
     * 
     */
    @JsonIgnore
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public ProjectArtifacts withLocation(CharSequence location) {
        this.location = location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ProjectArtifacts withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype
     * 
     */
    @JsonIgnore
    public CharSequence getNamespaceType() {
        return namespaceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype
     * 
     */
    @JsonIgnore
    public void setNamespaceType(CharSequence namespaceType) {
        this.namespaceType = namespaceType;
    }

    public ProjectArtifacts withNamespaceType(CharSequence namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("path", path).append("type", type).append("artifactIdentifier", artifactIdentifier).append("overrideArtifactName", overrideArtifactName).append("packaging", packaging).append("encryptionDisabled", encryptionDisabled).append("location", location).append("name", name).append("namespaceType", namespaceType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(encryptionDisabled).append(name).append(packaging).append(location).append(type).append(namespaceType).append(artifactIdentifier).append(overrideArtifactName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectArtifacts) == false) {
            return false;
        }
        ProjectArtifacts rhs = ((ProjectArtifacts) other);
        return new EqualsBuilder().append(path, rhs.path).append(encryptionDisabled, rhs.encryptionDisabled).append(name, rhs.name).append(packaging, rhs.packaging).append(location, rhs.location).append(type, rhs.type).append(namespaceType, rhs.namespaceType).append(artifactIdentifier, rhs.artifactIdentifier).append(overrideArtifactName, rhs.overrideArtifactName).isEquals();
    }

}
