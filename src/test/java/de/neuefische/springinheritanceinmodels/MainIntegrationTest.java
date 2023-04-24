package de.neuefische.springinheritanceinmodels;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class MainIntegrationTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    void testMain() throws Exception {
        mockMvc.perform(post("/api/main")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                        "type": "main",
                        "b": "B",
                        "c": "C"
                        }
                        """))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                        "type": "main"
                        }
                        """));

    }

    @Test
    void testSubOne() throws Exception {
        mockMvc.perform(post("/api/main")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                        {
                        "type": "sub",
                        "b": "B",
                        "c": "C"
                        }
                        """))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                        "type": "sub",
                        "b": "B"
                        }
                        """));

    }

    @Test
    void testSub2() throws Exception {
        mockMvc.perform(post("/api/main")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                        {
                        "type": "sub2",
                        "b": "B",
                        "c": "C"
                        }
                        """))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                        "type": "sub2",
                        "c": "C"
                        }
                        """));

    }
}
