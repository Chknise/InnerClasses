import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ManagedConnectionTest {

    ConnectionManager testCM = new ConnectionManager();
    Connection ManagedConnectionTest1 = testCM.findConnectionFromIP("1234");



    @Test

    public void testConnect() {

        String result = ManagedConnectionTest1.connect();

        assertTrue("test failed", result.equals("connection open"));

    }



    @Test

   public void testClose(){

        ManagedConnectionTest1.close();

        String result = ManagedConnectionTest1.connect();

        assertTrue("test failed", result.equals("connection close"));

    }

}

