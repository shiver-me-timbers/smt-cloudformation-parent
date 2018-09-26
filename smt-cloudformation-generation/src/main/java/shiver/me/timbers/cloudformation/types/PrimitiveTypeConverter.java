package shiver.me.timbers.cloudformation.types;

import java.util.Map;

public class PrimitiveTypeConverter {

    private final Map<String, Map<String, Object>> typeMap;

    public PrimitiveTypeConverter(Map<String, Map<String, Object>> typeMap) {
        this.typeMap = typeMap;
    }

    public Map<String, Object> convert(String type) {
        return typeMap.get(type);
    }
}
