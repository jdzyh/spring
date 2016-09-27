package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	//代替传统的web.xml配置
	@Override
	protected Class<?>[] getServletConfigClasses() { //程序启动时加载包含web组件bean的上下文
		return new Class<?>[]{ WebConfig.class };
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() { //加载其他bean的上下文，包含中间层、数据层
		return new Class<?>[]{ RootConfig.class };
	}
	
}
