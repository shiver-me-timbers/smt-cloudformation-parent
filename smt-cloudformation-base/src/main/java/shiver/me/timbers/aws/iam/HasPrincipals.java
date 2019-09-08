package shiver.me.timbers.aws.iam;

import shiver.me.timbers.aws.Property;

import java.util.Arrays;
import java.util.List;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.Arrays.asList;
import static java.util.Map.Entry;
import static java.util.stream.Collectors.toMap;

/**
 * Fluent methods for adding {@link Principal}s to a Statement.
 */
public interface HasPrincipals<T extends HasPrincipals> {

    /**
     * Create a new principal.
     *
     * @param name    - The name of the principal type.
     * @param targets - The target of the principal.
     * @return the new principal.
     */
    static Entry<String, List<CharSequence>> principal(String name, CharSequence... targets) {
        return new SimpleEntry<>(name, asList(targets));
    }

    /**
     * Add Principals to this Statement.
     *
     * @param principals - The Principals to add.
     * @return this Statement.
     */
    default T withPrincipals(Entry<String, List<CharSequence>>... principals) {
        return withPrincipal(new Principal(Arrays.stream(principals).collect(toMap(Entry::getKey, Entry::getValue))));
    }

    /**
     * Add a Principal to this Statement.
     *
     * @param principal - The Principal to add.
     * @return this Statement.
     */
    T withPrincipal(Property<Principal> principal);
}
