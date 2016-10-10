package spittr.test;

import static org.junit.Assert.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spittr.web.HomeController;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception{
		HomeController controller = new HomeController();
		
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build(); //搭建MockMvc
		
		mockMvc.perform( MockMvcRequestBuilders.get("/homepage") ) //对"/"执行GET请求
		       .andExpect( MockMvcResultMatchers.view().name("home") ); //预期得到home视图
	}

}
