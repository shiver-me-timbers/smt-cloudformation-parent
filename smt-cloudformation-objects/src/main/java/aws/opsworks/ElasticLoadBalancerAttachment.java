
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticLoadBalancerAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ElasticLoadBalancerName",
    "LayerId"
})
public class ElasticLoadBalancerAttachment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-elbname
     * 
     */
    @JsonProperty("ElasticLoadBalancerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-elbname")
    private String elasticLoadBalancerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-layerid
     * 
     */
    @JsonProperty("LayerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-layerid")
    private String layerId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-elbname
     * 
     */
    @JsonProperty("ElasticLoadBalancerName")
    public String getElasticLoadBalancerName() {
        return elasticLoadBalancerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-elbname
     * 
     */
    @JsonProperty("ElasticLoadBalancerName")
    public void setElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
    }

    public ElasticLoadBalancerAttachment withElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-layerid
     * 
     */
    @JsonProperty("LayerId")
    public String getLayerId() {
        return layerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-layerid
     * 
     */
    @JsonProperty("LayerId")
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    public ElasticLoadBalancerAttachment withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("elasticLoadBalancerName", elasticLoadBalancerName).append("layerId", layerId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(elasticLoadBalancerName).append(layerId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticLoadBalancerAttachment) == false) {
            return false;
        }
        ElasticLoadBalancerAttachment rhs = ((ElasticLoadBalancerAttachment) other);
        return new EqualsBuilder().append(elasticLoadBalancerName, rhs.elasticLoadBalancerName).append(layerId, rhs.layerId).isEquals();
    }

}