package aws.fn;

import aws.StringProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Cidr extends StringProperty implements StringFunction {

    @JsonProperty("Fn::Cidr")
    private final List<CharSequence> values;

    public Cidr(CharSequence ipBlock, CharSequence count, CharSequence cidrBits) {
        super(format("{ \"Fn::Cidr\" : [\"%s\", \"%s\", \"%s\"] }", ipBlock, count, cidrBits));
        this.values = asList(ipBlock, count, cidrBits);
    }
}
