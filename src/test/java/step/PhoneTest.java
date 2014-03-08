package step;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * @author JiHong Jang
 * @since 2014.03.01
 */
public class PhoneTest {

    List<PhoneInfo> phoneInfos;

    @Before
    public void setUp() {
        phoneInfos = new ArrayList<>();
    }

    @Test
    public void addPhoneInfo() {
        PhoneInfo phoneInfo = new PhoneInfo();
        phoneInfo.setName("Test");
        phoneInfo.setPhoneNumber("010-1234-5678");
        
        assertThat(phoneInfo.getName(), equalTo("Test"));
        assertThat(phoneInfo.getPhoneNumber(), equalTo("010-1234-5678"));
    }
}
