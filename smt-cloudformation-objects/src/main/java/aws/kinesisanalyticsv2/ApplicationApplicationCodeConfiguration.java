
package aws.kinesisanalyticsv2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationApplicationCodeConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CodeContentType",
    "CodeContent"
})
public class ApplicationApplicationCodeConfiguration implements Property<ApplicationApplicationCodeConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype
     * 
     */
    @JsonProperty("CodeContentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype")
    private CharSequence codeContentType;
    /**
     * ApplicationCodeContent
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html
     * 
     */
    @JsonProperty("CodeContent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html")
    private Property<ApplicationCodeContent> codeContent;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype
     * 
     */
    @JsonIgnore
    public CharSequence getCodeContentType() {
        return codeContentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype
     * 
     */
    @JsonIgnore
    public void setCodeContentType(CharSequence codeContentType) {
        this.codeContentType = codeContentType;
    }

    public ApplicationApplicationCodeConfiguration withCodeContentType(CharSequence codeContentType) {
        this.codeContentType = codeContentType;
        return this;
    }

    /**
     * ApplicationCodeContent
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationCodeContent> getCodeContent() {
        return codeContent;
    }

    /**
     * ApplicationCodeContent
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html
     * 
     */
    @JsonIgnore
    public void setCodeContent(Property<ApplicationCodeContent> codeContent) {
        this.codeContent = codeContent;
    }

    public ApplicationApplicationCodeConfiguration withCodeContent(Property<ApplicationCodeContent> codeContent) {
        this.codeContent = codeContent;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codeContentType", codeContentType).append("codeContent", codeContent).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codeContentType).append(codeContent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationApplicationCodeConfiguration) == false) {
            return false;
        }
        ApplicationApplicationCodeConfiguration rhs = ((ApplicationApplicationCodeConfiguration) other);
        return new EqualsBuilder().append(codeContentType, rhs.codeContentType).append(codeContent, rhs.codeContent).isEquals();
    }

}
