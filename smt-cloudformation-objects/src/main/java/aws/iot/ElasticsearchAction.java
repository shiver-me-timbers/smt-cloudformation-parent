
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
    private CharSequence endpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index
     * 
     */
    @JsonProperty("Index")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index")
    private CharSequence index;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint
     * 
     */
    public CharSequence getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint
     * 
     */
    public void setEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
    }

    public ElasticsearchAction withEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public ElasticsearchAction withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index
     * 
     */
    public CharSequence getIndex() {
        return index;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index
     * 
     */
    public void setIndex(CharSequence index) {
        this.index = index;
    }

    public ElasticsearchAction withIndex(CharSequence index) {
        this.index = index;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public ElasticsearchAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ElasticsearchAction withType(CharSequence type) {
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
