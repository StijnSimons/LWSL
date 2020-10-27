package xyz.baddeveloper.lwsl.tcp;

import xyz.baddeveloper.lwsl.ConnectionState;
import xyz.baddeveloper.lwsl.network.NetworkConnection;
import xyz.baddeveloper.lwsl.network.NetworkEndPoint;

import java.io.*;
import java.net.Socket;

// TODO: JavaDocs

public class TCPConnection extends NetworkConnection {

    private Socket socket;

    private DataInputStream inputStream;
    private DataOutputStream outputStream;

    protected TCPConnection(Socket socket) throws IOException {
        this.endPoint = new NetworkEndPoint(socket.getInetAddress(), socket.getPort());
        this.socket = socket;

        this.inputStream = new DataInputStream(socket.getInputStream());
        this.outputStream = new DataOutputStream(socket.getOutputStream());
        this.state = ConnectionState.CONNECTED;
    }

    public TCPConnection(NetworkEndPoint endPoint) {
        this.endPoint = endPoint;
        this.socket = new Socket();
        this.state = ConnectionState.NOT_CONNECTED;
    }

    @Override
    public void connect() throws IOException {
        if (this.state == ConnectionState.CONNECTED) {
            throw new IllegalStateException("Already connected to socket");
        }
        this.socket.connect(endPoint.getSocketAddress());

        this.inputStream = new DataInputStream(socket.getInputStream());
        this.outputStream = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void close() throws IOException {

    }
}
