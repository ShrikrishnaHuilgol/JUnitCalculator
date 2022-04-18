import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
    @Test
    public void testAdd(){
        Addition addition=new Addition();
        int sum=addition.add(5,3);
        assertEquals("Addition Success",8,sum);
    }

    @Test
    public void testSub(){
        Subtraction subtraction=new Subtraction();
        int sub=subtraction.sub(5,3);
        assertEquals("Subtraction Success",2,sub);
    }

    @Test
    public void testMul(){
        Multiplication multiplication=new Multiplication();
        int mul=multiplication.mul(5,7);
        assertEquals("Multiplication Success",35,mul);
    }

    @Test
    public void testDiv(){
        Division division=new Division();
        int div=division.div(6,3);
        assertEquals("Division success",2,div);
    }
}
