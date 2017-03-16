package MockTest;

import MockException.Foo;
import org.junit.Test;

import static MockException.Foo.HELLO_WORLD;
import static org.junit.Assert.assertEquals;
//import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.anyString;
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
    public void shouldRetunParameterWithAdditionalMessage(){
        //given
        Foo foo=mock(Foo.class);
        when(foo.greet(HELLO_WORLD)).thenReturn(HELLO_WORLD+" To nieprawidłowe hasło :D");

        //when
        System.out.println("Foo greets: " + foo.greet(HELLO_WORLD));

        //then
        assertEquals("Hello World To nieprawidłowe hasło :D", foo.greet(HELLO_WORLD));
    }

    @Test
    public void shouldReturnCustomMessageForAnyGivenMessage(){
        //given
        Foo foo=mock(Foo.class);
        when(foo.greet(anyString())).thenReturn("Custom Message");

        //then
        assertEquals("Custom Message", foo.greet("Jakiś napis"));
        assertEquals("Custom Message", foo.greet("Jakiś zupełnie inny napis"));

    }

    @Test
    public void shouldReturnFirstParameter(){
        //given
        Foo foo=mock(Foo.class);
        when(foo.greet(anyString())).then(returnsFirstArg());

        //then
        assertEquals("Jakiś napis", foo.greet("Jakiś napis"));
        assertEquals("Jakiś zupełnie inny napis", foo.greet("Jakiś zupełnie inny napis"));
    }


}
