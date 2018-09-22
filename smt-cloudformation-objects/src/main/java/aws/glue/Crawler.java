
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
    private String role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers
     * 
     */
    @JsonProperty("Classifiers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers")
    private List<String> classifiers = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description")
    private String description;
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
    private String configuration;
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
    private String databaseName;
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
    private String tablePrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name")
    private String name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role
     * 
     */
    @JsonProperty("Role")
    public String getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role
     * 
     */
    @JsonProperty("Role")
    public void setRole(String role) {
        this.role = role;
    }

    public Crawler withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers
     * 
     */
    @JsonProperty("Classifiers")
    public List<String> getClassifiers() {
        return classifiers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers
     * 
     */
    @JsonProperty("Classifiers")
    public void setClassifiers(List<String> classifiers) {
        this.classifiers = classifiers;
    }

    public Crawler withClassifiers(List<String> classifiers) {
        this.classifiers = classifiers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Crawler withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    @JsonProperty("SchemaChangePolicy")
    public SchemaChangePolicy getSchemaChangePolicy() {
        return schemaChangePolicy;
    }

    /**
     * SchemaChangePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
     * 
     */
    @JsonProperty("SchemaChangePolicy")
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
    @JsonProperty("Configuration")
    public String getConfiguration() {
        return configuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration
     * 
     */
    @JsonProperty("Configuration")
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public Crawler withConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
     * 
     */
    @JsonProperty("Schedule")
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
    @JsonProperty("DatabaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Crawler withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Targets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    @JsonProperty("Targets")
    public Targets getTargets() {
        return targets;
    }

    /**
     * Targets
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html
     * 
     */
    @JsonProperty("Targets")
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
    @JsonProperty("TablePrefix")
    public String getTablePrefix() {
        return tablePrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix
     * 
     */
    @JsonProperty("TablePrefix")
    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public Crawler withTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Crawler withName(String name) {
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
