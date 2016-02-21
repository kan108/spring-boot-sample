package com.example;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
@MapperScan(basePackages="com.example.test.domain.repository")
public class DataConfig {
	
	@Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //sessionFactory.setTypeAliasesPackage(Entity.class.getPackage().getName());
        //sessionFactory.setConfigLocation(new ClassPathResource("/mybatis-config.xml"));
        return sessionFactory;
    }
	
//	public static void main(String[] args) {
//		SpringApplication.run(ApplicationContext.class, args);
//	}
//	
//    @Autowired
//    @Bean
//    public DataSourceInitializer dataSourceInitializer(
//            @Qualifier("dataSource") DataSource dataSource) {
//        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//        dataSourceInitializer.setDataSource(dataSource);
//        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
//        databasePopulator.addScript(new ClassPathResource("sql"));
//        dataSourceInitializer.setDatabasePopulator(databasePopulator);
//        dataSourceInitializer.setEnabled(false);
//
//        return dataSourceInitializer;
//    }
//
//    @Autowired
//    @Bean
//    public DataSourceTransactionManager transactionManager(
//            @Qualifier("dataSource") DataSource dataSource) {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource);
//
//        return transactionManager;
//    }
//
//    @Autowired
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(
//            @Qualifier("dataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//
//        ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(
//                new DefaultResourceLoader());
//
//        // MyBatis のコンフィグレーションファイル
//        bean.setConfigLocation(resolver.getResource("classpath:config.xml"));
//        // MyBatis で使用する SQL ファイル群
//        bean.setMapperLocations(resolver.getResources("classpath:sql/*.xml"));
//
//        return new SqlSessionTemplate(bean.getObject());
//    }

//    @Primary
//    @Autowired
//    @Bean
//    public DriverManagerDataSource dataSource() {
//        // h2インメモリ
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.h2.Driver");
//        dataSource.setUrl("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//        dataSource.setUsername("sa");
//        dataSource.setPassword("");
//
//        return dataSource;
//    }
}