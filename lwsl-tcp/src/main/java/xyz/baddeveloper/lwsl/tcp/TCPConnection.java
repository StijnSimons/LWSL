package xyz.baddeveloper.lwsl.tcp;

import xyz.baddeveloper.lwsl.ConnectionState;
import xyz.baddeveloper.lwsl.network.NetworkConnection;
import xyz.baddeveloper.lwsl.network.NetworkEndPoint;

import java.io.IOException;
import java.net.Socket;

// TODO: JavaDocs

public class TCPConnection extends NetworkConnection {

    private Socket socket;

    protected TCPConnection(Socket socket) {
        this.endPoint = new NetworkEndPoint(socket.getInetAddress(), socket.getPort());
        this.socket = socket;
        this.state = ConnectionState.CONNECTED;
    }

    public TCPConnection(NetworkEndPoint endPoint) {
        this.endPoint = endPoint;
        this.socket = new Socket();
    }

    @Override
    public void connect() throws IOException {
        if (this.state == ConnectionState.CONNECTED) {
            throw new IllegalStateException("Already connected to socket");
        }
        this.socket.connect(endPoint.getSocketAddress());
    }

    @Override
    public void close() throws IOException {

    }
}
