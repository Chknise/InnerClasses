import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectionManagerTest {


    ConnectionManager testCM = new ConnectionManager();



    @Test

    public void testIPConnection() {
        Connection testCon = testCM.findConnectionFromIP("192.168.1.2");

        assertNotNull("Test falied on FindConnectoinFromIP", testCon);


    }


    @Test

    public void testProtocolConnection() {
        Connection testCon = testCM.findConnectionFromProtocol(Protocol.BLUETOOTH);

        assertNotNull("Test falied on FindConnectoinFromIP", testCon);


    }







}
