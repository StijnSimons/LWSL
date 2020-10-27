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

package xyz.baddeveloper.lwsl.network;

import xyz.baddeveloper.lwsl.ConnectionEndPoint;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * An {@link xyz.baddeveloper.lwsl.ConnectionEndPoint} used to indicate an {@link java.net.InetAddress}.
 *
 * @see java.net.InetSocketAddress
 */
public class NetworkEndPoint extends ConnectionEndPoint {

    /**
     * The target socket address including port.
     */
    private final InetSocketAddress socketAddress;

    /**
     * Create an endpoint using an {@link java.net.InetAddress} and port.
     *
     * @see java.net.InetAddress#getByName(java.lang.String)
     * @param address The target address.
     * @param port The target port (integer between 0 and 65,535).
     */
    public NetworkEndPoint(InetAddress address, int port) {
        socketAddress = new InetSocketAddress(address, port);
    }

    /**
     * Create an endpoint using a host or address and port.
     *
     * @see java.net.InetAddress#getByName(java.lang.String)
     * @param host The target host or address.
     * @param port The target port (integer between 0 and 65,535).
     * @throws UnknownHostException Thrown when the target host could not be resolved.
     */
    public NetworkEndPoint(String host, int port) throws UnknownHostException {
        this(InetAddress.getByName(host), port);
    }

    /**
     * @return Returns the current socket address and port.
     */
    public InetSocketAddress getSocketAddress() {
        return socketAddress;
    }
}
