
package aws.elasticloadbalancingv2;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ListenerRuleRuleCondition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Field",
    "HostHeaderConfig",
    "HttpHeaderConfig",
    "HttpRequestMethodConfig",
    "PathPatternConfig",
    "QueryStringConfig",
    "SourceIpConfig",
    "Values"
})
public class ListenerRuleRuleCondition implements Property<ListenerRuleRuleCondition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field
     * 
     */
    @JsonProperty("Field")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field")
    private CharSequence field;
    /**
     * ListenerRuleHostHeaderConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html
     * 
     */
    @JsonProperty("HostHeaderConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html")
    private Property<ListenerRuleHostHeaderConfig> hostHeaderConfig;
    /**
     * ListenerRuleHttpHeaderConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html
     * 
     */
    @JsonProperty("HttpHeaderConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html")
    private Property<ListenerRuleHttpHeaderConfig> httpHeaderConfig;
    /**
     * ListenerRuleHttpRequestMethodConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html
     * 
     */
    @JsonProperty("HttpRequestMethodConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html")
    private Property<ListenerRuleHttpRequestMethodConfig> httpRequestMethodConfig;
    /**
     * ListenerRulePathPatternConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-pathpatternconfig.html
     * 
     */
    @JsonProperty("PathPatternConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-pathpatternconfig.html")
    private Property<ListenerRulePathPatternConfig> pathPatternConfig;
    /**
     * ListenerRuleQueryStringConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html
     * 
     */
    @JsonProperty("QueryStringConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html")
    private Property<ListenerRuleQueryStringConfig> queryStringConfig;
    /**
     * ListenerRuleSourceIpConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html
     * 
     */
    @JsonProperty("SourceIpConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html")
    private Property<ListenerRuleSourceIpConfig> sourceIpConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values
     * 
     */
    @JsonProperty("Values")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values")
    private Set<CharSequence> values = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field
     * 
     */
    @JsonIgnore
    public CharSequence getField() {
        return field;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field
     * 
     */
    @JsonIgnore
    public void setField(CharSequence field) {
        this.field = field;
    }

    public ListenerRuleRuleCondition withField(CharSequence field) {
        this.field = field;
        return this;
    }

    /**
     * ListenerRuleHostHeaderConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleHostHeaderConfig> getHostHeaderConfig() {
        return hostHeaderConfig;
    }

    /**
     * ListenerRuleHostHeaderConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html
     * 
     */
    @JsonIgnore
    public void setHostHeaderConfig(Property<ListenerRuleHostHeaderConfig> hostHeaderConfig) {
        this.hostHeaderConfig = hostHeaderConfig;
    }

    public ListenerRuleRuleCondition withHostHeaderConfig(Property<ListenerRuleHostHeaderConfig> hostHeaderConfig) {
        this.hostHeaderConfig = hostHeaderConfig;
        return this;
    }

    /**
     * ListenerRuleHttpHeaderConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleHttpHeaderConfig> getHttpHeaderConfig() {
        return httpHeaderConfig;
    }

    /**
     * ListenerRuleHttpHeaderConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html
     * 
     */
    @JsonIgnore
    public void setHttpHeaderConfig(Property<ListenerRuleHttpHeaderConfig> httpHeaderConfig) {
        this.httpHeaderConfig = httpHeaderConfig;
    }

    public ListenerRuleRuleCondition withHttpHeaderConfig(Property<ListenerRuleHttpHeaderConfig> httpHeaderConfig) {
        this.httpHeaderConfig = httpHeaderConfig;
        return this;
    }

    /**
     * ListenerRuleHttpRequestMethodConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleHttpRequestMethodConfig> getHttpRequestMethodConfig() {
        return httpRequestMethodConfig;
    }

    /**
     * ListenerRuleHttpRequestMethodConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html
     * 
     */
    @JsonIgnore
    public void setHttpRequestMethodConfig(Property<ListenerRuleHttpRequestMethodConfig> httpRequestMethodConfig) {
        this.httpRequestMethodConfig = httpRequestMethodConfig;
    }

    public ListenerRuleRuleCondition withHttpRequestMethodConfig(Property<ListenerRuleHttpRequestMethodConfig> httpRequestMethodConfig) {
        this.httpRequestMethodConfig = httpRequestMethodConfig;
        return this;
    }

    /**
     * ListenerRulePathPatternConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-pathpatternconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRulePathPatternConfig> getPathPatternConfig() {
        return pathPatternConfig;
    }

    /**
     * ListenerRulePathPatternConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-pathpatternconfig.html
     * 
     */
    @JsonIgnore
    public void setPathPatternConfig(Property<ListenerRulePathPatternConfig> pathPatternConfig) {
        this.pathPatternConfig = pathPatternConfig;
    }

    public ListenerRuleRuleCondition withPathPatternConfig(Property<ListenerRulePathPatternConfig> pathPatternConfig) {
        this.pathPatternConfig = pathPatternConfig;
        return this;
    }

    /**
     * ListenerRuleQueryStringConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleQueryStringConfig> getQueryStringConfig() {
        return queryStringConfig;
    }

    /**
     * ListenerRuleQueryStringConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html
     * 
     */
    @JsonIgnore
    public void setQueryStringConfig(Property<ListenerRuleQueryStringConfig> queryStringConfig) {
        this.queryStringConfig = queryStringConfig;
    }

    public ListenerRuleRuleCondition withQueryStringConfig(Property<ListenerRuleQueryStringConfig> queryStringConfig) {
        this.queryStringConfig = queryStringConfig;
        return this;
    }

    /**
     * ListenerRuleSourceIpConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleSourceIpConfig> getSourceIpConfig() {
        return sourceIpConfig;
    }

    /**
     * ListenerRuleSourceIpConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html
     * 
     */
    @JsonIgnore
    public void setSourceIpConfig(Property<ListenerRuleSourceIpConfig> sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
    }

    public ListenerRuleRuleCondition withSourceIpConfig(Property<ListenerRuleSourceIpConfig> sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getValues() {
        return values;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values
     * 
     */
    @JsonIgnore
    public void setValues(Set<CharSequence> values) {
        this.values = values;
    }

    public ListenerRuleRuleCondition withValues(Set<CharSequence> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("field", field).append("hostHeaderConfig", hostHeaderConfig).append("httpHeaderConfig", httpHeaderConfig).append("httpRequestMethodConfig", httpRequestMethodConfig).append("pathPatternConfig", pathPatternConfig).append("queryStringConfig", queryStringConfig).append("sourceIpConfig", sourceIpConfig).append("values", values).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hostHeaderConfig).append(pathPatternConfig).append(sourceIpConfig).append(field).append(queryStringConfig).append(httpHeaderConfig).append(values).append(httpRequestMethodConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerRuleRuleCondition) == false) {
            return false;
        }
        ListenerRuleRuleCondition rhs = ((ListenerRuleRuleCondition) other);
        return new EqualsBuilder().append(hostHeaderConfig, rhs.hostHeaderConfig).append(pathPatternConfig, rhs.pathPatternConfig).append(sourceIpConfig, rhs.sourceIpConfig).append(field, rhs.field).append(queryStringConfig, rhs.queryStringConfig).append(httpHeaderConfig, rhs.httpHeaderConfig).append(values, rhs.values).append(httpRequestMethodConfig, rhs.httpRequestMethodConfig).isEquals();
    }

}
