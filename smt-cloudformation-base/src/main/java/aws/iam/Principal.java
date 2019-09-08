package aws.iam;

import aws.Property;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">Principal</a>
 * @see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_notprincipal.html">NotPrincipal</a>
 */
public class Principal extends HashMap<String, List<CharSequence>> implements Property<Principal> {

    /**
     * Create an empty Principal.
     */
    public Principal() {
    }

    /**
     * Create a new principal that contains some named targets.
     *
     * @param map - A map contains the named targets.
     */
    public Principal(Map<String, List<CharSequence>> map) {
        super(map);
    }
}
