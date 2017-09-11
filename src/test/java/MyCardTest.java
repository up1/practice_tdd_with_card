import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCardTest {

    MyCard myCard = new MyCard();

    @Test public void
    ไพ่ใบแรกในสำรับต้องเป็น_2C() {
        assertEquals("2C", myCard.cartAt(0));
    }

    @Test public void
    ไพ่ใบที่สองในสำรับต้องเป็น_3C() {
        assertEquals("3C", myCard.cartAt(1));
    }

}
