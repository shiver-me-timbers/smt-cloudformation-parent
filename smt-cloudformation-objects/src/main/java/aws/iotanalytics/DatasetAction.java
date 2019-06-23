
package aws.iotanalytics;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DatasetAction
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
public class DatasetAction implements Property<DatasetAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname
     * 
     */
    @JsonProperty("ActionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname")
    private CharSequence actionName;
    /**
     * DatasetContainerAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html
     * 
     */
    @JsonProperty("ContainerAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html")
    private Property<DatasetContainerAction> containerAction;
    /**
     * DatasetQueryAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
     * 
     */
    @JsonProperty("QueryAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html")
    private Property<DatasetQueryAction> queryAction;

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

    public DatasetAction withActionName(CharSequence actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * DatasetContainerAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html
     * 
     */
    @JsonIgnore
    public Property<DatasetContainerAction> getContainerAction() {
        return containerAction;
    }

    /**
     * DatasetContainerAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html
     * 
     */
    @JsonIgnore
    public void setContainerAction(Property<DatasetContainerAction> containerAction) {
        this.containerAction = containerAction;
    }

    public DatasetAction withContainerAction(Property<DatasetContainerAction> containerAction) {
        this.containerAction = containerAction;
        return this;
    }

    /**
     * DatasetQueryAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
     * 
     */
    @JsonIgnore
    public Property<DatasetQueryAction> getQueryAction() {
        return queryAction;
    }

    /**
     * DatasetQueryAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html
     * 
     */
    @JsonIgnore
    public void setQueryAction(Property<DatasetQueryAction> queryAction) {
        this.queryAction = queryAction;
    }

    public DatasetAction withQueryAction(Property<DatasetQueryAction> queryAction) {
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
        if ((other instanceof DatasetAction) == false) {
            return false;
        }
        DatasetAction rhs = ((DatasetAction) other);
        return new EqualsBuilder().append(queryAction, rhs.queryAction).append(actionName, rhs.actionName).append(containerAction, rhs.containerAction).isEquals();
    }

}
