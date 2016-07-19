package com.ttnd.reap.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.RecognizeKarma;;


@Configuration
@EnableWebMvc
@ComponentScan({"com.ttnd.reap"})
public class ApplicationContextConfig extends WebMvcConfigurerAdapter {

	private BasicDataSource dataSource;

	@Bean(name = "viewResolver")
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
		return viewResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

	}

	@Bean
	public DataSource getDataSource() {
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ReapV6");
		dataSource.setUsername("root");
		dataSource.setPassword("ishwar");
		return dataSource;
	}

	public Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.archive.autodetection", "class");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.current_session_context_class", "thread");
		properties.put("hibernate.hbm2ddl.auto", "create");
		return properties;
	}

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sesssionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sesssionBuilder.addProperties(getHibernateProperties());
		sesssionBuilder.addAnnotatedClasses(Employee.class);
		sesssionBuilder.addAnnotatedClass(GivingBadges.class);
		sesssionBuilder.addAnnotatedClass(RecievedBadges.class);
		sesssionBuilder.addAnnotatedClass(RecognizeKarma.class);
		SessionFactory sessionFactory = sesssionBuilder.buildSessionFactory();
		return sessionFactory;
	}
}
