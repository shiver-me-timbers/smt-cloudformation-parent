
package shiver.me.timbers.aws.kinesisanalyticsv2;

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
 * ApplicationReferenceDataSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApplicationName",
    "ReferenceDataSource"
})
public class ApplicationReferenceDataSource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname")
    private CharSequence applicationName;
    /**
     * ApplicationReferenceDataSourceReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html
     * 
     */
    @JsonProperty("ReferenceDataSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html")
    private Property<ApplicationReferenceDataSourceReferenceDataSource> referenceDataSource;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname
     * 
     */
    @JsonIgnore
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public ApplicationReferenceDataSource withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * ApplicationReferenceDataSourceReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationReferenceDataSourceReferenceDataSource> getReferenceDataSource() {
        return referenceDataSource;
    }

    /**
     * ApplicationReferenceDataSourceReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html
     * 
     */
    @JsonIgnore
    public void setReferenceDataSource(Property<ApplicationReferenceDataSourceReferenceDataSource> referenceDataSource) {
        this.referenceDataSource = referenceDataSource;
    }

    public ApplicationReferenceDataSource withReferenceDataSource(Property<ApplicationReferenceDataSourceReferenceDataSource> referenceDataSource) {
        this.referenceDataSource = referenceDataSource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("referenceDataSource", referenceDataSource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(applicationName).append(referenceDataSource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationReferenceDataSource) == false) {
            return false;
        }
        ApplicationReferenceDataSource rhs = ((ApplicationReferenceDataSource) other);
        return new EqualsBuilder().append(applicationName, rhs.applicationName).append(referenceDataSource, rhs.referenceDataSource).isEquals();
    }

}
