package aws;

import aws.fn.ConditionFunction;

public class Templates {

    public static Condition condition(String name, ConditionFunction condition) {
        return new Condition(name, condition);
    }
}
