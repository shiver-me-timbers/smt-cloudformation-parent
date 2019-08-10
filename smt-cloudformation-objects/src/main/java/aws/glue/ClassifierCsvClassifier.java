
package aws.glue;

import java.util.ArrayList;
import java.util.List;
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
 * ClassifierCsvClassifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "QuoteSymbol",
    "ContainsHeader",
    "Delimiter",
    "Header",
    "AllowSingleColumn",
    "DisableValueTrimming",
    "Name"
})
public class ClassifierCsvClassifier implements Property<ClassifierCsvClassifier>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-quotesymbol
     * 
     */
    @JsonProperty("QuoteSymbol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-quotesymbol")
    private CharSequence quoteSymbol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containsheader
     * 
     */
    @JsonProperty("ContainsHeader")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containsheader")
    private CharSequence containsHeader;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-delimiter
     * 
     */
    @JsonProperty("Delimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-delimiter")
    private CharSequence delimiter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-header
     * 
     */
    @JsonProperty("Header")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-header")
    private List<CharSequence> header = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-allowsinglecolumn
     * 
     */
    @JsonProperty("AllowSingleColumn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-allowsinglecolumn")
    private CharSequence allowSingleColumn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-disablevaluetrimming
     * 
     */
    @JsonProperty("DisableValueTrimming")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-disablevaluetrimming")
    private CharSequence disableValueTrimming;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-quotesymbol
     * 
     */
    @JsonIgnore
    public CharSequence getQuoteSymbol() {
        return quoteSymbol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-quotesymbol
     * 
     */
    @JsonIgnore
    public void setQuoteSymbol(CharSequence quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
    }

    public ClassifierCsvClassifier withQuoteSymbol(CharSequence quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containsheader
     * 
     */
    @JsonIgnore
    public CharSequence getContainsHeader() {
        return containsHeader;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containsheader
     * 
     */
    @JsonIgnore
    public void setContainsHeader(CharSequence containsHeader) {
        this.containsHeader = containsHeader;
    }

    public ClassifierCsvClassifier withContainsHeader(CharSequence containsHeader) {
        this.containsHeader = containsHeader;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-delimiter
     * 
     */
    @JsonIgnore
    public CharSequence getDelimiter() {
        return delimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-delimiter
     * 
     */
    @JsonIgnore
    public void setDelimiter(CharSequence delimiter) {
        this.delimiter = delimiter;
    }

    public ClassifierCsvClassifier withDelimiter(CharSequence delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-header
     * 
     */
    @JsonIgnore
    public List<CharSequence> getHeader() {
        return header;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-header
     * 
     */
    @JsonIgnore
    public void setHeader(List<CharSequence> header) {
        this.header = header;
    }

    public ClassifierCsvClassifier withHeader(List<CharSequence> header) {
        this.header = header;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-allowsinglecolumn
     * 
     */
    @JsonIgnore
    public CharSequence getAllowSingleColumn() {
        return allowSingleColumn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-allowsinglecolumn
     * 
     */
    @JsonIgnore
    public void setAllowSingleColumn(CharSequence allowSingleColumn) {
        this.allowSingleColumn = allowSingleColumn;
    }

    public ClassifierCsvClassifier withAllowSingleColumn(CharSequence allowSingleColumn) {
        this.allowSingleColumn = allowSingleColumn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-disablevaluetrimming
     * 
     */
    @JsonIgnore
    public CharSequence getDisableValueTrimming() {
        return disableValueTrimming;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-disablevaluetrimming
     * 
     */
    @JsonIgnore
    public void setDisableValueTrimming(CharSequence disableValueTrimming) {
        this.disableValueTrimming = disableValueTrimming;
    }

    public ClassifierCsvClassifier withDisableValueTrimming(CharSequence disableValueTrimming) {
        this.disableValueTrimming = disableValueTrimming;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ClassifierCsvClassifier withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quoteSymbol", quoteSymbol).append("containsHeader", containsHeader).append("delimiter", delimiter).append("header", header).append("allowSingleColumn", allowSingleColumn).append("disableValueTrimming", disableValueTrimming).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(disableValueTrimming).append(delimiter).append(allowSingleColumn).append(name).append(header).append(containsHeader).append(quoteSymbol).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassifierCsvClassifier) == false) {
            return false;
        }
        ClassifierCsvClassifier rhs = ((ClassifierCsvClassifier) other);
        return new EqualsBuilder().append(disableValueTrimming, rhs.disableValueTrimming).append(delimiter, rhs.delimiter).append(allowSingleColumn, rhs.allowSingleColumn).append(name, rhs.name).append(header, rhs.header).append(containsHeader, rhs.containsHeader).append(quoteSymbol, rhs.quoteSymbol).isEquals();
    }

}
