
package aws.waf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SqlInjectionMatchTuple
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FieldToMatch",
    "TextTransformation"
})
public class SqlInjectionMatchTuple {

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    @JsonProperty("FieldToMatch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html")
    private FieldToMatch fieldToMatch;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation
     * 
     */
    @JsonProperty("TextTransformation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation")
    private CharSequence textTransformation;

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    public FieldToMatch getFieldToMatch() {
        return fieldToMatch;
    }

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    public SqlInjectionMatchTuple withFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation
     * 
     */
    public CharSequence getTextTransformation() {
        return textTransformation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation
     * 
     */
    public void setTextTransformation(CharSequence textTransformation) {
        this.textTransformation = textTransformation;
    }

    public SqlInjectionMatchTuple withTextTransformation(CharSequence textTransformation) {
        this.textTransformation = textTransformation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fieldToMatch", fieldToMatch).append("textTransformation", textTransformation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(textTransformation).append(fieldToMatch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SqlInjectionMatchTuple) == false) {
            return false;
        }
        SqlInjectionMatchTuple rhs = ((SqlInjectionMatchTuple) other);
        return new EqualsBuilder().append(textTransformation, rhs.textTransformation).append(fieldToMatch, rhs.fieldToMatch).isEquals();
    }

}
