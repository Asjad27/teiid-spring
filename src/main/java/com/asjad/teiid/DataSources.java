package com.asjad.teiid;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSources {

    @ConfigurationProperties(prefix = "spring.datasource.postgresDS")
    @Bean
    public DataSource postgresDS() {
        return DataSourceBuilder.create().build();
    }

    @ConfigurationProperties(prefix = "spring.datasource.mysqlDS")
    @Bean
    public DataSource mysqlDS() {
        return DataSourceBuilder.create().build();
    }
}