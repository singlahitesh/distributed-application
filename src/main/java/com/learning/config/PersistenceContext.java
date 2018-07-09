package com.learning.config;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author hitesh.singla
 */
@Configuration
public class PersistenceContext {

  @Primary
  @Bean(name = "dataSource")
  @ConfigurationProperties(prefix = "primary.datasource")
  public DataSource dataSource(){
    return DataSourceBuilder.create().build();
  }

}
