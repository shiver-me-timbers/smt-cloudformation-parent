
package shiver.me.timbers.aws.resourcegroups;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * GroupQuery
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceTypeFilters",
    "StackIdentifier",
    "TagFilters"
})
public class GroupQuery implements Property<GroupQuery>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-resourcetypefilters
     * 
     */
    @JsonProperty("ResourceTypeFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-resourcetypefilters")
    private List<CharSequence> resourceTypeFilters = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-stackidentifier
     * 
     */
    @JsonProperty("StackIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-stackidentifier")
    private CharSequence stackIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-tagfilters
     * 
     */
    @JsonProperty("TagFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-tagfilters")
    private List<Property<GroupTagFilter>> tagFilters = new ArrayList<Property<GroupTagFilter>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-resourcetypefilters
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-resourcetypefilters
     * 
     */
    @JsonIgnore
    public void setResourceTypeFilters(List<CharSequence> resourceTypeFilters) {
        this.resourceTypeFilters = resourceTypeFilters;
    }

    public GroupQuery withResourceTypeFilters(List<CharSequence> resourceTypeFilters) {
        this.resourceTypeFilters = resourceTypeFilters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-stackidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getStackIdentifier() {
        return stackIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-stackidentifier
     * 
     */
    @JsonIgnore
    public void setStackIdentifier(CharSequence stackIdentifier) {
        this.stackIdentifier = stackIdentifier;
    }

    public GroupQuery withStackIdentifier(CharSequence stackIdentifier) {
        this.stackIdentifier = stackIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-tagfilters
     * 
     */
    @JsonIgnore
    public List<Property<GroupTagFilter>> getTagFilters() {
        return tagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-tagfilters
     * 
     */
    @JsonIgnore
    public void setTagFilters(List<Property<GroupTagFilter>> tagFilters) {
        this.tagFilters = tagFilters;
    }

    public GroupQuery withTagFilters(List<Property<GroupTagFilter>> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceTypeFilters", resourceTypeFilters).append("stackIdentifier", stackIdentifier).append("tagFilters", tagFilters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stackIdentifier).append(resourceTypeFilters).append(tagFilters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupQuery) == false) {
            return false;
        }
        GroupQuery rhs = ((GroupQuery) other);
        return new EqualsBuilder().append(stackIdentifier, rhs.stackIdentifier).append(resourceTypeFilters, rhs.resourceTypeFilters).append(tagFilters, rhs.tagFilters).isEquals();
    }

}
