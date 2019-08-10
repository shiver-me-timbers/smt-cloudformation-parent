package aws.iam;

import aws.Property;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal extends HashMap<String, List<CharSequence>> implements Property<Principal> {

    public Principal() {
    }

    public Principal(Map<String, List<CharSequence>> map) {
        super(map);
    }
}
