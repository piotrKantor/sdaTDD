package AlreadyKnown;


import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

    @Test
    public void shouldReturnCorrectSumOfInts(){

        //given
        int expected=222221;

        //when
        int actual=Adder.addIntNumbers(98765, 123456);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectSumOfDoubles(){
        //given
        Adder adder=new Adder(98765.35, 123456.65);
        double expected=222222d;

        //when
        double actual=adder.getSumOfDoubles();

        //then
        Assert.assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void shouldReturnStringInProperFormat(){
        //given
        Adder adder=new Adder(2,5);
        String expected="Adder{first=2.0}";

        //when
        String actual=adder.toString();

        //then
        Assert.assertEquals(expected, actual);
    }

}
