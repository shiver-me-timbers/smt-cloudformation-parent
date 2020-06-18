
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
 * DataSourceDeltaSyncConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BaseTableTTL",
    "DeltaSyncTableTTL",
    "DeltaSyncTableName"
})
public class DataSourceDeltaSyncConfig implements Property<DataSourceDeltaSyncConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-basetablettl
     * 
     */
    @JsonProperty("BaseTableTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-basetablettl")
    private CharSequence baseTableTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablettl
     * 
     */
    @JsonProperty("DeltaSyncTableTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablettl")
    private CharSequence deltaSyncTableTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablename
     * 
     */
    @JsonProperty("DeltaSyncTableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablename")
    private CharSequence deltaSyncTableName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-basetablettl
     * 
     */
    @JsonIgnore
    public CharSequence getBaseTableTTL() {
        return baseTableTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-basetablettl
     * 
     */
    @JsonIgnore
    public void setBaseTableTTL(CharSequence baseTableTTL) {
        this.baseTableTTL = baseTableTTL;
    }

    public DataSourceDeltaSyncConfig withBaseTableTTL(CharSequence baseTableTTL) {
        this.baseTableTTL = baseTableTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablettl
     * 
     */
    @JsonIgnore
    public CharSequence getDeltaSyncTableTTL() {
        return deltaSyncTableTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablettl
     * 
     */
    @JsonIgnore
    public void setDeltaSyncTableTTL(CharSequence deltaSyncTableTTL) {
        this.deltaSyncTableTTL = deltaSyncTableTTL;
    }

    public DataSourceDeltaSyncConfig withDeltaSyncTableTTL(CharSequence deltaSyncTableTTL) {
        this.deltaSyncTableTTL = deltaSyncTableTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablename
     * 
     */
    @JsonIgnore
    public CharSequence getDeltaSyncTableName() {
        return deltaSyncTableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablename
     * 
     */
    @JsonIgnore
    public void setDeltaSyncTableName(CharSequence deltaSyncTableName) {
        this.deltaSyncTableName = deltaSyncTableName;
    }

    public DataSourceDeltaSyncConfig withDeltaSyncTableName(CharSequence deltaSyncTableName) {
        this.deltaSyncTableName = deltaSyncTableName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseTableTTL", baseTableTTL).append("deltaSyncTableTTL", deltaSyncTableTTL).append("deltaSyncTableName", deltaSyncTableName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deltaSyncTableName).append(baseTableTTL).append(deltaSyncTableTTL).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSourceDeltaSyncConfig) == false) {
            return false;
        }
        DataSourceDeltaSyncConfig rhs = ((DataSourceDeltaSyncConfig) other);
        return new EqualsBuilder().append(deltaSyncTableName, rhs.deltaSyncTableName).append(baseTableTTL, rhs.baseTableTTL).append(deltaSyncTableTTL, rhs.deltaSyncTableTTL).isEquals();
    }

}
