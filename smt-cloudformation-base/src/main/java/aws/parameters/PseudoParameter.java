package aws.parameters;

import aws.HasReference;
import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;

import static java.lang.String.format;

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
    private final StringProperty property;

    PseudoParameter(String name) {
        this.property = new StringProperty(name);
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
