package shiver.me.timbers.aws.fn;

import shiver.me.timbers.aws.Condition;
import shiver.me.timbers.aws.HasAttributes;
import shiver.me.timbers.aws.HasName;

import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html">Intrinsic Functions</a>
 */
public class Functions {

    /**
     * @see Base64
     */
    public static Base64 fnBase64(CharSequence value) {
        return new Base64(value);
    }

    /**
     * @see Cidr
     */
    public static Cidr fnCidr(CharSequence ipBlock, CharSequence count, CharSequence cidrBits) {
        return new Cidr(ipBlock, count, cidrBits);
    }

    /**
     * @see FindInMap
     */
    public static FindInMap fnFindInMap(CharSequence mapName, CharSequence topLevelKey, CharSequence secondLevelKey) {
        return new FindInMap(mapName, topLevelKey, secondLevelKey);
    }

    /**
     * @see GetAtt
     */
    public static <T, R extends HasName & HasAttributes<T>> GetAtt fnGetAtt(R resource, T attribute) {
        return new GetAtt(resource, attribute);
    }

    /**
     * @see GetAZs
     */
    public static GetAZs fnGetAZs(CharSequence region) {
        return new GetAZs(region);
    }

    /**
     * @see ImportValue
     */
    public static ImportValue fnImportValue(CharSequence sharedValueToImport) {
        return new ImportValue(sharedValueToImport);
    }

    /**
     * @see Join
     */
    public static Join fnJoin(String delimiter, CharSequence... listOfValues) {
        return new Join(delimiter, listOfValues);
    }

    /**
     * @see Join
     */
    public static Join fnJoin(String delimiter, List<CharSequence> listOfValues) {
        return new Join(delimiter, listOfValues);
    }

    /**
     * @see Select
     */
    public static Select fnSelect(int index, String... listOfStrings) {
        return new Select(index, listOfStrings);
    }

    /**
     * @see Select
     */
    public static Select fnSelect(int index, List<String> listOfStrings) {
        return new Select(index, listOfStrings);
    }

    /**
     * @see Select
     */
    public static Select fnSelect(int index, Function function) {
        return new Select(index, function);
    }

    /**
     * @see Split
     */
    public static Split fnSplit(String delimiter, CharSequence string) {
        return new Split(delimiter, string);
    }

    /**
     * @see Sub
     */
    public static Sub fnSub(CharSequence string) {
        return new Sub(string);
    }

    /**
     * @see Sub
     */
    public static Sub fnSub(CharSequence string, Map<String, CharSequence> variables) {
        return new Sub(string, variables);
    }

    /**
     * @see Equals
     */
    public static <T> Equals<T> fnEquals(T value1, T value2) {
        return new Equals<>(value1, value2);
    }

    /**
     * @see And
     */
    public static And fnAnd(ConditionFunction... conditions) {
        return new And(conditions);
    }

    /**
     * @see And
     */
    public static And fnAnd(List<ConditionFunction> conditions) {
        return new And(conditions);
    }

    /**
     * @see Or
     */
    public static Or fnOr(ConditionFunction... conditions) {
        return new Or(conditions);
    }

    /**
     * @see Or
     */
    public static Or fnOr(List<ConditionFunction> conditions) {
        return new Or(conditions);
    }

    /**
     * @see Not
     */
    public static Not fnNot(ConditionFunction condition) {
        return new Not(condition);
    }

    /**
     * @see If
     */
    public static <T> If<T> fnIf(Condition condition, T trueValue, T falseValue) {
        return new If<>(condition, trueValue, falseValue);
    }

    /**
     * @see If
     */
    public static <T> If<T> fnIf(Condition condition, T trueValue) {
        return new If<>(condition, trueValue);
    }

    /**
     * @see Reference
     */
    public static Reference ref(String logicalName) {
        return new Reference(logicalName);
    }
}
