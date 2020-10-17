package xyz.baddeveloper.lwsl;

import java.io.Closeable;
import java.io.IOException;

/**
 * Abstract class extended by all connections.
 */
public abstract class Connection implements Closeable {

    /**
     * Holds the current state of the connection.
     */
    protected ConnectionState state;

    /**
     * Attempts to create the connection between the client and server.
     *
     * @throws IOException Thrown if an exception occurs while attempting to create the connection.
     */
    public abstract void connect() throws IOException;

    /**
     * Attempts to close the connection between the client and server.
     *
     * @throws IOException Thrown if an exception occurs while attempting to close the connection.
     */
    public abstract void close() throws IOException;
}
