package ParametrizedExample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PersonJunitTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 17, false }, { 18, true }, { 20, true }
        });
    }

    private int age;
    private boolean expected;

    public PersonJunitTest(int age, boolean expected) {
        this.age = age;
        this.expected = expected;
    }

    @Test
    public void ShouldReturnTrueIfPersonIsAtLeast18YO(){
        Assert.assertEquals(expected, new Person(age).isAdult());
    }
}
