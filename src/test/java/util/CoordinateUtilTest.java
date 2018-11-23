package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateUtilTest {

    @Test
    public void coordinateConversion() {
        assertEquals(new Double(2.01), CoordinateUtil.coordinateConversion("0160.3600"));
    }
}