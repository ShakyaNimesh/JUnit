
import org.junit.Test;
import static org.junit.Assert.*;


public class producttest {
    @Test
    public void testproduct() {
        Junittest test= new Junittest();
        int result= test.product(4, 2);
        assertEquals(8, result);
    }

   
}
