
package shiver.me.timbers.aws.codepipeline;

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
 * PipelineArtifactStoreMap
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ArtifactStore",
    "Region"
})
public class PipelineArtifactStoreMap implements Property<PipelineArtifactStoreMap>
{

    /**
     * PipelineArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    @JsonProperty("ArtifactStore")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html")
    private Property<PipelineArtifactStore> artifactStore;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-region")
    private CharSequence region;

    /**
     * PipelineArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    @JsonIgnore
    public Property<PipelineArtifactStore> getArtifactStore() {
        return artifactStore;
    }

    /**
     * PipelineArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    @JsonIgnore
    public void setArtifactStore(Property<PipelineArtifactStore> artifactStore) {
        this.artifactStore = artifactStore;
    }

    public PipelineArtifactStoreMap withArtifactStore(Property<PipelineArtifactStore> artifactStore) {
        this.artifactStore = artifactStore;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-region
     * 
     */
    @JsonIgnore
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-region
     * 
     */
    @JsonIgnore
    public void setRegion(CharSequence region) {
        this.region = region;
    }

    public PipelineArtifactStoreMap withRegion(CharSequence region) {
        this.region = region;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("artifactStore", artifactStore).append("region", region).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(region).append(artifactStore).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineArtifactStoreMap) == false) {
            return false;
        }
        PipelineArtifactStoreMap rhs = ((PipelineArtifactStoreMap) other);
        return new EqualsBuilder().append(region, rhs.region).append(artifactStore, rhs.artifactStore).isEquals();
    }

}
