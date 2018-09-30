
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Filter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IpFilter",
    "Name"
})
public class Filter {

    /**
     * IpFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html
     * 
     */
    @JsonProperty("IpFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html")
    private IpFilter ipFilter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name")
    private CharSequence name;

    /**
     * IpFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html
     * 
     */
    public IpFilter getIpFilter() {
        return ipFilter;
    }

    /**
     * IpFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html
     * 
     */
    public void setIpFilter(IpFilter ipFilter) {
        this.ipFilter = ipFilter;
    }

    public Filter withIpFilter(IpFilter ipFilter) {
        this.ipFilter = ipFilter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Filter withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ipFilter", ipFilter).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ipFilter).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Filter) == false) {
            return false;
        }
        Filter rhs = ((Filter) other);
        return new EqualsBuilder().append(ipFilter, rhs.ipFilter).append(name, rhs.name).isEquals();
    }

}
