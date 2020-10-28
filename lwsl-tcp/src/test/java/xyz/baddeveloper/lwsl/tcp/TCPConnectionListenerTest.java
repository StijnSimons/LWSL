package xyz.baddeveloper.lwsl.tcp;

import org.junit.Test;
import xyz.baddeveloper.lwsl.network.NetworkEndPoint;

import java.net.BindException;

import static org.junit.Assert.assertThrows;

public class TCPConnectionListenerTest {

    @Test
    public void testTCPConnectionListener() {
        assertThrows(BindException.class, () -> {
            TCPConnectionListener listener = new TCPConnectionListener(new NetworkEndPoint("baddeveloper.xyz", 8080));
            listener.listen();
        });
    }
}
