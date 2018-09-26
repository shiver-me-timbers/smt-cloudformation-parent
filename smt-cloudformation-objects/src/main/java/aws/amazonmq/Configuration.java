
package aws.amazonmq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Configuration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EngineVersion",
    "Description",
    "EngineType",
    "Data",
    "Name"
})
public class Configuration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion")
    private CharSequence engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype
     * 
     */
    @JsonProperty("EngineType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype")
    private CharSequence engineType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data
     * 
     */
    @JsonProperty("Data")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data")
    private CharSequence data;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion
     * 
     */
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion
     * 
     */
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public Configuration withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Configuration withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype
     * 
     */
    public CharSequence getEngineType() {
        return engineType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype
     * 
     */
    public void setEngineType(CharSequence engineType) {
        this.engineType = engineType;
    }

    public Configuration withEngineType(CharSequence engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data
     * 
     */
    public CharSequence getData() {
        return data;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data
     * 
     */
    public void setData(CharSequence data) {
        this.data = data;
    }

    public Configuration withData(CharSequence data) {
        this.data = data;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Configuration withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("engineVersion", engineVersion).append("description", description).append("engineType", engineType).append("data", data).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(engineVersion).append(name).append(description).append(engineType).append(data).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Configuration) == false) {
            return false;
        }
        Configuration rhs = ((Configuration) other);
        return new EqualsBuilder().append(engineVersion, rhs.engineVersion).append(name, rhs.name).append(description, rhs.description).append(engineType, rhs.engineType).append(data, rhs.data).isEquals();
    }

}
