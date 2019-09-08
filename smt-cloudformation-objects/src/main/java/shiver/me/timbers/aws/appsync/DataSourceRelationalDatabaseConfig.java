
package shiver.me.timbers.aws.appsync;

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
 * DataSourceRelationalDatabaseConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RdsHttpEndpointConfig",
    "RelationalDatabaseSourceType"
})
public class DataSourceRelationalDatabaseConfig implements Property<DataSourceRelationalDatabaseConfig>
{

    /**
     * DataSourceRdsHttpEndpointConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html
     * 
     */
    @JsonProperty("RdsHttpEndpointConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html")
    private Property<DataSourceRdsHttpEndpointConfig> rdsHttpEndpointConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype
     * 
     */
    @JsonProperty("RelationalDatabaseSourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype")
    private CharSequence relationalDatabaseSourceType;

    /**
     * DataSourceRdsHttpEndpointConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceRdsHttpEndpointConfig> getRdsHttpEndpointConfig() {
        return rdsHttpEndpointConfig;
    }

    /**
     * DataSourceRdsHttpEndpointConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html
     * 
     */
    @JsonIgnore
    public void setRdsHttpEndpointConfig(Property<DataSourceRdsHttpEndpointConfig> rdsHttpEndpointConfig) {
        this.rdsHttpEndpointConfig = rdsHttpEndpointConfig;
    }

    public DataSourceRelationalDatabaseConfig withRdsHttpEndpointConfig(Property<DataSourceRdsHttpEndpointConfig> rdsHttpEndpointConfig) {
        this.rdsHttpEndpointConfig = rdsHttpEndpointConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype
     * 
     */
    @JsonIgnore
    public CharSequence getRelationalDatabaseSourceType() {
        return relationalDatabaseSourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype
     * 
     */
    @JsonIgnore
    public void setRelationalDatabaseSourceType(CharSequence relationalDatabaseSourceType) {
        this.relationalDatabaseSourceType = relationalDatabaseSourceType;
    }

    public DataSourceRelationalDatabaseConfig withRelationalDatabaseSourceType(CharSequence relationalDatabaseSourceType) {
        this.relationalDatabaseSourceType = relationalDatabaseSourceType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rdsHttpEndpointConfig", rdsHttpEndpointConfig).append("relationalDatabaseSourceType", relationalDatabaseSourceType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(relationalDatabaseSourceType).append(rdsHttpEndpointConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSourceRelationalDatabaseConfig) == false) {
            return false;
        }
        DataSourceRelationalDatabaseConfig rhs = ((DataSourceRelationalDatabaseConfig) other);
        return new EqualsBuilder().append(relationalDatabaseSourceType, rhs.relationalDatabaseSourceType).append(rdsHttpEndpointConfig, rhs.rdsHttpEndpointConfig).isEquals();
    }

}
