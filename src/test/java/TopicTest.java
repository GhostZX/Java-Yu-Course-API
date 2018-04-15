import io.yuboz.springbootstarter.topic.Topic;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class TopicTest {
    private MockMvc mockMvc;

    @InjectMocks
    private Topic topic;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(topic).build();

    }
    @Test
    public void testTopic0() throws Exception{
        //模拟创建一个List对象
        Topic mock = mock(Topic.class);
        //使用mock的对象
        mock.setId("PHP");
        mock.setName("PHP intro");
        mock.setDescription("PHP introduction");
        //验证add(1)和clear()行为是否发生
        verify(mock).setId("PHP");
        verify(mock).setName("PHP intro");
        verify(mock).setDescription("PHP introduction");
    }



}