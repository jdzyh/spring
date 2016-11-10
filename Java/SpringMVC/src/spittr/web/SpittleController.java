package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	private static final String MAX_LONG_AS_STRING = Long.MAX_VALUE+"";
	
	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository){
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(Model model,
			@RequestParam(value="max" , defaultValue=MAX_LONG_AS_STRING) long max, 
			@RequestParam(value="count", defaultValue="20") int count) {
		
		model.addAttribute("spittleList", spittleRepository.findSpittles(max, count) );//将spittle添加到模型中
		return "spittles";//返回视图名称
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{spittleID}")
	public String showSpittle(Model model,
			@PathVariable("spittleID") long spittleId
			){
		model.addAttribute("spittle", spittleRepository.findOne(spittleId));
		return "spittle";
	}
	
	
}
