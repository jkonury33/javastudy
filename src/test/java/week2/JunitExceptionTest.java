package week2;

import org.junit.Test;

/**
 * @author JiHong Jang
 * @since 2014.03.02
 */
public class JunitExceptionTest {
    @Test(expected = RuntimeException.class)
    public void test(){
        int x = 10 / 0;
    }
}
