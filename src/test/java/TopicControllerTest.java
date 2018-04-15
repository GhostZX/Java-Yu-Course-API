import io.yuboz.springbootstarter.topic.TopicController;
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
public class TopicControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private TopicController topicController;


    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(topicController).build();
    }
    @Test
    public void testGetAllTopics() throws Exception{
        mockMvc.perform(get("/topics")) //参数也可以使用 param("method", "testGet")
                .andExpect(status().isOk())
                .andExpect(content().string("topic"));
        //        .andExpect((content().contentType(MediaType.APPLICATION_JSON_UTF8)));
    }
}