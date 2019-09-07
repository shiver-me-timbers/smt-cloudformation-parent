
package aws.lakeformation;

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
 * DataLakeSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Admins"
})
public class DataLakeSettings {

    /**
     * DataLakeSettingsAdmins
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-admins.html
     * 
     */
    @JsonProperty("Admins")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-admins.html")
    private Property<DataLakeSettingsAdmins> admins;

    /**
     * DataLakeSettingsAdmins
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-admins.html
     * 
     */
    @JsonIgnore
    public Property<DataLakeSettingsAdmins> getAdmins() {
        return admins;
    }

    /**
     * DataLakeSettingsAdmins
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-admins.html
     * 
     */
    @JsonIgnore
    public void setAdmins(Property<DataLakeSettingsAdmins> admins) {
        this.admins = admins;
    }

    public DataLakeSettings withAdmins(Property<DataLakeSettingsAdmins> admins) {
        this.admins = admins;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("admins", admins).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(admins).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataLakeSettings) == false) {
            return false;
        }
        DataLakeSettings rhs = ((DataLakeSettings) other);
        return new EqualsBuilder().append(admins, rhs.admins).isEquals();
    }

}
