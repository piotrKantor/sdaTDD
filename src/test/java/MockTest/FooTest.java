package MockTest;

import MockException.Foo;
import org.junit.Test;

import static MockException.Foo.HELLO_WORLD;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FooTest {

    @Test
    public void shouldReturnHelloWorld(){
        //given
        Foo foo=mock(Foo.class);
        when(foo.greet()).thenReturn(HELLO_WORLD); //tutaj ustawiamy zachowanie funkcji

        //when
        System.out.println("Foo greets: " + foo.greet());

        //then
        assertEquals(foo.greet(), HELLO_WORLD);
    }

    @Test
    public void shouldRetunWhatIWant(){
        //given
        Foo foo=mock(Foo.class);
        when(foo.greet(HELLO_WORLD)).thenReturn(HELLO_WORLD+" To nieprawidłowe hasło :D");

        //when
        System.out.println("Foo greets: " + foo.greet());

        //then
        assertEquals(foo.greet(), "Hello World To nieprawidłowe hasło :D");
    }
}
