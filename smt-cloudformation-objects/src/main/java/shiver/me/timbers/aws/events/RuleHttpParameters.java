
package shiver.me.timbers.aws.events;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * RuleHttpParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HeaderParameters",
    "PathParameterValues",
    "QueryStringParameters"
})
public class RuleHttpParameters implements Property<RuleHttpParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-headerparameters
     * 
     */
    @JsonProperty("HeaderParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-headerparameters")
    private Map<String, CharSequence> headerParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-pathparametervalues
     * 
     */
    @JsonProperty("PathParameterValues")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-pathparametervalues")
    private Set<CharSequence> pathParameterValues = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-querystringparameters
     * 
     */
    @JsonProperty("QueryStringParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-querystringparameters")
    private Map<String, CharSequence> queryStringParameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-headerparameters
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getHeaderParameters() {
        return headerParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-headerparameters
     * 
     */
    @JsonIgnore
    public void setHeaderParameters(Map<String, CharSequence> headerParameters) {
        this.headerParameters = headerParameters;
    }

    public RuleHttpParameters withHeaderParameters(Map<String, CharSequence> headerParameters) {
        this.headerParameters = headerParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-pathparametervalues
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getPathParameterValues() {
        return pathParameterValues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-pathparametervalues
     * 
     */
    @JsonIgnore
    public void setPathParameterValues(Set<CharSequence> pathParameterValues) {
        this.pathParameterValues = pathParameterValues;
    }

    public RuleHttpParameters withPathParameterValues(Set<CharSequence> pathParameterValues) {
        this.pathParameterValues = pathParameterValues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-querystringparameters
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getQueryStringParameters() {
        return queryStringParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-querystringparameters
     * 
     */
    @JsonIgnore
    public void setQueryStringParameters(Map<String, CharSequence> queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
    }

    public RuleHttpParameters withQueryStringParameters(Map<String, CharSequence> queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("headerParameters", headerParameters).append("pathParameterValues", pathParameterValues).append("queryStringParameters", queryStringParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pathParameterValues).append(queryStringParameters).append(headerParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleHttpParameters) == false) {
            return false;
        }
        RuleHttpParameters rhs = ((RuleHttpParameters) other);
        return new EqualsBuilder().append(pathParameterValues, rhs.pathParameterValues).append(queryStringParameters, rhs.queryStringParameters).append(headerParameters, rhs.headerParameters).isEquals();
    }

}
