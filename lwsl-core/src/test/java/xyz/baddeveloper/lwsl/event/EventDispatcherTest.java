package xyz.baddeveloper.lwsl.event;

import org.junit.Before;
import org.junit.Test;
import xyz.baddeveloper.lwsl.event.type.EventTest;

import static org.junit.Assert.assertEquals;

public class EventDispatcherTest {

    private EventDispatcher<EventTest> testEventDispatcher;
    private int testEventCounter;

    @Before
    public void setUp() {
        testEventDispatcher = new EventDispatcher<>();
    }

    @Test
    public void testEventDispatcher() {
        assertEquals(0, testEventCounter);

        testEventDispatcher.addListener(event -> testEventCounter++);
        testEventDispatcher.dispatchEvent(new EventTest());

        assertEquals(1, testEventCounter);
    }
}
