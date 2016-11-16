
import org.junit.Test;
import static org.junit.Assert.*;


public class Nametest {
    @Test
    public void testnames(){
        Junittest test= new Junittest();
        String result= test.names("one", "two");
        assertEquals("onetwo", result);
    }


}
