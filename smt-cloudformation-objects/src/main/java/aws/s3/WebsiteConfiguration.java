
package aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * WebsiteConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ErrorDocument",
    "IndexDocument",
    "RedirectAllRequestsTo",
    "RoutingRules"
})
public class WebsiteConfiguration implements Property<WebsiteConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument
     * 
     */
    @JsonProperty("ErrorDocument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument")
    private CharSequence errorDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument
     * 
     */
    @JsonProperty("IndexDocument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument")
    private CharSequence indexDocument;
    /**
     * RedirectAllRequestsTo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
     * 
     */
    @JsonProperty("RedirectAllRequestsTo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html")
    private Property<RedirectAllRequestsTo> redirectAllRequestsTo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules
     * 
     */
    @JsonProperty("RoutingRules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules")
    private Set<Property<RoutingRule>> routingRules = new LinkedHashSet<Property<RoutingRule>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument
     * 
     */
    @JsonIgnore
    public CharSequence getErrorDocument() {
        return errorDocument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument
     * 
     */
    @JsonIgnore
    public void setErrorDocument(CharSequence errorDocument) {
        this.errorDocument = errorDocument;
    }

    public WebsiteConfiguration withErrorDocument(CharSequence errorDocument) {
        this.errorDocument = errorDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument
     * 
     */
    @JsonIgnore
    public CharSequence getIndexDocument() {
        return indexDocument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument
     * 
     */
    @JsonIgnore
    public void setIndexDocument(CharSequence indexDocument) {
        this.indexDocument = indexDocument;
    }

    public WebsiteConfiguration withIndexDocument(CharSequence indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }

    /**
     * RedirectAllRequestsTo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
     * 
     */
    @JsonIgnore
    public Property<RedirectAllRequestsTo> getRedirectAllRequestsTo() {
        return redirectAllRequestsTo;
    }

    /**
     * RedirectAllRequestsTo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
     * 
     */
    @JsonIgnore
    public void setRedirectAllRequestsTo(Property<RedirectAllRequestsTo> redirectAllRequestsTo) {
        this.redirectAllRequestsTo = redirectAllRequestsTo;
    }

    public WebsiteConfiguration withRedirectAllRequestsTo(Property<RedirectAllRequestsTo> redirectAllRequestsTo) {
        this.redirectAllRequestsTo = redirectAllRequestsTo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules
     * 
     */
    @JsonIgnore
    public Set<Property<RoutingRule>> getRoutingRules() {
        return routingRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules
     * 
     */
    @JsonIgnore
    public void setRoutingRules(Set<Property<RoutingRule>> routingRules) {
        this.routingRules = routingRules;
    }

    public WebsiteConfiguration withRoutingRules(Set<Property<RoutingRule>> routingRules) {
        this.routingRules = routingRules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("errorDocument", errorDocument).append("indexDocument", indexDocument).append("redirectAllRequestsTo", redirectAllRequestsTo).append("routingRules", routingRules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(indexDocument).append(redirectAllRequestsTo).append(errorDocument).append(routingRules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebsiteConfiguration) == false) {
            return false;
        }
        WebsiteConfiguration rhs = ((WebsiteConfiguration) other);
        return new EqualsBuilder().append(indexDocument, rhs.indexDocument).append(redirectAllRequestsTo, rhs.redirectAllRequestsTo).append(errorDocument, rhs.errorDocument).append(routingRules, rhs.routingRules).isEquals();
    }

}
