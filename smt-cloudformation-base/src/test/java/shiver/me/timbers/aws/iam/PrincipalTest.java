package shiver.me.timbers.aws.iam;

import org.junit.Test;

import java.util.HashMap;

public class PrincipalTest {

    @Test
    public void Instantiation_for_coverage() {
        new Principal();
        new Principal(new HashMap<>());
    }
}