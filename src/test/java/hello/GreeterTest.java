package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

    @Test
    public void greeterSayAuRevoir() {
        assertThat(greeter.sayAuRevoir(), containsString("Au revoir"));
    }

    @Test
    public void greeterSayBonneJournee() {
        assertThat(greeter.sayBonneJournee(), containsString("Bonne journee"));
    }

    @Test
    public void greeterAstalaVista() {
        assertThat(greeter.sayAstalaVista(), containsString("AstalaVista"));
    }
}
