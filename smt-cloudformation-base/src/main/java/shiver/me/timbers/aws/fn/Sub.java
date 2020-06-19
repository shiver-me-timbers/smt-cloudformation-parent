package shiver.me.timbers.aws.fn;

import com.fasterxml.jackson.annotation.JsonProperty;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.Map;
import java.util.Objects;

import static java.lang.String.format;
import static java.util.Arrays.asList;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-sub.html">Fn::Sub</a>
 */
public class Sub extends PrimitiveProperty implements StringFunction {

    @JsonProperty("Fn::Sub")
    private final Object value;

    /**
     * @param string - A string with variables that AWS CloudFormation substitutes with their associated values at
     *               runtime. Write variables as ${MyVarName}.
     */
    public Sub(CharSequence string) {
        super(format("{ \"Fn::Sub\" : \"%s\" }", string));
        this.value = string;
    }

    /**
     * @param string    - A string with variables that AWS CloudFormation substitutes with their associated values at
     *                  runtime. Write variables as ${MyVarName}.
     * @param variables - A map where the keys is (The name of a variable that you included in the String parameter) and
     *                  the value is (The value that AWS CloudFormation substitutes for the associated variable name at
     *                  runtime).
     */
    public Sub(CharSequence string, Map<String, CharSequence> variables) {
        super(format("{ \"Fn::Sub\" : [\"%s\", %s] }", string, variables));
        this.value = asList(string, variables);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sub sub = (Sub) o;
        return Objects.equals(value, sub.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
