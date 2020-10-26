package xyz.baddeveloper.lwsl.network;

import org.junit.Test;

import java.net.UnknownHostException;

import static org.junit.Assert.assertThrows;

public class NetworkEndPointTest {

    private static final int PORT_MIN = 0;
    private static final int PORT_MAX = (1 << 16) -1;

    @Test
    public void testNetworkEndPoint() {
        assertThrows(UnknownHostException.class, () -> new NetworkEndPoint("null", 8080));

        assertThrows(IllegalArgumentException.class, () -> new NetworkEndPoint("localhost", PORT_MIN - 1));
        assertThrows(IllegalArgumentException.class, () -> new NetworkEndPoint("localhost", PORT_MAX + 1));
    }
}
