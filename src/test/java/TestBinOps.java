import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.BinOps;

public class TestBinOps {

    @Test
    public void testBinOps() {
        BinOps binOps = new BinOps();

        //10(1010) + 15(1111) = 25(11001)
        String result_sum = binOps.sum("1010", "1111");
        String expected_sum = "11001";

        //10(1010) * 15(1111) = 150(10010110)
        String result_mult = binOps.mult("1010", "1111");
        String expected_mult = "10010110";

        Assertions.assertEquals(expected_sum, result_sum);
        Assertions.assertEquals(expected_mult, result_mult);
    }
}
