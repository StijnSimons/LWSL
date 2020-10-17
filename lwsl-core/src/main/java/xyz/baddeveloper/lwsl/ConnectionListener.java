package xyz.baddeveloper.lwsl;

import java.io.Closeable;
import java.io.IOException;

/**
 * Abstract class extended by all connection listeners.
 */
public abstract class ConnectionListener implements Closeable {

    /**
     * Attempts to create the connection listener for incoming connections.
     *
     * @throws IOException Thrown if an exception occurs while attempting to create the connection listener.
     */
    public abstract void listen() throws IOException;

    /**
     * Attempts to close the connection listener.
     *
     * @throws IOException Thrown if an exception occurs while attempting to close the connection.
     */
    public abstract void close() throws IOException;
}
