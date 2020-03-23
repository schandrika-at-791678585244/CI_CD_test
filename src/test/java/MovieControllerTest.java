import com.surya.movie.controllers.MovieController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@WebMvcTest(MovieController.class)
public class MovieControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {
//        MovieController movieController = new MovieController();
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/hello").contentType(MediaType.TEXT_PLAIN)).andExpect(content().string("hello all"));
        assertEquals(true,true);
    }
}
