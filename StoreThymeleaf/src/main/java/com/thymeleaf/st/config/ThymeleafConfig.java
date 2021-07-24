package com.thymeleaf.st.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration 
public class ThymeleafConfig implements ApplicationContextAware {
  
	private ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) {
	   this.applicationContext = applicationContext;
	}
		
	/**
	* Configuramos el componente que resolverá las plantillas 
	* @return
	*/
    @Bean
	public SpringResourceTemplateResolver templateResolver() {
	  SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	  templateResolver.setApplicationContext(this.applicationContext);
	  templateResolver.setPrefix("classpath:/templates/");
	  templateResolver.setSuffix(".html");
	  templateResolver.setTemplateMode(TemplateMode.HTML);
	  templateResolver.setCacheable(true);
	 return templateResolver;
	} 
	
	/**
	* Configuramos el motor que procesará las plantillas
	* @return
	*/
	@Bean
	public SpringTemplateEngine templateEngine() {
	 SpringTemplateEngine engine = new SpringTemplateEngine();
	 //engine.setEnableSpringELCompiler(true);
	 engine.setTemplateResolver(templateResolver());
     return engine;
	} 
	
	/**
	* Configuramos el view resolver, que resuelve las vistas en Spring MVC
	* @return
	*/
    @Bean
	public ViewResolver viewResolver(){
	  ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	  resolver.setTemplateEngine(templateEngine());
	  resolver.setCharacterEncoding("UTF-8");
     return resolver;
	} 
}

