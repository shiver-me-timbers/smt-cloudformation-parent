
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
 * BucketWebsiteConfiguration
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
public class BucketWebsiteConfiguration implements Property<BucketWebsiteConfiguration>
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
     * BucketRedirectAllRequestsTo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
     * 
     */
    @JsonProperty("RedirectAllRequestsTo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html")
    private Property<BucketRedirectAllRequestsTo> redirectAllRequestsTo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules
     * 
     */
    @JsonProperty("RoutingRules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules")
    private Set<Property<BucketRoutingRule>> routingRules = new LinkedHashSet<Property<BucketRoutingRule>>();

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

    public BucketWebsiteConfiguration withErrorDocument(CharSequence errorDocument) {
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

    public BucketWebsiteConfiguration withIndexDocument(CharSequence indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }

    /**
     * BucketRedirectAllRequestsTo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
     * 
     */
    @JsonIgnore
    public Property<BucketRedirectAllRequestsTo> getRedirectAllRequestsTo() {
        return redirectAllRequestsTo;
    }

    /**
     * BucketRedirectAllRequestsTo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html
     * 
     */
    @JsonIgnore
    public void setRedirectAllRequestsTo(Property<BucketRedirectAllRequestsTo> redirectAllRequestsTo) {
        this.redirectAllRequestsTo = redirectAllRequestsTo;
    }

    public BucketWebsiteConfiguration withRedirectAllRequestsTo(Property<BucketRedirectAllRequestsTo> redirectAllRequestsTo) {
        this.redirectAllRequestsTo = redirectAllRequestsTo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules
     * 
     */
    @JsonIgnore
    public Set<Property<BucketRoutingRule>> getRoutingRules() {
        return routingRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules
     * 
     */
    @JsonIgnore
    public void setRoutingRules(Set<Property<BucketRoutingRule>> routingRules) {
        this.routingRules = routingRules;
    }

    public BucketWebsiteConfiguration withRoutingRules(Set<Property<BucketRoutingRule>> routingRules) {
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
        if ((other instanceof BucketWebsiteConfiguration) == false) {
            return false;
        }
        BucketWebsiteConfiguration rhs = ((BucketWebsiteConfiguration) other);
        return new EqualsBuilder().append(indexDocument, rhs.indexDocument).append(redirectAllRequestsTo, rhs.redirectAllRequestsTo).append(errorDocument, rhs.errorDocument).append(routingRules, rhs.routingRules).isEquals();
    }

}
