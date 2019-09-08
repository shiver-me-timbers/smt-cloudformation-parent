package shiver.me.timbers.aws;

import com.fasterxml.jackson.annotation.JsonFormat;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT;

/**
 * A property that can be assigned to a {@link Number} value.
 */
@JsonFormat(shape = OBJECT) // We force object serialisation to stop Jackson using toString() instead.
public abstract class NumberProperty extends Number {

    @Override
    public int intValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException();
    }
}
