package shiver.me.timbers.cloudformation;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static shiver.me.timbers.data.random.RandomIntegers.someIntegerBetween;
import static shiver.me.timbers.data.random.RandomStrings.someAlphaString;

public class Cloudformation {

    public static String packageName() {
        return IntStream.range(0, someIntegerBetween(2, 5))
            .mapToObj(index -> someAlphaString(5)).collect(Collectors.joining("::"));
    }
}
