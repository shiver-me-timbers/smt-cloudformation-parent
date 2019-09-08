
package shiver.me.timbers.aws.servicecatalog;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.CreationPolicy;
import shiver.me.timbers.aws.DeletionPolicy;
import shiver.me.timbers.aws.HasCondition;
import shiver.me.timbers.aws.HasDependsOn;
import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.UpdatePolicy;


/**
 * AcceptedPortfolioShareResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class AcceptedPortfolioShareResource
    extends Resource
    implements HasCondition<AcceptedPortfolioShareResource> , HasDependsOn<AcceptedPortfolioShareResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::ServiceCatalog::AcceptedPortfolioShare";
    /**
     * AcceptedPortfolioShare
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html")
    private AcceptedPortfolioShare properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AcceptedPortfolioShareResource() {
    }

    /**
     * 
     * @param name
     */
    public AcceptedPortfolioShareResource(java.lang.String name) {
        super(name);
    }

    @JsonIgnore
    public java.lang.String getType() {
        return type;
    }

    @JsonIgnore
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public AcceptedPortfolioShareResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * AcceptedPortfolioShare
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html
     * 
     */
    @JsonIgnore
    public AcceptedPortfolioShare getProperties() {
        return properties;
    }

    /**
     * AcceptedPortfolioShare
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html
     * 
     */
    @JsonIgnore
    public void setProperties(AcceptedPortfolioShare properties) {
        this.properties = properties;
    }

    public AcceptedPortfolioShareResource withProperties(AcceptedPortfolioShare properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public AcceptedPortfolioShareResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public AcceptedPortfolioShareResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public AcceptedPortfolioShareResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public AcceptedPortfolioShareResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public AcceptedPortfolioShareResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public AcceptedPortfolioShareResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public AcceptedPortfolioShareResource withName(java.lang.String name) {
        super.withName(name);
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("type", type).append("properties", properties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(type).append(properties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcceptedPortfolioShareResource) == false) {
            return false;
        }
        AcceptedPortfolioShareResource rhs = ((AcceptedPortfolioShareResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
