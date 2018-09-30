
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReceiptFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Filter"
})
public class ReceiptFilter {

    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html")
    private Filter filter;

    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html
     * 
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Filter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html
     * 
     */
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public ReceiptFilter withFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("filter", filter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptFilter) == false) {
            return false;
        }
        ReceiptFilter rhs = ((ReceiptFilter) other);
        return new EqualsBuilder().append(filter, rhs.filter).isEquals();
    }

}
