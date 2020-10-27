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

package xyz.baddeveloper.lwsl;

/**
 * Represents the current state of a {@link xyz.baddeveloper.lwsl.Connection} object.
 *
 * @see xyz.baddeveloper.lwsl.Connection
 */
public enum ConnectionState {

    /**
     * The connection has not been established yet or has been disconnected.
     */
    NOT_CONNECTED,


    /**
     * The connection is currently connecting to an endpoint.
     */
    CONNECTING,


    /**
     * The connection is connected.
     */
    CONNECTED,


    /**
     * The connection is currently disconnecting.
     */
    DISCONNECTING
}
