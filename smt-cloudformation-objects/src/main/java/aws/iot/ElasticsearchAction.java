
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticsearchAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Endpoint",
    "Id",
    "Index",
    "RoleArn",
    "Type"
})
public class ElasticsearchAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint")
    private String endpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id")
    private String id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index
     * 
     */
    @JsonProperty("Index")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index")
    private String index;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn")
    private String roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type")
    private String type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ElasticsearchAction withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id
     * 
     */
    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id
     * 
     */
    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    public ElasticsearchAction withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index
     * 
     */
    @JsonProperty("Index")
    public String getIndex() {
        return index;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index
     * 
     */
    @JsonProperty("Index")
    public void setIndex(String index) {
        this.index = index;
    }

    public ElasticsearchAction withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    public ElasticsearchAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type
     * 
     */
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type
     * 
     */
    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public ElasticsearchAction withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endpoint", endpoint).append("id", id).append("index", index).append("roleArn", roleArn).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(index).append(endpoint).append(id).append(type).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticsearchAction) == false) {
            return false;
        }
        ElasticsearchAction rhs = ((ElasticsearchAction) other);
        return new EqualsBuilder().append(index, rhs.index).append(endpoint, rhs.endpoint).append(id, rhs.id).append(type, rhs.type).append(roleArn, rhs.roleArn).isEquals();
    }

}
