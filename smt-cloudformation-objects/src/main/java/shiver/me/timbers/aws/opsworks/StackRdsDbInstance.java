
package shiver.me.timbers.aws.opsworks;

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
 * StackRdsDbInstance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DbPassword",
    "DbUser",
    "RdsDbInstanceArn"
})
public class StackRdsDbInstance implements Property<StackRdsDbInstance>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword
     * 
     */
    @JsonProperty("DbPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword")
    private CharSequence dbPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser
     * 
     */
    @JsonProperty("DbUser")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser")
    private CharSequence dbUser;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn
     * 
     */
    @JsonProperty("RdsDbInstanceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn")
    private CharSequence rdsDbInstanceArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword
     * 
     */
    @JsonIgnore
    public CharSequence getDbPassword() {
        return dbPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword
     * 
     */
    @JsonIgnore
    public void setDbPassword(CharSequence dbPassword) {
        this.dbPassword = dbPassword;
    }

    public StackRdsDbInstance withDbPassword(CharSequence dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser
     * 
     */
    @JsonIgnore
    public CharSequence getDbUser() {
        return dbUser;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser
     * 
     */
    @JsonIgnore
    public void setDbUser(CharSequence dbUser) {
        this.dbUser = dbUser;
    }

    public StackRdsDbInstance withDbUser(CharSequence dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn
     * 
     */
    @JsonIgnore
    public CharSequence getRdsDbInstanceArn() {
        return rdsDbInstanceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn
     * 
     */
    @JsonIgnore
    public void setRdsDbInstanceArn(CharSequence rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }

    public StackRdsDbInstance withRdsDbInstanceArn(CharSequence rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dbPassword", dbPassword).append("dbUser", dbUser).append("rdsDbInstanceArn", rdsDbInstanceArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbUser).append(rdsDbInstanceArn).append(dbPassword).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackRdsDbInstance) == false) {
            return false;
        }
        StackRdsDbInstance rhs = ((StackRdsDbInstance) other);
        return new EqualsBuilder().append(dbUser, rhs.dbUser).append(rdsDbInstanceArn, rhs.rdsDbInstanceArn).append(dbPassword, rhs.dbPassword).isEquals();
    }

}
