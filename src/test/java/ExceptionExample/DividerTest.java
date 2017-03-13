package ExceptionExample;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DividerTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticException() throws Exception {
        //given
        Divider divider= new Divider(5,0);

        //when
        divider.divideNumbers();

    }

    @Test
    public void shouldThrowArithmeticExceptionAndItsMessageShouldInformThatDenominatorHaveToBeDifferentThanZero(){
        //given
        Divider divider= new Divider(5,0);
        String expectedMessage="/ by zero";

        //when
        try{
            divider.divideNumbers();
            fail("This message informs that tested function din't throw the exception");
        }
        
        //then
        catch (ArithmeticException e){
            Assert.assertEquals(expectedMessage,e.getMessage());
        }
    }
    
    @Test
    public void shouldThrowNullPointerException(){
        //given
        Divider divider = null;
        exception.expect(NullPointerException.class);//to musi być w when, bo podczas wykonania funkcji jest przekazywane

        //when
        divider.divideNumbers();
    }

    @Test
    public void shouldThrowArithmeticExceptionAndItsMessageShouldInformThatDenominatorHaveToBeDifferentThanZero_RuleBased(){
        //given
        Divider divider= new Divider(5,0);
        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");

        //when
            divider.divideNumbers();
    }

}