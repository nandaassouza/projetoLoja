package br.com.senai.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.senai.controller.HomeController;
import br.com.senai.dao.ProductsDao;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, ProductsDao.class})
public class AppWebConfiguration {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver ();
		resolver.setPrefix("/WEB-INF/views/");  
        resolver.setSuffix(".jsp");
		return resolver;
	}
}
