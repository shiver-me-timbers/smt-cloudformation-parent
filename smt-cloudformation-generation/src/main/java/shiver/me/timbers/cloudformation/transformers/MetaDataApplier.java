package shiver.me.timbers.cloudformation.transformers;

import java.util.Map;

public class MetaDataApplier {

    public void apply(String id, String title, String description, Map<String, Object> schema) {
        schema.put("$schema", "http://json-schema.org/draft-07/schema#");
        schema.put("$id", id);
        schema.put("title", title);
        if (description != null && !description.isEmpty()) {
            schema.put("description", description);
        }
        schema.put("type", "object");
    }
}
