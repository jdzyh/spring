package spittr.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spittr.dao.JdbcSpitterRepository;

@Configuration
@ComponentScan(basePackages={"spittr"}, excludeFilters = {@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
@PropertySource("classpath:/spittr/config/env.property")
@ActiveProfiles("EMBEDED")
public class RootConfig {
	@Autowired
	Environment env;

	@Bean
	public JdbcSpitterRepository spitterRepository(JdbcTemplate jdbcTemplete){
		return new JdbcSpitterRepository(jdbcTemplete);
	}
	
	/**
	 * 可以绑定参数的模板
	 * @param dataSource
	 * @return
	 */
	@Bean
	public NamedParameterJdbcTemplate jdbcTemplete(DataSource dataSource){
		return new NamedParameterJdbcTemplate(dataSource);
	}
	
//	/**
//	 * JdbcTemplate 是 Spring 的 JDBC模板
//	 * @param dataSource:数据源
//	 * @return
//	 */
//	@Bean
//	public JdbcTemplate jdbcTemplete(DataSource dataSource){
//		return new JdbcTemplate(dataSource);
//	}
	
	/**
	 * 使用嵌入式数据源
	 * @return
	 */
	@Profile("EMBEDED")
	@Bean
	public DataSource embededDataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql")
				.addScript("classpath:test-data.sql")
				.build();
	}
	
	/**
	 * 使用DBCP数据库连接池
	 * @return
	 */
	@Profile("DISTINCT")
	@Bean
	public DataSource dataSource_run() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("db.driverclass", ""));
		ds.setUrl(env.getProperty("db.url", ""));
		ds.setUsername(env.getProperty("db.username", ""));
		ds.setPassword(env.getProperty("db.password", ""));
		ds.setInitialSize(1);
		ds.setMaxIdle(2);
		return ds;
	}
	
}
