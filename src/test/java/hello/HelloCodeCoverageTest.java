package hello;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class HelloCodeCoverageTest {
    @Test
    public void helloCodeCoveragedMainTest() {
        HelloCodeCoverage.main(new String[0]);
    }

    @Test
    public void helloCodeCoveragedInstantiatedTest() {
        HelloCodeCoverage helloCodeCoverage = new HelloCodeCoverage();
        assertNotNull(helloCodeCoverage);
    }
}
