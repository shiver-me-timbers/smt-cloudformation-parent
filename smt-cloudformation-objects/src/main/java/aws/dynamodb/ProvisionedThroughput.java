
package aws.dynamodb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ProvisionedThroughput
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReadCapacityUnits",
    "WriteCapacityUnits"
})
public class ProvisionedThroughput {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits
     * 
     */
    @JsonProperty("ReadCapacityUnits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits")
    private Integer readCapacityUnits;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits
     * 
     */
    @JsonProperty("WriteCapacityUnits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits")
    private Integer writeCapacityUnits;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits
     * 
     */
    public Integer getReadCapacityUnits() {
        return readCapacityUnits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits
     * 
     */
    public void setReadCapacityUnits(Integer readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    public ProvisionedThroughput withReadCapacityUnits(Integer readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits
     * 
     */
    public Integer getWriteCapacityUnits() {
        return writeCapacityUnits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits
     * 
     */
    public void setWriteCapacityUnits(Integer writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }

    public ProvisionedThroughput withWriteCapacityUnits(Integer writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("readCapacityUnits", readCapacityUnits).append("writeCapacityUnits", writeCapacityUnits).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(writeCapacityUnits).append(readCapacityUnits).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProvisionedThroughput) == false) {
            return false;
        }
        ProvisionedThroughput rhs = ((ProvisionedThroughput) other);
        return new EqualsBuilder().append(writeCapacityUnits, rhs.writeCapacityUnits).append(readCapacityUnits, rhs.readCapacityUnits).isEquals();
    }

}
