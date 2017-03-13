package DummyExample;

import org.junit.Assert;
import org.junit.Test;

public class CanonPrinterTest {

    @Test
    public void shouldReturnStringCanonAsAProducer(){
        //given
        Configuration dummyConfiguration=new Configuration(null, null,null, null);
        Printer printer=new CanonPrinter(dummyConfiguration);
        String expected="CANON";

        //when
        String actual = ((CanonPrinter)printer).getPRODUCER();

        //then
        Assert.assertEquals(expected, actual);
    }
}
