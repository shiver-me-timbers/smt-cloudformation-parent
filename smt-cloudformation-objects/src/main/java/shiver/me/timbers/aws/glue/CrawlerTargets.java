
package shiver.me.timbers.aws.glue;

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
import shiver.me.timbers.aws.Property;


/**
 * CrawlerTargets
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Targets",
    "CatalogTargets",
    "JdbcTargets",
    "DynamoDBTargets"
})
public class CrawlerTargets implements Property<CrawlerTargets>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets
     * 
     */
    @JsonProperty("S3Targets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets")
    private List<Property<CrawlerS3Target>> s3Targets = new ArrayList<Property<CrawlerS3Target>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-catalogtargets
     * 
     */
    @JsonProperty("CatalogTargets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-catalogtargets")
    private List<Property<CrawlerCatalogTarget>> catalogTargets = new ArrayList<Property<CrawlerCatalogTarget>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets
     * 
     */
    @JsonProperty("JdbcTargets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets")
    private List<Property<CrawlerJdbcTarget>> jdbcTargets = new ArrayList<Property<CrawlerJdbcTarget>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-dynamodbtargets
     * 
     */
    @JsonProperty("DynamoDBTargets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-dynamodbtargets")
    private List<Property<CrawlerDynamoDBTarget>> dynamoDBTargets = new ArrayList<Property<CrawlerDynamoDBTarget>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets
     * 
     */
    @JsonIgnore
    public List<Property<CrawlerS3Target>> getS3Targets() {
        return s3Targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets
     * 
     */
    @JsonIgnore
    public void setS3Targets(List<Property<CrawlerS3Target>> s3Targets) {
        this.s3Targets = s3Targets;
    }

    public CrawlerTargets withS3Targets(List<Property<CrawlerS3Target>> s3Targets) {
        this.s3Targets = s3Targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-catalogtargets
     * 
     */
    @JsonIgnore
    public List<Property<CrawlerCatalogTarget>> getCatalogTargets() {
        return catalogTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-catalogtargets
     * 
     */
    @JsonIgnore
    public void setCatalogTargets(List<Property<CrawlerCatalogTarget>> catalogTargets) {
        this.catalogTargets = catalogTargets;
    }

    public CrawlerTargets withCatalogTargets(List<Property<CrawlerCatalogTarget>> catalogTargets) {
        this.catalogTargets = catalogTargets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets
     * 
     */
    @JsonIgnore
    public List<Property<CrawlerJdbcTarget>> getJdbcTargets() {
        return jdbcTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets
     * 
     */
    @JsonIgnore
    public void setJdbcTargets(List<Property<CrawlerJdbcTarget>> jdbcTargets) {
        this.jdbcTargets = jdbcTargets;
    }

    public CrawlerTargets withJdbcTargets(List<Property<CrawlerJdbcTarget>> jdbcTargets) {
        this.jdbcTargets = jdbcTargets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-dynamodbtargets
     * 
     */
    @JsonIgnore
    public List<Property<CrawlerDynamoDBTarget>> getDynamoDBTargets() {
        return dynamoDBTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-dynamodbtargets
     * 
     */
    @JsonIgnore
    public void setDynamoDBTargets(List<Property<CrawlerDynamoDBTarget>> dynamoDBTargets) {
        this.dynamoDBTargets = dynamoDBTargets;
    }

    public CrawlerTargets withDynamoDBTargets(List<Property<CrawlerDynamoDBTarget>> dynamoDBTargets) {
        this.dynamoDBTargets = dynamoDBTargets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Targets", s3Targets).append("catalogTargets", catalogTargets).append("jdbcTargets", jdbcTargets).append("dynamoDBTargets", dynamoDBTargets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Targets).append(catalogTargets).append(dynamoDBTargets).append(jdbcTargets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrawlerTargets) == false) {
            return false;
        }
        CrawlerTargets rhs = ((CrawlerTargets) other);
        return new EqualsBuilder().append(s3Targets, rhs.s3Targets).append(catalogTargets, rhs.catalogTargets).append(dynamoDBTargets, rhs.dynamoDBTargets).append(jdbcTargets, rhs.jdbcTargets).isEquals();
    }

}
