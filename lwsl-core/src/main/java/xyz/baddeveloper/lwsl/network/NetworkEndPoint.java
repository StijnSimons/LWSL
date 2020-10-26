package xyz.baddeveloper.lwsl.network;

import xyz.baddeveloper.lwsl.ConnectionEndPoint;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

// TODO: JavaDocs

public class NetworkEndPoint extends ConnectionEndPoint {

    private final InetSocketAddress socketAddress;

    public NetworkEndPoint(InetAddress address, int port) {
        socketAddress = new InetSocketAddress(address, port);
    }

    public NetworkEndPoint(String host, int port) throws UnknownHostException {
        this(InetAddress.getByName(host), port);
    }

    public InetSocketAddress getSocketAddress() {
        return socketAddress;
    }
}
