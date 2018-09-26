
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticIp
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ip",
    "Name"
})
public class ElasticIp {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip
     * 
     */
    @JsonProperty("Ip")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip")
    private CharSequence ip;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip
     * 
     */
    public CharSequence getIp() {
        return ip;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip
     * 
     */
    public void setIp(CharSequence ip) {
        this.ip = ip;
    }

    public ElasticIp withIp(CharSequence ip) {
        this.ip = ip;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ElasticIp withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ip", ip).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(ip).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticIp) == false) {
            return false;
        }
        ElasticIp rhs = ((ElasticIp) other);
        return new EqualsBuilder().append(name, rhs.name).append(ip, rhs.ip).isEquals();
    }

}
