package aws.fn;

import aws.HasAttributes;
import aws.HasName;

import java.util.List;
import java.util.Map;

public class Functions {

    public static Base64 fnBase64(CharSequence value) {
        return new Base64(value);
    }

    public static Cidr fnCidr(CharSequence ipBlock, CharSequence count, CharSequence cidrBits) {
        return new Cidr(ipBlock, count, cidrBits);
    }

    public static FindInMap fnFindInMap(CharSequence mapName, CharSequence topLevelKey, CharSequence secondLevelKey) {
        return new FindInMap(mapName, topLevelKey, secondLevelKey);
    }

    public static <T, R extends HasName & HasAttributes<T>> GetAtt fnGetAtt(R resource, T attribute) {
        return new GetAtt(resource, attribute);
    }

    public static GetAZs fnGetAZs(CharSequence value) {
        return new GetAZs(value);
    }

    public static ImportValue fnImportValue(CharSequence value) {
        return new ImportValue(value);
    }

    public static Join fnJoin(String delimiter, String... strings) {
        return new Join(delimiter, strings);
    }

    public static Join fnJoin(String delimiter, List<String> strings) {
        return new Join(delimiter, strings);
    }

    public static Select fnSelect(int index, String... strings) {
        return new Select(index, strings);
    }

    public static Select fnSelect(int index, List<String> strings) {
        return new Select(index, strings);
    }

    public static Select fnSelect(int index, Function function) {
        return new Select(index, function);
    }

    public static Split fnSplit(String delimiter, CharSequence string) {
        return new Split(delimiter, string);
    }

    public static Sub fnSub(CharSequence string) {
        return new Sub(string);
    }

    public static Sub fnSub(CharSequence string, Map<String, CharSequence> variables) {
        return new Sub(string, variables);
    }

    public static <T> Equals<T> fnEquals(T left, T right) {
        return new Equals<>(left, right);
    }

    public static And fnAnd(ConditionFunction... conditions) {
        return new And(conditions);
    }

    public static And fnAnd(List<ConditionFunction> conditions) {
        return new And(conditions);
    }

    public static Or fnOr(ConditionFunction... conditions) {
        return new Or(conditions);
    }

    public static Or fnOr(List<ConditionFunction> conditions) {
        return new Or(conditions);
    }

    public static Not fnNot(ConditionFunction condition) {
        return new Not(condition);
    }

    public static <T> If<T> fnIf(String condition, T trueValue, T falseValue) {
        return new If<>(condition, trueValue, falseValue);
    }

    public static <T> If<T> fnIf(String condition, T trueValue) {
        return new If<>(condition, trueValue);
    }

    public static Reference ref(String name) {
        return new Reference(name);
    }
}
