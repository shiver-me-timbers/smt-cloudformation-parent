package shiver.me.timbers.aws.parameters;

/**
 * Thrown when a PseudoParameter cannot be found by the {@link PseudoParameter#fromValue} method.
 */
public class PseudoParameterException extends RuntimeException {

    public PseudoParameterException(String message) {
        super(message);
    }
}
