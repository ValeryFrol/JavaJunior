

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void echo() {
        String input = "Ivan";
        String expect ="Hello: jhkIvan";
        Calculator calculator= new Calculator();
        String result = calculator.echo(input);
        assertThat(result,is(expect));
    }
}
