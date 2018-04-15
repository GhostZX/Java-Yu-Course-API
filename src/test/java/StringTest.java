import io.yuboz.springbootstarter.hello.HelloController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@RunWith(SpringJUnit4ClassRunner.class)
public class StringTest {
    private MockMvc mockMvc;

    @InjectMocks
    private HelloController helloController;


    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();

    }
    @Test
    public void testGet() throws Exception{
        mockMvc.perform(get("/hello")) //参数也可以使用 param("method", "testGet")
                .andExpect(status().is(200)) // 请求的状态码是否符合预期
                .andExpect(content().string("Hi"));// 返回的内容是否符合预期
    }
}