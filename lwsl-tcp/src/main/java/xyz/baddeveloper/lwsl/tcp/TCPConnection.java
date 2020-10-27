/*
 * MIT License
 *
 * Copyright (c) 2020 BadDeveloper
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

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
