package spittr.test;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spittr.bean.Spitter;
import spittr.data.SpitterRepository;
import spittr.web.SpitterController;

public class SpitterControllerTest {

	@Test
	public void test() throws Exception {
		SpitterRepository mockRepository = mock(SpitterRepository.class);
		
		SpitterController spitterController = new SpitterController(mockRepository);
		MockMvc mock = MockMvcBuilders.standaloneSetup(spitterController).build();
		
		mock.perform(MockMvcRequestBuilders.get("/spitter/register"))
				.andExpect(MockMvcResultMatchers.view().name("registerForm"));
		
	}

	@Test
	public void shouldProcessRegistration() throws Exception{
		SpitterRepository mockRepository = mock(SpitterRepository.class);
		Spitter unsaved = new Spitter("jjj", "pwd");
		Spitter saved = new Spitter("jjj", "pwd");
		
		when(mockRepository.save(unsaved)).thenReturn(saved);
		
		SpitterController spitterController = new SpitterController(mockRepository);
		MockMvc mockmvc = MockMvcBuilders.standaloneSetup(spitterController).build();
		
		mockmvc.perform(MockMvcRequestBuilders.post("/spitter/register")
				.param("username", "jjj")
				.param("password", "pwd"))
				.andExpect(redirectedUrl("/spitter/jjj"));
		verify(mockRepository, atLeastOnce()).save(unsaved);//测试是否调用了一次mock方法
	}
}
