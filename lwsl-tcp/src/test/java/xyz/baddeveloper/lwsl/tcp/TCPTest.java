package xyz.baddeveloper.lwsl.tcp;

import org.junit.Test;
import xyz.baddeveloper.lwsl.network.NetworkEndPoint;

public class TCPTest {

    @Test
    public void testTCP() throws Exception {
        NetworkEndPoint endPoint = new NetworkEndPoint("localhost", 8080);
        TCPConnectionListener tcpListener = new TCPConnectionListener(endPoint);
        TCPConnection tcpConnection = new TCPConnection(endPoint);

        tcpListener.listen();
        tcpConnection.connect();

        // Wip

        tcpConnection.close();
        tcpListener.close();
    }
}
