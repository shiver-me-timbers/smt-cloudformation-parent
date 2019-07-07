package aws.iam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.Arrays.asList;
import static java.util.Map.Entry;
import static java.util.stream.Collectors.toMap;

public interface HasPrincipals<T extends HasPrincipals> {

    static Entry<String, List<CharSequence>> principal(String name, CharSequence... targets) {
        return new SimpleEntry<>(name, asList(targets));
    }

    default T withPrincipals(Entry<String, List<CharSequence>>... principals) {
        return withPrincipal(Arrays.stream(principals).collect(toMap(Entry::getKey, Entry::getValue)));
    }

    T withPrincipal(Map<String, List<CharSequence>> principal);
}
