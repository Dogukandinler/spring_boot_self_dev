package com.dodo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;

@Configuration
public class MongoConfiguration extends AbstractReactiveMongoConfiguration {




    @Override
    protected String getDatabaseName() {
        return "mydb";
    }
}
