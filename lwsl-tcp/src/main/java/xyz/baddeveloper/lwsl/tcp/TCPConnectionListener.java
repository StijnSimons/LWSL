package xyz.baddeveloper.lwsl.tcp;

import xyz.baddeveloper.lwsl.network.NetworkConnectionListener;
import xyz.baddeveloper.lwsl.network.NetworkEndPoint;

import java.io.IOException;
import java.net.ServerSocket;

// TODO: JavaDocs

public class TCPConnectionListener extends NetworkConnectionListener {

    private ServerSocket socket;
    private TCPConnectionHandler handler;

    public TCPConnectionListener(NetworkEndPoint endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public void listen() throws IOException {
        this.socket = new ServerSocket();
        this.socket.bind(endPoint.getSocketAddress());
        this.handler = new TCPConnectionHandler(this);
        this.handler.start();
    }

    @Override
    public void close() throws IOException {
        this.socket.close();
    }

    protected ServerSocket getSocket() {
        return socket;
    }
}