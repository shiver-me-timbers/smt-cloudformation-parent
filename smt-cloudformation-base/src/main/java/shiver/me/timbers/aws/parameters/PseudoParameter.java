package shiver.me.timbers.aws.parameters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import shiver.me.timbers.aws.HasReference;
import shiver.me.timbers.aws.PrimitiveProperty;

import java.util.EnumSet;

import static java.lang.String.format;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/pseudo-parameter-reference.html">Pseudo Parameters</a>
 */
public enum PseudoParameter implements CharSequence, HasReference {
    AccountId("AWS::AccountId"),
    NotificationARNs("AWS::NotificationARNs"),
    NoValue("AWS::NoValue"),
    Partition("AWS::Partition"),
    Region("AWS::Region"),
    StackId("AWS::StackId"),
    StackName("AWS::StackName"),
    URLSuffix("AWS::URLSuffix");

    public static final EnumSet<PseudoParameter> PSEUDO_PARAMETERS = EnumSet.allOf(PseudoParameter.class);

    @JsonCreator
    public static PseudoParameter fromValue(String value) {
        return PSEUDO_PARAMETERS.stream().filter(parameter -> parameter.getName().equals(value)).findFirst()
            .orElseThrow(
                () -> new PseudoParameterException(format("There is no PseudoParameter with the name (%s).", value))
            );
    }

    @JsonIgnore
    private final PrimitiveProperty property;

    PseudoParameter(String name) {
        this.property = new PrimitiveProperty(name);
    }

    @JsonValue
    @Override
    public String getName() {
        return toString();
    }

    @Override
    public int length() {
        return property.length();
    }

    @Override
    public char charAt(int index) {
        return property.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return property.subSequence(start, end);
    }

    @Override
    public String toString() {
        return property.toString();
    }
}
