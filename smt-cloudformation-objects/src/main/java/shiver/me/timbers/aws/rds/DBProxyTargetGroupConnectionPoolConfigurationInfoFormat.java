
package shiver.me.timbers.aws.rds;

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
 * DBProxyTargetGroupConnectionPoolConfigurationInfoFormat
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxConnectionsPercent",
    "MaxIdleConnectionsPercent",
    "ConnectionBorrowTimeout",
    "SessionPinningFilters",
    "InitQuery"
})
public class DBProxyTargetGroupConnectionPoolConfigurationInfoFormat implements Property<DBProxyTargetGroupConnectionPoolConfigurationInfoFormat>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxconnectionspercent
     * 
     */
    @JsonProperty("MaxConnectionsPercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxconnectionspercent")
    private Number maxConnectionsPercent;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxidleconnectionspercent
     * 
     */
    @JsonProperty("MaxIdleConnectionsPercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxidleconnectionspercent")
    private Number maxIdleConnectionsPercent;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-connectionborrowtimeout
     * 
     */
    @JsonProperty("ConnectionBorrowTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-connectionborrowtimeout")
    private Number connectionBorrowTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-sessionpinningfilters
     * 
     */
    @JsonProperty("SessionPinningFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-sessionpinningfilters")
    private List<CharSequence> sessionPinningFilters = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-initquery
     * 
     */
    @JsonProperty("InitQuery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-initquery")
    private CharSequence initQuery;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxconnectionspercent
     * 
     */
    @JsonIgnore
    public Number getMaxConnectionsPercent() {
        return maxConnectionsPercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxconnectionspercent
     * 
     */
    @JsonIgnore
    public void setMaxConnectionsPercent(Number maxConnectionsPercent) {
        this.maxConnectionsPercent = maxConnectionsPercent;
    }

    public DBProxyTargetGroupConnectionPoolConfigurationInfoFormat withMaxConnectionsPercent(Number maxConnectionsPercent) {
        this.maxConnectionsPercent = maxConnectionsPercent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxidleconnectionspercent
     * 
     */
    @JsonIgnore
    public Number getMaxIdleConnectionsPercent() {
        return maxIdleConnectionsPercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxidleconnectionspercent
     * 
     */
    @JsonIgnore
    public void setMaxIdleConnectionsPercent(Number maxIdleConnectionsPercent) {
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
    }

    public DBProxyTargetGroupConnectionPoolConfigurationInfoFormat withMaxIdleConnectionsPercent(Number maxIdleConnectionsPercent) {
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-connectionborrowtimeout
     * 
     */
    @JsonIgnore
    public Number getConnectionBorrowTimeout() {
        return connectionBorrowTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-connectionborrowtimeout
     * 
     */
    @JsonIgnore
    public void setConnectionBorrowTimeout(Number connectionBorrowTimeout) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
    }

    public DBProxyTargetGroupConnectionPoolConfigurationInfoFormat withConnectionBorrowTimeout(Number connectionBorrowTimeout) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-sessionpinningfilters
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSessionPinningFilters() {
        return sessionPinningFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-sessionpinningfilters
     * 
     */
    @JsonIgnore
    public void setSessionPinningFilters(List<CharSequence> sessionPinningFilters) {
        this.sessionPinningFilters = sessionPinningFilters;
    }

    public DBProxyTargetGroupConnectionPoolConfigurationInfoFormat withSessionPinningFilters(List<CharSequence> sessionPinningFilters) {
        this.sessionPinningFilters = sessionPinningFilters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-initquery
     * 
     */
    @JsonIgnore
    public CharSequence getInitQuery() {
        return initQuery;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-initquery
     * 
     */
    @JsonIgnore
    public void setInitQuery(CharSequence initQuery) {
        this.initQuery = initQuery;
    }

    public DBProxyTargetGroupConnectionPoolConfigurationInfoFormat withInitQuery(CharSequence initQuery) {
        this.initQuery = initQuery;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxConnectionsPercent", maxConnectionsPercent).append("maxIdleConnectionsPercent", maxIdleConnectionsPercent).append("connectionBorrowTimeout", connectionBorrowTimeout).append("sessionPinningFilters", sessionPinningFilters).append("initQuery", initQuery).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionBorrowTimeout).append(maxIdleConnectionsPercent).append(sessionPinningFilters).append(maxConnectionsPercent).append(initQuery).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBProxyTargetGroupConnectionPoolConfigurationInfoFormat) == false) {
            return false;
        }
        DBProxyTargetGroupConnectionPoolConfigurationInfoFormat rhs = ((DBProxyTargetGroupConnectionPoolConfigurationInfoFormat) other);
        return new EqualsBuilder().append(connectionBorrowTimeout, rhs.connectionBorrowTimeout).append(maxIdleConnectionsPercent, rhs.maxIdleConnectionsPercent).append(sessionPinningFilters, rhs.sessionPinningFilters).append(maxConnectionsPercent, rhs.maxConnectionsPercent).append(initQuery, rhs.initQuery).isEquals();
    }

}
