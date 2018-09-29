package aws;

import aws.fn.Reference;

public interface HasReference {

    String getName();

    default Reference ref() {
        return new Reference(getName());
    }
}
