package aws.iam;

import aws.Property;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">Condition</a>
 */
public class Condition extends HashMap<String, Map<String, List<CharSequence>>> implements Property<Condition> {
}
