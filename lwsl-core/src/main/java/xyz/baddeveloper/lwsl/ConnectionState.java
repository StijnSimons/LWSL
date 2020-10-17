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
