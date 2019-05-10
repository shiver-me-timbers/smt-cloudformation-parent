
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RelationalDatabaseConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RdsHttpEndpointConfig",
    "RelationalDatabaseSourceType"
})
public class RelationalDatabaseConfig {

    /**
     * RdsHttpEndpointConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html
     * 
     */
    @JsonProperty("RdsHttpEndpointConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html")
    private RdsHttpEndpointConfig rdsHttpEndpointConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype
     * 
     */
    @JsonProperty("RelationalDatabaseSourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype")
    private CharSequence relationalDatabaseSourceType;

    /**
     * RdsHttpEndpointConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html
     * 
     */
    @JsonIgnore
    public RdsHttpEndpointConfig getRdsHttpEndpointConfig() {
        return rdsHttpEndpointConfig;
    }

    /**
     * RdsHttpEndpointConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html
     * 
     */
    @JsonIgnore
    public void setRdsHttpEndpointConfig(RdsHttpEndpointConfig rdsHttpEndpointConfig) {
        this.rdsHttpEndpointConfig = rdsHttpEndpointConfig;
    }

    public RelationalDatabaseConfig withRdsHttpEndpointConfig(RdsHttpEndpointConfig rdsHttpEndpointConfig) {
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

    public RelationalDatabaseConfig withRelationalDatabaseSourceType(CharSequence relationalDatabaseSourceType) {
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
        if ((other instanceof RelationalDatabaseConfig) == false) {
            return false;
        }
        RelationalDatabaseConfig rhs = ((RelationalDatabaseConfig) other);
        return new EqualsBuilder().append(relationalDatabaseSourceType, rhs.relationalDatabaseSourceType).append(rdsHttpEndpointConfig, rhs.rdsHttpEndpointConfig).isEquals();
    }

}
