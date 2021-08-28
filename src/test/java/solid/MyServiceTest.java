package solid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyServiceTest {
    @Test
    void testGenerateUUID() {
        MyService myService = new MyService();
        assertEquals("DEMO7", myService.generateUUID());
    }
}
