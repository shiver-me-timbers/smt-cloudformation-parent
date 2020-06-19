package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.Objects;

import static java.lang.String.format;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">Fn::ImportValue</a>
 */
public class ImportValue extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::ImportValue")
    private final CharSequence sharedValueToImport;

    /**
     * @param sharedValueToImport - The stack output value that you want to import.
     */
    public ImportValue(CharSequence sharedValueToImport) {
        super(format("{ \"Fn::ImportValue\" : \"%s\" }", sharedValueToImport));
        this.sharedValueToImport = sharedValueToImport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImportValue that = (ImportValue) o;
        return Objects.equals(sharedValueToImport, that.sharedValueToImport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedValueToImport);
    }
}
