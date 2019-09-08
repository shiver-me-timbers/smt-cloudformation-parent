package shiver.me.timbers.aws;

/**
 * A property that can be assigned to any primitive value.
 */
public class PrimitiveProperty extends NumberProperty implements CharSequence {

    private final String string;

    public PrimitiveProperty(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start, end);
    }

    @Override
    public String toString() {
        return string;
    }
}
