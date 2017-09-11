import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCardTest {

    MyCard myCard = new MyCard();

    @Test public void
    ไพ่ใบแรกในสำรับต้องเป็น_2C() {
        assertEquals("2C", myCard.cartAt(1));
    }

    @Test public void
    ไพ่ใบที่สองในสำรับต้องเป็น_3C() {
        assertEquals("3C", myCard.cartAt(2));
    }

    @Test public void
    ไพ่ใบที่สามในสำรับต้องเป็น_4C() {
        assertEquals("4C", myCard.cartAt(3));
    }

    @Test public void
    ไพ่ใบที่สี่ในสำรับต้องเป็น_4C() {
        assertEquals("5C", myCard.cartAt(4));
    }

    @Test public void
    ไพ่ใบที่เก้าในสำรับต้องเป็น_0C() {
        assertEquals("0C", myCard.cartAt(9));
    }

    @Test public void
    ไพ่ใบที่สิบสามในสำรับต้องเป็น_AC() {
        assertEquals("AC", myCard.cartAt(13));
    }

    @Test public void
    ไพ่ใบที่สิบสี่ในสำรับต้องเป็น_2D() {
        assertEquals("2D", myCard.cartAt(14));
    }

    @Test public void
    ไพ่ใบที่สามสิบห้าในสำรับต้องเป็น_0H() {
        assertEquals("0H", myCard.cartAt(35));
    }

    @Test public void
    ไพ่ใบที่สามสิบหกในสำรับต้องเป็น_0H() {
        assertEquals("JH", myCard.cartAt(36));
    }

    @Test public void
    ไพ่ใบสุดท้ายของสำรับในสำรับต้องเป็น_AS() {
        assertEquals("AS", myCard.cartAt(52));
    }

}
