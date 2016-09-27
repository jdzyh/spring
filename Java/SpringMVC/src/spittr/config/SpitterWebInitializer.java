package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	//���洫ͳ��web.xml����
	@Override
	protected Class<?>[] getServletConfigClasses() { //��������ʱ���ذ���web���bean��������
		return new Class<?>[]{ WebConfig.class };
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() { //��������bean�������ģ������м�㡢���ݲ�
		return new Class<?>[]{ RootConfig.class };
	}
	
}
