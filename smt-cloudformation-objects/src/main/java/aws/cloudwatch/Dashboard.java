
package aws.cloudwatch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Dashboard
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DashboardName",
    "DashboardBody"
})
public class Dashboard {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname
     * 
     */
    @JsonProperty("DashboardName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname")
    private CharSequence dashboardName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody
     * 
     */
    @JsonProperty("DashboardBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody")
    private CharSequence dashboardBody;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname
     * 
     */
    public CharSequence getDashboardName() {
        return dashboardName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname
     * 
     */
    public void setDashboardName(CharSequence dashboardName) {
        this.dashboardName = dashboardName;
    }

    public Dashboard withDashboardName(CharSequence dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody
     * 
     */
    public CharSequence getDashboardBody() {
        return dashboardBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody
     * 
     */
    public void setDashboardBody(CharSequence dashboardBody) {
        this.dashboardBody = dashboardBody;
    }

    public Dashboard withDashboardBody(CharSequence dashboardBody) {
        this.dashboardBody = dashboardBody;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dashboardName", dashboardName).append("dashboardBody", dashboardBody).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dashboardBody).append(dashboardName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dashboard) == false) {
            return false;
        }
        Dashboard rhs = ((Dashboard) other);
        return new EqualsBuilder().append(dashboardBody, rhs.dashboardBody).append(dashboardName, rhs.dashboardName).isEquals();
    }

}
