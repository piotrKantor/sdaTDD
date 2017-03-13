package StubExample;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SimpleServiceTest {

    @Test
    public void shouldBeActiveIfColaboratorActive(){
        //given
        SimpleService service = new SimpleService();

        //when
        service.setCollaborator(new StubCollaborator());

        //then
        assertTrue(service.isActive());
    }
}
