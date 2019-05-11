
package aws.greengrass;

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


/**
 * SecretsManagerSecretResourceData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ARN",
    "AdditionalStagingLabelsToDownload"
})
public class SecretsManagerSecretResourceData {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-arn
     * 
     */
    @JsonProperty("ARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-arn")
    private CharSequence aRN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-additionalstaginglabelstodownload
     * 
     */
    @JsonProperty("AdditionalStagingLabelsToDownload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-additionalstaginglabelstodownload")
    private List<CharSequence> additionalStagingLabelsToDownload = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-arn
     * 
     */
    @JsonIgnore
    public CharSequence getARN() {
        return aRN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-arn
     * 
     */
    @JsonIgnore
    public void setARN(CharSequence aRN) {
        this.aRN = aRN;
    }

    public SecretsManagerSecretResourceData withARN(CharSequence aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-additionalstaginglabelstodownload
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAdditionalStagingLabelsToDownload() {
        return additionalStagingLabelsToDownload;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-additionalstaginglabelstodownload
     * 
     */
    @JsonIgnore
    public void setAdditionalStagingLabelsToDownload(List<CharSequence> additionalStagingLabelsToDownload) {
        this.additionalStagingLabelsToDownload = additionalStagingLabelsToDownload;
    }

    public SecretsManagerSecretResourceData withAdditionalStagingLabelsToDownload(List<CharSequence> additionalStagingLabelsToDownload) {
        this.additionalStagingLabelsToDownload = additionalStagingLabelsToDownload;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aRN", aRN).append("additionalStagingLabelsToDownload", additionalStagingLabelsToDownload).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aRN).append(additionalStagingLabelsToDownload).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecretsManagerSecretResourceData) == false) {
            return false;
        }
        SecretsManagerSecretResourceData rhs = ((SecretsManagerSecretResourceData) other);
        return new EqualsBuilder().append(aRN, rhs.aRN).append(additionalStagingLabelsToDownload, rhs.additionalStagingLabelsToDownload).isEquals();
    }

}
