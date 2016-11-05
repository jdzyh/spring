package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器类，处理对"/"的请求并渲染首页
 */
@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {
	
	/**
	 * value:指定该方法所要处理的请求路径
	 * method:指定该方法所处理的HTTP方法
	 * home视图
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		System.out.println("Jump page success!");
		return "home";
	}
	
}
