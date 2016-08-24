import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

@Test
public void testAdd(){
Calc c = new Calc();
assertEquals(3.0, c.add(10, 20));

@Test
public void testSub(){
Calc c = new Calc();
assertEquals(3.0, c.sub(10,20));


}
}
