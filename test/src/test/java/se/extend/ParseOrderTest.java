package se.extend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseOrderTest {

    @Test
    public void test(){
        int a = 5;
        int b = 6;
        int c = a = b;

        Assertions.assertEquals(6, c);
        Assertions.assertEquals(6, a);
    }
}