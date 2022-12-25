package com.onlineshopping.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.onlineshopping.dao")
class DatabaseConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "OnlineShoppingApp";
    }
}