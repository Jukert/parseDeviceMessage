package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilTest {

    @Test
    public void getUnix() {
        assertEquals(1542121031,DateUtil.getUnix("131118","175711"));
    }
}