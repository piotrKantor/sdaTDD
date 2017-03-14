package TDD_zadania1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FibonacciTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    @Parameters({"0, 0","1, 1", "2, 1", "3, 2", "30, 832040", "50, 12586269025" })
    public void shouldCountCorrectResultForGivenElement(int elementIndex, long expected){
        Assert.assertEquals(expected, Fibonacci.getElementOfIndex(elementIndex));
    }

    @Test
    public void shouldThrowRuntimeExceptionWithMessageThatOnlyPositiveNumbersAreValid(){
        //given
        String message="OnlyPositiveNumbersAreValid";
        exception.expect(RuntimeException.class);
        exception.expectMessage(message);

        //when
        Fibonacci.getElementOfIndex(-1);
    }
}
