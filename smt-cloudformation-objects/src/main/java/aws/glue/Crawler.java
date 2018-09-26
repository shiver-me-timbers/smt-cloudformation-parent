
package aws.glue;

import java.util.ArrayList;
import java.util.List;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Role",
    "Classifiers",
    "Description",
    "SchemaChangePolicy",
    "Configuration",
    "Schedule",
    "DatabaseName",
    "Targets",
    "TablePrefix",
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
     * SchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    @JsonProperty("SchemaChangePolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html")
    private SchemaChangePolicy schemaChangePolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration
     * 
     */
    @JsonProperty("Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration")
    private CharSequence configuration;
    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html")
    private Schedule schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename")
    private CharSequence databaseName;
    /**
     * Targets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    @JsonProperty("Targets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html")
    private Targets targets;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix
     * 
     */
    @JsonProperty("TablePrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix")
    private CharSequence tablePrefix;
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
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role
     * 
     */
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
    public List<CharSequence> getClassifiers() {
        return classifiers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers
     * 
     */
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
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Crawler withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * SchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    public SchemaChangePolicy getSchemaChangePolicy() {
        return schemaChangePolicy;
    }

    /**
     * SchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    public void setSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    public Crawler withSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration
     * 
     */
    public CharSequence getConfiguration() {
        return configuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration
     * 
     */
    public void setConfiguration(CharSequence configuration) {
        this.configuration = configuration;
    }

    public Crawler withConfiguration(CharSequence configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Crawler withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename
     * 
     */
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename
     * 
     */
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public Crawler withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Targets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    public Targets getTargets() {
        return targets;
    }

    /**
     * Targets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    public void setTargets(Targets targets) {
        this.targets = targets;
    }

    public Crawler withTargets(Targets targets) {
        this.targets = targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix
     * 
     */
    public CharSequence getTablePrefix() {
        return tablePrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix
     * 
     */
    public void setTablePrefix(CharSequence tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public Crawler withTablePrefix(CharSequence tablePrefix) {
        this.tablePrefix = tablePrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Crawler withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("role", role).append("classifiers", classifiers).append("description", description).append("schemaChangePolicy", schemaChangePolicy).append("configuration", configuration).append("schedule", schedule).append("databaseName", databaseName).append("targets", targets).append("tablePrefix", tablePrefix).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schedule).append(role).append(databaseName).append(configuration).append(tablePrefix).append(schemaChangePolicy).append(classifiers).append(name).append(description).append(targets).toHashCode();
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
        return new EqualsBuilder().append(schedule, rhs.schedule).append(role, rhs.role).append(databaseName, rhs.databaseName).append(configuration, rhs.configuration).append(tablePrefix, rhs.tablePrefix).append(schemaChangePolicy, rhs.schemaChangePolicy).append(classifiers, rhs.classifiers).append(name, rhs.name).append(description, rhs.description).append(targets, rhs.targets).isEquals();
    }

}
