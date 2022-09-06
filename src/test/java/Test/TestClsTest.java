package Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClsTest {

    @Test
    @DisplayName("Topla Yoxla")
    void toplaYoxla()
    {
        assertEquals(130,TestCls.Topla(45,85));
    }

    @Test
    @DisplayName("Faktoriali Yoxla")
    void faktorialYoxla()
    {
        assertEquals(120,TestCls.Faktorial(5));
    }

    @Test
    @DisplayName("Testing")
    void yoxla()
    {
        assertEquals("ab",TestCls.tersAd("ba"));
    }

}