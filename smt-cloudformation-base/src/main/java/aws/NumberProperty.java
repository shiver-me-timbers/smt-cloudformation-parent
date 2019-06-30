package aws;

import com.fasterxml.jackson.annotation.JsonFormat;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT;

@JsonFormat(shape = OBJECT)
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
