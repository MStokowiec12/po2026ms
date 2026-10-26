package agh.po.lab4;
import static org.junit.jupiter.api.Assertions.*;

class CodingbatTest {
    Codingbat codingbat = new Codingbat();

    @org.junit.jupiter.api.Test
    public void array123(){
        assertEquals(true, codingbat.array123(new int[]{1,2,3}));
    }
}
