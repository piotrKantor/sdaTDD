package ParametrizedExample;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PersonTest {

    @Test
    @Parameters({"17, false",
            "22, true" })
    public void ShouldReturnTrueIfPersonIsAtLeast18YO(int age, boolean expected){
        Assert.assertEquals(expected, new Person(age).isAdult());
    }
}
