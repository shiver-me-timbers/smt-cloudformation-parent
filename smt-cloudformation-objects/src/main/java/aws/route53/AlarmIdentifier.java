
package aws.route53;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AlarmIdentifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "Region"
})
public class AlarmIdentifier {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region")
    private CharSequence region;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public AlarmIdentifier withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region
     * 
     */
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region
     * 
     */
    public void setRegion(CharSequence region) {
        this.region = region;
    }

    public AlarmIdentifier withRegion(CharSequence region) {
        this.region = region;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("region", region).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(region).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlarmIdentifier) == false) {
            return false;
        }
        AlarmIdentifier rhs = ((AlarmIdentifier) other);
        return new EqualsBuilder().append(name, rhs.name).append(region, rhs.region).isEquals();
    }

}
