import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {

    @Test
    public void endWith_bracket() {
        MyRange r = new MyRange();
        boolean actualResult
                = r.endWithInclude("[1,5]");
        assertTrue("ต้องปิดด้วย [", actualResult);
    }

    @Test
    public void เริ่มต้นด้วย_bracket() {
        MyRange r = new MyRange();
        boolean actualResult
                = r.startWithInclude("[1,5]");
        assertTrue("ต้องเริ่มด้วย [", actualResult);
    }

    @Test
    public void เริ่มต้นด้วย_exclude() {
        MyRange r = new MyRange();
        boolean actualResult
                = r.startWithInclude("(1,5]");
        assertFalse("ต้องเริ่มด้วย (", actualResult);
    }
}
