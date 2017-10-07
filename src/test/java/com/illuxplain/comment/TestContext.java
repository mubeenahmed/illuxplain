package com.illuxplain.comment;

import javax.sql.DataSource;

import org.mockito.Mockito;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.illuxplain.models.Comments;
import com.illuxplain.repository.MySqlCommentPresistence;
import com.illuxplain.repository.PresistenceRepository;

@Configuration
@ComponentScan(basePackages={"com.illuxplain"})
public class TestContext {

	
	@Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
 
        messageSource.setBasename("i18n/messages");
        messageSource.setUseCodeAsDefaultMessage(true);
 
        return messageSource;
    }
		
	@Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	/*@Bean
    public DataSource dataSource()
    {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/learning");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }*/
	
	@Bean
	public DataSource dataSource()
	{
		return Mockito.mock(DataSource.class);
	}
    
    @Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return Mockito.mock(JdbcTemplate.class);
	}
	
}
