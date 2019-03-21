package ltd.idcu.junit;

import ltd.idcu.junit.testUtils.TestCount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Suite.class)
@Suite.SuiteClasses(TestCount.class)
@SpringBootTest
public class JunitApplicationTests {

    @Test
    public void contextLoads() {
    }

}
