package FakeExample;

import org.junit.Assert;
import org.junit.Test;

public class UserImpl {

    @Test
    public void sholudRerurnTrueIfMailIsOnGmail(){
        //given
        FakeDB fakeDB=new FakeDB();
        User user=fakeDB.findById("1");

        //when
        boolean actual=user.isEmailInGoogleDomain();

        //then
        Assert.assertEquals(true, actual);
    }
}
