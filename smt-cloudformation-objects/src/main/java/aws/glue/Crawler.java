
package aws.glue;

import java.util.ArrayList;
import java.util.List;
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
 * Crawler
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Role",
    "Classifiers",
    "Description",
    "SchemaChangePolicy",
    "Configuration",
    "Schedule",
    "DatabaseName",
    "Targets",
    "CrawlerSecurityConfiguration",
    "TablePrefix",
    "Tags",
    "Name"
})
public class Crawler {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role")
    private CharSequence role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers
     * 
     */
    @JsonProperty("Classifiers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers")
    private List<CharSequence> classifiers = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description")
    private CharSequence description;
    /**
     * CrawlerSchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    @JsonProperty("SchemaChangePolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html")
    private Property<CrawlerSchemaChangePolicy> schemaChangePolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration
     * 
     */
    @JsonProperty("Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration")
    private CharSequence configuration;
    /**
     * CrawlerSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html")
    private Property<CrawlerSchedule> schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename")
    private CharSequence databaseName;
    /**
     * CrawlerTargets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    @JsonProperty("Targets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html")
    private Property<CrawlerTargets> targets;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration
     * 
     */
    @JsonProperty("CrawlerSecurityConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration")
    private CharSequence crawlerSecurityConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix
     * 
     */
    @JsonProperty("TablePrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix")
    private CharSequence tablePrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role
     * 
     */
    @JsonIgnore
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role
     * 
     */
    @JsonIgnore
    public void setRole(CharSequence role) {
        this.role = role;
    }

    public Crawler withRole(CharSequence role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers
     * 
     */
    @JsonIgnore
    public List<CharSequence> getClassifiers() {
        return classifiers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers
     * 
     */
    @JsonIgnore
    public void setClassifiers(List<CharSequence> classifiers) {
        this.classifiers = classifiers;
    }

    public Crawler withClassifiers(List<CharSequence> classifiers) {
        this.classifiers = classifiers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Crawler withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * CrawlerSchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    @JsonIgnore
    public Property<CrawlerSchemaChangePolicy> getSchemaChangePolicy() {
        return schemaChangePolicy;
    }

    /**
     * CrawlerSchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    @JsonIgnore
    public void setSchemaChangePolicy(Property<CrawlerSchemaChangePolicy> schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    public Crawler withSchemaChangePolicy(Property<CrawlerSchemaChangePolicy> schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration
     * 
     */
    @JsonIgnore
    public CharSequence getConfiguration() {
        return configuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration
     * 
     */
    @JsonIgnore
    public void setConfiguration(CharSequence configuration) {
        this.configuration = configuration;
    }

    public Crawler withConfiguration(CharSequence configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * CrawlerSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    @JsonIgnore
    public Property<CrawlerSchedule> getSchedule() {
        return schedule;
    }

    /**
     * CrawlerSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    @JsonIgnore
    public void setSchedule(Property<CrawlerSchedule> schedule) {
        this.schedule = schedule;
    }

    public Crawler withSchedule(Property<CrawlerSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename
     * 
     */
    @JsonIgnore
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename
     * 
     */
    @JsonIgnore
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public Crawler withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * CrawlerTargets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    @JsonIgnore
    public Property<CrawlerTargets> getTargets() {
        return targets;
    }

    /**
     * CrawlerTargets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    @JsonIgnore
    public void setTargets(Property<CrawlerTargets> targets) {
        this.targets = targets;
    }

    public Crawler withTargets(Property<CrawlerTargets> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getCrawlerSecurityConfiguration() {
        return crawlerSecurityConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration
     * 
     */
    @JsonIgnore
    public void setCrawlerSecurityConfiguration(CharSequence crawlerSecurityConfiguration) {
        this.crawlerSecurityConfiguration = crawlerSecurityConfiguration;
    }

    public Crawler withCrawlerSecurityConfiguration(CharSequence crawlerSecurityConfiguration) {
        this.crawlerSecurityConfiguration = crawlerSecurityConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix
     * 
     */
    @JsonIgnore
    public CharSequence getTablePrefix() {
        return tablePrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix
     * 
     */
    @JsonIgnore
    public void setTablePrefix(CharSequence tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public Crawler withTablePrefix(CharSequence tablePrefix) {
        this.tablePrefix = tablePrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Crawler withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Crawler withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("role", role).append("classifiers", classifiers).append("description", description).append("schemaChangePolicy", schemaChangePolicy).append("configuration", configuration).append("schedule", schedule).append("databaseName", databaseName).append("targets", targets).append("crawlerSecurityConfiguration", crawlerSecurityConfiguration).append("tablePrefix", tablePrefix).append("tags", tags).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(role).append(databaseName).append(configuration).append(schemaChangePolicy).append(description).append(targets).append(crawlerSecurityConfiguration).append(tags).append(schedule).append(tablePrefix).append(classifiers).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Crawler) == false) {
            return false;
        }
        Crawler rhs = ((Crawler) other);
        return new EqualsBuilder().append(role, rhs.role).append(databaseName, rhs.databaseName).append(configuration, rhs.configuration).append(schemaChangePolicy, rhs.schemaChangePolicy).append(description, rhs.description).append(targets, rhs.targets).append(crawlerSecurityConfiguration, rhs.crawlerSecurityConfiguration).append(tags, rhs.tags).append(schedule, rhs.schedule).append(tablePrefix, rhs.tablePrefix).append(classifiers, rhs.classifiers).append(name, rhs.name).isEquals();
    }

}
