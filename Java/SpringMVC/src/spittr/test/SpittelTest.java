package spittr.test;


import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import spittr.bean.Spittle;
import spittr.data.SpittleRepository;
import spittr.web.SpittleController;

public class SpittelTest {

	@Test
	public void shouldShowPagedSpittles() throws Exception{
		List<Spittle> expectedSpittles = createSpittleList(50);

		SpittleRepository mockRepository = mock(SpittleRepository.class);
		when(mockRepository.findSpittles(23890, 50)).thenReturn(expectedSpittles);
		
		SpittleController controller = new SpittleController(mockRepository);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView( new InternalResourceView("/WEB-INF/views/spittles.jsp") ) //:mock框架不解析控制器中的视图名
				.build();
		
		mockMvc.perform( MockMvcRequestBuilders.get("/spittles?max=23890&count=50") )
				.andExpect(view().name("spittles"))
				.andExpect(model().attributeExists("spittleList"))
				.andExpect(model().attribute("spittleList", hasItems( expectedSpittles.toArray() )) );
		 
	}
	
	@Test
	public void shouldShowRecentSpittles() throws Exception{
		List<Spittle> expectedSpittles = createSpittleList(20);

		SpittleRepository mockRepository = mock(SpittleRepository.class);
		when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
		
		SpittleController controller = new SpittleController(mockRepository);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView( new InternalResourceView("/WEB-INF/views/spittles.jsp") ) //:mock框架不解析控制器中的视图名
				.build();
		
		mockMvc.perform( MockMvcRequestBuilders.get("/spittles") )
				.andExpect(view().name("spittles"))
				.andExpect(model().attributeExists("spittleList"))
				.andExpect(model().attribute("spittleList", hasItems( expectedSpittles.toArray() )) );
		 
	}

	/*
	 * Method that can create a list of spittles.
	 */
	private List<Spittle> createSpittleList(int count){
		List<Spittle> spittles = new ArrayList<Spittle>();		
		for(int i=0; i<count; i++){
			spittles.add( new Spittle("Spittle "+i, new Date()) );
		}
		return spittles;
	}
}
