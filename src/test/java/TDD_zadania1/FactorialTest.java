package TDD_zadania1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FactorialTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    @Parameters({"0, 1", "1, 1", "2, 2", "7, 5040", "15, 1307674368000" })
    public void shouldCountCorrectResultForGivenElement(int elementIndex, long expected){
        Assert.assertEquals(expected, Factorial.getFactorialOf(elementIndex));
    }

    @Test
    public void shouldThrowRuntimeExceptionWithMessageThatOnlyPositiveNumbersAreValid(){
        //given
        String message="OnlyPositiveNumbersAreValid";
        exception.expect(RuntimeException.class);
        exception.expectMessage(message);

        //when
        Factorial.getFactorialOf(-1);
    }

}
