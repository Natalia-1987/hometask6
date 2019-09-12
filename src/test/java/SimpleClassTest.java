import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleClassTest {

    @Test
    public void testMethod(){
        SimpleClass simple = new SimpleClass();
        assertEquals(0, simple.method1());
    }

}
