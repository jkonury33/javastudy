package step;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author JiHong Jang
 * @since 2014.03.01
 */
public class PhoneTest {

    Phone phone1;
    Phone phone2;

    @Before
    public void setUp() {
        phone1 = new Phone();
        phone2 = new Phone("test", "1234");

    }

    @Test
    public void phoneInfo() {
        assertThat(phone2.getName(), is("test"));
        assertThat(phone2.getPhoneNumber(), is("1234"));

    }
}
