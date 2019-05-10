
package aws.iotanalytics;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Action
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ActionName",
    "ContainerAction",
    "QueryAction"
})
public class Action {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname
     * 
     */
    @JsonProperty("ActionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname")
    private CharSequence actionName;
    /**
     * ContainerAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html
     * 
     */
    @JsonProperty("ContainerAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html")
    private ContainerAction containerAction;
    /**
     * QueryAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
     * 
     */
    @JsonProperty("QueryAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html")
    private QueryAction queryAction;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname
     * 
     */
    @JsonIgnore
    public CharSequence getActionName() {
        return actionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname
     * 
     */
    @JsonIgnore
    public void setActionName(CharSequence actionName) {
        this.actionName = actionName;
    }

    public Action withActionName(CharSequence actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * ContainerAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html
     * 
     */
    @JsonIgnore
    public ContainerAction getContainerAction() {
        return containerAction;
    }

    /**
     * ContainerAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html
     * 
     */
    @JsonIgnore
    public void setContainerAction(ContainerAction containerAction) {
        this.containerAction = containerAction;
    }

    public Action withContainerAction(ContainerAction containerAction) {
        this.containerAction = containerAction;
        return this;
    }

    /**
     * QueryAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
     * 
     */
    @JsonIgnore
    public QueryAction getQueryAction() {
        return queryAction;
    }

    /**
     * QueryAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
     * 
     */
    @JsonIgnore
    public void setQueryAction(QueryAction queryAction) {
        this.queryAction = queryAction;
    }

    public Action withQueryAction(QueryAction queryAction) {
        this.queryAction = queryAction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actionName", actionName).append("containerAction", containerAction).append("queryAction", queryAction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(queryAction).append(actionName).append(containerAction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return new EqualsBuilder().append(queryAction, rhs.queryAction).append(actionName, rhs.actionName).append(containerAction, rhs.containerAction).isEquals();
    }

}
