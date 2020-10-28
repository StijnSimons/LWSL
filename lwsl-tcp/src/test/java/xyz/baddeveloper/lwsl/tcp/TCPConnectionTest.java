package xyz.baddeveloper.lwsl.tcp;

import org.junit.Test;
import xyz.baddeveloper.lwsl.network.NetworkEndPoint;

import java.net.ConnectException;

import static org.junit.Assert.assertThrows;

public class TCPConnectionTest {

    @Test
    public void testTCPConnection() {
        assertThrows(ConnectException.class, () -> {
            TCPConnection connection = new TCPConnection(new NetworkEndPoint("localhost", 8080));
            connection.connect();
        });
    }
}
