package shiver.me.timbers.cloudformation.types;

import java.util.Map;

public class PrimitiveTypeConverter {

    private final Map<String, String> typeMap;

    public PrimitiveTypeConverter(Map<String, String> typeMap) {
        this.typeMap = typeMap;
    }

    public String convert(String type) {
        return typeMap.get(type);
    }
}
